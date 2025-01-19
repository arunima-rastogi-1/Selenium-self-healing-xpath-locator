package com.example;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.util.List;
import java.util.ArrayList;

public class TagReader {

    @Before
    public void beforeScenario(Scenario scenario) {
        // Get all tags associated with the scenario
        List<String> tags = new ArrayList<>(scenario.getSourceTagNames());

        // Print the tags
        System.out.println("Tags: " + tags);
    }
}
