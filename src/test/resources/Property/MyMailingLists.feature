#Author: your.email@your.domain.com

@tag
Feature: My mailing list Functionality Test

@Test1
   Scenario: Create a mailing list
   Given open application with "chrome" 
   Then enter username and password "test0312" and "Test1234" 
   Then click on myaccount
   When create mailing list "mllname3" 
   Then close browser
   
   
@Test2
   Scenario: Create a mailing list along with address
   Given open application with "chrome" 
   Then enter username and password "test0312" and "Test1234" 
   Then click on myaccount
   When create mailing list and one address "mlname6" and "maxwell" and "stud" and "newlane1" and "New York" 
   Then close browser

@smoketest  @Test3
   Scenario: upload mailing list
   Given open application with "chrome" 
   Then enter username and password "test0312" and "Test1234" 
   Then click on myaccount
   And upload mailing list
   
	@Test3
   Scenario: upload mailing list
   Given open application with "chrome"
   Then enter username and password "test0312" and "Test1234" 
   Then click on myaccount
   And create a job from my mailinglist
   
   
      