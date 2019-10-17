
@Test
Feature: Customer module under test

   @smoketest @test1(14722) 
   Scenario: Business type customer creation
   Given open application with "chrome"
   When click on the new customer 
   When select account type as business
   And enter emailid and other details "ra11321@i95dev.com" and "userb11142" and "P@ssw0rd" and "P@ssw0rd" and "swift" and "swift"     
   And enter companyname "Jiva" 
   Then select prefix and enter customer details "Raj" and "tari" and "address1" and "Newyork" and "11011" and "123-456-7890"
	 Then close browser
	
	 @test2
	 Scenario: Person type customer creation
	 Given open application with "chrome"
	 When click on the new customer
	 When select account type as person
   And enter emailid and other details "ra1141@i95dev.com" and "userb1124" and "P@ssw0rd" and "P@ssw0rd" and "swift" and "swift"  
   Then select prefix and enter customer details "seenu" and "vemula" and "address1" and "Newyork" and "11011" and "123-456-7890"
	 Then close browser
   		
	 @test3
	 Scenario: Buy credit creation for the existing customer
	 Given open application with "chrome" 
   Then enter username and password "testac71" and "Test1234"
   Then click on myaccount link
   Then enter buy credit amount "1000"
   Then enter card details "4111111111111111" and "123"
   Then close browser
    
   @test4(14723)
   Scenario: Customer addresses creation
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount link
   Then click on addresses link
   Then enter address type "Return" 
   Then create return address "retru1" and "add1" and "add2" and "newyork" and "11011"
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
   
   @test5
   Scenario: Customer addresses updation
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount link 
   Then click on addresses link
   Then enter address type "Return" 
              
   @test6      
   Scenario: Customer addresses deletion
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount link 
   And delete retrun address additional address
    
   @test7
   Scenario: From the home page or login page select forgot username
   Given open application with "chrome" 
   Then click on forgot username "test@test.com"
   Then close browser
   
   @test8
   Scenario: From the home page or login page select forgot username
   Given open application with "chrome" 
   Then click on forgot password "testac15" 
   Then close browser
       
 	 @test9
   Scenario: job templates creation
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   Then create molpro template "sampletemp"
   Then close browser
      
   @test10 
   Scenario Outline: multiple job templates creation
   Given open application with "chrome"
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   Then create new project "<project>" 
   Then close browser
    
   Examples: 
      | project   | 
      | pname1    |     
      | pname2    |    
      | pname3    |
      | pname4    |
             
   @test11
   Scenario: return address deletion from additional address
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   And delete retrun address additional address
   Then close browser
       
   @test12
   Scenario: return address deletion from additional address
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234"
   Then click on myaccount link
   Then update account details "Raj" and "tari" and "raj@i95dev.com" and "123-244-5874" and "anup" and "kumar" and "wipro" and "new address" and "New York" and "11011" 
   Then close browser
   
   @test13
   Scenario: New project creation -under My assets -my projects.
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   Then create a new project "Pnamexx" 
   Then close browser
    
   @test14
   Scenario: Project deletion -under My assets -my projects.
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   Then delete a project "Pnamexx" 
   Then close browser
   
    
	 @smoketest @test15
   Scenario: New mailinglist creation -under My assets -my mailinglist.
   Given open application with "chrome" 
   Then enter username and password "testac41" and "Test1234" 
   Then click on myaccount link
   When create mailing list "mlname1" and "Suresh" and "kumar" and "newlane1" and "New York" 
   Then close browser
   
    
    
    

  
