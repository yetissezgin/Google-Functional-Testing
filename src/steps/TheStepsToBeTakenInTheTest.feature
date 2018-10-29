Feature: The system testing of Google Search Engine

  Scenario Outline: User will access to Google mainpage and type keywords later, checks wheter the results are relevant to the keywords
    Given User is on google home page
    When User types <keywords> and click the search button
    Then User checks if the titles of the websites listed contain <keywords>

    Examples: 
      | keywords       |
      | galatasaray    |
      | test case      |
      | system testing |
