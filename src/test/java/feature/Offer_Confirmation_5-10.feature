@Offer_Confirmation
Feature: Offer Confirmation
  I want go to Offer Confirmation

  @click_on_Offer_Confirmation
  Scenario: Offer Confirmation
  	#OC contains "Offer Confirmation"
    Given I need to navigate LOLC FusionX Loging page for OC
    When I enter OC1 <Username>
    And I click continue button OC
    And I enter OC <Password>
    And I click the sign in button OC
    And I click Yard Management option OC
    And I click on Post Yard Management OC
    And I scroll down OC
    And I select Offer confirmation OC
    And I enter vehicle no OC
    And I click view button OC
    And I select payment method OC
    And I tick approve OC
    And I click save button OC