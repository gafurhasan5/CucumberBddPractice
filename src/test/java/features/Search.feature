Feature: Search Functionality

Background:
Given User Open the Application

Scenario: Seach the valid product
When User enters the valid product into the search field
And User clicks on Search button
Then valid Product should get displayed in search field

Scenario: Seach the non-existing product
When User enters the non-existing product into the search field
And User clicks on Search button
Then Proper text informimg the User about no product matching should displayed

Scenario: Seach the without any product
When User dont enter any product into the search field
And User clicks on Search button
Then Proper text informimg the User about no product matching should displayed
