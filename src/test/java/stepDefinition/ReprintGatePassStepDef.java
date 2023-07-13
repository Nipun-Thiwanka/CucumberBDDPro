package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import printGatePass.PrintGatePassSub;
import reprintGatePass. ReprintGatePassSub ;
import reprintGatePass.ReprintGatePassMain;



public class ReprintGatePassStepDef extends ReprintGatePassMain {
	


	@Given("I need to navigate Fusion X Loging page CRGP")
	public void i_need_to_navigate_fusion_x_loging_page_crgp() throws Throwable{
		driver=inheritanceCRGP();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@When("I enter   <Username>  CRGP")
	public void i_enter_username_crgp() throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	@When("I click continue button   CRGP")
	public void i_click_continue_button_crgp() throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		var1.clickContinueButton().click();
		Thread.sleep(2000);
	}
	@When("I enter  CRGP <Password>")
	public void i_enter_crgp_password()  throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		 var1.typePassword().sendKeys("September@1234");
		 Thread.sleep(2000);
	}
	@When("I click the sign in button CRGP")
	public void i_click_the_sign_in_button_crgp()  throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
			var1.clicksubmit().click();
			Thread.sleep(2000);
	}
	@When("I Scroll to Yard Management CRGP")
	public void i_scroll_to_yard_management_crgp() throws Throwable{
		Thread.sleep(3000);
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
	}
	@When("I click Yard Management CRGP")
	public void i_click_yard_management_crgp() throws Throwable{
		Thread.sleep(5000);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	@When("I click on Yard release CRGP")
	public void i_click_on_yard_release_crgp() throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1.clickYardRelease().click();
	}
	
	@When("I scroll to Reprint gate pass CRGP")
	public void i_scroll_to_reprint_gate_pass_crgp() throws Throwable{
		Thread.sleep(3000);
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrolltoReprintgatepass());
	}
	@When("I Click on Reprint gate pass CRGP")
	public void i_click_on_reprint_gate_pass_crgp()  throws Throwable{
		Thread.sleep(3000);
		ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		var1.clickRePrintGatePass().click();
		Thread.sleep(6000);
	}
	@When("I Enter  vehicle Number CRGP")
	public void i_enter_vehicle_number_crgp()  throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		 var1.EntervehicleNumber().sendKeys("QV5691");
		 Thread.sleep(2000);
	}
	@When("I Enter NIC Number CRGP")
	public void i_enter_nic_number_crgp()  throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		 var1.EnterNICNumber().sendKeys("");
		 Thread.sleep(2000);
	}
	@When("I Enter buyer Name CRGP")
	public void i_enter_buyer_name_crgp()  throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		 var1.buyerName().sendKeys("");
		 Thread.sleep(2000);
	
	}
	@When("I Select Yard name CRGP")
	public void i_select_yard_name_crgp()  throws Throwable{
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		 var1.SelectYardName().click();
		 Thread.sleep(3000);
		 var1. ClickAll().click();
		 Thread.sleep(3000);
	}
	@When("I click Search BTN  CRGP")
	public void i_click_search_btn_crgp()  throws Throwable{
		Thread.sleep(3000);
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		var1.ClickOnSearchBTN().click();
		Thread.sleep(6000);
	}
	@When("I Scroll To Print CRGP")
	public void i_scroll_to_print_crgp()  throws Throwable{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollToCheckbox());
	    Thread.sleep(3000);
	}
	@When("I Scroll To check Box CRGP")
	public void i_scroll_to_check_box_crgp()  throws Throwable{
		Thread.sleep(3000);
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToPrint());
	}
	@When("I Click Check Box  CRGP")
	public void i_click_check_box_crgp()  throws Throwable{
		Thread.sleep(3000);
		 ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		var1. ClickCheckbox().click();
		
	}
	
	@When("I Click Print CRGP")
	public void i_click_print_crgp()  throws Throwable{
		Thread.sleep(3000);
		ReprintGatePassSub var1=new  ReprintGatePassSub(driver);
		var1.  ClickPrint().click();
		Thread.sleep(3000);
		var1.ClickOkBTN().click();

		
	}
		
	}

