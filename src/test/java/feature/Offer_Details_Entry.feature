@Offer_Details_Entry
Feature: Offer Details Entry
  I want go to Offer Details Entry

  @click_on_Add_New_Offer_Entry_Details
  Scenario: Add New Offer Entry Details
  	#OED contains "Advertise For Tender & Auction"
    Given I need to navigate LOLC FusionX Loging page for OED
    When I enter OED1 <Username>
    And I click continue button OED
    And I enter OED <Password>
    And I click the sign in button OED
    And I click Yard Management option OED
    And I click on Post Yard Management OED