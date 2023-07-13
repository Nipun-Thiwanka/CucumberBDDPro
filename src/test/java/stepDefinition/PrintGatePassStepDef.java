package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import clickOnAddNewYardIn.ClickOnAddNewYardInSub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import printGatePass.PrintGatePassSub;
import yardEvaluationn.YardEvaluationnSub;
import printGatePass.PrintGatePassMain;

public class PrintGatePassStepDef extends PrintGatePassMain   {

	@Given("I need to navigate Fusion X Loging page CPGP")
	public void i_need_to_navigate_fusion_x_loging_page_cpgp() throws Throwable{
		driver=inheritanceGP ();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@When("I enter   <Username>  CPGP")
	public void i_enter_username_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
		
	@When("I click continue button   CPGP")
	public void i_click_continue_button_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1.clickContinueButton().click();
		Thread.sleep(2000);
	}
		
	@When("I enter  CPGP <Password>")
	public void i_enter_cpgp_password() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		 var1.typePassword().sendKeys("September@1234");
		 Thread.sleep(2000);
	}
		 
	@When("I click the sign in button CPGP")
	public void i_click_the_sign_in_button_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1.clicksubmit().click();
		Thread.sleep(6000);
	}

	@When("I Scroll to Yard Management CPGP")
	public void i_scroll_to_yard_management_cpgp() throws Throwable{
		Thread.sleep(3000);
		PrintGatePassSub var1=new PrintGatePassSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
	}

	@When("I click Yard Management CPGP")
	public void i_click_yard_management_cpgp() throws Throwable{
		Thread.sleep(5000);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	@When("I click on Yard release CPGP")
	public void i_click_on_yard_release_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1. clickYardRelease().click();
	}

	@When("I Click on print gate pass CPGP")
	public void i_click_on_print_gate_pass_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1.clickPrintGatePass().click();
		Thread.sleep(6000);

	}
	@When("I Enter  vehicle Number CPGP")
	public void i_enter_vehicle_number_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		 var1.EntervehicleNumber().sendKeys("YZ7262");
		 Thread.sleep(2000);
	}
	@When("I Enter NIC Number CPGP")
	public void i_enter_nic_number_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		 var1.EnterNICNumber().sendKeys("");
		 Thread.sleep(2000);
	}
	
	@When("I Enter buyer Name CPGP")
	public void i_enter_buyer_name_cpgp()  throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		 var1.buyerName().sendKeys("");
		 Thread.sleep(2000);
	}

	@When("I Select Yard name CPGP")
	public void i_select_yard_name_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
			 var1.SelectYardName().click();
			 Thread.sleep(3000);
			 var1. ClickAll().click();
	    
	}
	@When("I click Search BTN  CPGP")
	public void i_click_search_btn_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1.ClickOnSearchBTN().click();
		Thread.sleep(6000);

	}
	@When("I Scroll To check Box CPGP")
	public void i_scroll_to_check_box_cpgp() throws Throwable{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollToCheckbox());
	    Thread.sleep(3000);
	}
	@When("I Click Check Box  CPGP")
	public void i_click_check_box_cpgp() throws Throwable{
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1.ClickCheckbox().click();
		Thread.sleep(6000);

	}
	@When("I Scroll To Print CPGP")
	public void i_scroll_to_print_cpgp() throws Throwable{
		Thread.sleep(3000);
		PrintGatePassSub var1=new PrintGatePassSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToPrint());
	}
	@When("I Scroll To Print gatepass CPGP")
	public void i_scroll_to_print_gatepass_cpgp()  throws Throwable{
		Thread.sleep(3000);
		PrintGatePassSub var1=new PrintGatePassSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1. ScrollToPrintGatePass());
	}
	@When("I Click Print CPGP")
	public void i_click_print_cpgp() throws Throwable{
		Thread.sleep(3000);
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1. ClickPrint().click();
		Thread.sleep(6000);

	}
	
	@When("I Click Ok BTN CPGP")
	public void i_click_ok_btn_cpgp() throws Throwable{
		Thread.sleep(3000);
		PrintGatePassSub var1=new PrintGatePassSub(driver);
		var1.  ClickOkBTN().click();
		Thread.sleep(6000);
	}




	







}
