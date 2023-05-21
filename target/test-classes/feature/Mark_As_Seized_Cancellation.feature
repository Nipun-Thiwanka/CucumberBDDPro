@tag
Feature: Mark As Seized/Hand over Cancellation
  I want to use this template for my feature file

  @search_by_vehicle_number_in_hand_over_Cancellation
  Scenario: Update the status of vehicle with vehicle number2
    Given I need to navigate LOLC FusionX Loging page2
    When I enter2 <Username>
    And I click continue button2
    And I enter2 <Password>
    And I click the sign in button2
    And I click Yard in option2
    And I click on Mark as Seized2
    And I click on Mark as Seized HandedOver Cancellation
    And I click on search bar2
    And I enter search value2
    And I press the search button2
    And I click on select button2
    And Scroll to edit2
    And I enter remarks
    And I click on check box
    And I click save button2
    And I click ok to save
