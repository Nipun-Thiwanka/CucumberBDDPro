package stepDefinition;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import com.beust.jcommander.internal.Lists;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yardRelease.YardReleaseMain;
import yardRelease.YardReleaseSub;

public class YardReleaseStepDef extends YardReleaseMain{
	@Given("I need to navigate LOLC FusionX Loging page for YR")
	public void i_need_to_navigate_lolc_fusion_x_loging_page_for_yr() throws InterruptedException {
	    driver=inheritancYR();
        driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("I enter YR1 <Username>")
	public void i_enter_yr1_username() {
	    YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
	}

	@When("I click continue button YR")
	public void i_click_continue_button_yr() {
	    YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.clickContinueButton().click();
	}

	@When("I enter YR <Password>")
	public void i_enter_yr_password() {
	    YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.typePassword().sendKeys("September@1234");
	}

	@When("I click the sign in button YR")
	public void i_click_the_sign_in_button_yr() throws InterruptedException {
		Thread.sleep(3000);
	    YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.clicksubmit().click();
	}

	@When("I click Yard Management option YR")
	public void i_click_yard_management_option_yr() throws InterruptedException {
		Thread.sleep(5000);
	    YardReleaseSub var1 = new YardReleaseSub(driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrollToYardManagement());
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        var1.clickYardManagement().click();
		Thread.sleep(10000);
	}

	@When("I click on Yard Release YR")
	public void i_click_on_yard_release_yr() {
		YardReleaseSub var1 = new YardReleaseSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickOnYardReleas().click();
	}

	@When("I select Yard Release YR")
	public void i_select_yard_release_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.SelectYardReleas().click();
	}

