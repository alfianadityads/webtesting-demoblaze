Feature: About us

  As an user, I want see about company

  Background:
    Given user is already is on landing page

  @Positive-Case
  Scenario: User watch video about us after login
    When user clicks on the Log In menu button
    And input "useralfian1" as the Username  and input "useralfian1" as the Password for login
    And user clicks the Log In button
    And click on about us menu button
    Then user click on the video
    And video can be played

  @Negative-Case
  Scenario: User watch video about us without login
    When click on about us menu button
    And user click on the video
    Then video can be played