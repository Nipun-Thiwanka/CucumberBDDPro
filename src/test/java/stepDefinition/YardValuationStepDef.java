package stepDefinition;


import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.internal.Lists;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yardEvaluationn.YardEvaluationnMain;
import yardEvaluationn.YardEvaluationnSub;


public class YardValuationStepDef extends YardEvaluationnMain {
	
	@Given("I need to navigate Fusion X Loging page CANYV")
	public void i_need_to_navigate_fusion_x_loging_page_canyv()  throws Throwable {
		driver=inheritanceYVN();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
	}

	@When("I enter   <Username> CANYV")
	public void i_enter_username_canyv() throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	
	@When("I click continue button  CANYV")
	public void i_click_continue_button_canyv() throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver); 
		var1.clickContinueButton().click();
		Thread.sleep(2000); 
	}
	
	@When("I enter CANYV  <Password>")
	public void i_enter_canyv_password() throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		 var1.typePassword().sendKeys("September@1234");
		 Thread.sleep(2000);
	}
	
	@When("I click the sign in button CANYV")
	public void i_click_the_sign_in_button_canyv() throws Throwable{
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.clicksubmit().click();
		Thread.sleep(6000);
	}
	@When("I click Yard Management CANYV")
	public void i_click_yard_management_canyv() throws Throwable {
		Thread.sleep(5000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        Thread.sleep(5000);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	
	@When("I click on Post Yard Management CANYV")
	public void i_click_on_post_yard_management_canyv() throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickPostYardManagement().click();
	}
	
	@When("I click The Yard Valuation CANYV")
	public void i_click_the_yard_valuation_canyv() throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
		var1.clickTheYardValuation().click();
	}
	
	@When("I click The Add New Yard Valuation CANYV")
	public void i_click_the_add_new_yard_valuation_canyv()throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub  var1=new YardEvaluationnSub (driver);
		var1. AddNewYardValuation().click();
	}
	
	@When("I click The View or Update Yard Valuation CANYV")
	public void i_click_the_view_or_update_yard_valuation_canyv() throws InterruptedException {
		Thread.sleep(3000);
		YardEvaluationnSub  var1=new YardEvaluationnSub (driver);
		var1.  ViewOrUpdateYardValuation().click();
	}
	
	@When("I  Enter the Vehicle Number CANYV")
	public void i_enter_the_vehicle_number_canyv() throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.EntertheVehicleNumberValuation().sendKeys("HM1289");
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
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1. ClicktheSearchBtnValuation().click();
		Thread.sleep(3000);
	}
	
	@When("I Click  the Scroll btn CANYV")
	public void i_click_the_scroll_btn_canyv() throws Throwable {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  YardEvaluationnSub  var1 = new YardEvaluationnSub(driver);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.clicktheScrollBtnValuation());
	}
	
	@When("I Click  the Scroll btn to view CANYV")
	public void i_click_the_scroll_btn_to_view_canyv() throws Throwable{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  YardEvaluationnSub  var1 = new YardEvaluationnSub(driver);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.clicktheScrollBtnValuationview());
	      Thread.sleep(3000);
	}
	
	@When("I Click  the ReValuation btn CANYV")
	public void i_click_the_re_valuation_btn_canyv() throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.clicktheReValuationbtn().click();
		
	}
	
	
	@When("I Enter  the FS Value  CANYV")
	public void i_enter_the_fs_value_canyv() throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.EnterTheFSValue().sendKeys("350");
		
	}

	@When("I Click Valuer  CANYV")
	public void i_click_valuer_canyv() throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickValuer().click();
		
	}
	
	@When("I Click  the Select Btn CANYV")
	public void i_click_the_select_btn_canyv() throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
		var1.ClickSelectBtnValue().click();
		
	}
	
	@When("I click the  Down Scroll Btn CANYV")
	public void i_click_the_down_scroll_btn_canyv() throws Throwable{
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownValuation());
	}
	
	@When("I Upload The File CANYV")
	public void i_upload_the_file_canyv()throws Throwable {
		Thread.sleep(1000);
	    String fileURL = "https://www.orimi.com/pdf-test.pdf";
	    URL url = new URL(fileURL);
	    InputStream inputStream = url.openStream();
	    File tempFile = File.createTempFile("temp", ".pdf");
	    FileUtils.copyInputStreamToFile(inputStream, tempFile);
	    String filePath = tempFile.getAbsolutePath();
    	YardEvaluationnSub var1=new YardEvaluationnSub(driver);
    	var1.FileUploadValue().sendKeys(filePath);
    	Thread.sleep(1000);
	}
	@When("I Click the View Upload  CANYV")
	public void i_click_the_view_upload_canyv()throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
		var1.ClickViewUpload().click();
		
	}
	@When("I Click the OK Btn View  Upload  CANYV")
	public void i_click_the_ok_btn_view_upload_canyv() throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
		var1.ClickOkBTNViewUpload().click();
		Thread.sleep(3000);
	}
	
	@When("I click the  Down Scroll Btn2 CANYV")
	public void i_click_the_down_scroll_btn2_canyv() throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownBtnValuation());
	}

	@When("I Tick on Valuation Condition check boxes CANYV")
	public void i_tick_on_valuation_condition_check_boxes_canyv() throws Throwable{
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ValuationConditionCheckBoxes().click();
		Thread.sleep(3000);
	}
	@When("I click the  Down Scroll Btn3 CANYV")
	public void i_click_the_down_scroll_btn3_canyv()throws Throwable{
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownBtnValuation3());
	}
	
	@When("I Click on Add New CANYV")
	public void i_click_on_add_new_canyv()  throws Throwable{
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickAddNewValuation().click();
		Thread.sleep(3000);
	}
	
	@When("I Click Ok Btn add New CANYV")
	public void i_click_ok_btn_add_new_canyv()  throws Throwable{
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickOKBtnAddNewValuation().click();
		Thread.sleep(3000);
	}

	@When("I Enter External Valuation CANYV")
	public void i_enter_external_valuation_canyv() throws Throwable{
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickExternalValuation().click();
		Thread.sleep(3000);
	}
	
	@When("I Click Select Btn EX CANYV")
	public void i_click_select_btn_ex_canyv() throws Throwable{
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickSelectBtnEx().click();
		Thread.sleep(3000);
	}

	@When("I click the  Down Scroll Btn4 CANYV")
	public void i_click_the_down_scroll_btn4_canyv() throws Throwable{
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownBtnValuation4());
	   	Thread.sleep(3000);
	}
	
	@When("I Click on Save button CANYV")
	public void i_click_on_save_button_canyv() throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickSavebuttonValuation().click();
		Thread.sleep(3000);
	}
	@When("I Click Ok Btn Save CANYV")
	public void i_click_ok_btn_save_canyv() throws Throwable{
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickOkSaveBtnValuation().click();
		Thread.sleep(3000);
	}
	
	@When("I View uploaded report CANYV")
	public void i_view_uploaded_report_canyv() throws Throwable{
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ViewUploadedReport().click();
		Thread.sleep(3000);
	}

	
