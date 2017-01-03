Feature: User Check Customer
  As a valid user
  I should be able to check my customer

  Scenario: Check Customer
    Given Open Browser and start application
    Given a user has logged in user id "mngr56734" and password "vydApEj"
    And the user is on the Edit Customer page
    When he submits "96942" as customer id
    Then ensures the customer name is "Triveni"
    And ensures the customer gender is "female"
    And ensures that DoB is "1988-01-08"
    Then close the application.
