package stepDefinition;

import java.util.List;
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
        var1.typePassword().sendKeys("Hecember@1234");
    }

    @And("^I click the sign in button RPU$")
    public void i_click_the_sign_in_button_rpu() throws Throwable {
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
        var1.clicksubmit().click();
    }

    @And("^I click Yard Management option RPU$")
    public void i_click_yard_management_option_rpu() throws Throwable {
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        ResellingPriceUpdateSub var1 = new ResellingPriceUpdateSub(driver);
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
}
