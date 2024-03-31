Feature: Contact

  As an user, I want to contact to the company

  Background:
    Given user is already on the landing page
    When click on contact menu button
    And new message pop up will appear

  @Positive-Case
  Scenario: User wants send message to company with all valid data
    And user input "alfian@example.com" as email, "Alfian Uhuy" as name, and "hemlo ma pren" as message
    Then click on send message button
    And thanks for the message pop up will appear

  @Negative-Case
  Scenario: User wants send message to company with invalid data
    And user input "alfian@example.com" as email and "Alfian Uhuy" as name
    Then click on send message button
    And please input message pop up will appear