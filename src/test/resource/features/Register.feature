Feature:User Registration

Scenario: Register With mandotary Field
Given I navigate to register account page
When I enters firstname "rehan" into the first Name Field
And I enters lastname "sheik" into the last Name Field
And I enters emailAddres "rehansheik123@gmail.com" into the email Address Field
And I enters telePhone number "982973721232" into the telephone Field
And I enters  password "982973721232" into the password Field
And I enters  confirm password "982973721232" into the confirm password Field
And Selects Privacy Field
And Click Continue button
Then Account should Successfully created

Scenario: Register With All Field
Given I navigate to register account page
When I enters firstname "rehan" into the first Name Field
And I enters lastname "sheik" into the last Name Field
And I enters emailAddres "rehansheik123@gmail.com" into the email Address Field
And I enters telePhone number "982973721232" into the telephone Field
And I enters  password "982973721232" into the password Field
And I enters  confirm password "982973721232" into the confirm password Field
And select Yes for Newsletter
And Selects Privacy Field
And Click Continue button
Then Account should Successfully created





