package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import vSDP_Approval.VSDP_ApprovalMain;
import vSDP_Approval.VSDP_ApprovalSub;
public class VSDP_ApprovalStepDef extends VSDP_ApprovalMain{


	@Given("I need to navigate Fusion X Loging page CVA")
	public void i_need_to_navigate_fusion_x_loging_page_cva() throws Throwable{
		driver=inheritanceCVA ();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
	}
	@When("I enter   <Username> CVA")
	public void i_enter_username_cva() throws Throwable{
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	@When("I click continue button  CVA")
	public void i_click_continue_button_cva() throws Throwable{
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		var1.clickContinueButton().click();
		Thread.sleep(2000); 
	}
	@When("I enter CVA <Password>")
	public void i_enter_cva_password() throws Throwable{
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		 var1.typePassword().sendKeys("September@1234");
		 Thread.sleep(2000);
	}
	@When("I click the sign in button CVA")
	public void i_click_the_sign_in_button_cva() throws Throwable{
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		var1.clicksubmit().click();
		Thread.sleep(6000);
	}
	
	@When("I click Yard Management CVA")
	public void i_click_yard_management_cva() throws Throwable{
		Thread.sleep(5000);
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	@When("I click on Post Yard Management CVA")
	public void i_click_on_post_yard_management_cva() throws Throwable{
		Thread.sleep(6000);
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickPostYardManagement().click();
	}
	@When("I Scroll to VSDP_Approval  CVA")
	public void i_scroll_to_vsdp_approval_cva() throws Throwable{
		Thread.sleep(5000);
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToOfferApproval());
	   	Thread.sleep(6000);
	}
	@When("I Click VSDP_Approval CVA")
	public void i_click_vsdp_approval_cva() throws Throwable{
		Thread.sleep(6000);
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		var1.clickVSDPApproval().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
	}
	@When("I Search vehicle Number CVA")
	public void i_search_vehicle_number_cva() throws Throwable{
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		var1.SearchVehicleNumber().sendKeys("AAY4113");
		Thread.sleep(2000);
	}
	@When("I Click Search BTN  CVA")
	public void i_click_search_btn_cva() throws Throwable{
		Thread.sleep(3000);
		VSDP_ApprovalSub  var1=new VSDP_ApprovalSub(driver);
		var1.ClickOnSerachBTN().click();
		
	}



}
