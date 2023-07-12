package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yardFeeCharge.YardFeeChargeMain;
import yardFeeCharge.YardFeeChargeSub;

public class YardFeeChargeStepDef extends YardFeeChargeMain {
	@Given("I need to navigate LOLC FusionX Loging page for YFC")
	public void i_need_to_navigate_lolc_fusion_x_loging_page_for_yfc() throws InterruptedException {
		driver=inheritancYFC();
        driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@When("I enter YFC1 <Username>")
	public void i_enter_yfc1_username() {
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
	}
	
	@When("I click continue button YFC")
	public void i_click_continue_button_yfc() {
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		var1.clickContinueButton().click();
	}
	
	@When("I enter YFC <Password>")
	public void i_enter_yfc_password() {
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		var1.typePassword().sendKeys("September@1234");
	}
	
	@When("I click the sign in button YFC")
	public void i_click_the_sign_in_button_yfc() throws InterruptedException {
		Thread.sleep(3000);
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		var1.clicksubmit().click();
	}
	
	@When("I click Yard Management option YFC")
	public void i_click_yard_management_option_yfc() throws InterruptedException {
		Thread.sleep(5000);
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrollToYardManagement());
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        var1.clickYardManagement().click();
		Thread.sleep(10000);
	}
	
	@When("I click on Yard Fee Charge YFC")
	public void i_click_on_yard_fee_charge_yfc() throws InterruptedException {
		Thread.sleep(5000);
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.YardFeeCharge().click();
	}
	
	@When("I select Yard Fee Charge YFC")
	public void i_select_yard_fee_charge_yfc() throws InterruptedException {
		Thread.sleep(5000);
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		var1.SelectYardFeeCharge().click();
	}
	
	@When("I select Yard Fee Charge Cancellation YFCC")
	public void i_select_yard_fee_charge_cancellation_yfcc() throws InterruptedException {
		Thread.sleep(5000);
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		var1.SelectYardFeeChargeCancellation().click();
	}
	
	@When("I search vehicle number YFC")
	public void i_search_vehicle_number_yfc() throws InterruptedException {
		Thread.sleep(2000);
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		var1.EnterVehicleNumber().sendKeys("QQ6272");
		Thread.sleep(2000);
		var1.ClickSearchButton().click();
		Thread.sleep(2000);
		var1.ClickSelectButton().click();
	}
	
	@When("I search vehicle number YFCC")
	public void i_search_vehicle_number_yfcc() throws InterruptedException {
		Thread.sleep(2000);
		YardFeeChargeSub var1 = new YardFeeChargeSub(driver);
		var1.EnterVehicleNumber().sendKeys("QQ6272");
		Thread.sleep(2000);
		var1.ClickSearchButton().click();
		Thread.sleep(2000);
		var1.ClickSelectButtonInCancedllation().click();
	}
	
	



}
