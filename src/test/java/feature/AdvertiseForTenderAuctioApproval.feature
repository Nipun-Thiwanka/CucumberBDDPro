@Post_yard_Management 
Feature: Post Yard management
  I want to navigate Post Yard Management

 @Click_on_Advertise_For_Tender_Auction_Approval
  Scenario: Click on Advertise For Tender Auction Approval
 #CAFTA contains " Click on Advertise For Tender Auction Approval"
  	Given I need to navigate Fusion X Loging page CAFTA
    When I enter   <Username> CAFTA 
    And I click continue button  CAFTA
    And I enter CAFTA <Password> 
    And I click the sign in buttonCAFTA
    And I Scroll to Yard Management 
    And I click Yard Management CAFTA 
    And I click on Post Yard Management CAFTA
    And I Click Advertise For Tender Auction Approval  CAFTA
    And I search by Approval Use CAFTA
    And I Click the Search Btn CAFTA
    And I Scroll to View btn CAFTA
    And I Click View Btn CAFTA
    And I Scroll to check box
    And I tick on Approve or Reject check boxes CAFTA 
    And I enter comment CAFTA
    And I click on Save button CAFTA
    And I Click Ok SAve Btn CAFTA
   
    @Click_on_Approved_Vehicle_List_For_Advertise
  Scenario: 	Click on Approved Vehicle List For Advertise
 #CAVLIFA contains "Click on Approved Vehicle List For Advertise"
  		Given I need to navigate Fusion X Loging page CAFTA
    When I enter   <Username> CAFTA 
    And I click continue button  CAFTA
    And I enter CAFTA <Password> 
    And I click the sign in buttonCAFTA
    And I Scroll to Yard Management 
    And I click Yard Management CAFTA 
    And I click on Post Yard Management CAFTA
    And I Click Approved Vehicle List For Advertise CAVLIFA
    And I search by Asset Sub Type CAVLIFA
    And I search by Vehicle No  CAVLIFA
    And I search by Yard Name CAVLIFA
    And I search by Advertise Date From CAVLIFA
    And I search by Advertise Date To CAVLIFA
    And I Click search Btn CAVLIFA
    And I Scroll To Export Btn  CAVLIFA
    And I Click Export Btn CAVLIFA