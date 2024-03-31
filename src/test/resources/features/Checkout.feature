Feature: Checkout product

  As an user, I want checkout product from this webiste

  Background:
    Given user is already on the landing page
    When user clicks on the Log In menu button
    And input "useralfian1" as the Username  and input "useralfian1" as the Password for login
    And user clicks the Log In button
    And user click on Nokia Lumia-1520
    Then user click add to cart button
    And product successfully added to cart
    And user click on cart menu button

  @Positive-Case
  Scenario: User wants checkout item with all complete data
    And click on place order button
    And place order pop up will be showed
    Then user input "Alfian Uhuy" as Name and "1234XXX" as credit card on place order field
    And click purchase button
    And thank you for your purchase pop up will be showed

  @Negative-Case
  Scenario: User wants checkout item without complete data
    And click on place order button
    And place order pop up will be showed
    Then user input "Alfian Uhuy" as Name place order field
    And click purchase button
    And pop up Fill out credit card will be showed

  @Negative-Case
  Scenario: User wants checkout item without complete data
    And click on delete item button
    And click on place order button
    And place order pop up will be showed
    Then user input "Alfian Uhuy" as Name and "1234XXX" as credit card on place order field
    And click purchase button
    And pop up You have to add at least one item will be showed