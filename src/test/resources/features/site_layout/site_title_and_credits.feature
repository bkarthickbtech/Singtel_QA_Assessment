@ux
Feature: Site Title and Credits

  Scenario: The page title should be shown
    Given user opens the Todo Application
    Then the page title should include "Vue.js • TodoMVC"

  Scenario: The application credits should appear in the footer
    Given user opens the Todo Application
    Then user should see the credits in the footer