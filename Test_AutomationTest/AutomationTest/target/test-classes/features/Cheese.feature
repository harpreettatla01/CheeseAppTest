@Regression
Feature: Cheese Test

#Implementation 1
Scenario: Check if all the three categories of cheese are displayed 
			Given I have launched the app and Home page title is displayed
			Then Validate all the three categories of cheese are displayed
	
#Implementation 2			
Scenario Outline: Check if all the three categories of cheese are displayed 
			Given I have launched the app and Home page title is displayed
			Then Validate all the three categories of cheese "<Category One>" "<Category Two>" "<Category Three>" are displayed
			
			Examples:	
			| Category One | Category Two | Category Three |
			| CATEGORY 1 	 | CATEGORY 2   | CATEGORY 3  	 |
			
Scenario: Check if all the three sections are displayed for the selected cheese 
			Given I have launched the app and Home page title is displayed
			Then Select a cheese
			Then Validate Info Section is displayed
			Then Validate Friends Section is displayed
			Then Validate Related Section is displayed

Scenario Outline: Change the mode of the App
			Given I have launched the app and Home page title is displayed
			Then Click the Ellipsis on top right of the app and select night mode
			Then Change the mode to "<Mode>"
			
			Examples:	
			| Mode					 | 
			| Night (always) |
			