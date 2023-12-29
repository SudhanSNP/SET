Feature: UserLoginTest

A short summary of the feature

@LoginTests
Scenario Outline: Verify user login
	Given I navigated to OrangeHRM login
	When Enter the Username and Password in the login form <Username> and <Password>
	Then The logo should be present in the Dashboard page 

Examples: 
	| Username | Password  |
	| Admin    | admin123  |
	| sudhan   | sudhan123 |
