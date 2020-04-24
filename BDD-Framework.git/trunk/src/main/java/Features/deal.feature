Feature: Dealdata creation

Scenario: Free CRM create a new deal


Given user is on login page
#When verify title of login page.
Then user enter username and password
| batchautomation | Test@12345 |
Then user clicking on login button
Then user navigate to home page
Then user moves to new deal page
Then user enters deal details
| test deal | 1000 | 50 | 10 |
Then Quit the browser