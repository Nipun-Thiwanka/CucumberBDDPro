package stepDefinition;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.internal.Lists;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yardvaluation.YardValuationMain;
import yardvaluation.YardValuationSub;

public class YardValuationStepDef extends YardValuationMain {
	
	@Given("I need to navigate Fusion X Loging page CANYV")
	public void i_need_to_navigate_fusion_x_loging_page_canyv()  throws Throwable {
		driver=inheritanceYV();
		driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
	}

	@When("I enter   <Username> CANYV")
	public void i_enter_username_canyv() throws Throwable {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	
	@When("I click continue button  CANYV")
	public void i_click_continue_button_canyv() throws Throwable {
		 YardValuationSub var1=new YardValuationSub(driver); 
		var1.clickContinueButton().click();
		Thread.sleep(2000); 
	}
	
	@When("I enter CANYV  <Password>")
	public void i_enter_canyv_password() throws Throwable {
		 YardValuationSub var1=new YardValuationSub(driver);
		 var1.typePassword().sendKeys("Hecember@1234");
		 Thread.sleep(2000);
	}
	
	@When("I click the sign in button CANYV")
	public void i_click_the_sign_in_button_canyv() throws Throwable{
		YardValuationSub var1=new YardValuationSub(driver);
		var1.clicksubmit().click();
	}
	
	@When("I click Yard Management CANYV")
	public void i_click_yard_management_canyv() throws Throwable {
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		YardValuationSub var1=new YardValuationSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	
	@When("I click on Post Yard Management CANYV")
	public void i_click_on_post_yard_management_canyv() {
		YardValuationSub var1=new YardValuationSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickPostYardManagement().click();
	}
	
	@When("I click The Yard Valuation CANYV")
	public void i_click_the_yard_valuation_canyv() {
		YardValuationSub var1=new YardValuationSub(driver);
		var1.clickTheYardValuation().click();
}
}
