package stepDefinition;

import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import resellingPriceUpdate.ResellingPriceUpdateMain;
import resellingPriceUpdate.ResellingPriceUpdateSub;

public class ResellingPriceUpdateStepDef extends ResellingPriceUpdateMain{
    @Given("^I need to navigate LOLC FusionX Loging page for RPU$")
    public void i_need_to_navigate_lolc_fusionx_loging_page_for_rpu() throws Throwable {
        driver=inheritanceRPU();
        driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("^I enter RPU1 (.+)$")
    public void i_enter_rpu1(String username) throws Throwable {
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
    }

    @And("^I click continue button RPU$")
    public void i_click_continue_button_rpu() throws Throwable {
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.clickContinueButton().click();
    }

    @And("^I enter RPU (.+)$")
    public void i_enter_rpu(String password) throws Throwable {
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.typePassword().sendKeys("September@1234");
    }

    @And("^I click the sign in button RPU$")
    public void i_click_the_sign_in_button_rpu() throws Throwable {
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.clicksubmit().click();
    }

    @And("^I click Yard Management option RPU$")
    public void i_click_yard_management_option_rpu() throws Throwable {
    	Thread.sleep(5000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrollToYardManagement());
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
    }

    @And("^I click on Post Yard Management RPU$")
    public void i_click_on_post_yard_management_rpu() throws Throwable {
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	    driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1.clickOnPostYardManagement().click();
    }

    @And("^I select Reselling Price Update RPU$")
    public void i_select_reselling_price_update_rpu() throws Throwable {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.SelectResellingPriceUpdate().click();
    }

    @When("I enter Yard In Date From RPU")
    public void i_enter_yard_in_date_from_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.YardInDate().sendKeys("2023-01-03");
        Thread.sleep(2000);
        var1.ClickOnThree().click();
    }

    @When("I enter Yard In Date To RPU")
    public void i_enter_yard_in_date_to_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.TardInDateTo().click();
        Thread.sleep(2000);
        var1.SelectToDay().click();
    }

    @When("I enter vehicle number RPU")
    public void i_enter_vehicle_number_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.VehicleNumber().sendKeys("ABA7508");
    }

    @When("I click search button RPU")
    public void i_click_search_button_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.ClickSearchButton().click();
    }

    @When("I scroll div horizontally RPU")
    public void i_scroll_div_horizontally_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToClick());
    }

    @When("I click update button RPU")
    public void i_click_update_button_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.ClickUpdateButton().click();
    }

    @When("I scroll down to save RPU")
    public void i_scroll_down_to_save_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToSave());
    }

    @When("I click save button RPU")
    public void i_click_save_button_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.ClickSaveButton().click();
    }

    @When("I click ok button RPU")
    public void i_click_ok_button_rpu() throws InterruptedException {
        Thread.sleep(2000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.ClickOkButton().click();
    }

}
