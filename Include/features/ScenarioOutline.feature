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
Feature:  Login With Valid Credentials with Scenario Outline 
  I want to use this template for my feature file

  @valid_invalid
  Scenario Outline: Test Login Page
    Given navigate to the login page
    When I login with email address "<email>" and password "<password>"
    Then I should arrive to account page
    Examples: 
      | email               | password |
      | matest9536@test.com |qeJ0sjJnwEs=| 
      |matest9539@test.com  |qeJ0sjJnwEs=|