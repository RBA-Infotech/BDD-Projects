Feature: Feature to test place order functionality in Flipkart 


Scenario: Validate the place order E2E functionality 
	Given user is on login page 
	When user enters username and password and click on login button 
	Then user search for laptop 
	Then user select the first laptop 
	Then user clicks on add to cart button 
	And user clicks logout button
	