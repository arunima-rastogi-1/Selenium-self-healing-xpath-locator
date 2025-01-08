package com.example;

import io.cucumber.java.*;
import org.testng.annotations.BeforeTest;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println(">> Before Scenario: Setting up environment");
    }

    @After
    public void afterScenario() {
        System.out.println(">> After Scenario: Cleaning up environment");
    }
}
