#Author: your.email@your.domain.com
@tag
Feature: Mymailing list Functionality Test

   @smoketest  @Test1
   Scenario: Create a mailing list
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   When create mailing list "mllname21" 
   Then close browser
      
   @smoketest @Test2
   Scenario: Create a mailing list along with address
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   When create mailing list and one address "mlname61" and "maxwell" and "stud" and "newlane1" and "New York" 
   Then close browser
   
   @Test3
   Scenario: upload mailing list
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   And upload mailing list "list1"
   Then close browser
      
   @Test4
   Scenario: Create a job from mailinglist
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   And create a job from my mailinglist
   Then close browser
      
   @Test5
   Scenario: Delete a mailinglist
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   And Delete a mailinglist "dup1"
              
   @Test6
   Scenario: Create a dublicate mailinglist
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   And Dublicate a mailinglist "bcghgh" and "fup12"
   
   
   
   
   
   
   
   
   