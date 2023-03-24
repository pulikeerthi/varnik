
Feature: MyAccount-Login Feature
  Description : This feature will test a login feature

 
  #Simple Login without parameters
  Scenario: Log-in with valid username and password
    Given Open the browser
    When Enter the URL "https://admin-demo.nopcommerce.com"
    Enter registered username "admin@yourstore.com" and password "admin"
    And Click on login button
    Then User must successfully login to the web page
