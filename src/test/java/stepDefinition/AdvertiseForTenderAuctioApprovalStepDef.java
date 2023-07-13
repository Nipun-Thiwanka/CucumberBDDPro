package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;


import advertiseForTenderAuctioApproval.AdvertiseForTenderAuctioApprovalMain;
import advertiseForTenderAuctioApproval.AdvertiseForTenderAuctioApprovalSub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AdvertiseForTenderAuctioApprovalStepDef extends AdvertiseForTenderAuctioApprovalMain {
	
	@Given("I need to navigate Fusion X Loging page CAFTA")
	public void i_need_to_navigate_fusion_x_loging_page_cafta()throws Throwable {
		driver=inheritanceCAFTA();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
	}
	
	@When("I enter   <Username> CAFTA")
	public void i_enter_username_cafta() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	
	@When("I click continue button  CAFTA")
	public void i_click_continue_button_cafta() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.clickContinueButton().click();
		Thread.sleep(2000); 
	}
	
	@When("I enter CAFTA <Password>")
	public void i_enter_cafta_password() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		 var1.typePassword().sendKeys("September@1234");
		 Thread.sleep(2000);
	}
	
	@When("I click the sign in buttonCAFTA")
	public void i_click_the_sign_in_button_cafta() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.clicksubmit().click();
		Thread.sleep(6000);
	}
	
	@When("I Scroll to Yard Management")
	public void i_scroll_to_yard_management() throws Throwable{
		Thread.sleep(3000);
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
	}

	@When("I click Yard Management CAFTA")
	public void i_click_yard_management_cafta() throws Throwable{
		Thread.sleep(5000);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	
	@When("I click on Post Yard Management CAFTA")
	public void i_click_on_post_yard_management_cafta() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickPostYardManagement().click();
	}

	@When("I Click Advertise For Tender Auction Approval  CAFTA")
	public void i_click_advertise_for_tender_auction_approval_cafta()throws Throwable {
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.AdvertiseForTenderAuctionApproval().click();
		Thread.sleep(6000);
	}
	
	@When("I search by Approval Use CAFTA")
	public void i_search_by_approval_use_cafta() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		 var1.SearchApprovalUse().sendKeys("seniya");
		 Thread.sleep(2000);
	}
	
	@When("I Click the Search Btn CAFTA")
	public void i_click_the_search_btn_cafta()  throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.ClickSearchBtn().click();
		Thread.sleep(6000);
	}

	@When("I Scroll to View btn CAFTA")
	public void i_scroll_to_view_btn_cafta() throws Throwable{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollToViewBtn());
	      Thread.sleep(6000);
	}

	@When("I Click View Btn CAFTA")
	public void i_click_view_btn_cafta()throws Throwable {
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.ClickViewBtnCAFTA().click();
		Thread.sleep(6000);
	}
	
	@When("I Scroll to check box")
	public void i_scroll_to_check_box() throws Throwable{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollToCheckBox());
	      Thread.sleep(6000);
	}

	@When("I tick on Approve or Reject check boxes CAFTA")
	public void i_tick_on_approve_or_reject_check_boxes_cafta() throws Throwable {
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.ApproveorRejectcheckboxes().click();
		Thread.sleep(6000);
	}
	
	@When("I enter comment CAFTA")
	public void i_enter_comment_cafta()throws Throwable {
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		 var1.EnterTheComment().sendKeys("Check Comment");
		 Thread.sleep(2000);
	}
	
	@When("I click on Save button CAFTA")
	public void i_click_on_save_button_cafta()  throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.ClickONSaveBtn().click();
		Thread.sleep(6000);
	}
	
	@When("I Click Ok SAve Btn CAFTA")
	public void i_click_ok_s_ave_btn_cafta() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.ClickOKSaveBtn().click();
		Thread.sleep(6000);	
	}
	
	// @Click_on_Approved_Vehicle_List_For_Advertise

	@When("I Click Approved Vehicle List For Advertise CAVLIFA")
	public void i_click_approved_vehicle_list_for_advertise_cavlifa() throws Throwable {
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.ApprovedVehicleList().click();
		Thread.sleep(6000);	
	}
	
	@When("I search by Asset Sub Type CAVLIFA")
	public void i_search_by_asset_sub_type_cavlifa() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		 var1. AssetSubType().sendKeys("THREE-WHEELER");
		 Thread.sleep(2000);
	}

	@When("I search by Vehicle No  CAVLIFA")
	public void i_search_by_vehicle_no_cavlifa() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		 var1.VehicleNo().sendKeys("YZ7262");
		 Thread.sleep(2000);
	}
	
	@When("I search by Yard Name CAVLIFA")
	public void i_search_by_yard_name_cavlifa() throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		 var1.YardName().sendKeys("WELLAMPITIYA");
		 Thread.sleep(2000);
	}
	
	@When("I search by Advertise Date From CAVLIFA")
	public void i_search_by_advertise_date_from_cavlifa() throws Throwable{
		 Thread.sleep(2000);
		 AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
	        var1.AdvertiseDateFrom().click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = ''", var1.AdvertiseDateFrom());
	        var1.AdvertiseDateFrom().sendKeys("2021-05-04");
	        Thread.sleep(2000);
	}
	
	@When("I search by Advertise Date To CAVLIFA")
	public void i_search_by_advertise_date_to_cavlifa() throws Throwable{
		 Thread.sleep(2000);
		 AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
	        var1.AdvertiseDateTo().sendKeys("2023-05-17");
	}
	
	@When("I Click search Btn CAVLIFA")
	public void i_click_search_btn_cavlifa()  throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.ClickSearchBTN().click();
		Thread.sleep(6000);
	}
	@When("I Scroll To Export Btn  CAVLIFA")
	public void i_scroll_to_export_btn_cavlifa() throws Throwable {
		Thread.sleep(3000);
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1. ScrollToExportBtn());
	   	Thread.sleep(3000);
	}
	@When("I Click Export Btn CAVLIFA")
	public void i_click_export_btn_cavlifa()  throws Throwable{
		AdvertiseForTenderAuctioApprovalSub var1=new AdvertiseForTenderAuctioApprovalSub(driver);
		var1.ClickExportBtn().click();
		Thread.sleep(6000);
	}

}
