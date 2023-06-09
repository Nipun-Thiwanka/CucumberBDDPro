package stepDefinition;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

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
	        Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.ClickUpdateLink().click();
	    }

	    @And("^I scroll down to uploads VUYO$")
	    public void i_scroll_down_to_uploads_vuyo() throws Throwable {
	        ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView();", var1.ScrollToDownUpload());
	        Thread.sleep(2000);
	    }

	    @And("^I upload an image VUYO$")
	    public void i_upload_an_image_vuyo() throws Throwable {
	        Thread.sleep(1000);
			String fileURL = "https://www.kasandbox.org/programming-images/avatars/leaf-blue.png";
			URL url = new URL(fileURL);
			InputStream inputStream = url.openStream();
			File tempFile = File.createTempFile("temp", ".png");
			FileUtils.copyInputStreamToFile(inputStream, tempFile);
			String imgPath = tempFile.getAbsolutePath();
			ViewUpdateYardOperationSub var1=new ViewUpdateYardOperationSub(driver);
			var1.ClickToUploadImg().sendKeys(imgPath);
   		 }
	    

	    @And("^I upload a file VUYO$")
	    public void i_upload_a_file_vuyo() throws Throwable {
			Thread.sleep(1000);
			String fileURL = "https://www.orimi.com/pdf-test.pdf";
			URL url = new URL(fileURL);
			InputStream inputStream = url.openStream();
			File tempFile = File.createTempFile("temp", ".pdf");
			FileUtils.copyInputStreamToFile(inputStream, tempFile);
			String filePath = tempFile.getAbsolutePath();
			ViewUpdateYardOperationSub var1=new ViewUpdateYardOperationSub(driver);
			var1.ClickToUploadFile().sendKeys(filePath);
	    }

	    @And("^I scroll down to other conditions VUYO$")
	    public void i_scroll_down_to_other_conditions_vuyo() throws Throwable {
	        ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToDownOtherCondt());
	        Thread.sleep(2000);
	    }

	    @And("^I set test condition as yes VUYO$")
	    public void i_set_test_condition_as_yes_vuyo() throws Throwable {
	        ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnDropdownTestCondt().click();
			Thread.sleep(2000);
			var1.SelectYesTestCondt().click();
	    }

	    @And("^I set test condition date VUYO$")
	    public void i_set_test_condition_date_vuyo() throws Throwable {
	        Thread.sleep(2000);
			ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.SelectDateTestCondt().click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = ''", var1.SelectDateTestCondt());
			var1.SelectDateTestCondt().sendKeys("2022-01-01");
	    }

	    @And("^I scroll down to insurance details VUYO$")
	    public void i_scroll_down_to_insurance_details_vuyo() throws Throwable {
	        ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView();", var1.ScrollToDownUploadExpireDates());
	        Thread.sleep(2000);
	    }

	    @And("^I change Insurance Expiry Date VUYO$")
	    public void i_change_insurance_expiry_date_vuyo() throws Throwable {
	        Thread.sleep(2000);
			ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.SelectDateInsuaranceDate().click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = ''", var1.SelectDateInsuaranceDate());
			var1.SelectDateInsuaranceDate().sendKeys("2022-01-01");
	    }

	    @And("^I change License Expiry Date VUYO$")
	    public void i_change_license_expiry_date_vuyo() throws Throwable {
	        Thread.sleep(2000);
			ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.SelectDateLision().click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = ''", var1.SelectDateLision());
			var1.SelectDateLision().sendKeys("2022-01-01");
	    }

	    @And("^I select transmission type VUYO$")
	    public void i_select_transmission_type_vuyo() throws Throwable {
	        ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnDropdownTransmissionTyp().click();
			Thread.sleep(2000);
			var1.SelectAuto().click();
	    }

	    @And("^I select fuel type VUYO$")
	    public void i_select_fuel_type_vuyo() throws Throwable {
	        ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnDropdownFuelTyp().click();
			Thread.sleep(2000);
			var1.SelectPetrol().click();
	    }

	    @And("^I set milage VUYO$")
	    public void i_set_milage_vuyo() throws Throwable {
	        Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.SetMilage().sendKeys("56000");
	    }

	    @And("^I number of owners VUYO$")
	    public void i_number_of_owners_vuyo() throws Throwable {
	        Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.SetOwners().sendKeys("2");
	    }

	    @And("^I scroll down to save VUYO$")
	    public void i_scroll_down_to_save_vuyo() throws Throwable {
	        ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView();", var1.ScrollToDownToSave());
	        Thread.sleep(2000);
	    }

	    @And("^I click save button VUYO$")
	    public void i_click_save_button_vuyo() throws Throwable {
	        Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.ClickSaveBtn().click();
	    }

	    @And("^I click yes button VUYO$")
	    public void i_click_yes_button_vuyo() throws Throwable {
	        Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
	    	var1.ClickYesBtn().click();
	    }

		@And("^I scroll down to bonded details VUYO$")
    	public void i_scroll_down_to_bonded_details_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
   	 		js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToBondedDetails());
    }

    	
		@When("I tick on bonded details VUYO")
		public void i_tick_on_bonded_details_vuyo() throws InterruptedException {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickBondedDetailsCheckBox().click();
	}

		@When("I fill offence VUYO")
		public void i_fill_offence_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterOffence().sendKeys("Test Offence");
    }

		@When("I fill police station VUYO")
		public void i_fill_police_station_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterPoliceStation().sendKeys("Test Police Station");
    }

		@When("I select bonded date VUYO")
		public void i_select_bonded_date_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.SelectBondedDate().click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = ''", var1.SelectBondedDate());
			Thread.sleep(2000);
			var1.SelectBondedDate().sendKeys("2023-01-01");
    }

		@When("I enter bonded value VUYO")
		public void i_enter_bonded_value_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterBondedValue().sendKeys("100000");
    }

    	@And("^I select Next Hearing Date VUYO$")
    	public void i_select_next_hearing_date_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.SelectNextHearingDate().click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = ''", var1.SelectNextHearingDate());
			Thread.sleep(2000);
			var1.SelectNextHearingDate().sendKeys("2023-06-01");
    }

    	@And("^I select Bonded Release Date VUYO$")
    	public void i_select_bonded_release_date_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.SelectBondedReleaseDate().click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = ''", var1.SelectBondedReleaseDate());
			Thread.sleep(2000);
			var1.SelectBondedReleaseDate().sendKeys("2024-01-01");
    }

    	@And("^I click on select lawyer link VUYO$")
    	public void i_click_on_select_lawyer_link_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickSelecLawyerLink().click();
    }

    	@And("^I enter lawyer name VUYO$")
    	public void i_enter_lawyer_name_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterLawyerName().sendKeys("LOLC");
    }

    	@And("^I press lawyer search button VUYO$")
    	public void i_press_lawyer_search_button_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickLawyerSearchButton().click();
    }

		@And("^I press lawyer select button VUYO$")
    	public void i_press_lawyer_select_button_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickLawyerSelectButton().click();
    }

    	@And("^I enter case number VUYO$")
    	public void i_enter_case_number_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterCaseNumber().sendKeys("Test-100");
    }

		@When("I enter court house VUYO")
		public void i_enter_court_house_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterCourtHouse().sendKeys("Panadura");
    }

    	@And("^I enter Name Of the Person Appear VUYO$")
    	public void i_enter_name_of_the_person_appear_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EntereNameOfPerson().sendKeys("Mr.Perera");
    }

		@When("I enter remarks VUYO")
		public void i_enter_remarks_vuyo() throws Throwable {
        	Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterRemarksInBonded().sendKeys("LOLC");
    }

		@And("^I scroll down to sales stop VUYO$")
		public void i_scroll_down_to_sales_stop_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
   	 		js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollDownToSalesStop());
		}

		@And("^I tick on sales stop check box VUYO$")
		public void i_tick_on_sales_stop_check_box_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnSalesStopCheckBox().click();
		}

		@And("^I click on Select Stop By link VUYO$")
		public void i_click_on_select_stop_by_link_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnSalesStopByLink().click();
		}

		@And("^I enter search value in Stop By link VUYO$")
		public void i_enter_search_value_in_stop_by_link_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterSearchValueInStopByLink().sendKeys("test new");
		}

		@And("^I select search result in Stop By link VUYO$")
		public void i_select_search_result_in_stop_by_link_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnSearchResultInSalesStopBy().click();
		}

		@And("^I enter Sales Stop Date VUYO$")
		public void i_enter_sales_stop_date_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.EnterSalesStopDate().click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = ''", var1.EnterSalesStopDate());
			var1.EnterSalesStopDate().sendKeys("2023-01-10");
		}

		@And("^I select Sales Stop Reason VUYO$")
		public void i_select_sales_stop_reason_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnDropdownStopReson().click();
			Thread.sleep(2000);
			var1.SelectClientAgreed().click();
		}

		@And("^I click never expire VUYO$")
    	public void i_click_never_expire_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnNeverExpire().click();
    }

		@And("^I click on Sales Stop Save button VUYO$")
		public void i_click_on_sales_stop_save_button_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnSalesStopSaveBtn().click();
		}

		@And("^I click on Sales Stop ok button VUYO$")
		public void i_click_on_sales_stop_ok_button_vuyo() throws Throwable {
			Thread.sleep(1000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickOnSalesStopSaveBtnYes().click();
		}

		@And("^I scroll down to save with sales stop VUYO$")
    	public void i_scroll_down_to_save_with_sales_stop_vuyo() throws Throwable {
        	Thread.sleep(5000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ScrollToSave().click();
    	}

		@And("^I click yes button in sales stop VUYO$")
		public void i_click_yes_button_in_sales_stop_vuyo() throws Throwable {
			Thread.sleep(3000);
	    	ViewUpdateYardOperationSub var1 = new ViewUpdateYardOperationSub(driver);
			var1.ClickYesBtnInSalesStop().click();
			
		}


}
