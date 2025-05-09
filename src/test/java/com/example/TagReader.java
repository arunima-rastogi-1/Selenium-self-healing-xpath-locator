package com.example;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.util.List;
import java.util.ArrayList;

public class TagReader {

    @Before
    public void beforeScenario(Scenario scenario) {

        List<String> tags = new ArrayList<>(scenario.getSourceTagNames());


        System.out.println("Tags: " + tags);
    }
}
