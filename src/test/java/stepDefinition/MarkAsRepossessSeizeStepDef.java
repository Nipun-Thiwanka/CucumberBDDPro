package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import markAsRepossessSeize.MarkAsRepossessSeizeMain;
import markAsRepossessSeize.MarkAsRepossessSeizeSub;

public class MarkAsRepossessSeizeStepDef extends MarkAsRepossessSeizeMain  {

	@Given("^I need to navigate LOLC FusionX Loging page1$")
    public void i_need_to_navigate_lolc_fusionx_loging_page1() throws InterruptedException {
	   driver=inheritance1();
	   driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	}

	@When("I enter1 <Username>")
	public void i_enter_username1() {
		MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
	    var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");;
	}
	
	@And("^I click continue button1$")
    public void i_click_continue_button1() {
		MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver); 
		var1.clickContinueButton().click();
    }

	@When("I enter1 <Password>")
	public void i_enter_password1() {
		MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
	    var1.typePassword().sendKeys("September@1234");
	}

	@When("I click the sign in button1")
	public void i_click_the_sign_in_button1() throws InterruptedException {
		MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.clicksubmit().click();
	}
	
	@And("^I click Yard in option1$")
    public void i_click_yard_in_option1() throws Throwable{
		Thread.sleep(5000);
		MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrollToYardManagement());
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		var1.clickYardIn().click();
		Thread.sleep(5000);
    }
	
	@And("^I click on Mark as Seized1$")
    public void i_click_on_mark_as_seized1() throws Throwable {
		MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.ClickonMarkasSeized().click();	
    }
	
	@And("^I click on Mark as Repossess Seized$")
    public void i_click_on_mark_as_repossess_seized() throws Throwable {
		Thread.sleep(3000);
		MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.ClickonMarkasSeizedHandedOver().click();
		Thread.sleep(3000);
		var1.ClickonRepossessButton().click();
    }
	
	@And("^I click on search bar1$")
    public void i_click_on_search_bar1() throws Throwable {
		Thread.sleep(2000);
		MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.clickOnSearchBar().click();
    }

    @And("^I enter search value1$")
    public void i_enter_search_value1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.clickOnSearchBar().sendKeys("1111");
    }
    
    @And("^I click on dropdown1$")
    public void i_click_on_dropdown1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.clickOnDrodown().click();
    }
    
    @And("^I select by contract number1$")
    public void i_select_by_contract_number1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.clickOnContracNum().click();
    }
    
    @And("^I select by chassis number1$")
    public void i_select_by_chassis_number1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.clickOnChassisNum().click();
    }
    
    @And("^I select by serial number1$")
    public void i_select_by_serial_number1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.clickOnSerialNum().click();
    }
    
    @And("^I press the search button1$")
    public void i_press_the_search_button1() throws Throwable {
    	Thread.sleep(10000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.clickOnSearchBtn().click();
    }
    
    @And("^I click on of search option1$")
    public void i_select_on_of_search_options1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
    	var1.clickOnSelectBtn().click();
    }
    
    @And("^I click on select button1$")
    public void i_click_on_select_button1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
    	var1.clickOnSelectBtnWithContractNum().click();
    }
    
    @And("^I click on select button with serial num1$")
    public void i_click_on_select_button_with_serial_num1() throws Throwable {
    	Thread.sleep(12000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
    	var1.clickOnSelectBtnWithSerialNum().click();
    }
    
    @And("^I select by repossess_order number1$")
    public void i_select_by_repossessorder_number1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
    	var1.clickOnRepossessOrderNum().click();
    }
    
    @And("^User need to scroll div1$")
    public void user_need_to_scroll_div1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1 = new MarkAsRepossessSeizeSub(driver);
        //WebElement element = var1.scrollToSelect();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToSelect());
    }
    
    @And("^User need mark as handovered1$")
    public void user_need_mark_as_handovered1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.selectToSave().click();
    }
    
    @And("^User need to scroll back div1$")
    public void user_need_to_scroll_back_div1() throws Throwable {
    	 Thread.sleep(2000);
    	 MarkAsRepossessSeizeSub var1 = new MarkAsRepossessSeizeSub(driver);
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("arguments[0].scrollIntoView();", var1.scrollBackToSave());
    }
    
    @And("^User need to save1$")
    public void user_need_to_save1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.selectandSave().click();
    }
    
    @And("^User Select ok1$")
    public void user_select_ok1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.yesToSave().click();
    }
    
    @And("^User Select ok with contract num1$")
    public void user_select_ok_with_contract_num1() throws Throwable {
    	Thread.sleep(2000);
    	MarkAsRepossessSeizeSub var1=new MarkAsRepossessSeizeSub(driver);
		var1.yesToSavewithContractNum().click();
    }
}
