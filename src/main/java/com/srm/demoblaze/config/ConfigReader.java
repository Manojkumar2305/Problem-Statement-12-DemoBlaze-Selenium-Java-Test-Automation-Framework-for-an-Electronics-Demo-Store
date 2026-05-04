package com.srm.demoblaze.config;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public final class ConfigReader {

    private static final String CONFIG_FILE = "config.properties";
    private static final Properties PROPERTIES = loadProperties();

    private ConfigReader() {
    }

    private static Properties loadProperties() {
        Properties properties = new Properties();
        try (InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (inputStream == null) {
                throw new IllegalStateException("Unable to find " + CONFIG_FILE + " on the classpath.");
            }
            properties.load(inputStream);
            return properties;
        } catch (IOException exception) {
            throw new IllegalStateException("Unable to load " + CONFIG_FILE, exception);
        }
    }

    public static String getBrowser() {
        return getRequiredProperty("browser");
    }

    public static String getBaseUrl() {
        return getRequiredProperty("baseUrl");
    }

    public static Duration getTimeout() {
        return Duration.ofSeconds(Long.parseLong(getRequiredProperty("timeout")));
    }

    public static boolean isHeadless() {
        return Boolean.parseBoolean(PROPERTIES.getProperty("headless", "false"));
    }

    private static String getRequiredProperty(String key) {
        String value = PROPERTIES.getProperty(key);
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalStateException("Missing configuration value for key: " + key);
        }
        return value.trim();
    }
}
