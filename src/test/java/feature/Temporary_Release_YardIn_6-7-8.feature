@Temporary_Yard_Release
Feature: Click on Temporary Release - Yard In
  I want go to Temporary Release - Yard In
  
  @click_on_Temporary_Yard_Release
  Scenario: Temporary Release - Yard In
  	#TR contains "Temporary Release"
    Given I need to navigate LOLC FusionX Loging page for TR
    When I enter TR1 <Username>
    And I click continue button TR
    And I enter TR <Password>
    And I click the sign in button TR
    And I click Yard Management option TR
    And I click on Yard Release TR
    And I scroll down TR
    And I select Temporary Release TR
    
    @click_on_Sold_And_Returns
  Scenario: Sold & Returns
  	#SR contains "Sold And Returns"
    Given I need to navigate LOLC FusionX Loging page for TR
    When I enter TR1 <Username>
    And I click continue button TR
    And I enter TR <Password>
    And I click the sign in button TR
    And I click Yard Management option TR
    And I click on Yard Release TR
    And I scroll down TR
    And I select Sold and Returns TR
    And I search and tick SR
    And I click save button