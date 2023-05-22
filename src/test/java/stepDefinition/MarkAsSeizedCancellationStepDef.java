package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;


import mark_As_Seized_Cancellation.MarkAsSeizedCancellationMain;
import mark_As_Seized_Cancellation.MarkAsSeizedCancellationSub;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MarkAsSeizedCancellationStepDef extends MarkAsSeizedCancellationMain {

	@Given("^I need to navigate LOLC FusionX Loging page2$")
    public void i_need_to_navigate_lolc_fusionx_loging_page2() throws InterruptedException {
	   driver=inheritance2();
	   driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	}

	@When("I enter2 <Username>")
	public void i_enter_username2() {
		MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
	    var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");;
	}
	
	@And("^I click continue button2$")
    public void i_click_continue_button2() {
		MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver); 
		var1.clickContinueButton().click();
    }

	@When("I enter2 <Password>")
	public void i_enter_password2() {
		MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
	    var1.typePassword().sendKeys("Hecember@1234");
	}

	@When("I click the sign in button2")
	public void i_click_the_sign_in_button2() throws InterruptedException {
		MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
		var1.clicksubmit().click();
	}
	
	@And("^I click Yard in option2$")
    public void i_click_yard_in_option2() throws Throwable{
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
		var1.clickYardIn().click();
		Thread.sleep(5000);
    }
	
	@And("^I click on Mark as Seized2$")
    public void i_click_on_mark_as_seized2() throws Throwable {
		MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.ClickonMarkasSeized().click();	
    }
	
	 @And("^I click on Mark as Seized HandedOver Cancellation$")
	    public void i_click_on_mark_as_seized_handedover_cancellation() throws Throwable {
		 	Thread.sleep(3000);
		 	MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.ClickonMarkasSeizedHandedOverCancellation().click();
	    }
	 
	 @And("^I click on search bar2$")
	    public void i_click_on_search_bar2() throws Throwable {
			Thread.sleep(2000);
			MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.clickOnSearchBar().click();
	    }

	    @And("^I enter search value2$")
	    public void i_enter_search_value2() throws Throwable {
	    	Thread.sleep(3000);
	    	MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.clickOnSearchBar().sendKeys("123452");
	    }
	    
	    @And("^I press the search button2$")
	    public void i_press_the_search_button2() throws Throwable {
	    	Thread.sleep(5000);
	    	MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.clickOnSearchBtn().click();
	    }
	    
	    @And("^I click on select button2$")
	    public void i_click_on_select_button2() throws Throwable {
	    	Thread.sleep(5000);
	    	MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.clickOnSelectBtn().click();
	    }
	    
	    @And("^Scroll to edit2$")
	    public void scroll_to_edit2() throws Throwable {
	    	Thread.sleep(5000);
	    	MarkAsSeizedCancellationSub var1 = new MarkAsSeizedCancellationSub(driver);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToEdit());
	    }
	    
	    @And("^I enter remarks$")
	    public void i_enter_remarks() throws Throwable {
	    	Thread.sleep(5000);
	    	MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.enterRemarks().sendKeys("Testing");
	    }
	    
	    @And("^I click on check box$")
	    public void i_click_on_check_box() throws Throwable {
	    	Thread.sleep(5000);
	    	MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.clickOnCheckBox().click();
	    }
	    
	    @And("^I click save button2$")
	    public void i_click_save_button2() throws Throwable {
	    	Thread.sleep(5000);
	    	MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.clickSaveBtn().click();
	    }

	    @And("^I click ok to save$")
	    public void i_click_ok_to_save() throws Throwable {
	    	Thread.sleep(5000);
	    	MarkAsSeizedCancellationSub var1=new MarkAsSeizedCancellationSub(driver);
			var1.clickOkBtn().click();
	    }


}
