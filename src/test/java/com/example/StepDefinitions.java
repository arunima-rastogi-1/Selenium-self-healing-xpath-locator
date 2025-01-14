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

    @Given("step1")
    public void the_user_enters_a_valid_username_and_password1() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("tag 1 and 2");
    }
    @Given("step2")
    public void the_user_enters_a_valid_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("tag 2");
    }
    @Given("step3")
    public void the_user_enters_a_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("tag 3");
    }

}
