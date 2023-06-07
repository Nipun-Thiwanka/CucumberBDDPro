@Pending_Yard_Transfer
Feature: Pending Yard Transfer
  I want go to Yard Transfer

  @click_on_pending_yard_transfer_view_details
  Scenario: Pending Yard Transfer View
  	#PYT contains "Pending Yard Transfer"
    Given I need to navigate LOLC FusionX Loging page for PYT
    When I enter PYT1 <Username>
    And I click continue button PYT
    And I enter PYT <Password>
    And I click the sign in button PYT
    And I click Yard Management option PYT
    And I click on Yard Transfer PYT
    And I select Pending Yard Transfer PYT
    And I enter search values PYT
    And I click search button PYT
    And I scroll div horizontally PYT
    And I click view button PYT
    And I click ok button PYT

  @click_on_pending_yard_transfer_yard_in
  Scenario: Pending Yard Transfer Yard In
  	#PYT contains "Pending Yard Transfer"
    Given I need to navigate LOLC FusionX Loging page for PYT
    When I enter PYT1 <Username>
    And I click continue button PYT
    And I enter PYT <Password>
    And I click the sign in button PYT
    And I click Yard Management option PYT
    And I click on Yard Transfer PYT
    And I select Pending Yard Transfer PYT
    And I enter search values PYT
    And I click search button PYT
    And I scroll div horizontally PYT
    And I click yard in button PYT
    And I select yard PYT
    And I select yard in sub category PYT
    And I scroll down to yard in check list PYT
    And I tick on availability checkbox PYT
    And I enter item description PYT
    And I enter item count PYT
    And I scroll down to export check list PYT
    And I click export check list button PYT
    And I upload a file PYT
    And I enter remarks PYT
    And I click save button PYT
    And I click ok PYT