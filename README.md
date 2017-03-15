# cucumberAutomation

Guru99 WebApplication testing using CucumberSCM with Maven and Jenkins

Go to Guru99 Bank at http://demo.guru99.com/v4/

1. Create your own account

2. Log in

3. Manually create a new customer using the New Customer link

Then, test the following BDD scenario

Feature: User Check Customer

As a valid user

I should be able to check my customer

Scenario: Check Customer

Given a user has logged in user id "mngr54551" and password "hysApAz"

And the user is on the Edit Customer page

When he submits "88050" as customer id

Then ensures the customer name is "Frank"

And ensures the customer gender is "male"

And ensures that DoB is "1970-01-01"

Please replace those red text with your own data.
