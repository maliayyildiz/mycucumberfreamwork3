@hooks
Feature: US1000 Google search test

  Background: User is on the google page
    Given user is on the google page

  Scenario: TC01 Verify Iphone search
    And user search for "school bag"
    Then verify the result has "schol bag"

  Scenario: TC02 Verify tea pot search
    And  user search for tea pot
    Then verify the result has tea pot

  Scenario: TC03 Verify flower search
    And  user search for flower
    Then verify the result has flower