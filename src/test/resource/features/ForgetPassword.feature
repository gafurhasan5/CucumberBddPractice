Feature: Forget Password Functionality

Scenario: Reset password on forgetting it
Given User Open the Application
When User clicks on MyAccount
And Select the login Option
And Clicks on forgotten Password option
And Enters valid Email Address
And Click on Continue button
Then Proper Confirmation message should be displayed