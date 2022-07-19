Feature: to test tags

  @SmokeTest
  Scenario: Scenario_1
    Given "User given"
    When "User when"
    And "and"
    Then "User then"

  @RegressionTest
  Scenario: Scenario_2
    Given "User given"
    When "User when"
    And "and"
    Then "User then"

      @RegressionTest @SmokeTest
  Scenario: Scenario_2
    Given "User given"
    When "User when"
    And "and"
    Then "User then"