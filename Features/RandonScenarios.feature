#Author: Mohana Priya K


Feature: Random Scenarios


 
  Scenario: Verify if the firstname and lastname of the loggedin user is displayed
    Given User launch Chrome Browser
    When User opens Sales Force login page "https://login.salesforce.com/"
    And User enters Username as "harrypotter@abc.com" and password as "Open123$#SalesF"
    Then  User Clicks on login 
    And page Title should be "Home Page ~ Salesforce - Developer Edition"

  
