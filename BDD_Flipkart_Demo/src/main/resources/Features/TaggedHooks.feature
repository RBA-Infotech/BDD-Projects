Feature: Tagged Hooks

@SmokeTest
Scenario: To validate Amazaon login page functionality
Given user is on amazon login page
When user enters username and password
Then user clicks logout button

@RegressionTest
Scenario: To validate search for flights in EaseMyTrip
Given user is on easemytrip home page
When user enters from, to, date and click on search button
Then search results for buses are displayed