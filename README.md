# 🛒 DemoBlaze Automation Framework (Selenium + TestNG)

## 📌 Project Overview

This project is a **Selenium-based Automation Test Framework** built for the DemoBlaze e-commerce application.

It automates complete end-to-end user workflows including:

* User Authentication (Signup, Login, Logout)
* Product Browsing
* Cart Management
* Order Placement
* Form Validations

The framework follows **industry best practices** such as:

* Page Object Model (POM)
* Data-driven testing using Excel
* TestNG for execution
* Extent Reports for reporting
* Screenshot capture on failure

---

## 🚀 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Reporting:** ExtentReports
* **Data Handling:** Apache POI (Excel)
* **Driver Management:** WebDriverManager

---

## 🌐 Application Under Test

👉 https://www.demoblaze.com

---

## 🏗️ Framework Architecture

This project follows the **Page Object Model (POM)** design pattern:

```
DemoBlaze/
│
├── src/main/java/com/srm/demoblaze/
│   ├── config/
│   │   └── ConfigReader.java
│   ├── driver/
│   │   └── DriverFactory.java
│   ├── model/
│   │   ├── UserCredentials.java
│   │   └── OrderDetails.java
│   ├── pages/
│   │   ├── BasePage.java
│   │   ├── HomePage.java
│   │   ├── LoginModalPage.java
│   │   ├── SignupModalPage.java
│   │   ├── ProductDetailPage.java
│   │   ├── CartPage.java
│   │   └── OrderModalPage.java
│   └── utils/
│       └── ExcelUtil.java
│
├── src/test/java/com/srm/demoblaze/
│   ├── base/
│   │   └── BaseTest.java
│   ├── listeners/
│   │   ├── TestListener.java
│   │   └── ExtentReportManager.java
│   ├── testdata/
│   │   └── TestDataFactory.java
│   └── tests/
│       ├── AuthenticationTests.java
│       ├── ProductBrowseTests.java
│       ├── CartTests.java
│       ├── OrderTests.java
│       └── FormValidationTests.java
│
├── src/test/resources/
│   ├── config.properties
│   └── testdata.xlsx
│
├── screenshots/
├── test-output/
└── pom.xml
```

---

## 🧪 Test Coverage

### ✅ Authentication

* Sign up with unique credentials
* Login with valid credentials
* Login with invalid credentials
* Logout verification

### ✅ Product Browsing

* Filter products by category
* View product details
* Navigate back to home

### ✅ Cart

* Add product to cart
* Add multiple products
* Delete product
* Validate total price

### ✅ Order Placement

* Place order with valid details
* Verify confirmation message and order ID
* Validate empty field behavior

### ✅ Form Validation

* Duplicate signup handling
* Empty login validation
* Modal input validation

---

## 📊 Data-Driven Testing (Excel)

Test data is managed using **Excel (Apache POI)**.

### 📁 File:

```
src/test/resources/testsdata.xlsx
```

### 📄 Sheets:

#### 🔹 LoginSignup

| username | password |
| -------- | -------- |
| user1    | pass1    |
| user2    | wrong    |

#### 🔹 Order

| Name    | Country | City   | Credit card | Month | Year |
| ------- | ------- | ------ | ----------- | ----- | ---- |
| Deepika | India   | Bhopal | 2345698765  | 1     | 2029 |

✔ Login and Order tests fetch data dynamically from Excel
✔ Improves scalability and maintainability

---

## ⚙️ Configuration

All configurations are managed in:

```
src/test/resources/config.properties
```

Example:

```
browser=chrome
baseUrl=https://www.demoblaze.com
timeout=10
```

---

## 🧠 Key Features

* ✅ Page Object Model (POM)
* ✅ Reusable and maintainable design
* ✅ Data-driven testing using Excel
* ✅ WebDriverManager integration
* ✅ Explicit waits (no Thread.sleep)
* ✅ Screenshot capture on failure
* ✅ ExtentReports HTML reporting
* ✅ Clean separation of concerns

---

## 📸 Screenshot Capture

* Automatically captures screenshots on test failure
* Stored in:

```
/screenshots/
```

---

## 📈 Test Reports

* Generated using **ExtentReports**
* Located in:

```
/test-output/
```

Includes:

* Test status (Pass/Fail)
* Logs
* Screenshots (on failure)

---

## ▶️ How to Run the Project

### 1. Clone Repository

```
git clone https://github.com/your-username/DemoBlaze.git
```

### 2. Navigate to Project

```
cd DemoBlaze
```

### 3. Run Tests

```
* Right-click `testng.xml`
* Run as → TestNG Suite

```

---

## 📌 Important Notes

* No hardcoded credentials (all managed via Excel/config)
* No Thread.sleep() used (explicit waits implemented)
* Tests executed via TestNG XML
* Framework designed for scalability

---

## 👩‍💻 Author

**Deepika Kantheti**


---

## ⭐ Acknowledgment

This project was developed as part of a Selenium Automation Hackathon to demonstrate real-world test automation framework design.

---
