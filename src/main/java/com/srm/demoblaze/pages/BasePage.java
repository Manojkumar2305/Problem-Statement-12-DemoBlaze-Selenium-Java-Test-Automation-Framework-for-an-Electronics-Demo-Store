package com.srm.demoblaze.pages;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srm.demoblaze.config.ConfigReader;

public class BasePage {

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, ConfigReader.getTimeout());
    }

    protected WebElement waitForElementVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitForElementClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void click(By locator) {
        waitForElementClickable(locator).click();
    }

    protected void type(By locator, String value) {
        WebElement element = waitForElementVisible(locator);
        element.clear();
        if (value != null && !value.isEmpty()) {
            element.sendKeys(value);
        }
    }

    protected String getValue(By locator) {
        return waitForElementVisible(locator).getAttribute("value");
    }

    protected String getText(By locator) {
        return waitForElementVisible(locator).getText().trim();
    }

    protected boolean isDisplayed(By locator) {
        return !driver.findElements(locator).isEmpty() && driver.findElement(locator).isDisplayed();
    }

    protected List<String> getTexts(By locator) {
        return driver.findElements(locator).stream()
                .map(WebElement::getText)
                .map(String::trim)
                .filter(text -> !text.isEmpty())
                .collect(Collectors.toList());
    }

    protected void waitForModalToAppear(By modalLocator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalLocator));
    }

    protected void waitForInvisibility(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected String waitForAlertAndAccept() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }

    protected void waitForElementCountToBeLessThan(By locator, int currentCount) {
        wait.until(driver -> driver.findElements(locator).size() < currentCount);
    }

    protected void waitForElementCountToBeMoreThan(By locator, int count) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, count));
    }

    protected void shortStabilityWait(By locator) {
        WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        shortWait.ignoring(StaleElementReferenceException.class)
                .until(webDriver -> !driver.findElements(locator).isEmpty());
    }
}
