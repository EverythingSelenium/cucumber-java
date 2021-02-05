@ui
Feature: Hover Over

  Background:
    Given I am in the home page of https://the-internet.herokuapp.com/
    When navigate to Hovers page

  Scenario Outline: verify a user is able to hover over an element
    When I hover over <figure> on hover page
    Then The user name is displayed as <userName>
    Examples:
    |figure|userName|
    |figure1|user1  |
    |figure2|user2  |
    |figure3|user3  |
