@Reggression
Feature: Crater login page

  @Smoke
  Scenario: Validate Crater loging page with valid credentails.
    Given User is on crater Login page.
    And Inputs valid username in username textbox
    And Inputs valid password in password textbox
    When I click on sign in button
    Then I should be on the dashboard page of crater.
	@Smoke
  Scenario Outline: Validate Crater login page with invalid credentails. 
  	Given User is on crater Login page.
  	And   Inputs invalid "<email>" and "<password>"
  	When I click on sign in button
  	Then I should still be on login page.
  	
  	Examples: email\password
  	|email            |  password |
    |yoyo@gmail.com   |  1234     | 
  	|web32@gmail.com  |           |
  	|                 |  eaefeaf  |
  	|                 |           |