Feature: medical record system verification

  Background: 
    Given I am in Login Page
    When I enter valid credential and click on Inpatient Ward
    And click on Login button

  Scenario: verify medical record system
    Then verify Login in Inpatient Ward
    And click on Logout button  

  Scenario: Test Register a patient
    Then I click on Register a patient
    And verify I am in Register a patient page
    And I enter Patient Demographics
   # Then I click on Confirm button
  