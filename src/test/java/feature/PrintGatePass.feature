@Yard_release
Feature: Title of your feature
  I want to use this template for my feature file

  @Click_On_Print_Gate_Pass
  Scenario: Print Gate Pass
  #CPGP contains "Click on PrintGatePass"
   Given I need to navigate Fusion X Loging page CPGP
    When I enter   <Username>  CPGP
    And I click continue button   CPGP
    And I enter  CPGP <Password> 
    And I click the sign in button CPGP
    And I Scroll to Yard Management CPGP
    And I click Yard Management CPGP
    And I click on Yard release CPGP
    And I Click on print gate pass CPGP
    And I Enter  vehicle Number CPGP
    #And I Enter NIC Number CPGP
    #And I Enter buyer Name CPGP
    #And I Select Yard name CPGP
    And I click Search BTN  CPGP
    And I Scroll To check Box CPGP
    And I Click Check Box  CPGP
    And I Scroll To Print gatepass CPGP 
    And I Click Print CPGP 
    And I Click Ok BTN CPGP