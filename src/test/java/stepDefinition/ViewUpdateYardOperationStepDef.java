package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import addNewYardOperation.AddNewYardOperationSub;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import viewUpdateYardOperation.ViewUpdateYardOperationMain;
import viewUpdateYardOperation.ViewUpdateYardOperationSub;

public class ViewUpdateYardOperationStepDef extends ViewUpdateYardOperationMain {
	
	
	 	@Given("^I need to navigate LOLC FusionX Loging page for VUYO$")
	    public void i_need_to_navigate_lolc_fusionx_loging_page_for_vuyo() throws Throwable {
	 		driver=inheritanceVUYO();
			driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	    }

	    @When("^I enter VUYO1 (.+)$")
	    public void i_enter_vuyo1(String username) throws Throwable {
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
	    }

	    @And("^I click continue button VUYO$")
	    public void i_click_continue_button_vuyo() throws Throwable {
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.clickContinueButton().click();
	    }

	    @And("^I enter VUYO (.+)$")
	    public void i_enter_vuyo(String password) throws Throwable {
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.typePassword().sendKeys("Hecember@1234");
	    }

	    @And("^I click the sign in button VUYO$")
	    public void i_click_the_sign_in_button_vuyo() throws Throwable {
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.clicksubmit().click();
	    }

	    @And("^I click Yard Management option VUYO$")
	    public void i_click_yard_management_option_vuyo() throws Throwable {
	    	List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
			Thread.sleep(5000);
			ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.clickYardManagement().click();
			Thread.sleep(5000);
	    }

	    @And("^I click on Yard In VUYO$")
	    public void i_click_on_yard_in_vuyo() throws Throwable {
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	        driver.switchTo().window(browserTabs.get(1));
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        var1.clickOnYardIn().click();
	    }

	    @And("^I select Yard Operation VUYO$")
	    public void i_select_yard_operation_vuyo() throws Throwable {
	    	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.ClickOnYardOperation().click();
	    }

	    @And("^I click on view update yard operation VUYO$")
	    public void i_click_on_view_update_yard_operation_vuyo() throws Throwable {
	    	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.ClickOnViewUpdateYardOperation().click();
	    }

	    @And("^I enter search value VUYO$")
	    public void i_enter_search_value_vuyo() throws Throwable {
	    	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.EnterSearchValue().sendKeys("1226");
	    }

	    @And("^I press the view button VUYO$")
	    public void i_press_the_view_button_vuyo() throws Throwable {
	    	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.ClickViewButton().click();
	    }

	    @And("^I scroll to down in view VUYO$")
	    public void i_scroll_to_down_in_view_vuyo() throws Throwable {
	    	Thread.sleep(5000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView();", var1.ScrollToDown());
	        Thread.sleep(2000);
	    }

	    @And("^I press ok button in view VUYO$")
	    public void i_press_ok_button_in_view_vuyo() throws Throwable {
	    	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.ClickViewOkBtton().click();
	    }
	    
	    @And("^I press the update button VUYO$")
	    public void i_press_the_update_button_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I scroll down to uploads VUYO$")
	    public void i_scroll_down_to_uploads_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I upload an image VUYO$")
	    public void i_upload_an_image_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I upload a file VUYO$")
	    public void i_upload_a_file_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I scroll down to other conditions VUYO$")
	    public void i_scroll_down_to_other_conditions_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I set test condition as yes VUYO$")
	    public void i_set_test_condition_as_yes_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I set test condition date VUYO$")
	    public void i_set_test_condition_date_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I scroll down to insurance details VUYO$")
	    public void i_scroll_down_to_insurance_details_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I change Insurance Expiry Date VUYO$")
	    public void i_change_insurance_expiry_date_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I change License Expiry Date VUYO$")
	    public void i_change_license_expiry_date_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I select transmission type VUYO$")
	    public void i_select_transmission_type_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I select fuel type VUYO$")
	    public void i_select_fuel_type_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I set milage VUYO$")
	    public void i_set_milage_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I number of owners VUYO$")
	    public void i_number_of_owners_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I scroll down to save VUYO$")
	    public void i_scroll_down_to_save_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I click save button VUYO$")
	    public void i_click_save_button_vuyo() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^I click yes button VUYO$")
	    public void i_click_yes_button_vuyo() throws Throwable {
	        throw new PendingException();
	    }
}
