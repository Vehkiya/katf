Feature: Kotlin Cucumber Demo

  @Run
  Scenario: Demo Scenario
    Given 2 pickles
    When 3 more pickles are added
    Then I have 5 pickles in total

  Scenario: scenario without tag
    Given 3 pickles