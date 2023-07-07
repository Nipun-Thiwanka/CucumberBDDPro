package stepDefinition;


import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import com.beust.jcommander.internal.Lists;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import offerDetailsEntry.OfferDetailsEntryMain;
import offerDetailsEntry.OfferDetailsEntrySub;

public class OfferDetailsEntryStepDef extends OfferDetailsEntryMain {
	
	
	@Given("I need to navigate LOLC FusionX Loging page for OED")
	public void i_need_to_navigate_lolc_fusion_x_loging_page_for_oed() throws InterruptedException {
		driver=inheritancODE();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@When("I enter OED1 <Username>")
	public void i_enter_oed1_username() {
	    OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
	}

	@When("I click continue button OED")
	public void i_click_continue_button_oed()  {
        OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickContinueButton().click();
    }

    @When("I enter OED <Password>")
    public void i_enter_oed_password() {
        OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.typePassword().sendKeys("September@1234");
    }

    @When("I click the sign in button OED")
    public void i_click_the_sign_in_button_oed() throws InterruptedException  {
    	Thread.sleep(3000);
        OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clicksubmit().click();
    }


    @When("I click Yard Management option OED")
    public void i_click_yard_management_option_oed()  throws InterruptedException {
    	Thread.sleep(5000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrollToYardManagement());
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        var1.clickYardManagement().click();
		Thread.sleep(5000);
    }


    @When("I click on Post Yard Management OED")
    public void i_click_on_post_yard_management_oed() {
        OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickOnPostYardManagement().click();
    }
    
    @When("I scroll down OED")
    public void i_scroll_down_oed() throws InterruptedException {
    	Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView();", var1.SelectOfferDetailsEntry());
    }
    
    @When("I select Offer Details Entry OED")
    public void i_select_offer_details_entry_oed() throws InterruptedException {
    	Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
    	var1.SelectOfferDetailsEntry().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }

    @When("I click Add New Offer Details Entry OED")
    public void i_click_add_new_offer_details_entry_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickOnAddNewOfferDetailsEntry().click();
    }

    @When("I enter vehicle number OED")
    public void i_enter_vehicle_number_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.enterVehicleNum().sendKeys("QQ1240");
    }

    @When("I click search button OED")
    public void i_click_search_button_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickSearchButton().click();
    }

    @When("I click select button OED")
    public void i_click_select_button_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickSelectButton().click();
    }

    @When("I select method as auction OED")
    public void i_select_method_as_auction_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickMethodDropdown().click();
        Thread.sleep(2000);
        var1.SelectAuction().click();
    }
    

    @When("I select Auction Reference OED")
    public void i_select_auction_reference_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickReferenceDropdown().click();
        Thread.sleep(2000);
        var1.SelectReference().click();
    }

    @When("I scroll down to select buyer OED")
    public void i_scroll_down_to_select_buyer_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownToSelectBuyer());
    }

    @When("I tick new buyer radio button OED")
    public void i_tick_new_buyer_radio_button_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.TickNewBuyer().click();
    }

    @When("I enter buyer name OED")
    public void i_enter_buyer_name_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.enterName().sendKeys("Test Buyer");
    }

    @When("I enter buyer NIC OED")
    public void i_enter_buyer_nic_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.enterNic().sendKeys("123456789V");
    }

    @When("I enter buyer mobile num OED")
    public void i_enter_buyer_mobile_num_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.enterMobileNum().sendKeys("1234567890");
    }

    @When("I enter offer OED")
    public void i_enter_offer_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.enterOffer().sendKeys("100000");
    }

    @When("I select payment method OED")
    public void i_select_payment_method_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickPaymentDropdown().click();
        Thread.sleep(2000);
        var1.SelectCash().click();
    }

    @When("I select Marketing officer OED")
    public void i_select_marketing_officer_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickMarketingOfficerSelect().click();
        Thread.sleep(2000);
        var1.enterMarketingOffName().sendKeys("Theeksha Dumini");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToClickSelectBtn());
        Thread.sleep(2000);
        var1.clickOfficerSelectButton().click();
    }

    @When("I upload file OED")
    public void i_upload_file_oed() throws InterruptedException, IOException {
        Thread.sleep(1000);
        String fileURL = "https://www.kasandbox.org/programming-images/avatars/leaf-blue.png";
        URL url = new URL(fileURL);
        InputStream inputStream = url.openStream();
        File tempFile = File.createTempFile("temp", ".png");
        FileUtils.copyInputStreamToFile(inputStream, tempFile);
        String imgPath = tempFile.getAbsolutePath();
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.UploadImg().sendKeys(imgPath);
        Thread.sleep(1000);
    }

    @When("I scroll down to add OED")
    public void i_scroll_down_to_add_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownToAdd());
    }

    @When("I click add button OED")
    public void i_click_add_button_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickAddButton().click();
    }

    @When("I scroll down to save OED")
    public void i_scroll_down_to_save_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownToSave());
    }

    @When("I click save button OED")
    public void i_click_save_button_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickSaveButton().click();
    }

    @When("I click ok button OED")
    public void i_click_ok_button_oed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickOkButton().click();
    }

    @When("I click View And Update Offer Details Entry UOED")
    public void i_click_view_and_update_offer_details_entry_uoed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickViewOrUpdate().click();
    }

    @When("I enter vehicle number UOED")
    public void i_enter_vehicle_number_uoed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.EnterValue().sendKeys("QQ1240");
    }

    @When("I scroll div horizontally UOED")
    public void i_scroll_div_horizontally_uoed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToView());
    }

    @When("I click View Button UOED")
    public void i_click_view_button_uoed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickViewButton().click();
    }

    @When("I click Ok Button UOED")
    public void i_click_ok_button_uoed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToClickOk());
        Thread.sleep(2000);
        var1.clickOkBtn().click();
    }

    @When("I click Update Button UOED")
    public void i_click_update_button_uoed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clickUpdateBtn().click();
    }

    @When("I update offer value UOED")
    public void i_update_offer_value_uoed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToUpdate());
        Thread.sleep(2000);
        var1.UpdateOffer().click();
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].value = ''", var1.UpdateOffer());
        Thread.sleep(2000);
    	var1.UpdateOffer().sendKeys("100000");
    }

    @When("I click save button UOED")
    public void i_click_save_button_uoed() throws InterruptedException {
        Thread.sleep(2000);
    	OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.ClickSaveBtn().click();
        Thread.sleep(2000);
        var1.ClickOkBtn().click();
    }



}
