@wip
Feature: US01 KoalaPalaceHotelRoomCreation

  Background: user is on the koala palace page
    Given Application should be available and should accessible with valid credidentials
    When user clicks login button
    And user input username
    And user input password
    Then user clicks login
    When user clicks hotel management
    When user clicks Hotel Rooms

  Scenario: TC01 Hotel room creation testing
    When user clicks on the ADD HOTELROOM button
    When user Select IDHotel
    When user input Code
    When user input the name
    When user input the location
    When user input description
    When user input price
    When user select Room type
    When user input Max adult count
    When user input Max children count
    When user clicks check box
    And click Save button
    Then verify hotel room created successfully

  Scenario: TC02 verify hotel room is created
    When user input the code to the code box
    When user clicks on the search button
    Then verify name field with your hotel name




