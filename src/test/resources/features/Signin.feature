@tag

Feature: feature to check signin functionality

@login

Scenario: Check the login is done successfully

Given The user is in signin page 

When The user clicks signin

Then It should display an error "Please fill out this field" below Username textbox

Given The user is in signin page 

When The user clicks signin

Then It should display an error "Please fill out this field" below Password textbox

Given The user is in signin page 

When The user enters invalid username and password

Then It should display an error "Invalid Username and Password"

Given The user is in signin page 

When The user enters an valid user id + invalid password

Then System should alert user "Please check your password"

Given The user is in signin page 

When The user enters an invalid user id + valid password

Then System should alert user "Please check your username"

Given The user is in the Home page after logged in

When The user clicks "Sign out" 

Then The user enters a valid user id + valid password

And clicks on login button