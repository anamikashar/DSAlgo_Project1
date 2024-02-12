Feature: feature to test homepage functionality

I want to use this template for my feature file



@homepage

Scenario: Check the homepage is successfully open

Given The user opens Home Page

When The user clicks "Get Started" button

Then The user should enter the home page

When The user clicks "Data Structures" drop down

Then The user should see 6 panes with different data structires

When The user clicks "Array"on drop menu

Then It should alert the user with a message "You are not logged in"