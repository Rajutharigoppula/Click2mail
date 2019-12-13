
@Printlist
Feature: Verifing Order Functionality with print and mail list products
  

@Test1
Scenario: Order place with Postcard 3.5 x 5 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p postcard355
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
  	Then close browser 
  	
  
@Regression @Test2
Scenario: Order place with Postcard 4.25 x 6 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p postcard4256
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
  	Then close browser
  	
@Test3
Scenario: Order place with Postcard 4 x 9 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p postcard49
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
  	Then close browser
  	
@Test4
Scenario: Order place with Postcard 5 x 8 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p postcard58
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
  	Then close browser
  	
@Test5
Scenario: Order place with Postcard 6 x 9 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p postcard69
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
  	Then close browser

 @Test6
Scenario: Order place with Postcard 6 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p postcard611
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
 @Test7
Scenario: Order place with Notecard 4.125 x 5.5 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p notecard1
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
@Test8
Scenario: Order place with Notecard - Folded 4.125 x 5.5 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p notecard2
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
 @Regression @Test9
Scenario: Order place with Rack Card 4 x 9 - Mailed product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p rackcard49
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
@Test10
Scenario: Order place with Booklet Self Mailer 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p booklet1
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser

@Test11
Scenario: Order place with Booklet 8.5 x 11-Address Back Page product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p booklet2
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
@Test12
Scenario: Order place with Booklet 8.5 x 11 - Address fornt Page product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
	  Then select print and mail list products
    Then select p booklet3
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser

 @Test13
Scenario: Order place with Letter 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p letter1
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser

@Test14
Scenario: Order place with Letter 8.5 x 14 product
    Given open application with "chrome"
    Then select print and mail list products
    Then select p letter2
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
 @Test15
Scenario: Order place with Secure Self Mailer 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p securemailer
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser

@Test16
Scenario: Order place with Reply Postcard 4.25 x 6 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p replay mail1
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser

@Test17
Scenario: Order place with Reply Letter - 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p replay mail2
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser

@Test18
Scenario: Order place with Certified Self Mailer 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
	  Then select print and mail list products
    Then select p certified mail1
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
@Test19
Scenario: Order place with Certified Self Mailer-with Green Card Receipt product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p certified mail2
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
 @Test20
Scenario: Order place with Certified Letter 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p certified mail3
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
@Test21
Scenario: Order place with Priority Letter 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p priority mail
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
 
 @Test22
Scenario: Order place with Priority Mail Express Letter 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p priority mail express
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
 @Test23
Scenario: Order place with Flyer 8.5 x 11 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p flyer
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser
    
@Test24
Scenario: Order place with Brochure 11 x 8.5 product
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then select print and mail list products
    Then select p brochures
    Then print and mail products place an order
    And enter initials for print mail "Rj" 
    Then close browser




 	
  	
  	