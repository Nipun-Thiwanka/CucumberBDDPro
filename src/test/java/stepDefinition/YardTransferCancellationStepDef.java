package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yardTransferCancellation.YardTransferCancellationMain;
import yardTransferCancellation.YardTransferCancellationSub;

public class YardTransferCancellationStepDef extends YardTransferCancellationMain {
    @Given("^I need to navigate LOLC FusionX Loging page for YTCa$")
    public void i_need_to_navigate_lolc_fusionx_loging_page_for_ytca() throws Throwable {
        driver=inheritanceYTCa();
        driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("^I enter YTCa1 (.+)$")
    public void i_enter_ytca1(String username) throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
    }

    @And("^I click continue button YTCa$")
    public void i_click_continue_button_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.clickContinueButton().click();
    }

    @And("^I enter YTCa (.+)$")
    public void i_enter_ytca(String password) throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.typePassword().sendKeys("September@1234");
    }

    @And("^I click the sign in button YTCa$")
    public void i_click_the_sign_in_button_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.clicksubmit().click();
    }

    @And("^I click Yard Management option YTCa$")
    public void i_click_yard_management_option_ytca() throws Throwable {
    	Thread.sleep(5000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrollToYardManagement());
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        var1.clickYardManagement().click();
		Thread.sleep(10000);
    }

    @And("^I click on Yard Transfer YTCa$")
    public void i_click_on_yard_transfer_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	    driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1.clickOnYardTransfer().click();
    }

    @And("^I select Yard Transfer Cancellation YTCa$")
    public void i_select_yard_transfer_cancellation_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.clickOnYardTransferCancellation().click();
    }

    @And("^I enter search values YTCa$")
    public void i_enter_search_values_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.EnterSearchValue().sendKeys("QG2547");
    }

    @And("^I click search button YTCa$")
    public void i_click_search_button_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.ClickSearchButton().click();
    }

    @And("^I select search result YTCa$")
    public void i_select_search_result_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.ClickSelectButton().click();
    }

    @And("^I scroll div horizontally YTCa$")
    public void i_scroll_div_horizontally_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToTick());
    }

    @And("^I enter remarks YTCa$")
    public void i_enter_remarks_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.EnterRemarks().sendKeys("Test Remarks");
    }

    @And("^I tick on check box YTCa$")
    public void i_tick_on_check_box_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.ClickCheckBox().click();
    }

    @And("^I click save button YTCa$")
    public void i_click_save_button_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.ClickSaveButton().click();
    }

    @And("^I click ok button YTCa$")
    public void i_click_ok_button_ytca() throws Throwable {
        Thread.sleep(1000);
        YardTransferCancellationSub var1 = new YardTransferCancellationSub(driver);
        var1.ClickOkButton().click();
    }
}
