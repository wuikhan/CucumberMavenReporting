Feature: As a valid user , I should be able to login

  Scenario: As a valid user , I should be able to login
    Given I login to the website
    And I enter username and password
    And I click login
    And I logout
