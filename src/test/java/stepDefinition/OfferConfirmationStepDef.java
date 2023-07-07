package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import offerConfirmation.OfferConfirmationMain;
import offerConfirmation.OfferConfirmationSub;
import offerDetailsEntry.OfferDetailsEntrySub;

public class OfferConfirmationStepDef extends OfferConfirmationMain {
    @Given("I need to navigate LOLC FusionX Loging page for OC")
    public void i_need_to_navigate_lolc_fusion_x_loging_page_for_oc() throws InterruptedException {
        driver=inheritancOC();
        driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
    }

    @When("I enter OC1 <Username>")
    public void i_enter_oc1_username() {
        OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
    }

    @When("I click continue button OC")
    public void i_click_continue_button_oc() {
        OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        var1.clickContinueButton().click();
    }

    @When("I enter OC <Password>")
    public void i_enter_oc_password() {
        OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        var1.typePassword().sendKeys("September@1234");
    }

    @When("I click the sign in button OC")
    public void i_click_the_sign_in_button_oc() throws InterruptedException {
        Thread.sleep(3000);
        OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        var1.clicksubmit().click();
    }

    @When("I click Yard Management option OC")
    public void i_click_yard_management_option_oc() throws InterruptedException {
    	Thread.sleep(5000);
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrollToYardManagement());
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        var1.clickYardManagement().click();
		Thread.sleep(10000);
    }

    @When("I click on Post Yard Management OC")
    public void i_click_on_post_yard_management_oc() {
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
    	List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickOnPostYardManagement().click();
    }

    @When("I scroll down OC")
    public void i_scroll_down_oc() throws InterruptedException {
        Thread.sleep(2000);
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView();", var1.SelectOfferConfirmation());
    }

    @When("I select Offer confirmation OC")
    public void i_select_offer_confirmation_oc() throws InterruptedException {
        Thread.sleep(2000);
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        var1.SelectOfferConfirmation().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }

    @When("I enter vehicle no OC")
    public void i_enter_vehicle_no_oc() throws InterruptedException {
        Thread.sleep(2000);
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        var1.EnterVehicleNum().sendKeys("AAY4113");
    }

    @When("I click view button OC")
    public void i_click_view_button_oc() throws InterruptedException {
        Thread.sleep(2000);
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToClick());
        Thread.sleep(2000);
        var1.ClickViewButton().click();
    }

    @When("I select payment method OC")
    public void i_select_payment_method_oc() throws InterruptedException {
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        var1.ClickPaymentMethod().click();
        Thread.sleep(2000);
        var1.SelectPaymentMethod().click();
        Thread.sleep(2000);
    }

    @When("I tick approve OC")
    public void i_tick_approve_oc() throws InterruptedException {
        Thread.sleep(2000);
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToTick());
        Thread.sleep(2000);
        var1.TickApproved().click();

    }

    @When("I click save button OC")
    public void i_click_save_button_oc() throws InterruptedException {
        Thread.sleep(2000);
    	OfferConfirmationSub var1 = new OfferConfirmationSub(driver);
        var1.ClickSaveButton().click();
        Thread.sleep(2000);
        var1.ClickOkButton().click();

    }


}
