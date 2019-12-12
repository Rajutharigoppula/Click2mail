	
@shipped
Feature: Verifing Order Functionality with shipped products
      
 @Test25
Scenario: Order place with Postcard 3.5 x 5 - Shipped product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
  	Then select postcard355
  	Then shipped product placing orders
  	And enter initials for shiped product "Rj"
  	Then close browser
  	
@smoketest @Test26
Scenario: Order place with Postcard 4.25 x 6 - Shipped product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
    Then select postcard4256
  	Then shipped product placing orders
  	And enter initials for shiped product "Rj"
  	Then close browser
  	
 @Test27
Scenario: Order place with Postcard 4 x 9 - Shipped product
    Given open application with "chrome" 
    Then enter username and password "testac41" and "Test1234" 
	  Then select print and ship
    Then select postcard49
    Then shipped product placing orders
  	And enter initials for shiped product "Rj"
  	Then close browser
  	
 @Test28
Scenario: Order place with Postcard 5 x 8 - Shipped product
    Given open application with "chrome" 
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
    Then select postcard58
    Then shipped product placing orders
   	And enter initials for shiped product "Rj"
  	Then close browser

@Test29
Scenario: Order place with Postcard 6 x 11 - Shipped product
    Given open application with "chrome" " "
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
    Then select postcard611
    Then shipped product placing orders  	
  	And enter initials for shiped product "Rj"
  	Then close browser
 
@Test30
Scenario: order place with Postcard 6.5 x 9 - Shipped product
    Given open application with "chrome" 
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
    Then select postcard659
    Then shipped product placing orders 	
  	And enter initials for shiped product "Rj"
  	Then close browser
  	
 @Test31
Scenario: order place with Rack Card 4 x 9 - Shipped product
    Given open application with "chrome" 
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
    Then select rackcard49
    Then shipped product placing orders 	
  	And enter initials for shiped product "Rj"
  	Then close browser
  	
 @Test32
Scenario: order place with Brochure 11 x 8.5 - Shipped product
    Given open application with "chrome" 
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
   	Then select brochure1185
    Then shipped product placing orders	
  	And enter initials for shiped product "Rj"
  	Then close browser
  	
 @Test33
Scenario: order place with Flyer 8.5 x 11 - Shipped product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
  	Then select flyer8511
    Then shipped product placing orders
  	And enter initials for shiped product "Rj"
  	Then close browser
  	
  	
 @Test34
Scenario: order place with Cardstock 12 x 4.5 - Shipped product
    Given open application with "chrome" 
    Then enter username and password "testac41" and "Test1234" 
    Then select print and ship
    Then select cardstock1245
    Then shipped product placing orders
  	And enter initials for shiped product "Rj" 
  	Then close browser
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	