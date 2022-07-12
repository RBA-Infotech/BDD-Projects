Feature: Feature to test Place Order funcationality in Flipkart

@RegressionTest
Scenario: Validate the Place Order E2E functionality
Given the user is on login page
When user enters username and password and clicks login button
Then user search for laptop
Then user select first laptop
Then user click add to cart button
And user click logout button

