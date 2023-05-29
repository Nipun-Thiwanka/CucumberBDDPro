@Yard_Transfer
Feature: Yard Transfer
  I want go to Yard Transfer

  @click_on_yard_transfer_cancellation
  Scenario: Yard Transfer Cancellation
  	#YTCa contains "Yard Transfer Cancellation"
    Given I need to navigate LOLC FusionX Loging page for YTCa
    When I enter YTCa1 <Username>
    And I click continue button YTCa
    And I enter YTCa <Password>
    And I click the sign in button YTCa
    And I click Yard Management option YTCa
    And I click on Yard Transfer YTCa
    And I select Yard Transfer Cancellation YTCa
    And I enter search values YTCa
    And I click search button YTCa
    And I select search result YTCa
    And I scroll div horizontally YTCa
    And I enter remarks YTCa
    And I tick on check box YTCa
    And I click save button YTCa
    And I click ok button YTCa