
# Self-Healing XPath Locator with Selenium, Cucumber & TestNG

This project demonstrates an intelligent **self-healing XPath locator strategy** using **Selenium WebDriver**, **Cucumber**, and **TestNG**. It enables automation scripts to automatically recover from XPath failures by trying alternative locators when the primary one is broken due to changes in the DOM.

---
 
## 🚀 Features

- ✅ Self-healing XPath logic
- 🧪 Cucumber BDD integration
- 🔍 TestNG for test execution and reporting
- 📄 Page Object Model (POM) design
- 🌐 Cross-browser test readiness

---

## 🛠️ Tech Stack

- Java 17+
- Selenium WebDriver
- TestNG
- Cucumber JVM
- Maven
- IntelliJ IDEA / Eclipse

---

## 📁 Project Structure

```
├── src
│   ├── main
│   │   └── java
│   │       └── com.example
│   │           ├── CustomDriver.java
│   │           └── EventFiringWebDriverExample.java
│   └── test
│       ├── java
│       │   └── stepdefinitions
│       └── resources
│           └── features
│               └── example.feature
├── pom.xml
└── testng.xml
```

---

## 🧪 Running Tests

```bash
# Using Maven
mvn clean test
```

Make sure to configure `testng.xml` and `runner` classes properly before execution.

---

## 🧰 How It Works

1. **Custom WebDriver Wrapper** monitors failures.
2. If the primary XPath fails, it tries alternate locators from a defined list.
3. Logging is used to track fallback attempts and final result.

---

## 📝 Example XPath Healing Flow

```java
// Original XPath fails
driver.findElement(By.xpath("//input[@id='old_id']"));

// Self-healing attempts alternative
driver.findElement(By.xpath("//input[@name='username']"));
```

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙋‍♀️ Author

**Arunima Rastogi**  
💼 [LinkedIn](https://www.linkedin.com/in/arunimarastogi)  
📧 [Email](mailto:e.arunimarastogi@gmail.com)

---

## 🌟 Contributions

Contributions, issues and feature requests are welcome!  
Feel free to fork the repo and submit a pull request.