	@When("I click Add new Yard Release YR")
	public void i_click_add_new_yard_release_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickAddNewYardRelease().click();
	}

	@When("I select Release Type YR")
	public void i_select_release_type_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickReleaseType().click();
		Thread.sleep(2000);
		var1.SelectTemporary().click();
	}

	@When("I select Release Sub Type YR")
	public void i_select_release_sub_type_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickReleaseSubType().click();
		Thread.sleep(2000);
		var1.SelectGeneral().click();
	}

	@When("I search vehicle number YR")
	public void i_search_vehicle_number_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.enterVehicleNum().sendKeys("YC3818");
		Thread.sleep(2000);
		var1.ClickSearchBtn().click();
	}

	@When("I click select button YR")
	public void i_click_select_button_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToSelect());
		Thread.sleep(2000);
		var1.ClickSelectBtn().click();
	}

	@When("I enter return date YR")
	public void i_enter_return_date_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.enterReturnDate().sendKeys("2023-06-30");
		// LocalDate currentDate = LocalDate.now();
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		// String formattedDate = currentDate.format(formatter);
		// var1.enterReturnDate().sendKeys(formattedDate);
	}

	@When("I enter Release Reason YR")
	public void i_enter_release_reason_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.enterReleaseReason().sendKeys("Test Reason");
	}

	@When("I enter Release Checked by YR")
	public void i_enter_release_checked_by_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickOnCheckedByLink().click();
		Thread.sleep(2000);
		var1.SearchCheckedPerson().sendKeys("Lakshani Ma");
		Thread.sleep(2000);
		var1.SelectPerson().click();
	}

	@When("I scroll down to check list YR")
	public void i_scroll_down_to_check_list_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDowntToCheckLis());
	}

	@When("I scroll horizontally to check list YR")
	public void i_scroll_horizontally_to_check_list_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollHorizontallyToCheckLis());
	}

	@When("I tick check list YR")
	public void i_tick_check_list_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.TickCheckBox().click();
		var1.TickCheckBox1().click();
		var1.TickCheckBox2().click();
	}

	@When("I scroll down to fill YR")
	public void i_scroll_down_to_fill_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDowntToForm());
	}

	@When("I enter Handover Person Name YR")
	public void i_enter_handover_person_name_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.HandoverPersonName().sendKeys("Name");
	}

	@When("I enter Handover Person Contact No YR")
	public void i_enter_handover_person_contact_no_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.HandoverPersonContact().sendKeys("1234567890");
	}

	@When("I enter Address Line one YR")
	public void i_enter_address_line_one_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.HandoverPersonAddress1().sendKeys("Address 1");
	}

	@When("I enter Address Line two YR")
	public void i_enter_address_line_two_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.HandoverPersonAddress2().sendKeys("Address 2");
	}

	@When("I enter Address Line three YR")
	public void i_enter_address_line_three_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.HandoverPersonAddress3().sendKeys("Address 3");
	}

	@When("I enter City YR")
	public void i_enter_city_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.HandoverPersonCity().sendKeys("City");
	}

	@When("I enter Special Remark YR")
	public void i_enter_special_remark_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.HandoverPersonRemark().sendKeys("Test Remark");
	}

	@When("I click save button YR")
	public void i_click_save_button_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDowntToSave());
		Thread.sleep(1000);
		var1.ClickSaveBtn().click();
		// Thread.sleep(1000);
		// var1.ClickOkBtn().click();
	}


	@When("I select Release Sub Type as Dealer Point YR")
	public void i_select_release_sub_type_as_dealer_point_yr() throws InterruptedException {
   	Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickReleaseSubType().click();
		Thread.sleep(3000);
		var1.SelectDealerPoint().click();
	}

	@When("I click select button YR2")
	public void i_click_select_button_yr2() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToSelect2());
		Thread.sleep(2000);
		var1.ClickSelectBtn().click();
	}

	@When("I search Release to dealer points YR")
	public void i_search_release_to_dealer_points_yr() throws InterruptedException {
		Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.EnterDealerName().sendKeys("Test");
		Thread.sleep(1000);
		var1.ClickSelectSearchKey().click();
		Thread.sleep(2000);
		var1.SelectName().click();
		// Thread.sleep(2000);
		// var1.ClickSearchButton().click();
	}

	@When("I enter Handover Person Name and others YR")
	public void i_enter_handover_person_name_and_others_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.DealerPersonName().sendKeys("Name");
		Thread.sleep(2000);
		var1.DealerPersonNIC().sendKeys("1236549875V");
		var1.HandoverPersonAddress1().sendKeys("Addres1");
		var1.HandoverPersonAddress2().sendKeys("Addres2");
		var1.HandoverPersonAddress3().sendKeys("Addres3");
		var1.DealerPersonPO().sendKeys("1234");
	}
	
	@When("I select Release Type as permenent YR")
	public void i_select_release_type_as_permenentyr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickReleaseType().click();
		Thread.sleep(2000);
		var1.SelectPermenent().click();
	}

	@When("I select Release Sub Type as to customer YR")
	public void i_select_release_sub_type_as_to_customeryr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickReleaseSubType().click();
		Thread.sleep(2000);
		var1.SelectToCustomer().click();
	}
	
	@When("I enter Settlement Type YR")
	public void i_enter_settlement_type_yr() throws InterruptedException {
		Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickSettlementType().click();
		Thread.sleep(2000);
		var1.SelectFull().click();
	}
	
	@When("I enter remaining fields YR")
	public void i_enter_remaining_fields_yr() throws InterruptedException {
		Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToFill());
   	 	Thread.sleep(1000);
   	    var1.ClickSameCustomerReleaseCheckBox().click();
   	    Thread.sleep(1000);
   	    var1.ReceiptNo().sendKeys("1234");
	}

	@When("I Upload img YR")
	public void i_upload_img_yr() throws InterruptedException, IOException{
		Thread.sleep(2000);
		String fileURL = "https://www.kasandbox.org/programming-images/avatars/leaf-blue.png";
	    URL url = new URL(fileURL);
	    InputStream inputStream = url.openStream();
	    File tempFile = File.createTempFile("temp", ".png");
	    FileUtils.copyInputStreamToFile(inputStream, tempFile);
	    String imgPath = tempFile.getAbsolutePath();
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickToUploadImg().sendKeys(imgPath);
	    Thread.sleep(1000);
	}
	
	
	@When("I click select button YR3")
	public void i_click_select_button_yr3() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToSelect3());
		Thread.sleep(2000);
		var1.ClickSelectBtn().click();
	}
	
	@When("I select Release Sub Type as to buyer YR")
	public void i_select_release_sub_type_as_to_buyer_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickReleaseSubType().click();
		Thread.sleep(2000);
		var1.SelectToBuyer().click();
	}
	
	@When("I select Sale Method YR")
	public void i_select_sale_method_yr() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickSaleMethod().click();
		Thread.sleep(2000);
		var1.SelectTender().click();
		Thread.sleep(2000);
		var1.SaleValue().sendKeys("100000");
	}
	
	@When("I enter remaining fields YR2")
	public void i_enter_remaining_fields_yr2() throws InterruptedException {
		Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView();", var1.ScrollToFill2());
   	 	Thread.sleep(3000);
   	 	var1.Address1().sendKeys("Address1");
   	 	var1.Address2().sendKeys("Address2");
   	 	var1.Address3().sendKeys("Address3");
   	 	Thread.sleep(1000);
   	    var1.ClickSameCustomerReleaseCheckBox().click();
   	    Thread.sleep(1000);
   	    var1.ReceiptNo().sendKeys("1234");
	}

//Release Approval

	@When("I select Release Approval RA")
	public void i_select_release_approval_ra() throws InterruptedException{
	    Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.SelectReleaseApproval().click();
	}

	@When("I search by vehicle number RA")
	public void i_search_by_vehicle_number_ra() throws InterruptedException {
		Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.VehicleNu().sendKeys("DAB8017");
	}
	
	@When("I tick on approve check box RA")
	public void i_tick_on_approve_check_box_ra() throws InterruptedException {
		Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToTick());
        Thread.sleep(2000);
        var1.TickOnApproveCheckbox().click();
	}
	
	@When("I click save button RA")
	public void i_click_save_button_ra() throws InterruptedException {
		Thread.sleep(2000);
		YardReleaseSub var1 = new YardReleaseSub(driver);
		var1.ClickSave().click();
	}






}
