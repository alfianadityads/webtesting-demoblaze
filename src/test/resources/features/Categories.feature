Feature: See categories for product in web

  As an user, I want see products based on categories

  Background:
    Given user is already on the landing page

  @Positive-Case
  Scenario: User want select phones on categories menu
    When the user clicks on the Phones button in the category field
    Then the phone products are displayed

  @Positive-Case
  Scenario: User want select laptops on categories menu
    When the user clicks on the Laptops button in the category field
    Then the laptops products are displayed

  @Positive-Case
  Scenario: User want select monitors on categories menu
    When the user clicks on the Monitors button in the category field
    Then the monitors products are displayed