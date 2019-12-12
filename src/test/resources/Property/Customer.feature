
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
   And enter emailid and other details "test1112@mail.com" and "test1112" and "Test1234" and "Test1234" and "swift" and "swift"  
   Then select prefix and enter customer details "TestName" and "TestLname" and "33 S Wood Ave #600" and "Iselin" and "08830" and "301-760-7499"
   Then close browser
   
   @Test3
   Scenario: Update customer account and address details
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount
   Then update account details "Raju" and "tari" and "test129@i95dev.com" and "123-244-5874" and "anup" and "kumar" and "wipro" and "new address" and "New York" and "11011" 
   Then close browser
   
   @Test4
   Scenario: Verify fogot username functinality 
   Given open application with "chrome" 
   Then click on forgot username "test12@test.com"
   Then close browser
   
   @Test5
   Scenario: Verifty forgot password functinoality
   Given open application with "chrome" 
   Then click on forgot password "testac3" 
   Then close browser
   
   @Test6
	 Scenario: Verify create Buy credit functionality
	 Given open application with "chrome" 
   Then enter username and password "testac71" and "Test1234"
   Then click on myaccount
   Then enter buy credit amount "250"
   Then enter card details "4111111111111111" and "123"
   Then close browser
    
   @Test7(14723)
   Scenario: Customer addresses creation
   Given open application with "chrome" 
   Then enter username and password "raju1127" and "Test1234"
   Then click on myaccount
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
   
   @Test8
   Scenario: Customer addresses updation
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount 
   Then click on addresses link
   Then enter address type "Return" 
              
   @Test9      
   Scenario: Customer addresses deletion
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount 
   And delete retrun address additional address
         
 	 
   @Test10
   Scenario: return address deletion from additional address
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   And delete retrun address additional address
   Then close browser
       
   
   @Test1
   Scenario: Create a job templates 
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount
   Then create molpro template "sampletemp1"
   Then close browser
   
   