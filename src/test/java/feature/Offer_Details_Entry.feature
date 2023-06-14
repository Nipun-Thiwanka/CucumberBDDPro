@Offer_Details_Entry
Feature: Offer Details Entry
  I want go to Offer Details Entry

  @click_on_Add_New_Offer_Entry_Details
  Scenario: Add New Offer Entry Details
  	#OED contains "Offer Entry Details"
    Given I need to navigate LOLC FusionX Loging page for OED
    When I enter OED1 <Username>
    And I click continue button OED
    And I enter OED <Password>
    And I click the sign in button OED
    And I click Yard Management option OED
    And I click on Post Yard Management OED
    And I scroll down OED
    And I select Offer Details Entry OED
    And I click Add New Offer Details Entry OED
    And I enter vehicle number OED
    And I click search button OED
    And I click select button OED
    And I select method as auction OED
    And I select Auction Reference OED
    And I scroll down to select buyer OED
    And I tick new buyer radio button OED
    And I enter buyer name OED
    And I enter buyer NIC OED
    And I enter buyer mobile num OED
    And I enter offer OED
    And I select payment method OED
    #And I select Marketing officer OED
    And I upload file OED
    And I scroll down to add OED
    And I click add button OED
    And I scroll down to save OED
    And I click save button OED
    And I click ok button OED

     @click_View_And_Update_Offer_Entry_Details
  Scenario: View And Update Offer Entry Details
  	#UOED contains "Update Offer Entry Details"
    Given I need to navigate LOLC FusionX Loging page for OED
    When I enter OED1 <Username>
    And I click continue button OED
    And I enter OED <Password>
    And I click the sign in button OED
    And I click Yard Management option OED
    And I click on Post Yard Management OED
    And I scroll down OED
    And I select Offer Details Entry OED
    And I click View And Update Offer Details Entry UOED
    And I enter vehicle number UOED
    And I scroll div horizontally UOED
    And I click View Button UOED
    And I click Ok Button UOED
    And I click Update Button UOED
    And I update offer value UOED
    And I click save button UOED