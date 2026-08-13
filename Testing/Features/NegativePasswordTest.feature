Feature: Login User with correct email and incorrect password

  Scenario: Negative Login with Invalid Password
    Given User should Launch Edge browser
    When User should Navigate to url 'http://automationexercise.com'
    And User should Verify home page is visible successfully
    Then Click on 'Signup / Login' button
    And Verify 'Login to your account' is visible
    And Enter correct email address and incorrect password
    When Click 'login' button
    Then Verify error 'Your email or password is incorrect!' is visible
