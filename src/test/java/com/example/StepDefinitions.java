package com.example;

import io.cucumber.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Map;
import java.util.NoSuchElementException;


public class StepDefinitions {

    @FindBy(how = How.ID, using = "small-searchterms")
    WebElement element;


    // Getter method to access the element
    public WebElement getElement() {
        return element;
    }

    @Given("As a user I test for self-healing capability in selenium")
    public void the_user_enters_a_valid_username() {
        WebDriverManager.chromedriver().setup();


        WebDriver customdriver = new ChromeDriver();
        WebDriver driver = new CustomDriver(customdriver);

        try {
            driver.get("https://demowebshop.tricentis.com/");

            try {
                driver.findElement(By.id("small-searchterm")).sendKeys("hello");
            } catch (Exception e) {
                System.out.println("Primary element not found. Starting recovery...");

                try {
                    WebElement element1 = driver.findElement(By.id("small-searchterms"));
                    String str = myMethod(element1, driver); // Ensure this method is safe
                    WebElement fallbackElement = driver.findElement(By.xpath(str));
                    fallbackElement.sendKeys("hello");
                } catch (NoSuchElementException ex) {
                    System.out.println("Recovery element not found as well.");
                } catch (Exception ex) {
                    System.out.println("Unexpected error during recovery: " + ex.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println("Fatal error: " + e.getMessage());
        } finally {
            System.out.println("Quitting driver...");
            driver.quit(); //  This will now always execute
        }


    }

    public String myMethod(WebElement searchBox, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> attributes = (Map<String, Object>) js.executeScript("var items = {}; " + "for (index = 0; index < arguments[0].attributes.length; ++index) { " + "  items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; " + "return items;", searchBox);
        // Build XPath
        StringBuilder xpathBuilder = new StringBuilder("//" + searchBox.getTagName() + "[");
        boolean first = true;
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            if (!first) {
                xpathBuilder.append(" and ");
            }
            xpathBuilder.append("@").append(entry.getKey()).append("='").append(entry.getValue()).append("'");
            first = false;
        }
        xpathBuilder.append("]");

        // Print XPath
        System.out.println("\n--- Generated XPath ---");
        System.out.println(xpathBuilder.toString());
        //  WebElement element=driver.findElement(By.xpath(xpathBuilder.toString()));
        return xpathBuilder.toString();
    }

}
