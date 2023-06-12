package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import com.beust.jcommander.internal.Lists;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import offerDetailsEntry.OfferDetailsEntryMain;
import offerDetailsEntry.OfferDetailsEntrySub;

public class OfferDetailsEntryStepDef extends OfferDetailsEntryMain {
	
	
	@Given("I need to navigate LOLC FusionX Loging page for OED")
	public void i_need_to_navigate_lolc_fusion_x_loging_page_for_oed() throws InterruptedException {
		driver=inheritancODE();
		driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
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
        var1.typePassword().sendKeys("Hecember@1234");
    }

    @When("I click the sign in button OED")
    public void i_click_the_sign_in_button_oed()  {
        OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
        var1.clicksubmit().click();
    }


    @When("I click Yard Management option OED")
    public void i_click_yard_management_option_oed()  throws InterruptedException {
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        OfferDetailsEntrySub var1 = new OfferDetailsEntrySub(driver);
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


}
