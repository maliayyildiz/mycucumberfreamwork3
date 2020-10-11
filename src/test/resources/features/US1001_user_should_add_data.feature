Feature: US1001_user_should_add_data

  Scenario: TC01_testing_data_table_web_page
    Given user should be on the web table page
    And user should add new data by clicking new button
    When user input the first name
    When user input the last name
    When user input the position
    When user input the office
    When user input the extension
    When user input the start date
    When user input the salary
    Then user clicks on the create button
    And search for the first name
    When search me
    Then verify the name fields contains first name



