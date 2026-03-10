Feature: Adactin Hotel Login
Scenario: Verify login with valid username and password

Given  is on Adactin login page
When User enters username and password
Then User clicks login button
And User should navigate to search hotel page