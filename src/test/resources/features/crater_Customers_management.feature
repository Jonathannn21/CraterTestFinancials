
 @Reggression
Feature: Crater add customer 
  

  @Customer @UI @Smoke 
  Scenario: Validate UI components to add customer 
    Given as a "level1" user I have logged into crater application 
    When user clicks on Customers link
   	And clicks on the new customer button
   	When new page loads user should be on New Customer page
   	And will see Basic Info section
   	And Billing Address
   	And Shipping Address
   	And Save Customer button 
   	
   	@Customer @Smoke
   	Scenario: Create new Customer 
   	Given as a "level1" user I have logged into crater application 
   	When user clicks on Customers link
   	And clicks on the new customer button
   	When new page loads user should be on New Customer page
   	And provides data in Display Name 
   	And email box 
   	And primary currency 
   	And Primary contact
   	And Phone 
   	And name in billing address
		And state in billing address
		And Address in billing address
		And Country in billing address
		And city in in billing address
		And phone in billing address
		And zip code in billing address
		When user clicks on Save Customer
		Then Customer should be saved
		
































#		@Reggression @Customer1 
#		Scenario Outline: Customer Filter 
#		Given as a "level1" user I have logged into crater application 
   #	When user clicks on Customers link
   #	And clicks on Filter button
   #	When they enter date in Display Name, Contact Name, Phone  
   #	
   	
   	
   	
   	
   	