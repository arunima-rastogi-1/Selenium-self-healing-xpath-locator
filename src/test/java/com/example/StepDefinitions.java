package com.example;

import io.cucumber.java.en.*;

public class StepDefinitions {

    @Given("The application is launched")
    public void applicationLaunched() {
        System.out.println("Application is launched");
    }

    @Given("The user is on the login page")
    public void userOnLoginPage() {
        System.out.println("User is on the login page");
    }

    @Given("The user enters a valid username and password")
    public void enterValidCredentials() {
        System.out.println("User enters valid credentials");
    }

    @When("The user clicks the login button")
    public void clickLoginButton() {
        System.out.println("User clicks the login button");
    }

    @Then("The user should see the dashboard")
    public void verifyDashboard() {
        System.out.println("Dashboard is displayed");
    }
}
