Feature: searching function is working or not

  Scenario: searching for a topic using a keyword
    Given user is in search page
    When user enter the keyword
    And user press Enter key
    Then search result displayed


