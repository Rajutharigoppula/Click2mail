#Author: your.email@your.domain.com

@tag
Feature: Mydocumets Functionality Test

 @tag1
  Scenario: Create a document under my documents
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then click on myaccount
    And Create a document "testdoc25" and "This is test document" 
  
 @smoketest  @tag2  
  Scenario: upload a document under my documents
    Given open application with "chrome"
    Then enter username and password "testac41" and "Test1234" 
    Then click on myaccount
    And upload a document under my documents