Feature: Logout User

  Scenario: Logout User Successfully

    Given User should Launch browser
    When User should Navigate to url "http://automationexercise.com"
    Then User should Verify home page is visible successfully
    And Click on "Signup / Login" button
    Then Verify "Login to your account" is visible
    When Enter correct email address and password
    And Click "login" button
    Then Verify that "Logged in as username" is visible
    When Click "Logout" button
    Then Verify that user is navigated to login page