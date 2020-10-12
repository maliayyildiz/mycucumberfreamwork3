@regression
Feature: US1003_user_should_add_data_scenario_outline

  Scenario Outline: TC01_testing_data_table_web_page
    Given user should be on the web table page
    And user should add new data by clicking new button
    When user input the first name "<firstname>"
    When user input the last name  "<lastname>"
    When user input the position    "<position>"
    When user input the office      "<offive>"
    When user input the extension "<extension>"
    When user input the start date "<startdate>"
    When user input the salary "<salary>"
    Then user clicks on the create button
    And search for the first name "<firstname>"
    Then verify the name fields contains first name "<firstname>"
    Examples:
      | firstname | lastname | position | offive | extension | startdate | salary |
      | ali       | jt       |dr        |hq      |100        |2020-10-10 |1000    |
      | mali       | jt       |dr        |hq      |100        |2020-10-10 |1000    |
