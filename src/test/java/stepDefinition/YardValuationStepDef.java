package stepDefinition;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.internal.Lists;

import clickOnAddNewYardIn.ClickOnAddNewYardInSub;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yardvaluation.YardValuationMain;
import yardvaluation.YardValuationSub;

public class YardValuationStepDef extends YardValuationMain {
	
	@Given("I need to navigate Fusion X Loging page CANYV")
	public void i_need_to_navigate_fusion_x_loging_page_canyv()  throws Throwable {
		driver=inheritanceYV();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
	}

	@When("I enter   <Username> CANYV")
	public void i_enter_username_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	
	@When("I click continue button  CANYV")
	public void i_click_continue_button_canyv() throws Throwable {
		 YardValuationSub var1=new YardValuationSub(driver); 
		var1.clickContinueButton().click();
		Thread.sleep(2000); 
	}
	
	@When("I enter CANYV  <Password>")
	public void i_enter_canyv_password() throws Throwable {
		 YardValuationSub var1=new YardValuationSub(driver);
		 var1.typePassword().sendKeys("Hecember@1234");
		 Thread.sleep(2000);
	}
	
	@When("I click the sign in button CANYV")
	public void i_click_the_sign_in_button_canyv() throws Throwable{
		YardValuationSub var1=new YardValuationSub(driver);
		var1.clicksubmit().click();
	}
	
	@When("I click Yard Management CANYV")
	public void i_click_yard_management_canyv() throws Throwable {
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		YardValuationSub var1=new YardValuationSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	
	@When("I click on Post Yard Management CANYV")
	public void i_click_on_post_yard_management_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickPostYardManagement().click();
	}
	
	@When("I click The Yard Valuation CANYV")
	public void i_click_the_yard_valuation_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.clickTheYardValuation().click();
	}
	
	@When("I click The Add New Yard Valuation CANYV")
	public void i_click_the_add_new_yard_valuation_canyv()throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1. AddNewYardValuation().click();
	}
	
	@When("I  Enter the Vehicle Number CANYV")
	public void i_enter_the_vehicle_number_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.EntertheVehicleNumberValuation().sendKeys("QB9335");
		Thread.sleep(2000);
	}
//	@When("I Enter the Contract Number CANYV")
//	public void i_enter_the_contract_number_canyv() throws Throwable {
//		YardValuationSub var1=new YardValuationSub(driver);
//		var1.EntertheContractNumberValuation().sendKeys("F7-02-3447DA");
//		Thread.sleep(2000);
//	}
//	
//	@When("I Enter the Chassis Number CANYV")
//	public void i_enter_the_chassis_number_canyv() throws Throwable {
//		YardValuationSub var1=new YardValuationSub(driver);
//		var1.EntertheVehicleNumberValuation().sendKeys("KD0582");
//		Thread.sleep(2000);
//	}

	@When("I Click  the Search btn CANYV")
	public void i_click_the_search_btn_canyv()throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1. ClicktheSearchBtnValuation().click();
	}
	
	@When("I Click  the Scroll btn CANYV")
	public void i_click_the_scroll_btn_canyv() throws Throwable {
		  Thread.sleep(2000);
		  YardValuationSub  var1 = new YardValuationSub (driver);
	      WebElement element = var1.clicktheScrollBtnValuation();
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.clicktheScrollBtnValuation());
	}
	
	@When("I Click  the ReValuation btn CANYV")
	public void i_click_the_re_valuation_btn_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.clicktheReValuationbtn().click();
	}
	
	@When("I Enter  the FS Value  CANYV")
	public void i_enter_the_fs_value_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.EnterTheFSValue().sendKeys("350");
		Thread.sleep(3000);
	}

	@When("I Click Valuer  CANYV")
	public void i_click_valuer_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.ClickValuer().click();
		Thread.sleep(3000);
	}
	
	@When("I Click  the Select Btn CANYV")
	public void i_click_the_select_btn_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.ClickSelectBtnValue().click();
		Thread.sleep(3000);
	}
	
	@When("I  click the  Down Scroll Btn CANYV")
	public void i_click_the_down_scroll_btn_canyv() throws Throwable {
		Thread.sleep(2000);
		YardValuationSub  var1 = new YardValuationSub (driver);
	    WebElement element = var1.ScrollDownValuation();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollDownValuation());
	}
	
	@When("I Upload The File CANYV")
	public void i_upload_the_file_canyv()throws Throwable {
		Thread.sleep(3000);
    	String filePath = "C:\\Users\\IshankaPu\\Pictures\\Screenshots";
    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
    	var1.FileUpload().sendKeys(filePath);
	}
	
	@When("I Tick on Valuation Condition check boxes")
	public void i_tick_on_valuation_condition_check_boxes()throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.ValuationConditionCheckBoxes().click();
		Thread.sleep(3000);
	}
	
	@When("I Click on Add New")
	public void i_click_on_add_new()throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.ClickSelectBtnValue().click();
		Thread.sleep(3000);
	}
	
	@When("I Enter External Valuation")
	public void i_enter_external_valuation() throws Throwable{
		YardValuationSub var1=new YardValuationSub(driver);
		var1.EnterTheFSValue().sendKeys("350");
		Thread.sleep(3000);
	}
	
	@When("I Click on Save button")
	public void i_click_on_save_button() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.ClickSelectBtnValue().click();
		Thread.sleep(3000);
	}
	
	@When("I View uploaded report")
	public void i_view_uploaded_report() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}






	
	  




