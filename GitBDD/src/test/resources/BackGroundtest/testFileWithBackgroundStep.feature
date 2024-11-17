Feature: End to End Test of Sause labs application

Background: User is logged into the Sause application
Given User is on Login Page
Then User should be able to enter Valid Username and Password
And Click on login button




Scenario: User should be able to add products to cart
Then User should be able to Add new Products to cart
And Validate the products in cart page

Scenario: User should be able to Logout of the applicaio
Then User should be able to Logout
And Validate that User has logged out Successfuly



