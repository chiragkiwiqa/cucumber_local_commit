Feature: Amazon

Background: Opening the browser and navigating to the Amazon
	Given I navigate to "http://www.amazon.com/"
@Scenario
Scenario: Filter Nikon product and assert Product Name in Details 
	Given Enter search key : "Nikon"
	And Choose Heighest to Lowest Price filter option
	And Choose Second item from search result
	Then Product Name text should contains : "Nikon D3X"