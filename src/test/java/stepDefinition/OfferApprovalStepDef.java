package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.internal.Lists;

import advertiseForTenderAuctioApproval.AdvertiseForTenderAuctioApprovalSub;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import offerApproval.OfferApprovalMain;
import offerApproval.OfferApprovalSub;
import yardEvaluationn.YardEvaluationnSub;


public class OfferApprovalStepDef extends OfferApprovalMain {

	

	@Given("I need to navigate Fusion X Loging page COA")
	public void i_need_to_navigate_fusion_x_loging_page_coa() throws Throwable{
		driver=inheritanceCOA ();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
	}
	@When("I enter   <Username> COA")
	public void i_enter_username_coa() throws Throwable{
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	@When("I click continue button  COA")
	public void i_click_continue_button_coa() throws Throwable{
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		var1.clickContinueButton().click();
		Thread.sleep(2000); 
	}
	@When("I enter COA <Password>")
	public void i_enter_coa_password() throws Throwable{
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		 var1.typePassword().sendKeys("September@1234");
		 Thread.sleep(2000);
	}
	@When("I click the sign in button COA")
	public void i_click_the_sign_in_button_coa() throws Throwable{
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		var1.clicksubmit().click();
		Thread.sleep(6000);
	}

	@When("I Scroll to Yard Management COA")
	public void i_scroll_to_yard_management_coa() throws Throwable{
		Thread.sleep(3000);
		OfferApprovalSub var1=new OfferApprovalSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
	}
	
	@When("I click Yard Management COA")
	public void i_click_yard_management_coa() throws Throwable{
		Thread.sleep(5000);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
		
	@When("I click on Post Yard Management COA")
	public void i_click_on_post_yard_management_coa() throws Throwable{
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickPostYardManagement().click();
	}
	
	@When("I Scroll to Offer Approval  COA")
	public void i_scroll_to_offer_approval_coa() throws Throwable{
		Thread.sleep(3000);
		OfferApprovalSub var1=new OfferApprovalSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToOfferApproval());
	   	Thread.sleep(6000);
	}

	@When("I Click Offer Approval COA")
	public void i_click_offer_approval_coa() throws Throwable{
		Thread.sleep(6000);
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		var1.clickOfferApproval().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
	}
	
	@When("I Search vehicle Number COA")
	public void i_search_vehicle_number_coa() throws Throwable{
		Thread.sleep(2000);
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		var1.SearchVehicleNumber().sendKeys("AAY4113");
		
	}
	
	@When("I Click Search BTN  COA")
	public void i_click_search_btn_coa() throws Throwable{
		Thread.sleep(3000);
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		var1.ClickOnSerachBTN().click();
		
	}
	
	@When("I Scroll to View Offer COA")
	public void i_scroll_to_view_offer_coa() throws Throwable{
		 Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		OfferApprovalSub var1=new OfferApprovalSub(driver);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrolltoViewOffer());
	     
	}

	@When("I Click View Offer COA")
	public void i_click_view_offer_coa() throws Throwable{
		Thread.sleep(6000);
		OfferApprovalSub var1=new OfferApprovalSub(driver);
		var1.ClickViewOffer().click();
		
	}


}
