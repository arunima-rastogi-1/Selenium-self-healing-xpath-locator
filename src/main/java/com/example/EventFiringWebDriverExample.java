package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import java.util.List;


public class EventFiringWebDriverExample {
    static class MyWebDriverListener implements WebDriverListener {

        //@Override
        public void beforeClickOn(WebElement element, WebDriver driver) {
            System.out.println("Before clicking on: " + element);
        }

        //@Override
        public void afterClickOn(WebElement element, WebDriver driver) {
            System.out.println("After clicking on: " + element);
        }
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "W:\\ARTemp\\softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = null;

        try {

            WebDriver baseDriver = new ChromeDriver();


            WebDriverListener listener = new MyWebDriverListener();
            WebDriver decoratedDriver = new EventFiringDecorator<>(listener).decorate(baseDriver);


            decoratedDriver.navigate().to("https://www.google.com/");
            WebElement ele= (WebElement) decoratedDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
            ele.click();

            List<WebElement> anchorTags = decoratedDriver.findElements(By.tagName("a"));


            System.out.println("Extracting href attributes from the first 10 anchor tags:");
            for (int i = 0; i < Math.min(10, anchorTags.size()); i++) {
                System.out.println(anchorTags.get(i).getAttribute("href"));
            }


            driver = decoratedDriver; // Assign to ensure proper cleanup in finally
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit(); // Ensure the browser is closed in all scenarios
            }
        }}
}
