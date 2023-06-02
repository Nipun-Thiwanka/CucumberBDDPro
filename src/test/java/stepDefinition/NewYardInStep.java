package stepDefinition;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.internal.Lists;

import clickOnAddNewYardIn.ClickOnAddNewYardInMain;
import clickOnAddNewYardIn.ClickOnAddNewYardInSub;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NewYardInStep extends ClickOnAddNewYardInMain{
	@Given("I need to navigate Fusion X Loging page CANYI")
	public void i_need_to_navigate_fusion_x_loging_page_canyi()  throws Throwable {
		driver=inheritanceCANYI();
		driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
	}

	@When("I enter   <Username> CANYI1")
	public void i_enter_username_canyi1()throws Throwable {
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	
	@When("I click continue button  CANYI")
	public void i_click_continue_button_canyi()  throws Throwable {
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver); 
		var1.clickContinueButton().click();
		Thread.sleep(2000); 
	}
	
	@When("I enter CANYI <Password> CANYI")
	public void i_enter_canyi_password_canyi() throws Throwable {
		 ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		 var1.typePassword().sendKeys("Hecember@1234");
		 Thread.sleep(2000);
	}
	
	@When("I click the sign in button CANYI")
	public void i_click_the_sign_in_button_canyi() throws Throwable {
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.clicksubmit().click();
	}
	
	@When("I click Yard Management CANYI")
	public void i_click_yard_management_canyi()  throws Throwable {
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(3000);
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(3000);
	}
	
	@When("I click on Yard In CANYI")
	public void i_click_on_yard_in_canyi() throws Throwable{
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        var1.clickYardIn().click();
	}
	
//@Clickon_Settlement_Letter_Print
	
	@When("I Click the Settlement Letter Print  CANYI")
	public void i_click_the_settlement_letter_print_canyi()  throws Throwable{
		Thread.sleep(3000);
	    ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.ClickTheSettlementLetterPrint().click();
	}
	
	@And("^I Enter the vehicle Number$")
    public void i_enter_the_vehicle_number() throws Throwable {
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.EnterTheVehicleNumberSettlementLetter().sendKeys("YQ5280");
		Thread.sleep(2000);
    }
	
	@And("^I Click Search Btn for vehicle Number$")
	public void i_click_search_btn_for_vehicle_number() throws Throwable {
    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1. ClickSearchBtnforvehicleNumber().click();
		Thread.sleep(3000);
	}
	
	 @And("^I Enter Settlement Letter Print  Contract Number$")
	 public void i_enter_settlement_letter_print_contract_number() throws Throwable{
		Thread.sleep(2000);
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1. EnterSettlementLetterPrintContractNumber().sendKeys("G0-02-0010BF");
		Thread.sleep(2000);
	}
	 
	 @And("^I Click Search Btn for Contract Number$")
	 public void i_click_search_btn_for_contract_number() throws Throwable {
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.ClickSearchBtnforContractNumber().click();
		Thread.sleep(3000);
	}
	 
	 @And("^I Enter the Customer Name$")
	 public void i_enter_the_customer_name() throws Throwable {
		Thread.sleep(3000);
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.EntertheSettlementLetterPrintCustomerName().sendKeys("MR CK SIRIWARDHANA");
	    Thread.sleep(2000);
	}
	 
	 @And("^I Click Search Btn for Customer Name$")
	 public void i_click_search_btn_for_customer_name1() throws Throwable {
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
	    var1.SearchBtnforCustomerName().click();
		Thread.sleep(3000);
	}
	 
	 @And("^I Select the YardIn Date From$")
	 public void i_select_the_yardin_date_from1() throws Throwable{
	    Thread.sleep(2000);
		ClickOnAddNewYardInSub var1 = new  ClickOnAddNewYardInSub(driver);
        var1.SelecttheYardInDateFrom().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelecttheYardInDateFrom());
        var1.SelecttheYardInDateFrom().sendKeys("2017-09-06");
	 }
	 
	 @And("^I on date$")
	 public void i_on_date() throws Throwable {
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.ClickOnDate().click();
		Thread.sleep(3000);
	 }

	 
	 
	  @And("^I Select the YardIn Date To$")
	  public void i_select_the_yardin_date_to1() throws Throwable{
		 Thread.sleep(2000);
		 ClickOnAddNewYardInSub var1 = new  ClickOnAddNewYardInSub(driver);
	     var1.SelecttheYardInDateTo().click();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].value = ''", var1.SelecttheYardInDateTo());
	     var1.SelecttheYardInDateTo().sendKeys("2023-05-01");
	 }
	
	 @And("^I Click Search button$")
	 public void i_click_search_button() throws Throwable {
		  ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		  var1.ClickOnSearch().click();
		  Thread.sleep(3000);
	 }


	 @And("^I Enter The Print Type$")
	 public void i_enter_the_print_type() throws Throwable {
		 Thread.sleep(3000);
		 ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
		 var1.EnterThePrintType().click();
		 Thread.sleep(3000);
		 var1.EnterThePrintTypeNotPrinted().click();
	 }
	    
	 @And("^I scroll to down$")
	 public void i_scroll_to_down() throws Throwable {
	    Thread.sleep(3000);
	    ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToDown());
	 }
	    
	 @And("^I scroll div horizontally$")
	 public void i_scroll_div_horizontally() throws Throwable {
	    ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		Thread.sleep(3000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToTick());
	    Thread.sleep(2000);
	 }

	  @When("I Tick the PrintCheckBox")
	  public void i_tick_the_print_check_box() throws Throwable {
	    Thread.sleep(3000);
	    ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.TickthePrintCheckBox().click();
		Thread.sleep(3000);
	 }

	 @When("I Click The Print Btn")
	 public void i_click_the_print_btn() throws Throwable {
	    ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.ClickThePrintBtn().click();
		Thread.sleep(3000);
	 }
	    
	 @And("^I Click The Print OK Btn$")
	 public void i_click_the_print_ok_btn() throws Throwable {
		ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.ClickThePrintOKBtn().click();
		Thread.sleep(3000);
	 }
	    
	 
