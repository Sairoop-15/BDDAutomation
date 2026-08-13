Feature: User Registration

  Scenario: Register User Successfully
    Given User should Launch browser
    When User should Navigate to url "http://automationexercise.com"
    Then User should Verify home page is visible successfully
    And Click on "Signup / Login" button
    Then Verify "New User Signup!" is visible
    When Enter name and email address
    And Click "Signup" button
    Then Verify that "ENTER ACCOUNT INFORMATION" is visible
    When Fill account details with Title, Name, Email, Password and Date of birth
    And Select "Sign up for our newsletter!" checkbox
    And Select "Receive special offers from our partners!" checkbox
    And Fill address details with First name, Last name, Company, Address, Address2, Country, State, City, Zipcode and Mobile Number
    And Click "Create Account" button
    Then Verify that "ACCOUNT CREATED!" is visible
    When Click "Continue" button
    Then Verify that "Logged in as username" is visible
    When Click "Delete Account" button
    Then Verify that "ACCOUNT DELETED!" is visible
    And Click "Continue" button
