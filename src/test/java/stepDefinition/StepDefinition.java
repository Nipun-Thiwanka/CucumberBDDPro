package stepDefinition;

import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import cucumber_pro.CucumberBDDPro.Base;
import cucumber_pro.CucumberBDDPro.Landing;



public class StepDefinition extends Base {
	
	@Given("^I need to navigate LOLC FusionX Loging page$")
    public void i_need_to_navigate_lolc_fusionx_loging_page() throws InterruptedException {
	   driver=inheritance();
	   driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	}
	
	@Given("^I need to navigate LOLC FusionX Loging page uat$")
    public void i_need_to_navigate_lolc_fusionx_loging_page_uat() throws Throwable {
		driver=inheritance();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
    }

	@When("I enter <Username>")
	public void i_enter_username() {
		Landing var1=new Landing(driver);
	    var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");;
	}
	
	@And("^I click continue button$")
    public void i_click_continue_button() 
	{
		Landing var1=new Landing(driver); 
		var1.clickContinueButton().click();
    }

	@When("I enter <Password>")
	public void i_enter_password() {
		Landing var1=new Landing(driver);
	    var1.typePassword().sendKeys("Hecember@1234");
	}

	@When("I click the sign in button")
	public void i_click_the_sign_in_button() throws InterruptedException {
		Landing var1=new Landing(driver);
		var1.clicksubmit().click();
	    //Thread.sleep(2000);
	    
	}
	@And("^I click Yard in option$")
    public void i_click_yard_in_option() throws Throwable
	{
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		Landing var1=new Landing(driver);
		var1.clickYardIn().click();
		Thread.sleep(2000);
		
    }
	@And("^I click on Mark as Seized$")
    public void i_click_on_mark_as_seized() throws Throwable 
	{
		Landing var1=new Landing(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.ClickonMarkasSeized().click();
    }

	@And("^I click on Mark as Seized HandedOver$")
    public void i_click_on_mark_as_seized_handedover() throws Throwable 
	{
		Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.ClickonMarkasSeizedHandedOver().click();
		var1.ClickonHandOverButton().click();
    }
	
	@And("^I click on search bar$")
    public void i_click_on_search_bar() throws Throwable {
		Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.clickOnSearchBar().click();
    }

    @And("^I enter search value$")
    public void i_enter_search_value() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.clickOnSearchBar().sendKeys("1111");
    }
    
    @And("^I enter search value uat$")
    public void i_enter_search_value_uat() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.clickOnSearchBar().sendKeys("123452");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @And("^I click on dropdown$")
    public void i_click_on_dropdown() throws Throwable {
    	Thread.sleep(3000);
		Landing var1=new Landing(driver);
		var1.clickOnDrodown().click();
    }
    
    @And("^I select by chassis number$")
    public void i_select_by_chassis_number() throws Throwable {
    	Thread.sleep(1000);
		Landing var1=new Landing(driver);
		var1.clickOnChassisNum().click();
    }
    
    @And("^I select by contract number$")
    public void i_select_by_contract_number() throws Throwable {
    	Thread.sleep(1000);
		Landing var1=new Landing(driver);
		var1.clickOnContracNum().click();
    }
    
    @And("^I select by serial number$")
    public void i_select_by_serial_number() throws Throwable {
    	Thread.sleep(1000);
		Landing var1=new Landing(driver);
		var1.clickOnSerialNum().click();
    }
    
    @And("^I select by repossess order number$")
    public void i_select_by_repossess_order_number() throws Throwable {
    	Thread.sleep(1000);
		Landing var1=new Landing(driver);
		var1.clickOnRepossessOrderNum().click();
    }


    @And("^I press the search button$")
    public void i_press_the_search_button() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.clickOnSearchBtn().click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @And("^I click on of search option$")
    public void i_select_on_of_search_options() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
    	var1.selectOnSearchResult().click();
    }
    
    @And("^I click on select button$")
    public void i_click_on_select_button() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
    	var1.clickOnSelectBtn().click();
    }
    
    @And("^I click on select button in qa domain$")
    public void i_click_on_select_button_in_qa_domain() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
    	var1.clickOnSelectBtnInQA().click();
    }
    
    @And("^User need to scroll div$")
    public void user_need_to_scroll_div() throws Throwable {
    	Thread.sleep(2000);
        Landing var1 = new Landing(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToSelect());
    }
    
    @And("^User need mark as handovered$")
    public void user_need_mark_as_handovered() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.selectToSave().click();
    }
    
    @And("^User need to scroll back div$")
    public void user_need_to_scroll_back_div() throws Throwable {
    	 Thread.sleep(2000);
    	 Landing var1 = new Landing(driver);
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("arguments[0].scrollIntoView();", var1.scrollBackToSelect());
    }
    
    @And("^User need to save$")
    public void user_need_to_save() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.selectandSave().click();
    }
    
    @And("^User Select ok$")
    public void user_select_ok() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.yesToSave().click();
    }
    
    @And("^User Select ok with contract num$")
    public void user_select_ok_with_contract_num() throws Throwable {
    	Thread.sleep(2000);
		Landing var1=new Landing(driver);
		var1.yesToSaveWithContractNum().click();
    }
	
}
