@Yard_Transfer
Feature: Yard Transfer
  I want go to Yard Transfer

  @click_on_yard_transfer_creation
  Scenario: Yard Transfer Creation
  	#YTC contains "Yard Transfer Creation"
    Given I need to navigate LOLC FusionX Loging page for YTC
    When I enter YTC1 <Username>
    And I click continue button YTC
    And I enter YTC <Password>
    And I click the sign in button YTC
    And I click Yard Management option YTC
    And I click on Yard Transfer YTC
    And I select Yard Transfer Creation YTC
    And I enter search values YTC
    And I click search button YTC
    And I select search result YTC
    And I scroll div horizontally YTC
    And I tick on sid glass check box YTC
    And I enter remarks on sid glass YTC
    And I tick on alternator check box YTC
    And I enter remarks on alternator YTC
    And I scroll to down YTC
    And I tick on ash tray check box YTC
    And I enter remarks on ash tray YTC
    And I scroll down to bottom YTC
    And I select transfer yard YTC
    And I enter remarks YTC
    And I scroll down to save YTC
    And I click save button YTC
    And I click ok button YTC