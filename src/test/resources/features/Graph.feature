@tag
Feature: feature to test Graph functionality

I want to use this template for my feature file

@NavigateGraphPage
Scenario: Navigating to Graph Page
    Given the user is logged in
    When the user clicks the "Graph" button
    Then the user should be directed to the "Graph" Page


  Scenario: Navigating to Try Here Page from Graph Page
    Given the user is in the Graph page after logged in
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page having a tryEditor with a Run button to test

 
  Scenario: Navigating to Graph Representations Page
    Given the user is in the Graph page after logged in
    When the user clicks the "Graph Representations" button
    Then the user should be directed to the "Graph Representations" Page

  
  Scenario: Navigating to Try Here Page from Graph Representations Page
    Given the user is in the Graph Representations page after logged in
    When the user clicks the "Try Here" button
    Then the user should be redirected to a page having a tryEditor with a Run button to test