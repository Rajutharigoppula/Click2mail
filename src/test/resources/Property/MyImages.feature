#Author: your.email@your.domain.com
	@tag
	Feature: MyImages functionality Test
  
  	@Test1
  	Scenario: upload image to my images
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then click on myaccount
    And upload an image 
  	Then close browser
  	
  	@Test2
  	Scenario: upload multiple images to my images
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then click on myaccount
    And upload multiple images
    Then close browser
    
 	@smoketest   @Test3
 	Scenario: Delete image from my images
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then click on myaccount
  	And Delete a image 
   	Then close browser
 