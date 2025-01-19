Feature: Validate scenario tags

  @yourTag
  Scenario: Validate login functionality
    Given the user is on the login page
    When the user enters valid credentials "user123" and "password123"
    Then the user should be redirected to the homepage
