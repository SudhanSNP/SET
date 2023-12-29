Feature: DashboardMenuTest

@DashboardTests
Scenario Outline: Verify the Dashboard menus
	Given We launched OrangeHRM
	And Login to the Dashboard
	When Verify each <Menu> item present in the menu bar
	Then Menu should be present

Examples: 
	| Menu        |
	| Admin       |
	| PIM         |
	| Leave       |
	| Time        |
	| Recruitment |
	| Performance |
	| Dashboard   |
	| Directory   |
	| Maintenance |
	| Claim       |
	| Buzz        |
	| My Info     |