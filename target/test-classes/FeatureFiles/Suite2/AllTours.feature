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
@tag
Feature: Validate All Tours page
  I want to use this template for my feature file

  @GB
  Scenario: All Tours page redirection
    Given url "http://localhost:80"
    When I click on All Tours menu link
    Then All tours page displays with "Our Tours" header
    
  @GB
  Scenario: All Tours page redirection
    Given url "http://localhost:80"
    When I click on All Tours menu link
    Then All tours page displays with "Our Tours" header 
    
  @GB
  Scenario: All Tours page redirection
    Given url "http://localhost:80"
    When I click on All Tours menu link
    Then All tours page displays with "Our Tours" header 

