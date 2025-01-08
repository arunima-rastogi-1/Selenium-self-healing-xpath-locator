Feature: Login Functionality
  Background: Common setup
    Given The application is launched
    And The user is on the login page

  Scenario: Valid Login
    Given The user enters a valid username and password
    When The user clicks the login button
    Then The user should see the dashboard
