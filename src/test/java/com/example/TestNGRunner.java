package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.example", // Ensure "com.example" includes your step definitions and hooks
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@yourTag" // Specify the tag to execute
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
