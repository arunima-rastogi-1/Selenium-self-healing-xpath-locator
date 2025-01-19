package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
<<<<<<< HEAD
        features = "src/test/resources/features",
        glue = "com.example", // Ensure "com.example" includes your step definitions and hooks
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@yourTag" // Specify the tag to execute
=======
        features = "src/test/resources/features/test2.feature",
        glue = "com.example",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@tag1"
>>>>>>> bccbac000aa4868196e859db14801caee9b8fc52
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
