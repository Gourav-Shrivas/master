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
@FunctionaTest
Feature: Login Feature
  I want to use this template for my feature file

  @SanityTesting
  Scenario Outline: Login Test Scenario
    Given user is already on Login Page
    When title of login page is QA Fake
    Then user enters "<username>" and "<password>"
    Then user checked rember me
    Then user clicks on login button
    Then user get the secret string on home screen
    Then Close the browser
    
  Examples:
    | username | password |
    | admin    | eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InN1cnlhQHNraWxsZW56YS5jb20iLCJpYXQiOjE2MTEzMTc2Njh9.HVMcJZZJh8_EAhB_mcSeGLfZZarE5ZgnEgbbAxSu99g |

  

  