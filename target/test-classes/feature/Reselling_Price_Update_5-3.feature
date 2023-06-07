@Reselling_Price_Update
Feature: Reselling Price Update
  I want go to Reselling Price Update

  @click_on_Reselling_Price_Update
  Scenario: Reselling Price Update
  	#RPU contains "Reselling Price Update"
    Given I need to navigate LOLC FusionX Loging page for RPU
    When I enter RPU1 <Username>
    And I click continue button RPU
    And I enter RPU <Password>
    And I click the sign in button RPU
    And I click Yard Management option RPU
    And I click on Post Yard Management RPU
    And I select Reselling Price Update RPU
    And I enter Yard In Date From RPU
    And I enter Yard In Date To RPU
    And I enter vehicle number RPU
    And I click search button RPU
    And I scroll div horizontally RPU
    And I click update button RPU
    And I scroll down to save RPU
    And I click save button RPU
    And I click ok button RPU