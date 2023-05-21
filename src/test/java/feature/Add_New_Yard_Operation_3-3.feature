@tag1
Feature: Yard Operation
  I want to use this template for my feature file

  @click_on_add_new_yard_operation
  Scenario: Add New Yard Operation
  	#ANYO contains "Add New Yard Operaation"
    Given I need to navigate LOLC FusionX Loging page for ANYO
    When I enter ANYO1 <Username>
    And I click continue button ANYO
    And I enter ANYO <Password>
    And I click the sign in button ANYO
    And I click Yard Management option ANYO
    And I click on Yard In ANYO
    And I select Yard Operation ANYO
    And I click on Add new yard operation ANYO
    And I enter search value ANYO
    And I press the search button ANYO
    And I need to scroll div ANYO
    # YO contains "yard operations"
    And I need click YO link ANYO
    And I scroll to down ANYO
    And I upload an image ANYO
    And I upload a file ANYO
    And I scroll down to Other Conditions ANYO
    And I select YES in CR Received ANYO
    And I change date in CR Received ANYO
    And I select YES in Objection ANYO
    And I change date in Objection ANYO
    And I scroll down to expire dates ANYO
    And I change Insurance Expiry Date ANYO
    And I change License Expiry Date ANYO
    And I select transmission type ANYO
    And I select fuel type ANYO
    And I set milage ANYO
    And I number of owners ANYO
    And I scroll down to save ANYO
    And I click save button ANYO
    And I click yes button ANYO
    

  @click_on_add_new_yard_operation_with_bonded_detail
  Scenario: Add New Yard Operation with bonded details
  	#ANYO contains "Add New Yard Operaation"
    Given I need to navigate LOLC FusionX Loging page for ANYO
    When I enter ANYO1 <Username>
    And I click continue button ANYO
    And I enter ANYO <Password>
    And I click the sign in button ANYO
    And I click Yard Management option ANYO
    And I click on Yard In ANYO
    And I select Yard Operation ANYO
    And I click on Add new yard operation ANYO
    And I enter search value ANYO
    And I press the search button ANYO
    And I need to scroll div ANYO
    # YO contains "yard operations"
    And I need click YO link ANYO
    And I scroll to down ANYO
    And I upload an image ANYO
    And I upload a file ANYO
    And I scroll down to Other Conditions ANYO
    And I select YES in CR Received ANYO
    And I change date in CR Received ANYO
    And I select YES in Objection ANYO
    And I change date in Objection ANYO
    And I scroll down to bonded details ANYO
    And I tick on bonded details ANYO 
    And I fill offence ANYO 
    And I fill police station ANYO 
    And I select bonded date ANYO 
    And I enter bonded value ANYO 
    And I select Next Hearing Date ANYO
    And I select Bonded Release Date ANYO
    And I click on select lawyer link ANYO
    And I enter lawyer name ANYO
    And I press lawyer search button ANYO
    And I press lawyer select button ANYO
    And I enter case number ANYO
    And I enter court house ANYO 
    And I enter Name Of the Person Appear ANYO
    And I enter remarks ANYO 
    And I scroll down to save ANYO
    And I click save button ANYO
    And I click yes button ANYO
    
    @click_on_add_new_yard_operation_with_sales_stop
  Scenario: Add New Yard Operation With Sales Stop
  	#ANYO contains "Add New Yard Operaation"
    Given I need to navigate LOLC FusionX Loging page for ANYO
    When I enter ANYO1 <Username>
    And I click continue button ANYO
    And I enter ANYO <Password>
    And I click the sign in button ANYO
    And I click Yard Management option ANYO
    And I click on Yard In ANYO
    And I select Yard Operation ANYO
    And I click on Add new yard operation ANYO
    And I enter search value ANYO
    And I press the search button ANYO
    And I need to scroll div ANYO
    # YO contains "yard operations"
    And I need click YO link ANYO
    And I scroll to down ANYO
    And I upload an image ANYO
    And I upload a file ANYO
    And I scroll down to Other Conditions ANYO
    And I select YES in CR Received ANYO
    And I change date in CR Received ANYO
    And I select YES in Objection ANYO
    And I change date in Objection ANYO
    And I scroll down to sales stop ANYO
    And I tick on sales stop check box ANYO
    And I click on Select Stop By link ANYO
    And I enter search value in Stop By link ANYO
    And I select search result in Stop By link ANYO
    And I enter Sales Stop Date ANYO
    And I select Sales Stop Reason ANYO
    And I enter Sales Stop Expire Date ANYO
    And I click on Sales Stop Save button ANYO
   	And I click on Sales Stop ok button ANYO
    And I click save button ANYO
    And I click yes button in sales stop ANYO