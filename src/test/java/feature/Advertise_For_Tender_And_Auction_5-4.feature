@Advertise_For_Tender_&_Auction
Feature: Advertise For Tender & Auction
  I want go to Advertise For Tender & Auction

  @click_on_Advertise_For_Tender_&_Auction
  Scenario: Advertise For Tender & Auction
  	#AFTnA contains "Advertise For Tender & Auction"
    Given I need to navigate LOLC FusionX Loging page for AFTnA
    When I enter AFTnA1 <Username>
    And I click continue button AFTnA
    And I enter AFTnA <Password>
    And I click the sign in button AFTnA
    And I click Yard Management option AFTnA
    And I click on Post Yard Management AFTnA
    And I select Advertise For Tender and Auction AFTnA
    And I enter branch AFTnA
    And I select Advertised Status AFTnA
    And I enter vehicle number AFTnA
    And I click search button AFTnA
    And I select type AFTnA
    And I enter Advertise date AFTnA
    And I enter auction date AFTnA
    And I click approval user button AFTnA
    And I enter approval user name AFTnA
    And I scroll horizontally approval user div AFTnA
    And I click select user button AFTnA
    And I scroll down to selevt AFTnA
    And I scroll horizontally Advertise div AFTnA
    And I tick on Advertise checkbox AFTnA
    And I click save button AFTnA
    And I click ok button AFTnA