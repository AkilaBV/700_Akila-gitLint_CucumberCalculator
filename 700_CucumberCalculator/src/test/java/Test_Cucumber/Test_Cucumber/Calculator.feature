

Feature: calculator operations
  

  Scenario: Add 2 numbers
    Given two numbers
    When I add those 2 numbers
    Then I validate the sum
    And display the sum
    
    
    Scenario: subtract 2 numbers
    Given two other numbers
    When I subtract those 2 numbers
    Then I validate the difference
    And display the difference

 