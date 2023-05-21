package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.internal.Lists;
import org.openqa.selenium.interactions.Actions;

import addNewYardOperation.AddNewYardOperationMain;
import addNewYardOperation.AddNewYardOperationSub;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AddNewYardOperationStepDef extends AddNewYardOperationMain {

	@Given("^I need to navigate LOLC FusionX Loging page for ANYO$")
    public void i_need_to_navigate_lolc_fusionx_loging_page_for_anyo() throws Throwable {
		driver=inheritanceANYO();
		driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
    }

	@When("^I enter ANYO1 (.+)$")
    public void i_enter_anyo1(String username) throws Throwable {
		AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
	}

    @And("^I click continue button ANYO$")
    public void i_click_continue_button_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver); 
		var1.clickContinueButton().click();
    }

    @And("^I enter ANYO (.+)$")
    public void i_enter_anyo(String password) throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
	    var1.typePassword().sendKeys("Hecember@1234");
    }

    @And("^I click the sign in button ANYO$")
    public void i_click_the_sign_in_button_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.clicksubmit().click();
    }

    @And("^I click Yard Management option ANYO$")
    public void i_click_yard_management_option_anyo() throws Throwable {
    	List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
    }

    @And("^I click on Yard In ANYO$")
    public void i_click_on_yard_in_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickOnYardIn().click();
    }

    @And("^I select Yard Operation ANYO$")
    public void i_select_yard_operation_anyo() throws Throwable {
    	Thread.sleep(3000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickOnYardOperation().click();
    }

    @And("^I click on Add new yard operation ANYO$")
    public void i_click_on_add_new_yard_operation_anyo() throws Throwable {
    	Thread.sleep(3000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.ClickonAddNewYardOperationButton().click();
    }
    
    @And("^I enter search value ANYO$")
    public void i_enter_search_value_anyo() throws Throwable {
    	Thread.sleep(3000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterSearchValues().sendKeys("27");
    }

    @And("^I press the search button ANYO$")
    public void i_press_the_search_button_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.PressSearchBtn().click();
    }

    @And("^I need to scroll div ANYO$")
    public void i_need_to_scroll_div_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1 = new AddNewYardOperationSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollDiv());
    }

    @And("^I need click YO link ANYO$")
    public void i_need_click_yo_link_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickYardOperationLink().click();
    }
    
    @And("^I scroll to down ANYO$")
    public void i_scroll_to_down_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1 = new AddNewYardOperationSub(driver);
   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView();", var1.ScrollToDown());
    }
    
    @And("^I upload an image ANYO$")
    public void i_upload_an_image_anyo() throws Throwable {
    	Thread.sleep(2000);
    	String imgPath = "C:\\Users\\ThiwankaRa\\Documents\\Testing Files - Do Not Delete\\Images\\test.png";
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    for (int i = 0; i < 5; i++) {
		var1.ClickToUploadImg().sendKeys(imgPath);}
    }
    
    @And("^I upload a file ANYO$")
    public void i_upload_a_file_anyo() throws Throwable {
    	Thread.sleep(5000);
    	String filePath = "C:\\Users\\ThiwankaRa\\Documents\\Testing Files - Do Not Delete\\Files\\test.pdf";
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickToUploadFile().sendKeys(filePath);
    }
    
    @And("^I scroll down to Other Conditions ANYO$")
    public void i_scroll_down_to_other_conditions_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1 = new AddNewYardOperationSub(driver);
   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToOtherConditions());
