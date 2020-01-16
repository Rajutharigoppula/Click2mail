#Author: your.email@your.domain.com
@tag
Feature: My projects Functionality Test
   
   @Test1
   Scenario: Create a new project
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   Then create a new project "test56" 
   Then close browser
   
   @Test2
   Scenario: Delete a project
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   Then delete a project "test56" 
   Then close browser     
   
   @Test3 
   Scenario Outline: Create multiple projects 
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   Then create new project "<project>" 
   Then close browser
    
   Examples: 
      | project   | 
      | pname4    |     
      | pname5    |    
      | pname6    |
      
    
   @Test4
   Scenario: Create a start job from my projects 
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   And create a job from my projects
   
   @smoketest   @Test5
   Scenario: Create a job with print and ship product
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then select print and ship
   Then select postcard355
   And create a job from products
      
   @Test6
   Scenario: 
   
    
   
   
 
      