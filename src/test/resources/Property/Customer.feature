
@Test
Feature: Customer module under test

    @Test1(14722) 
   Scenario: Business type customer creation
   Given open application with "chrome"
   When click on the new customer 
   When select account type as business
   And enter emailid and other details "ra11324@i95dev.com" and "userb31" and "P@ssw0rd" and "P@ssw0rd" and "swift" and "swift"     
   And enter companyname "Jiva" 
   Then select prefix and enter customer details "Raj" and "tari" and "address1" and "Newyork" and "11011" and "123-456-7890"
	 Then close browser
	
	 @smoketest @Test2
	 Scenario: Person type customer creation
	 Given open application with "chrome"
	 When click on the new customer
	 When select account type as person
   And enter emailid and other details "ra1132@i95dev.com" and "userac103" and "P@ssw0rd" and "P@ssw0rd" and "swift" and "swift"  
   Then select prefix and enter customer details "TestName" and "TestLname" and "33 S Wood Ave #600" and "Iselin" and "08830" and "301-760-7499"
   Then close browser
   
  @Test3
	 Scenario: Verify create Buy credit functionality
	 Given open application with "chrome" 
   Then enter username and password "testac71" and "Test1234"
   Then click on myaccount link
   Then enter buy credit amount "250"
   Then enter card details "4111111111111111" and "123"
   Then close browser
    
  @Test4(14723)
   Scenario: Customer addresses creation
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount link
   Then click on addresses link
   Then enter address type "Return" 
   Then create return address "retru16" and "add1" and "add2" and "newyork" and "11011"
   And click on add new address link
   Then enter address type "billing" 
   Then create billing address "billin1" and "add1" and "add2" and "newyork" and "11011" and "123-254-2541"
   And click on add new address link 
   Then enter address type "shipping"
   Then create shipping address "shippin1" and "add1" and "add2" and "newyork" and "11011" and "123-254-2541"
   And click on add new address link
   Then enter address type "eddm"
   Then create eddm address "edd1" and "add1" and "add2" and "newyork" and "11011" and "123-254-2541"
   And click on add new address link
   Then enter address type "business"
   Then create business address "busines1" and "jiva" and "add1" and "add2" and "newyork" and "11011" and "123-254-2541" and "Newyork" and "123456789"
   And click on add new address link
   Then enter address type "courtesy"
   Then create courtesy address "courtesy1" and "add1" and "add2" and "newyork" and "11011"
   Then close browser
   
   @Test5
   Scenario: Customer addresses updation
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount link 
   Then click on addresses link
   Then enter address type "Return" 
              
   @Test6      
   Scenario: Customer addresses deletion
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount link 
   And delete retrun address additional address
    
   @Test7
   Scenario: Verify fogot username functinality 
   Given open application with "chrome" 
   Then click on forgot username "test12@test.com"
   Then close browser
   
   @Test8
   Scenario: Verifty forgot password functinoality
   Given open application with "chrome" 
   Then click on forgot password "testac3" 
   Then close browser
       
 	 @Test9
   Scenario: Create a job templates 
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   Then create molpro template "sampletemp1"
   Then close browser
      
   @Test10 
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
             
   @Test11
   Scenario: return address deletion from additional address
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   And delete retrun address additional address
   Then close browser
       
   @Test12
   Scenario: Update customer account and address details
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount link
   Then update account details "Raju" and "tari" and "raj9@i95dev.com" and "123-244-5874" and "anup" and "kumar" and "wipro" and "new address" and "New York" and "11011" 
   Then close browser
   
   @Test13
   Scenario: Create a new project
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   Then create a new project "Pname21" 
   Then close browser
    
   @Test14
   Scenario: Delete a project
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   Then delete a project "Pname21" 
   Then close browser
   
    
	 @Test15
   Scenario: Create a mailing list
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   When create mailing list "mlname2" and "maxwell" and "stud" and "newlane1" and "New York" 
   Then close browser
   
    
    
    

  
