Feature: Test Facebook Smoke Scenarios 


Scenario: Test facebook website login with valid credentials 
	Given Open firefox and start application
	When I enter valid username and password
	Then user should be able to login successfully