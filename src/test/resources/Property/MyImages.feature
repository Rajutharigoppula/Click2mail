#Author: your.email@your.domain.com

@tag
Feature: My Images functionality Test
  
  @smoketest @tag1
  Scenario: upload image to my images
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then click on myaccount
    And upload an image 
  	Then close browser
  	
