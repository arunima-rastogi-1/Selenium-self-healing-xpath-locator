package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        System.out.println("Navigated to the login page.");
    }

    @When("the user enters valid credentials {string} and {string}")
    public void user_enters_credentials(String username, String password) {
        System.out.println("Entered username: " + username + ", password: " + password);
    }

    @Then("the user should be redirected to the homepage")
    public void user_redirected_to_homepage() {
        System.out.println("User successfully logged in and redirected to the homepage.");
    }
}
