Feature: Login validation

   Scenario: Login Functionality with positive validation
    Given Browser opens
    When user enters username
    And user enters password
    And click the login button
    Then validates to homepage
   
  Scenario: Hotelsearching Page
    Given Enter all the required details
    Then click search 
    Then validates to another page
   
