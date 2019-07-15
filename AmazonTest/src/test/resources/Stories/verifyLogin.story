Meta:
@LoginLogout
@FullSuite

Narrative:
In order to test the Login functionality
As a tester
I want to be able to verify Myaccount login functionality, field validations.

Scenario:To validate Login logout process

Given the user is on amazon home page
When the user click on login link
Then verify the user is on login page
When the user enter <SubscribedID> and <ValidPassword>
And click on sign in button
Then the user verify login properly
When the user click on logout link
Then the user verify logout properly

Examples:
General.table