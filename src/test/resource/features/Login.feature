Feature:Login user
Scenario:Login with valid Credentials
Given User navigates the login Page
When User enter the valid Email "rehankhan56390@gmail.com"
And User enter the valid Password "123456789"
And click Login Button
Then User should Login successfully

Scenario:Login with invalid Credentials
Given User navigates the login Page
When User enter the valid Email "rehankhan56390122@gmail.com"
And User enter the valid Password "123456789112"
And click Login Button
Then User should not Login successfully

Scenario:Login with valid Email and invalid Password 
Given User navigates the login Page
When User enter the valid Email "rehankhan56390@gmail.com"
And User enter the valid Password "123456789927"
And click Login Button
Then User should not Login successfully

Scenario:Login with invalid Email and valid Password 
Given User navigates the login Page
When User enter the valid Email "rehankhan563902333@gmail.com"
And User enter the valid Password "123456789"
And click Login Button
Then User should not Login successfully