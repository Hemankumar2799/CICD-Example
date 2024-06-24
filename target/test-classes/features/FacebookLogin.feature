
Feature: feature to test login functionality

Scenario: Successful login with valid credentials
     Given I am on the Facebook login page    
      When I enter valid credentials    
       And I click the login button    
        Then I should be redirected to the home page

    
