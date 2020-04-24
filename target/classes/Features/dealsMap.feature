Feature: Dealdata creation

Scenario: Free CRM create a new deal


Given user is on login page
#When verify title of login page.
Then user enter username and password
|username | password |
| batchautomation | Test@12345 |
Then user clicking on login button
Then user navigate to home page
Then user moves to new deal page
Then user enters deal details
| title | amount | probability | comission |
| test deal 1 | 1000 | 50 | 10 |
| test deal 2 | 2000 | 60 | 20 |
| test deal 3 | 3000 | 70 | 30 |
| test deal 4 | 4000 | 80 | 40 |
Then Quit the browser