//    	Actions actions = new Actions(driver);
//      actions.moveToElement(var1.ScrollToOtherConditions()).perform();
        Thread.sleep(2000);
    }

    @And("^I select YES in CR Received ANYO$")
    public void i_select_yes_in_cr_received_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
   // 	Thread.sleep(2000);
		var1.ClickOnDropdownCR().click();
		Thread.sleep(2000);
		var1.SelectYesCR().click();
    }
    
    @And("^I change date in CR Received ANYO$")
    public void i_change_date_in_cr_received_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SelectDateCR().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectDateCR());
    	var1.SelectDateCR().sendKeys("2022-01-01");
    }
    
    @And("^I select YES in Objection ANYO$")
    public void i_select_yes_in_objection_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
   // 	Thread.sleep(2000);
		var1.ClickOnDropdownObjection().click();
		Thread.sleep(2000);
		var1.SelectYesObjection().click();
    }
    
    @And("^I change date in Objection ANYO$")
    public void i_change_date_in_objection_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SelectDateObjection().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectDateObjection());
    	var1.SelectDateObjection().sendKeys("2023-05-01");
    }
    
    @And("^I scroll down to bonded details ANYO$")
    public void i_scroll_down_to_bonded_details_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1 = new AddNewYardOperationSub(driver);
   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToBondedDetails());
    }

    @When("I tick on bonded details ANYO")
    public void i_tick_on_bonded_details_anyo() throws InterruptedException {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickBondedDetailsCheckBox().click();
    }
    
    @When("I fill offence ANYO")
    public void i_fill_offence_anyo() throws InterruptedException {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterOffence().sendKeys("Test Offence");
    }
    
    @When("I fill police station ANYO")
    public void i_fill_police_station_anyo() throws InterruptedException {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterPoliceStation().sendKeys("Test Police Station");
    }

    @When("I select bonded date ANYO")
    public void i_select_bonded_date_anyo() throws InterruptedException {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SelectBondedDate().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectBondedDate());
        Thread.sleep(2000);
    	var1.SelectBondedDate().sendKeys("2023-01-01");
    }

    @When("I enter bonded value ANYO")
    public void i_enter_bonded_value_anyo() throws InterruptedException {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterBondedValue().sendKeys(" 500000");
    }

    @And("^I select Next Hearing Date ANYO$")
    public void i_select_next_hearing_date_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SelectNextHearingDate().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectNextHearingDate());
        Thread.sleep(2000);
    	var1.SelectNextHearingDate().sendKeys("2023-06-01");
    }

    @And("^I select Bonded Release Date ANYO$")
    public void i_select_bonded_release_date_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SelectBondedReleaseDate().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectBondedReleaseDate());
        Thread.sleep(2000);
    	var1.SelectBondedReleaseDate().sendKeys("2024-01-01");
    }

    @And("^I click on select lawyer link ANYO$")
    public void i_click_on_select_lawyer_link_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickSelecLawyerLink().click();
    }

    @And("^I enter lawyer name ANYO$")
    public void i_enter_lawyer_name_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterLawyerName().sendKeys("LOLC");
    }

    @And("^I press lawyer search button ANYO$")
    public void i_press_lawyer_search_button_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickLawyerSearchButton().click();
    }

    @And("^I press lawyer select button ANYO$")
    public void i_press_lawyer_select_button_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickLawyerSelectButton().click();
    }

    @And("^I enter case number ANYO$")
    public void i_enter_case_number_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterCaseNumber().sendKeys("Test-100");
    }
    
    @When("I enter court house ANYO")
    public void i_enter_court_house_anyo() throws InterruptedException {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterCourtHouse().sendKeys("Panadura");
    }

    @And("^I enter Name Of the Person Appear ANYO$")
    public void i_enter_name_of_the_person_appear_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EntereNameOfPerson().sendKeys("Mr.Perera");
    }

    @When("I enter remarks ANYO")
    public void i_enter_remarks_anyo() throws InterruptedException {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterRemarksInBonded().sendKeys("LOLC");
    }
    
    @And("^I scroll down to expire dates ANYO$")
    public void i_scroll_down_to_expire_dates_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1 = new AddNewYardOperationSub(driver);
   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToExpireDates());
    }
    
    @And("^I change Insurance Expiry Date ANYO$")
    public void i_change_insurance_expiry_date_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SelectInsuranceExpiryDate().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectInsuranceExpiryDate());
    	var1.SelectInsuranceExpiryDate().sendKeys("2023-05-11");
    }

    @And("^I change License Expiry Date ANYO$")
    public void i_change_license_expiry_date_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SelectLicenseExpiryDate().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectLicenseExpiryDate());
    	var1.SelectLicenseExpiryDate().sendKeys("2023-05-10");
    }
    
    @And("^I select transmission type ANYO$")
    public void i_select_transmission_type_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    //	Thread.sleep(2000);
		var1.ClickOnDropdownTransmission().click();
		Thread.sleep(2000);
		var1.SelectAuto().click();
    }

    @And("^I select fuel type ANYO$")
    public void i_select_fuel_type_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickOnDropdownFuel().click();
		Thread.sleep(2000);
		var1.SelectPetrol().click();
    }

    @And("^I set milage ANYO$")
    public void i_set_milage_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SetMilage().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SetMilage());
    	var1.SetMilage().sendKeys("45800.50");
    }
    
    @And("^I number of owners ANYO$")
    public void i_number_of_owners_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.SetNoOfOwners().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SetNoOfOwners());
    	var1.SetNoOfOwners().sendKeys("4");
    }
    
    @And("^I scroll down to sales stop ANYO$")
    public void i_scroll_down_to_sales_stop_anyo() throws Throwable {
    	Thread.sleep(3000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownToSalesStop());
    }

    @And("^I tick on sales stop check box ANYO$")
    public void i_tick_on_sales_stop_check_box_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickOnSalesStopCheckBox().click();
    }

    @And("^I click on Select Stop By link ANYO$")
    public void i_click_on_select_stop_by_link_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickOnSalesStopByLink().click();
    }

    @And("^I enter search value in Stop By link ANYO$")
    public void i_enter_search_value_in_stop_by_link_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.EnterSearchValueInStopByLink().sendKeys("test new");
    }

    @And("^I select search result in Stop By link ANYO$")
    public void i_select_search_result_in_stop_by_link_anyo() throws Throwable {
    	Thread.sleep(3000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickOnSearchResultInSalesStopBy().click();
    }

    @And("^I enter Sales Stop Date ANYO$")
    public void i_enter_sales_stop_date_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.EnterSalesStopDate().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.EnterSalesStopDate());
    	var1.EnterSalesStopDate().sendKeys("2023-01-10");
    }

    @And("^I select Sales Stop Reason ANYO$")
    public void i_select_sales_stop_reason_anyo() throws Throwable {
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickOnDropdownStopReson().click();
		Thread.sleep(5000);
		var1.SelectClientAgreed().click();
    }

    @And("^I enter Sales Stop Expire Date ANYO$")
    public void i_enter_sales_stop_expire_date_anyo() throws Throwable {
    	Thread.sleep(2000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
    	var1.EnterSalesStopExpDate().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.EnterSalesStopExpDate());
        Thread.sleep(2000);
    	var1.EnterSalesStopExpDate().sendKeys("2024-01-10");
    }

    @And("^I click on Sales Stop Save button ANYO$")
    public void i_click_on_sales_stop_save_button_anyo() throws Throwable {
    	Thread.sleep(1000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickOnSalesStopSaveBtn().click();
    }

    @And("^I click on Sales Stop ok button ANYO$")
    public void i_click_on_sales_stop_ok_button_anyo() throws Throwable {
    	Thread.sleep(5000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickOnSalesStopSaveBtnYes().click();
    }

    @And("^I scroll down to save ANYO$")
    public void i_scroll_down_to_save_anyo() throws Throwable {
    	Thread.sleep(3000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToSave());
    }
    
    @And("^I click save button ANYO$")
    public void i_click_save_button_anyo() throws Throwable {
    	Thread.sleep(5000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickSaveBtn().click();
    }

    @And("^I click yes button ANYO$")
    public void i_click_yes_button_anyo() throws Throwable {
    	Thread.sleep(5000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickYesBtn().click();
    }
    
    @And("^I click yes button in sales stop ANYO$")
    public void i_click_yes_button_in_sales_stop_anyo() throws Throwable {
    	Thread.sleep(5000);
    	AddNewYardOperationSub var1=new AddNewYardOperationSub(driver);
		var1.ClickYesBtnInSalesStop().click();
    }


}
