Feature: Verify user authentication 



@test 
Scenario Outline:: User login with correct username and password 
	Given user navigate to the login page 
	When user enter valid <username> and <password> 
	Then user is successfully logged in 
	Then the check credentails are valid
	
	Examples: 
		|username|password| 
		|Admin   |admin123|