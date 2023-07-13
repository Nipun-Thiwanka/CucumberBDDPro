package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import markAsYardOut.MarkAsYardOutMain;
import markAsYardOut.MarkAsYardOutSub;
import printGatePass.PrintGatePassSub;

public class MarkAsYardOutStepDef extends MarkAsYardOutMain  {


	@Given("I need to navigate Fusion X Loging page COMY")
	public void i_need_to_navigate_fusion_x_loging_page_comy()  throws Throwable{
		driver=inheritanceCOMY();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@When("I enter   <Username>  COMY")
	public void i_enter_username_comy()  throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	@When("I click continue button   COMY")
	public void i_click_continue_button_comy()  throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		var1.clickContinueButton().click();
		Thread.sleep(2000);
	}
	@When("I enter COMY<Password>")
	public void i_enter_comy_password()  throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		 var1.typePassword().sendKeys("September@1234");
		 Thread.sleep(2000);
	}
	@When("I click the sign in button COMY")
	public void i_click_the_sign_in_button_comy()  throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
			var1.clicksubmit().click();
			Thread.sleep(2000);
	}
	@When("I Scroll to Yard Management COMY")
	public void i_scroll_to_yard_management_comy()  throws Throwable{
		Thread.sleep(3000);
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
	}
	@When("I click Yard Management COMY")
	public void i_click_yard_management_comy()  throws Throwable{
		Thread.sleep(5000);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	@When("I click on Yard release COMY")
	public void i_click_on_yard_release_comy()  throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1.clickYardRelease().click();
	   
	}
	
	@When("I Scroll to Mark As Yard Out COMY")
	public void i_scroll_to_mark_as_yard_out_comy1() throws Throwable{
		Thread.sleep(3000);
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToMarkAsYardOut());
	}
	
	@When("I Click on Mark As Yard Out COMY")
	public void i_click_on_mark_as_yard_out_comy() throws Throwable{
		Thread.sleep(2000);
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		var1. clickMarkAsYardOut().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
		
	}
	@When("I Enter  vehicle Number COMY")
	public void i_enter_vehicle_number_comy() throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		 var1.EntervehicleNumber().sendKeys("NC3909");
		 Thread.sleep(2000);
	}
	@When("I click Search BTN  COMY")
	public void i_click_search_btn_comy() throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		var1. ClickOnSearchBTN().click();
		Thread.sleep(2000);
	}
	@When("I Scroll To check Box COMY")
	public void i_scroll_to_check_box_comy() throws Throwable{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollToCheckbox());
	    Thread.sleep(3000);

	}
	@When("I Select Date Time  COMY")
	public void i_select_date_time_comy() throws Throwable{
		Thread.sleep(2000);
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
        var1.SelectDateTime().click();
        Thread.sleep(2000);
        var1.SelectDateTime().sendKeys("2023-07-12 00:00:00");
        Thread.sleep(2000);
        var1.OKDateTime().click(); 
	}
	@When("I Click Check Box COMY")
	public void i_click_check_box_comy() throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		var1.ClickCheckbox().click();
		Thread.sleep(2000);
	}
	 @When("I Scroll To Update COMY")
     public void i_scroll_to_update_comy() throws Throwable{
		Thread.sleep(3000);
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToUpdate());
	}
	@When("I Click Update BTN COMY")
	public void i_click_update_btn_comy() throws Throwable{
		MarkAsYardOutSub var1=new  MarkAsYardOutSub(driver);
		var1.ClickUpdate().click();
		Thread.sleep(2000);
	}

	
}
