@tag1
Feature: Yard Operation
  I want to View Update Yard Operations

  @click_on_view_yard_operation
  Scenario: View Yard Operation
  	#VUYO contains "View Update Yard Operaation"
    Given I need to navigate LOLC FusionX Loging page for VUYO
    When I enter VUYO1 <Username>
    And I click continue button VUYO
    And I enter VUYO <Password>
    And I click the sign in button VUYO
    And I click Yard Management option VUYO
    And I click on Yard In VUYO
    And I select Yard Operation VUYO
    And I click on view update yard operation VUYO
    And I enter search value VUYO
    And I press the view button VUYO
    And I scroll to down in view VUYO
    And I press ok button in view VUYO
    
  @click_on_edit_yard_operation_with_insurance_details
  	Scenario: Update Yard Operation
  	#VUYO contains "View Update Yard Operaation"
    Given I need to navigate LOLC FusionX Loging page for VUYO
    When I enter VUYO1 <Username>
    And I click continue button VUYO
    And I enter VUYO <Password>
    And I click the sign in button VUYO
    And I click Yard Management option VUYO
    And I click on Yard In VUYO
    And I select Yard Operation VUYO
    And I click on view update yard operation VUYO
    And I enter search value VUYO
    And I press the update button VUYO
    And I scroll down to uploads VUYO
    And I upload an image VUYO
    And I upload a file VUYO
    And I scroll down to other conditions VUYO
    And I set test condition as yes VUYO
    And I set test condition date VUYO
    And I scroll down to insurance details VUYO
    And I change Insurance Expiry Date VUYO
    And I change License Expiry Date VUYO
    And I select transmission type VUYO
    And I select fuel type VUYO
    And I set milage VUYO
    And I number of owners VUYO
    And I scroll down to save VUYO
    And I click save button VUYO
    And I click yes button VUYO