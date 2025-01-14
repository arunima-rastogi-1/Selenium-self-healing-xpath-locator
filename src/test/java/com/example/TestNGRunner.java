package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/test2.feature",
        glue = "com.example",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@tag1"
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
