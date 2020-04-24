Feature: Free CRM login feature

#Scenario: Free CRM login test scenario
#Without Example keyword
#Given user is already on login page
#When title of login page is free CRM
#Then user enters username and password
#Then user enters "batchautomation" and "Test@12345"
#Then user clicks on login button
#Then user is on home page
#Then close the browser

#Scenario:
#Given user is create a new contact
#When user mouse over in contact link
#Then user click on new contact link
#Then user enter firstname and last name
#Then user click on save button
#Then verify new contact created

#With Example Keyword
#when we using data driven approach with examples keyword then we have to mention"Scenario Outline"
Scenario Outline: Free CRM login test scenario
Given user is already on login page
When title of login page is free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
  | username | password |
  | batchautomation | Test@12345 |
  | batchadmin | Test@12345 |
  