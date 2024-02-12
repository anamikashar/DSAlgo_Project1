@tag

Feature: Feature to test register functionality

@register

Scenario: Check the register is done successfully

Given The user opens Register Page

When The user clicks "Register" button with all fields empty

Then It should display an error "Please fill out this field" below Username textbox

Given The user opens Register Page

When The user clicks "Register" button after entering Username with other fields empty

Then It should display an error "Please fill out this field" below Password textbox

Given The user opens Register Page

When The user clicks "Register" button after entering Username and password with Password Confirmation field empty

Then It should display an error "Please fill out this field" below Password Confirmation textbox

Given The user opens Register Page

When The user clicks "Register" button after entering invalid username

Then It should display an error message "Please enter a valid username"

Given The user opens Register Page

When The user clicks "Register" button after entering different passwords in Password and Password Confirmation fields 

Then It should display an error message "password_mismatch:The two password fields didn’t match."

Given The user opens Register Page

When The user enters a Password with characters less than 8

Then It should display an error message "Please enter a valid password"

Given The user opens Register Page

When The user clicks "Register" button after entering the correct username,password,confirmed password

Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"