Feature: Adding todo list items in ToDo MVC Application

   # Case 0
  Scenario: User should able to see what needs to be done text in todo items input field
    Given user has not entered any todo items
    Then the application should suggest how to add them

  # Case 1
  Scenario: Adding a single todo item
    Given user has not entered any todo items
    When user adds "Complete the Coding Task"
    Then user todo list should contain:
      | Complete the Coding Task |
    And the remaining item count should show "1 item left"

  # Case 2
  Scenario: Adding multiple todo items
    Given user has a todo list containing
      | Complete the Coding Task |
    When user adds "Generate the Test Report"
    When user adds "Commit The Code In Github"
    Then user todo list should contain:
      | Complete the Coding Task |
      | Generate the Test Report |
      | Commit The Code In Github |
    And the remaining item count should show "3 items left"

  # Case 3
  Scenario: Adding todo items to an existing list
    Given user has not entered any todo items
    When user adds "Commit The Code In Github"
    And user adds "Submit Github Link For Evaluation"
    Then user todo list should contain:
      | Commit The Code In Github |
      | Submit Github Link For Evaluation |
    And the remaining item count should show "2 items left"

