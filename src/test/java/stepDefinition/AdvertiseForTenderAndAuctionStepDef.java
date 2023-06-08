package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.internal.Lists;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import advertiseForTenderAndAuction.AdvertiseForTenderAndAuctionMain;
import advertiseForTenderAndAuction.AdvertiseForTenderAndAuctionSub;



public class AdvertiseForTenderAndAuctionStepDef extends AdvertiseForTenderAndAuctionMain {
    @Given("I need to navigate LOLC FusionX Loging page for AFTnA")
    public void i_need_to_navigate_lolc_fusion_x_loging_page_for_af_tn_a() throws InterruptedException {
        driver=inheritancAFTnA();
        driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("I enter AFTnA1 <Username>")
    public void i_enter_af_tn_a1_username() {
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
    }

    @When("I click continue button AFTnA")
    public void i_click_continue_button_af_tn_a() {
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.clickContinueButton().click();
    }

    @When("I enter AFTnA <Password>")
    public void i_enter_af_tn_a_password() {
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.typePassword().sendKeys("Hecember@1234");
    }

    @When("I click the sign in button AFTnA")
    public void i_click_the_sign_in_button_af_tn_a() {
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.clicksubmit().click();
    }

    @When("I click Yard Management option AFTnA")
    public void i_click_yard_management_option_af_tn_a() throws InterruptedException {
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.clickYardManagement().click();
		Thread.sleep(5000);
    }

    @When("I click on Post Yard Management AFTnA")
    public void i_click_on_post_yard_management_af_tn_a() {
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	    driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1.clickOnPostYardManagement().click();
    }

    @When("I select Advertise For Tender and Auction AFTnA")
    public void i_select_advertise_for_tender_and_auction_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.SelectAdvertiseForTender().click();
    }
    
    @When("I enter branch AFTnA")
    public void i_enter_branch_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.EnterBranch().sendKeys("TRINCOMALEE");
    }

    @When("I select Advertised Status AFTnA")
    public void i_select_advertised_status_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.ClickOnDropDown().click();
        Thread.sleep(1000);
        var1.SelectAll().click();
    }

    @When("I enter vehicle number AFTnA")
    public void i_enter_vehicle_number_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.EnterVehicleNumber().sendKeys("AAB9776");
    }

    @When("I click search button AFTnA")
    public void i_click_search_button_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.ClickSearchButton().click();
    }

    @When("I select type AFTnA")
    public void i_select_type_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.ClickOnTypeDropDown().click();
        Thread.sleep(1000);
        var1.SelectTender().click();
    }

    @When("I enter Advertise date AFTnA")
    public void i_enter_advertise_date_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.AdvertiseDate().sendKeys("2023-02-07");
    }

    @When("I enter auction date AFTnA")
    public void i_enter_auction_date_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.AuctionDate().sendKeys("2024-02-07");
    }

    @When("I click approval user button AFTnA")
    public void i_click_approval_user_button_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.ClickApprovalUser().click();
    }

    @When("I enter approval user name AFTnA")
    public void i_enter_approval_user_name_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.EnterApprovalUser().sendKeys("Theeksha Dumini");
    }

    @When("I scroll horizontally approval user div AFTnA")
    public void i_scroll_horizontally_approval_user_div_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToSelect());
    }

    @When("I click select user button AFTnA")
    public void i_click_select_user_button_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.ClickSelectButton().click();
    }

    @When("I scroll down to selevt AFTnA")
    public void i_scroll_down_to_selevt_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToSave());
    }

    @When("I scroll horizontally Advertise div AFTnA")
    public void i_scroll_horizontally_advertise_div_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToTick());
    }

    @When("I tick on Advertise checkbox AFTnA")
    public void i_tick_on_advertise_checkbox_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.ClickOnCheckBox().click();
    }

    @When("I click save button AFTnA")
    public void i_click_save_button_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.ClickOnSaveButton().click();
    }

    @When("I click ok button AFTnA")
    public void i_click_ok_button_af_tn_a() throws InterruptedException {
        Thread.sleep(2000);
        AdvertiseForTenderAndAuctionSub var1 = new AdvertiseForTenderAndAuctionSub(driver);
        var1.ClickOnOkButton().click();
    }

    
}
