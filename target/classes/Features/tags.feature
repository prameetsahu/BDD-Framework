Feature: Free CRM Tag concepts
@SmokeTest
Scenario: login to application 
Given user enter un AND pw

@RegressionTest @SmokeTest
Scenario: create a new account
Given enter details and create an account

@RegressionTest
Scenario: Navigate to home page 
Given user should be in home page after login

@SanityTest @SmokeTest
Scenario: Create a new contact
Given user should create a new contact

@SanityTest @SmokeTest @RegressionTest
Scenario: Create a new deal
Given user should create a new deal

@SanityTest
Scenario: Create a new task 
Given user should create a new task

@E2ETest
Scenario: send confirmation message after a task
Given message should be send properly

@E2ETest @SmokeTest
Scenario: logout from an application
Given User should logout after click onbutton

@E2ETest @SmokeTest
Scenario: close the browser
Given User should close the browser