//@Clickon_Settlement_Letter_Print	
	
	
	@When("I click on YardIn Details CANYI")
	public void i_click_on_yard_in_details_canyi()  throws Throwable {
		Thread.sleep(3000);
    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.YardInDetails().click();
	}


	@When("I click on Add Newe Yard in CANYI")
	public void i_click_on_add_newe_yard_in_canyi()  throws Throwable{
	  	Thread.sleep(3000);
	  	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.AddNeweYard().click();
	} 
	
	
//Clickon_View_Or_Update_YArd_In
	
	  @And("^I click on View Or Update YArd In CANYI$")
	  public void i_click_on_view_or_update_yard_in_canyi() throws Throwable {
		  Thread.sleep(3000);
		  ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		  var1.ViewOrUpdateYArdIn().click();
	 }
	  
	  @And("^I enter the vehicle number CANYIU$")
	  public void i_enter_the_vehicle_number_canyiu1() throws Throwable {
		  ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		  var1.UpdateEnterTheVehicleNo().sendKeys("HF7386");
		  Thread.sleep(2000);
	 }
	  
	  @And("^I press the search button CANYIU$")
	  public void i_press_the_search_button_canyiu1() throws Throwable {		 
		  Thread.sleep(3000);
	      ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	      var1. UpdateclickOnSearchBtn().click();
	 }
	  
	  @And("^User need to scroll div CANYIU$")
	  public void user_need_to_scroll_div_canyiu1() throws Throwable {
		  Thread.sleep(2000);
	      ClickOnAddNewYardInSub var1 = new ClickOnAddNewYardInSub(driver);
	      WebElement element = var1.UpdateScrollToSelectYardIn();
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.UpdateScrollToSelectYardIn());
	 }
	  
	  @And("^Click the select Update CANYIU$")
	  public void click_the_select_update_canyiu() throws Throwable {
	    Thread.sleep(3000);
	  	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.clickOnUpdateBtn().click();
	 }
	  
	  @When("Click Yard Option CANYIUS")
	  public void click_yard_option_canyius() throws Throwable {
		 Thread.sleep(3000);
	     ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	     var1.UpdateSelectYardDropDown().click();
	     Thread.sleep(3000);
	     var1.UpdateSelectYardDropDownOption().click();
	  }
	  
	  @When("Yard-In Sub Category CANYIU")
	  public void yard_in_sub_category_canyiu()throws Throwable{
	     ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
		 var1.YardInSubCategoryDropDown().click();
		 Thread.sleep(3000);
		 var1.YardInSubCategoryDropDownOption().click();
	  }

	  @And("^I Click the Side Mirror CANYIU$")
	  public void i_click_the_side_mirror_canyiu() throws Throwable {
	    Thread.sleep(3000);
	    ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	    Thread.sleep(3000);
	    var1.UpdateClickTheSideMirror().click();
	  }

	  @And("^I Enter The Item Description CANYIU$")
	  public void i_enter_the_item_description_canyiu() throws Throwable {
	    ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.UpdateEnterItemDescription().sendKeys("100526");
		Thread.sleep(2000);	    
	  }

	  @And("^I Enter The Item Count CANYIU$")
	  public void i_enter_the_item_count_canyiu() throws Throwable {
	    ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.UpdateEnterItemCount().sendKeys("1");
		Thread.sleep(2000);
	  }
	  
	  @And("^I Click the Seats CANYIU$")
	  public void i_click_the_seats_canyiu() throws Throwable {
	    Thread.sleep(3000);
	    ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	    Thread.sleep(3000);
	    var1.UpdateEnterClicktheSeats().click();
	  }

	  @And("^I Enter The Seats  Item Description CANYIU$")
	  public void i_enter_the_seats_item_description_canyiu() throws Throwable {
	    ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		var1.UpdateClickSeatsItemDescription().sendKeys("53695");
		Thread.sleep(2000);	 
	  }

	    @And("^I Enter The Seats  Item Count CANYIU$")
	    public void i_enter_the_seats_item_count_canyiu() throws Throwable {
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
			  var1.UpdateEnterTheSeatsItemCount().sendKeys("5");;
			  Thread.sleep(2000);
	  }
	    @When("I scroll to check list CANYI")
	    public void i_scroll_to_check_list_canyi() throws Throwable {
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1 = new ClickOnAddNewYardInSub(driver);
	   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView();", var1.UpdatescrolldivToChecklist());
	   	 	Thread.sleep(3000);
	  }

	    @When("I Click The Export CheckList CANYIU")
	    public void i_click_the_export_check_list_canyiu() throws Throwable {
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	    	Thread.sleep(3000);
	    	var1. UpdateClickTheExportCheckList().click();
	   }

		@And("^I Click The Click to Upload CANYIU$")
	    public void i_click_the_click_to_upload_canyiu() throws Throwable {
	    	Thread.sleep(1000);
			String fileURL = "https://www.orimi.com/pdf-test.pdf";
			URL url = new URL(fileURL);
			InputStream inputStream = url.openStream();
			File tempFile = File.createTempFile("temp", ".pdf");
			FileUtils.copyInputStreamToFile(inputStream, tempFile);
			String filePath = tempFile.getAbsolutePath();
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
	    	var1.FileUpload().sendKeys(filePath);
	   }

	    @And("^I Enter The Remark CANYIU$")
	    public void i_enter_the_remark_canyiu() throws Throwable {
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
			 var1.EnterTheRemark().sendKeys("Test Remark");
			 Thread.sleep(2000);
	   }
	    
	    @And("^I scroll to update CANYIU$")
	    public void i_scroll_to_update_canyiu() throws Throwable {
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1 = new ClickOnAddNewYardInSub(driver);
	   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView();", var1.ScrollToUpdate());
	   	 	Thread.sleep(3000);
	   }


	    @When("^I Click  Update Btn CANYIU$")
	    public void i_click_update_btn_canyiu() throws Throwable {
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	        var1.ClickTheUpdateBtn().click();
	    }

	    @When("I Click The OK Btn CANYIU")
	    public void ClickTheUpdateBtn() throws Throwable{
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	        var1.UpdateClickTheOKBtn().click();
	    }
	    
