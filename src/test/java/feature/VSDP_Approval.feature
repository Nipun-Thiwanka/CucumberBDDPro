
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Click_on_VSDPApproval
  Scenario: Click_on_VSDPApproval
 CVA contains "Click on VSDPApproval"
  	Given I need to navigate Fusion X Loging page CVA 
    When I enter   <Username> CVA 
    And I click continue button  CVA
    And I enter CVA <Password> 
    And I click the sign in button CVA
    And I click Yard Management CVA
    And I click on Post Yard Management CVA
    And I Scroll to VSDP_Approval  CVA
    And I Click VSDP_Approval CVA
    And I Search vehicle Number CVA
    And I Click Search BTN  CVA
   