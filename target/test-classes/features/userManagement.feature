#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login  
Feature: moodle login functionality 
  User with permission is able to login with the application successfully

  @validlogin @loginTests
  Scenario: successful login 
    Given As a user, I am on login page
    When I enter a valid email and a valid password
    And click on login in button
    Then I am direct to the homepage

  @invalidlogin @loginTests
  Scenario Outline: Invalid username login
    Given As a user, I am on login page
    When I enter invalid username and valid password
    And click on login in button
    Then I am given an error message and not directed to the homepage


