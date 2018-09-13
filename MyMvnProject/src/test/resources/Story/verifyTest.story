Meta:
@Test1
Narrative: Demo BDD Framework with serenity and BDD usind maven biult tool
Scenario: Flight booking process on http://newtours.demoaut.com/ for subscribe user 

Given the user open browser
Then the user maximize the browser
When the user click on login
Then the user should be navigate to login page
When the user enter subscribe gobindaakhuli@gmail.com and <'password'>
And click on submit button
Then the user navigate to billing page
When the user enter user information
And the user click on cesurePurchase button
Then the user should be on booking confirmation page

Examples:
General.table
