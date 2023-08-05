#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#When,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples When <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@techfios_newAccount
Feature: Add a new account
  
  I want to add acount using an example table with cucumber step

  @Process
  Scenario Outline: 
    Given I am on biling page
    When I login with my <username> and <password>
      | username          | password |
      | demo@techfios.com | abc123   |
    Then I land on the dashboard page
    When I clicks on the new account page
    Then I land on the new account page
    When I input those fields from the  following columns:
      | acctname | purpose    | balance  | accountNumber | contactPerson | Phone       | internetBankingURL        |
      | venus    | trust fund | 3,500000 |     456787654 | DiEris        | 31354676513 | https://www.VenusFund.gov |
    And user clicks on save
    Then user should be able to validate account created successfully
      | acctname |
      | venus    |
