Feature: US1002_user_should_add_data_with_parameters

  Scenario: TC01_testing_data_table_web_page
    Given user should be on the web table page
    And user should add new data by clicking new button
    When user input the first name "ali"
    When user input the last name  "veli"
    When user input the position    "qa"
    When user input the office      "hq"
    When user input the extension "123"
    When user input the start date "2020-03-03"
    When user input the salary "1000"
    Then user clicks on the create button
    And search for the first name "ali"
    Then verify the name fields contains first name "ali"
