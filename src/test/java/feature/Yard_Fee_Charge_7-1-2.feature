@Yard_Fee_Charge
Feature: Click on Yard Fee Charge
  I want go to Yard Fee Charge
  
  @click_on_Yard_Fee_Charge
  Scenario: Yard_Fee_Charge
  	#YFC contains "Yard Fee Charge"
    Given I need to navigate LOLC FusionX Loging page for YFC
    When I enter YFC1 <Username>
    And I click continue button YFC
    And I enter YFC <Password>
    And I click the sign in button YFC
    And I click Yard Management option YFC
    And I click on Yard Fee Charge YFC
    And I select Yard Fee Charge YFC
    And I search vehicle number YFC
    
    @click_on_Yard_Fee_Charge_Cancellation
  Scenario: Yard_Fee_Charge_Cancellation
  	#YFCC contains "Yard Fee Charge Cancellation"
    Given I need to navigate LOLC FusionX Loging page for YFC
    When I enter YFC1 <Username>
    And I click continue button YFC
    And I enter YFC <Password>
    And I click the sign in button YFC
    And I click Yard Management option YFC
    And I click on Yard Fee Charge YFC
    And I select Yard Fee Charge Cancellation YFCC
    And I search vehicle number YFCC