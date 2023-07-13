@Yard_release
Feature: Title of your feature
  I want to use this template for my feature file

  @Click_On_RePrint_Gate_Pass
  Scenario: RePrint Gate Pass
  #CRGP contains "Click on REPrintGatePass"
   Given I need to navigate Fusion X Loging page CRGP
    When I enter   <Username>  CRGP
    And I click continue button   CRGP
    And I enter  CRGP <Password> 
    And I click the sign in button CRGP
    And I Scroll to Yard Management CRGP
    And I click Yard Management CRGP
    And I click on Yard release CRGP
    And I scroll to Reprint gate pass CRGP
    And I Click on Reprint gate pass CRGP
    And I Enter  vehicle Number CRGP
    And I Enter NIC Number CRGP
    And I Enter buyer Name CRGP
    And I Select Yard name CRGP
    And I click Search BTN  CRGP
    And I Click Check Box  CRGP
    And I Click Print CRGP 
    