//	Clickon_View_Or_Update_YArd_In
	  
	  
	    @When("I enter the vehicle number CANYI")
		public void i_enter_the_vehicle_number_canyi() throws Throwable {
		  ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
		  var1.EnterTheVehicleNo().sendKeys("YD1449");
		  Thread.sleep(2000);
	    }
	    @When("I press the search button CANYI")
		public void i_press_the_search_button_canyi() throws Throwable{
		  	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	        var1.clickOnSearchBtn().click();
	    }
	    
	  	@And("^User need to scroll div CANYI$")
	    public void user_need_to_scroll_div_canyi() throws Throwable {
		    Thread.sleep(2000);
	    	ClickOnAddNewYardInSub var1 = new ClickOnAddNewYardInSub(driver);
	    	WebElement element = var1.scrollToSelectYardIn();
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToSelectYardIn());
	    }

	    @And("^Click the select Yard In CANYI$")
	    public void click_the_select_yard_in_canyi() throws Throwable {
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	        var1.selectYardInBtn().click();
	    }
	   
	    @And("^Click Yard Option CANYI$")
	    public void click_yard_option_canyi() throws Throwable {
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	        var1.selectYardDropDown().click();
	    	Thread.sleep(3000);
	    	var1.selectYardDropDownOption().click();
	    }
	    
	    @When("Yard-In Sub Category CANYI")
	    public void yard_in_sub_category_canyi() throws Throwable{
	    	 ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
		 	 var1.YardInSubCategory().click();
		 	 Thread.sleep(3000);
		 	 var1.selectSubCategoryDropDownOption().click();
	    }
	    
	    @When("I scroll to check list CANYIU")
		public void i_scroll_to_check_list_canyiu() throws Throwable {
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1 = new ClickOnAddNewYardInSub(driver);
	   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToCheckList());
	   	 	Thread.sleep(3000);
	    }
	  
	    @When("I Click the Side Mirror CANYI")
	    public void i_click_the_side_mirror_canyi()throws Throwable {
	    	Thread.sleep(5000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	    	Thread.sleep(3000);
	    	var1.ClickTheSideMirror().click();
	    }

	    @When("I Enter The Item Description CANYI")
	    public void i_enter_the_item_description_canyi1()throws Throwable {
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
			var1.EnterItemDescription().sendKeys("17895");
			Thread.sleep(2000);	    
	    }
	    
	    @When("^I Enter The Item Count CANYI$")
	    public void i_enter_the_item_count_canyi1() throws Throwable {
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
			var1.EnterItemCount().sendKeys("1");;
			Thread.sleep(2000);
	    }
	    
	    @When("^I Click the Seats CANYI$")
	    public void i_click_the_seats_canyi() throws Throwable {
	        Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	    	Thread.sleep(3000);
	    	var1.ClickTheideSeats().click();
	    }
	
	    @When("I Enter The Seats  Item Description CANYI")
	    public void i_enter_the_seats_item_description_canyi()throws Throwable {
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
			var1.EnterSeatsItemDescription().sendKeys("235896");
			Thread.sleep(2000);
	    }
	    
	    @And("I Enter The Seats  Item Count CANYI")
	    public void i_enter_the_seats_item_count_canyi()throws Throwable {
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
			var1.EnterSeatsItemCount().sendKeys("2");
			Thread.sleep(2000);
	    }
	    
	    @When("^User need to scroll div To Checklist CANYI$")
	    public void user_need_to_scroll_div_to_checklist_canyi() throws Throwable {
	    	Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1 = new ClickOnAddNewYardInSub(driver);
	   	 	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToExportCheckList());
	   	 	Thread.sleep(3000);
	    }
	  
	    @When("I Click The Export CheckList CANYI")
	    public void i_click_the_export_check_list_canyi() throws Throwable {
	        Thread.sleep(3000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	        var1.ClickTheExportCheckLists().click();
	    }

		@When("I Click The Click to Upload CANYI")
	    public void i_click_the_click_to_upload_canyi()throws Throwable {
	    	Thread.sleep(1000);
			String fileURL = "https://www.orimi.com/pdf-test.pdf";
			URL url = new URL(fileURL);
			InputStream inputStream = url.openStream();
			File tempFile = File.createTempFile("temp", ".pdf");
			FileUtils.copyInputStreamToFile(inputStream, tempFile);
			String filePath = tempFile.getAbsolutePath();
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
	    	var1.FileUpload().sendKeys(filePath);
	    }
	 
	    @When("I Enter The Remark")
	    public void i_enter_the_remark() throws Throwable {
	    	ClickOnAddNewYardInSub var1=new ClickOnAddNewYardInSub(driver);
			var1.EnterTheRemark().sendKeys("Test Remark");
			Thread.sleep(2000);
	    }

	  
	    @And("^I Click The Save Btn CANYI$")
	    public void i_click_the_save_btn_canyi() throws Throwable {
	    	Thread.sleep(2000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	        var1. ClickTheSaveBtn().click();
	    }
	    @When("^I Click The OK Btn CANYI$")
	    public void i_click_the_ok_btn_canyi() throws Throwable {
	    	Thread.sleep(2000);
	    	ClickOnAddNewYardInSub var1=new  ClickOnAddNewYardInSub(driver);
	        var1.ClickOkBtn().click();
	    }
}
