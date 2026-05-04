# 📦 DemoBlaze Selenium Automation Framework

## 🚀 Overview

This project is a Selenium-Java Automation Test Framework built for the DemoBlaze e-commerce web application.
It follows the Page Object Model (POM) design pattern and uses TestNG for execution and reporting.

The framework automates end-to-end user workflows including authentication, product browsing, cart operations, and order placement.

---

## 🌐 Application Under Test

* URL: https://www.demoblaze.com
* Type: Single Page Application (SPA)
* Domain: Electronics E-commerce

---

## 🧠 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* WebDriverManager
* ExtentReports
* Maven

---

## 📂 Project Structure

```
src/
 ├── main/java
 │    ├── base/              # Base classes (Driver setup, utilities)
 │    ├── pages/             # Page Object classes
 │    ├── utils/             # Config reader, helpers
 │
 ├── test/java
 │    ├── tests/             # Test classes
 │    ├── listeners/         # TestNG listeners (screenshots)
 │
 ├── resources/
 │    ├── config.properties
 │    ├── testng.xml
 │
 ├── screenshots/
 ├── reports/
```

---

## 🔥 Features Implemented

### ✅ User Authentication

* Sign Up via modal
* Login with valid/invalid credentials
* Logout functionality
* Alert validations

### ✅ Product Browsing

* Category filtering (Phones, Laptops, Monitors)
* Product detail verification
* Home navigation validation

### ✅ Shopping Cart

* Add product to cart
* Multiple product handling
* Delete item from cart
* Total price validation

### ✅ Order Placement

* Fill order form and confirm purchase
* Validate confirmation message
* Order ID verification

### ✅ Form Validations

* Existing user signup validation
* Empty login validation
* Input field checks

---

## 🏗️ Framework Design

### 🔹 Page Object Model (POM)

* Separate classes for each page:

  * HomePage
  * LoginModalPage
  * ProductDetailPage
  * CartPage
  * OrderModalPage
* All locators and actions inside page classes
* No WebDriver code in test classes

### 🔹 Base Classes

* Common utilities (waits, actions)
* Driver initialization

---

## ⚙️ Configuration

All configs are stored in:

`config.properties`

```
browser=chrome
baseUrl=https://www.demoblaze.com
timeout=10
```

---

## ⏱️ Wait Strategy

* Uses WebDriverWait + ExpectedConditions
* No Thread.sleep()

---

## 📊 Test Execution

Run tests using:

```
mvn test
```

Test suite defined in:

```
testng.xml
```

---

## 📸 Screenshot on Failure

* Implemented using TestNG ITestListener
* Screenshots saved in:

```
/screenshots/
```

---

## 📈 Reporting

* ExtentReports generates HTML reports
* Includes:

  * Test status
  * Logs
  * Screenshots on failure

---

## 🔄 Data-Driven Testing

* Implemented using @DataProvider
* Supports:

  * Valid credentials
  * Invalid credentials

---

## ⭐ Best Practices Followed

* No hardcoded values
* Reusable components
* Clean code structure
* Proper naming conventions
* Separation of concerns

---

## ⚡ Optional Enhancements

* Parallel execution
* Excel/JSON DataProvider
* Retry mechanism
* Headless execution
* FluentWait usage

---

## 👨‍💻 How to Run

1. Clone the repository
2. Install dependencies:

```
mvn clean install
```
