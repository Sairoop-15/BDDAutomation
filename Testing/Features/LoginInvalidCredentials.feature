Feature: Login User with Incorrect Email and Password

  Scenario: Unsuccessful Login with Invalid Credentials

    Given User should Launch browser
    When User should Navigate to url "http://automationexercise.com"
    Then User should Verify home page is visible successfully
    And Click on "Signup / Login" button
    Then Verify "Login to your account" is visible
    When Enter incorrect email address and password
    And Click "login" button
    Then Verify error "Your email or password is incorrect!" is visible