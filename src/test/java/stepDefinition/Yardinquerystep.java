package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yardInquiry.YardInquiryMain;
import yardInquiry.YardInquirySub;

public class Yardinquerystep extends YardInquiryMain {
	@Given("^I need to navigate yard Loging page yard inquery YI$")
    public void i_need_to_navigate_yard_loging_page_yard_inquery_yi() throws Throwable
 {
	   driver=inheritance2();
	   driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
  }
  
  @When("^I enter username  yard inquery YI$")
  public void i_enter_username_yard_inquery_yi() throws Throwable 
  {
        
	  YardInquirySub var1=new YardInquirySub(driver);
	  var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");;
	  Thread.sleep(2000);
  }

  @And("^I click continue button yard inquery YI$")
  public void i_click_continue_button_yard_inquery_yi() throws Throwable 
  {
    	YardInquirySub var1=new YardInquirySub(driver); 
		var1.clickContinueButton().click();
		Thread.sleep(2000);
  }

  @And("^I enter Password yard inquery YI$")
  public void i_enter_password_yard_inquery_yi() throws Throwable 
  {
    	YardInquirySub var1=new YardInquirySub(driver);
	    var1.typePassword().sendKeys("Hecember@1234");
	    Thread.sleep(2000);

  }
       
  @And("^I click the sign in button yard inquery YI$")
  public void i_click_the_sign_in_button_yard_inquery_yi() throws Throwable
  {
    	YardInquirySub var1=new YardInquirySub(driver);
		var1.clicksubmit().click();
  }

  @And("^I click Yard in option yard inquery YI$")
  public void i_click_yard_in_option_yard_inquery_yi() throws Throwable
  {
    	List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		YardInquirySub var1=new YardInquirySub(driver);
		var1.clickYardIn().click();
		Thread.sleep(5000);
		
  }

  @When("I click on yard inquery YI")
  public void i_click_on_yard_inquery_yi() throws Throwable 
  {
	   YardInquirySub var1=new YardInquirySub(driver);
	   List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	   driver.switchTo().window(browserTabs.get(1));
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   var1.ClickonMarkasSeized().click();
   
 }

@And("^I enter the vehicle number YI$")
public void i_enter_the_vehicle_number_yi() throws Throwable 
{
	YardInquirySub var1=new YardInquirySub(driver);
    var1.SearchVehicleNo().sendKeys("1234");
    Thread.sleep(2000);
}

@And("^I enter the contract number YI$")
public void i_enter_the_contract_number() throws Throwable
{
	YardInquirySub var1=new YardInquirySub(driver);
    var1.SearchContractNo().sendKeys("F4-11-1508GO");
    Thread.sleep(2000);
}

@And("^I click on dropdown YI$")
public void i_click_on_dropdown_yi() throws Throwable 
{
	Thread.sleep(5000);
	YardInquirySub var1=new YardInquirySub(driver);
	var1.clickOnDrodown().click();
}

@And("^I select by contract number YI$")
public void i_select_by_contract_number() throws Throwable 
{
	Thread.sleep(5000);
	YardInquirySub var1=new YardInquirySub(driver);
	var1.clickOnContracNum().click();
}
 
@And("^User need to scroll div With contract number YI$")
public void user_need_to_scroll_div_with_contract_number() throws Throwable 
{
	Thread.sleep(2000);
	YardInquirySub var1 = new YardInquirySub(driver);
	WebElement element = var1.ScrolWithContractNumber();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrolWithContractNumber());

}

@And("^Click the select button with contract number YI$")
public void click_the_select_button_with_contract_number_yi() throws Throwable
{
	Thread.sleep(2000);
	YardInquirySub var1=new YardInquirySub(driver);
	var1.clickSelectButtonWithContractNumber().click();  
}


@And("^I enter the userName YI$")
public void i_enter_the_userName_yi() throws Throwable 
{
	YardInquirySub var1=new YardInquirySub(driver);
    var1.SearchuserName().sendKeys("MR DM DASANAYAKA");
    Thread.sleep(2000);
}

@And("^I click on dropdown123 YI$")
public void i_click_on_dropdown123_yi() throws Throwable 
{
	Thread.sleep(5000);
	YardInquirySub var1=new YardInquirySub(driver);
	var1.clickOnDrodown123().click();
}

@And("^I select by userName YI$")
public void i_select_by_userName_yi() throws Throwable 
{
	Thread.sleep(5000);
	YardInquirySub var1=new YardInquirySub(driver);
	var1.clickOnuserName().click();
}

@And("^I press the search button YI$")
public void i_press_the_search_button_yi() throws Throwable 
{
	Thread.sleep(5000);
	YardInquirySub var1=new YardInquirySub(driver);
    var1.clickOnSearchBtn().click();
}
@And("^User need to scroll div with user name YI$")
public void user_need_to_scroll_div_with_user_name_yi() throws Throwable {
	Thread.sleep(2000);
	YardInquirySub var1 = new YardInquirySub(driver);
	WebElement element = var1.ScrolWithUserName();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrolWithUserName());

}
@And("^Click the select button with user name YI$")
public void click_the_select_button_with_user_name_yi() throws Throwable {
	Thread.sleep(2000);
	YardInquirySub var1=new YardInquirySub(driver);
	var1.clickSelectButtonWithUserName().click();  
}


@And("^User need to scroll div YI$")
public void user_need_to_scroll_div() throws Throwable {
	Thread.sleep(2000);
	YardInquirySub var1 = new YardInquirySub(driver);
	WebElement element = var1.scrollToSelect();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToSelect());
}

@And("^Click the select button YI$")
public void click_the_select_button_yi() throws Throwable 
{
	Thread.sleep(2000);
	YardInquirySub var1=new YardInquirySub(driver);
	var1.clickSelectButton().click();  
}

@And("^click on status history YI$")
public void click_on_status_history_yi() throws Throwable {
	Thread.sleep(2000);
	YardInquirySub var1=new YardInquirySub(driver);
	var1.clickStatusHistoryButton().click();
}
}
