@Yard_Release
Feature: Yard Release
  I want go to Yard Release
  
@click_on_Release_Approval
  Scenario: Click on Release Approval
  	#RA contains "Release Approval"
    Given I need to navigate LOLC FusionX Loging page for YR
    When I enter YR1 <Username>
    And I click continue button YR
    And I enter YR <Password>
    And I click the sign in button YR
    And I click Yard Management option YR
    And I click on Yard Release YR
    And I select Release Approval RA
    And I search by vehicle number RA
    And I tick on approve check box RA
    And I click save button RA
    
  @click_on_Add_New_Yard_Release_with_Release_Type_Temporary_and_Release_Sub_Type_General
  Scenario: Add New Yard Release with Release Type Temporary and Release Sub Type General
  	#YR contains "Yard Release"
    Given I need to navigate LOLC FusionX Loging page for YR
    When I enter YR1 <Username>
    And I click continue button YR
    And I enter YR <Password>
    And I click the sign in button YR
    And I click Yard Management option YR
    And I click on Yard Release YR
    And I select Yard Release YR
    And I click Add new Yard Release YR
    And I select Release Type YR
    And I select Release Sub Type YR
    And I search vehicle number YR
    And I click select button YR
    And I enter return date YR
    And I enter Release Reason YR
    And I enter Release Checked by YR
    And I scroll down to check list YR
    And I scroll horizontally to check list YR
    And I tick check list YR
    And I scroll down to fill YR
    And I enter Handover Person Name YR
    And I enter Handover Person Contact No YR
    And I enter Address Line one YR
    And I enter Address Line two YR
    And I enter Address Line three YR
    And I enter City YR
    And I enter Special Remark YR
    And I click save button YR
    
     
    
     @click_on_Add_New_Yard_Release_with_Release_Type_Temporary_and_Release_Sub_Type_Dealer_Point
  Scenario: Add New Yard Release with Release Type Temporary and Release Sub Type Dealer Point 
  	#YR contains "Yard Release"
    Given I need to navigate LOLC FusionX Loging page for YR
    When I enter YR1 <Username>
    And I click continue button YR
    And I enter YR <Password>
    And I click the sign in button YR
    And I click Yard Management option YR
    And I click on Yard Release YR
    And I select Yard Release YR
    And I click Add new Yard Release YR
    And I select Release Type YR
    And I select Release Sub Type as Dealer Point YR
    And I search vehicle number YR
    And I click select button YR2
    And I enter return date YR
    And I enter Release Reason YR
    #And I enter Release Checked by YR
    And I scroll down to check list YR
    And I scroll horizontally to check list YR
    And I tick check list YR
    And I scroll down to fill YR
    And I search Release to dealer points YR
    And I enter Handover Person Name and others YR
    And I click save button YR

    @click_on_Add_New_Yard_Release_with_Release_Type_Permenent_and_Release_Sub_Type_To_Customer
  Scenario: Add New Yard Release with Release Type Permenent and Release Sub Type To Customer
  	#YR contains "Yard Release"
    Given I need to navigate LOLC FusionX Loging page for YR
    When I enter YR1 <Username>
    And I click continue button YR
    And I enter YR <Password>
    And I click the sign in button YR
    And I click Yard Management option YR
    And I click on Yard Release YR
    And I select Yard Release YR
    And I click Add new Yard Release YR
    And I select Release Type as permenent YR
    And I select Release Sub Type as to customer YR
    And I search vehicle number YR
    And I click select button YR2
    And I enter Settlement Type YR
    And I enter remaining fields YR
    And I Upload img YR
    And I click save button YR
    
    @click_on_Add_New_Yard_Release_with_Release_Type_Permenent_and_Release_Sub_Type_To_Buyer
  Scenario: Add New Yard Release with Release Type Permenent and Release Sub Type To Buyer
  	#YR contains "Yard Release"
    Given I need to navigate LOLC FusionX Loging page for YR
    When I enter YR1 <Username>
    And I click continue button YR
    And I enter YR <Password>
    And I click the sign in button YR
    And I click Yard Management option YR
    And I click on Yard Release YR
    And I select Yard Release YR
    And I click Add new Yard Release YR
    And I select Release Type as permenent YR
    And I select Release Sub Type as to buyer YR
    And I search vehicle number YR
    And I click select button YR3
    And I select Sale Method YR
    And I enter remaining fields YR2
    And I Upload img YR
    And I click save button YR
    
   
    