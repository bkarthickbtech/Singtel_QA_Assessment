@workflow
Feature: Filtering todos

  Scenario Outline: Should be able to view only completed todos
    Given user has a todo list containing
      | Commit The Code In Github |
      | Submit Github Link For Evaluation |
    When user completes "Commit The Code In Github"
    And user filters the list to show Completed tasks
    Then user todo list should contain:
      | Commit The Code In Github |
    When user filters the list to show Active tasks
    Then user todo list should contain:
      | Submit Github Link For Evaluation |

