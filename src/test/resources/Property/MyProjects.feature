#Author: your.email@your.domain.com

@tag
Feature: My projects testing
  
 
   @Test1
   Scenario: Create a new project
   Given open application with "chrome" 
   Then enter username and password "test0312" and "Test1234" 
   Then click on myaccount link
   Then create a new project "Pname1" 
   Then close browser
    
   @pending @Test2
   Scenario: Delete a project
   Given open application with "chrome" 
   Then enter username and password "test0312" and "Test1234" 
   Then click on myaccount link
   Then delete a project "Pname1" 
   Then close browser     
	@Test3
   Scenario Outline: Create multiple projects 
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   Then create new project "<project>" 
   Then close browser
    
   Examples: 
      | project   | 
      | pname4    |     
      | pname5    |    
      | pname6    |
             
