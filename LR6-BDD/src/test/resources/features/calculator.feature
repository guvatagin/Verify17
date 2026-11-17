Feature: Software calculator
  Scenario Outline: Addition
    Given I have a software calculator
    When I enter <a> as the first operand
    And I enter <b> as the second operand
    And I press "Add"
    Then the result should be <result>
    Examples:
      | a  | b  | result |
      | 2  | 3  | 5 |
      | -2 | 2  | 0 |
      | 5  | 10 | 15 |
