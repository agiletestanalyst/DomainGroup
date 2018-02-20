@smoke-test @PageLoadTest
Feature: Acceptance testing to validate that all the TOP header pages
	are loading succesfully.

  
  Scenario Outline: Validate header page loads
    Given I navigate to the Home Page "https://www.domain.com.au/" of real estate website
    When I click on <top header menu> link
    Then Page loads successfully showing the <expected title> 
    And The DOM loads successfully showing status as completed   
   	Examples:
    |top header menu|expected title	|
    |Rent			|rentPageTitle	|			