//	@Click_On_View_or_Update_Yard_Valuation
	
	
	@When("I Click  the View btn CANYV")
	public void i_click_the_view_btn_canyv()throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1. ClicktheViewbtnValu().click();
		Thread.sleep(3000);
	}
	@When("I Click the Close btn CANYV")
	public void i_click_the_close_btn_canyv() throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClicktheCloseBtnValu().click();
		Thread.sleep(3000);
	}
	@When("I Click  the Update btn CANYV")
	public void i_click_the_update_btn_canyv()throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClicktheUpdateBtnValu().click();
		Thread.sleep(3000);
	}
	@When("I click the  Down Scroll Btn to update btn1 CANYV")
	public void i_click_the_down_scroll_btn_to_update_btn1_canyv()throws Throwable {
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollUpdateBtn1Valuation());
	   	Thread.sleep(3000);
	}

	@When("I Click Update Btn1 CANYV")
	public void i_click_update_btn1_canyv() throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1. ClickUpdateBtn1Valuation().click();
		Thread.sleep(3000);
	}

	@When("I Click Ok Update Btn1 CANYV")
	public void i_click_ok_update_btn1_canyv()throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickOKUpdateBtn1Valuation().click();
		Thread.sleep(3000);
	}

	@When("I Scroll to Update Btn CANYV")
	public void i_scroll_to_update_btn_canyv() throws Throwable{
		Thread.sleep(3000);
		YardEvaluationnSub var1=new YardEvaluationnSub (driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrolltosaveBtnValuation());
	   	Thread.sleep(3000);
	}

	@When("I Click on Update button CANYV")
	public void i_click_on_update_button_canyv()throws Throwable {
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickUpdateBtnValuation().click();
		Thread.sleep(3000);
	}

	@When("I Click on Save to Update btn CANYV")
	public void i_click_on_save_to_update_btn_canyv() throws Throwable{
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1. ClickSaveUpdateBtnValuation().click();
		Thread.sleep(3000);
	}
	@When("I Click Ok Btn to Save Update  CANYV")
	public void i_click_ok_btn_to_save_update_canyv() throws Throwable{
		YardEvaluationnSub var1=new YardEvaluationnSub(driver);
		var1.ClickSaveOkUpdateBtnValuation().click();
		Thread.sleep(3000);
	}



}






	
	  




