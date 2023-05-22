
@Click_on_Hand_Over
Feature: Mark As Seized/Hand over
  I want to use this template for my feature file

  @search_by_vehicle_number
  Scenario: Update the status of vehicle with vehicle number
    Given I need to navigate LOLC FusionX Loging page uat
    When I enter <Username>
    And I click continue button
    And I enter <Password>
    And I click the sign in button
    And I click Yard in option
    And I click on Mark as Seized 
    And I click on Mark as Seized HandedOver
    And I click on search bar
    And I enter search value uat
    And I press the search button
    And I click on of search option
    And User need to scroll div
    And User need mark as handovered
    And User need to scroll back div
    And User need to save
    And User Select ok
    
    @search_by_contract_number
    Scenario: Update the status of vehicle with contract number
    Given I need to navigate LOLC FusionX Loging page
    When I enter <Username>
    And I click continue button
    And I enter <Password>
    And I click the sign in button
    And I click Yard in option
    And I click on Mark as Seized 
    And I click on Mark as Seized HandedOver
    And I click on search bar
    And I enter search value
    And I click on dropdown
    And I select by contract number
    And I press the search button
    And I click on select button in qa domain
    And User need to scroll div
    And User need mark as handovered
    And User need to scroll back div
    And User need to save
    And User Select ok with contract num
    
    @search_by_chassis_number
    Scenario: Update the status of vehicle with chassis number
    Given I need to navigate LOLC FusionX Loging page
    When I enter <Username>
    And I click continue button
    And I enter <Password>
    And I click the sign in button
    And I click Yard in option
    And I click on Mark as Seized 
    And I click on Mark as Seized HandedOver
    And I click on search bar
    And I enter search value
    And I click on dropdown
    And I select by chassis number
    And I press the search button
    And I click on select button in qa domain
    And User need to scroll div
    And User need mark as handovered
    And User need to scroll back div
    And User need to save
    And User Select ok with contract num
    
    @search_by_serial_number
    Scenario: Update the status of vehicle with serial number
    Given I need to navigate LOLC FusionX Loging page
    When I enter <Username>
    And I click continue button
    And I enter <Password>
    And I click the sign in button
    And I click Yard in option
    And I click on Mark as Seized 
    And I click on Mark as Seized HandedOver
    And I click on search bar
    And I enter search value
    And I click on dropdown
    And I select by serial number
    And I press the search button
    #And I click on select button in qa domain
    #And User need to scroll div
    #And User need mark as handovered
    #And User need to scroll back div
    #And User need to save
    #And User Select ok with contract num
    
    @search_by_repossess_order_number
    Scenario: Update the status of vehicle with repossess order number
    Given I need to navigate LOLC FusionX Loging page
    When I enter <Username>
    And I click continue button
    And I enter <Password>
    And I click the sign in button
    And I click Yard in option
    And I click on Mark as Seized 
    And I click on Mark as Seized HandedOver
    And I click on search bar
    And I enter search value
    And I click on dropdown
    And I select by repossess order number
    And I press the search button
    #And I click on select button in qa domain
    #And User need to scroll div
    #And User need mark as handovered
    #And User need to scroll back div
    #And User need to save
    #And User Select ok with contract num