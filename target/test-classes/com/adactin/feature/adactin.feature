Feature: Hotel Booking In Adactin Application 

Scenario: User Login In Adactin Application 
	Given user launch The Web Application 
	When user Enter The Username In Username Field 
	And user Enter The Passeord In Password Field 
	Then user Click The Login Button And Navigates TO Sear Hotel Page 
	
Scenario: User Select Hotel In Adactin Application 
	When user Click And Select The Location In Dropdown 
	And user Click And Select The Hotels In Hotels Dropdown 
	And user Click And Select The Room In Room Type Dropdown 
	And user Click And Select The Room Numbers In Number Of Rooms Dropdown 
	And user Click And Select The Date In Check In Date Field 
	And user Click And Select The Date In Check Out Date Field 
	And user Click And Select The Rooms In Adults Per Room Dropdown 
	And user Click And Select The Rooms In Children Per Room Dropdown 
	Then user Click Then Search Button And Navigates To Next Page 
	
Scenario: User Select Hotel In Adactin Application 
	When user Select Hotel In Radio Button 
	Then user Click The Continue Button And Navigates To Next Page 
	
Scenario: User Book A Hotel In Adactin Application 
	When user Enter The Name In First Name Field 
	And user Enter The Name In Last Name Field 
	And user Enter The Address In Billing Address Field 
	And user Enter The Number In Credit Card No Field 
	And user Select The Card Type In Credit Card Type Dropdown 
	And user Select The Date In Expiry Date Dropdown 
	And user Enter The Number In CVV Number Field 
	Then user Click The Book Now Button And Navigates To Next Page 
	
Scenario: User Logout From Adactin Application 
	Then user Click The Logout Button And Navigates To LOgout Page 
	