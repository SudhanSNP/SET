Feature: LoginLogoTest

@LoginTests
Scenario: Verify the presence of Logo
	Given I navigated to OrangeHRM portal
	When Check for the logo image
	Then The logo should be present
