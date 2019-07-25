#Author: syntax team   or john.smith@wellfargo.com
@sprint3 @Control
Feature: UItestpractise home

  Background: 
    Given I navigate to UItestpractise

  @smoke
  Scenario: drag and drop
    When I see draganddrop title
    And I successfully draganddrop
    Then I see dropped message

  @smoke
  Scenario: Button Double Click
    When I double click the button
    And I see pop-up message
    Then I click ok button
    @smoke
      Scenario: Iframe
    When I switch to frame
    And i click to text box
    Than i write my name 
    
