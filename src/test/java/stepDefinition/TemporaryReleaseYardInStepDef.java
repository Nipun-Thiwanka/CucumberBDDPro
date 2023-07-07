package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import temporaryReleaseYardIn.TemporaryReleaseYardInMain;
import temporaryReleaseYardIn.TemporaryReleaseYardInSub;

public class TemporaryReleaseYardInStepDef extends TemporaryReleaseYardInMain {
	@Given("I need to navigate LOLC FusionX Loging page for TR")
	public void i_need_to_navigate_lolc_fusion_x_loging_page_for_tr() throws InterruptedException {
		driver=inheritancTRYI();
        driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@When("I enter TR1 <Username>")
	public void i_enter_tr1_username() {
		TemporaryReleaseYardInSub var1 = new TemporaryReleaseYardInSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
	}
	
	@When("I click continue button TR")
	public void i_click_continue_button_tr() {
		TemporaryReleaseYardInSub var1 = new TemporaryReleaseYardInSub(driver);
		var1.clickContinueButton().click();
	}
	
	@When("I enter TR <Password>")
	public void i_enter_tr_password() {
		TemporaryReleaseYardInSub var1 = new TemporaryReleaseYardInSub(driver);
		var1.typePassword().sendKeys("September@1234");
	}
	
	@When("I click the sign in button TR")
	public void i_click_the_sign_in_button_tr() throws InterruptedException {
		Thread.sleep(3000);
		TemporaryReleaseYardInSub var1 = new TemporaryReleaseYardInSub(driver);
		var1.clicksubmit().click();
	}
	
	@When("I click Yard Management option TR")
	public void i_click_yard_management_option_tr() throws InterruptedException {
		Thread.sleep(5000);
		TemporaryReleaseYardInSub var1 = new TemporaryReleaseYardInSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.scrollToYardManagement());
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        var1.clickYardManagement().click();
		Thread.sleep(10000);
	}
	
	@When("I click on Yard Release TR")
	public void i_click_on_yard_release_tr() {
		TemporaryReleaseYardInSub var1 = new TemporaryReleaseYardInSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickOnYardReleas().click();
	}
	
	@When("I scroll down TR")
	public void i_scroll_down_tr() throws InterruptedException {
		Thread.sleep(2000);
		TemporaryReleaseYardInSub var1 = new TemporaryReleaseYardInSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView();", var1.SelectTemporaryRelease());
	}
	
	@When("I select Temporary Release TR")
	public void i_select_temporary_release_tr() throws InterruptedException {
		Thread.sleep(2000);
		TemporaryReleaseYardInSub var1 = new TemporaryReleaseYardInSub(driver);
		var1.SelectTemporaryRelease().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
	}



}
