package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yardTransferCreation.YardTransferCreationMain;
import yardTransferCreation.YardTransferCreationSub;

public class YardTransferCreationStepDef extends YardTransferCreationMain {

    @Given("^I need to navigate LOLC FusionX Loging page for YTC$")
    public void i_need_to_navigate_lolc_fusionx_loging_page_for_ytc() throws Throwable {
        driver=inheritanceYTC();
        driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("^I enter YTC1 (.+)$")
    public void i_enter_ytc1(String username) throws Throwable {
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
    }

    @And("^I click continue button YTC$")
    public void i_click_continue_button_ytc() throws Throwable {
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.clickContinueButton().click();
    }

    @And("^I enter YTC (.+)$")
    public void i_enter_ytc(String password) throws Throwable {
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.typePassword().sendKeys("Hecember@1234");
    }

    @And("^I click the sign in button YTC$")
    public void i_click_the_sign_in_button_ytc() throws Throwable {
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.clicksubmit().click();
    }

    @And("^I click Yard Management option YTC$")
    public void i_click_yard_management_option_ytc() throws Throwable {
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.clickYardManagement().click();
		Thread.sleep(5000);
    }

    @And("^I click on Yard Transfer YTC$")
    public void i_click_on_yard_transfer_ytc() throws Throwable {
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	    driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1.clickOnYardTransfer().click();
    }

    @And("^I select Yard Transfer Creation YTC$")
    public void i_select_yard_transfer_creation_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.clickOnYardTransferCreation().click();
    }

    @And("^I enter search values YTC$")
    public void i_enter_search_values_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.EnterSearchValue().sendKeys("QG2547");
    }

    @And("^I click search button YTC$")
    public void i_click_search_button_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.ClickSearchButton().click();
    }

    @And("^I select search result YTC$")
    public void i_select_search_result_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.ClickSelectButton().click();
    }

    @And("^I scroll div horizontally YTC$")
    public void i_scroll_div_horizontally_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToTick());
    }

    @And("^I tick on sid glass check box YTC$")
    public void i_tick_on_sid_glass_check_box_ytc() throws Throwable {
        Thread.sleep(5000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.ClickSidGlassCheckBox().click();
    }

    @And("^I enter remarks on sid glass YTC$")
    public void i_enter_remarks_on_sid_glass_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.EnterSidGlassRemarks().sendKeys("Test Remarks");
    }

    @And("^I tick on alternator check box YTC$")
    public void i_tick_on_alternator_check_box_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.ClickAlternatorCheckBox().click();
    }

    @And("^I enter remarks on alternator YTC$")
    public void i_enter_remarks_on_alternator_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.EnterAlternatorRemarks().sendKeys("Test Remarks");
    }

    @And("^I scroll to down YTC$")
    public void i_scroll_to_down_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToAshTray());
    }

    @And("^I tick on ash tray check box YTC$")
    public void i_tick_on_ash_tray_check_box_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.ClickAlshTrayCheckBox().click();
    }

    @And("^I enter remarks on ash tray YTC$")
    public void i_enter_remarks_on_ash_tray_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.EnterAlshTrayRemarks().sendKeys("Test Remarks");
    }

    @And("^I scroll down to bottom YTC$")
    public void i_scroll_down_to_bottom_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToBottom());
    }

    @And("^I select transfer yard YTC$")
    public void i_select_transfer_yard_ytc() throws Throwable {
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.ClickOnDropdownSelecYard().click();
		Thread.sleep(2000);
		var1.SelectGrandpass().click();
    }

    @And("^I enter remarks YTC$")
    public void i_enter_remarks_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.EnterRemarks().sendKeys("Test Remarks");
    }

    @And("^I scroll down to save YTC$")
    public void i_scroll_down_to_save_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToSave());
    }

    @And("^I click save button YTC$")
    public void i_click_save_button_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.ClickSaveButton().click();
    }

    @And("^I click ok button YTC$")
    public void i_click_ok_button_ytc() throws Throwable {
        Thread.sleep(1000);
        YardTransferCreationSub var1 = new YardTransferCreationSub(driver);
        var1.ClickOkButton().click();
    }

}
