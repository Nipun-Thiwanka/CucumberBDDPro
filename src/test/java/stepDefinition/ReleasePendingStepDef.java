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
import offerApproval.OfferApprovalSub;
import  releasePending.ReleasePendingSub ;
import yardEvaluationn.YardEvaluationnSub;
import  releasePending. ReleasePendingMain;

public class ReleasePendingStepDef extends  ReleasePendingMain{
	
	
@Given("I need to navigate Fusion X Loging page CORP")
public void i_need_to_navigate_fusion_x_loging_page_corp() throws Throwable{
	driver=inheritanceRP ();
	driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}
@When("I enter   <Username>  CORP")
public void i_enter_username_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
	Thread.sleep(2000);
}
	
@When("I click continue button   CORP")
public void i_click_continue_button_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.clickContinueButton().click();
	Thread.sleep(2000);
}
	
@When("I enter  CORP <Password>")
public void i_enter_corp_password() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.typePassword().sendKeys("September@1234");
	 Thread.sleep(2000);
}
	 
@When("I click the sign in button  CORP")
public void i_click_the_sign_in_button_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.clicksubmit().click();
	Thread.sleep(6000);
}

@When("I click Yard Management CORP")
public void i_click_yard_management_corp() throws Throwable{
	Thread.sleep(5000);
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
    List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	Thread.sleep(5000);
	var1.clickYardManagement().click();
	Thread.sleep(5000);
}

@When("I click on Yard release  CORP")
public void i_click_on_yard_release_corp() throws Throwable{
	Thread.sleep(5000);
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	driver.switchTo().window(browserTabs.get(1));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    var1.clickYardRelease().click();
}

@When("I Click On Release Pending - Release To Buyer CORP")
public void i_click_on_release_pending_release_to_buyer_corp() throws Throwable{
	Thread.sleep(6000);
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1. ReleasePendingReleaseToBuyer().click();
	Thread.sleep(6000);
}

@When("I Search vehicle Number CORP")
public void i_search_vehicle_number_corp() throws Throwable{
	Thread.sleep(2000);
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.SearchvehicleNum().sendKeys("QA1211");
	 Thread.sleep(2000);
}

@When("I Click Search BTN CORP")
public void i_click_search_btn_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.ClickSearchButton().click();
	Thread.sleep(6000);
}

@When("I Scroll To Release To Buyer CORP")
public void i_scroll_to_release_to_buyer_corp() throws Throwable{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ReleasePendingSub var1=new ReleasePendingSub(driver);
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.ScrollToReleaseToBuyer());
      Thread.sleep(3000);
}

@When("I Click Release To Buyer CORP")
public void i_click_release_to_buyer_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.ClickToReleaseToBuyer().click();
	Thread.sleep(6000);
}

@When("I Select Yard Method CORP")
public void i_select_yard_method_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.SelectYardMethod().click();
	Thread.sleep(6000);
}

@When("I Select Tender CORP")
public void i_select_tender_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.SelectTender().click();
	Thread.sleep(6000);
}

@When("I Enter  Sale Value CORP")
public void i_enter_sale_value_corp() throws Throwable{
	Thread.sleep(2000);
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.SelectSaleValue().click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].value = ''", var1.SelectSaleValue());
     Thread.sleep(2000);
	 var1.SelectSaleValue().sendKeys("72000");
	 Thread.sleep(2000);
}

@When("I Select Sale Date CORP")
public void i_select_sale_date_corp() throws Throwable{
	 Thread.sleep(2000);
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
        var1.SelectSaleDate().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectSaleDate());
        var1.SelectSaleDate().sendKeys("2023-05-19");
        Thread.sleep(2000);
}

@When("I Select Release Date CORP")
public void i_select_release_date_corp() throws Throwable{
	 Thread.sleep(2000);
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
        var1.SelectReleaseDate().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = ''", var1.SelectReleaseDate());
        var1.SelectReleaseDate().sendKeys("2023-05-19");
        Thread.sleep(2000);
}

@When("I Scroll To Buyer CORP")
public void i_scroll_to_buyer_corp() throws Throwable{
	Thread.sleep(3000);
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToBuyer());
   	Thread.sleep(3000);
}

@When("I Enter The Name CORP")
public void i_enter_the_name_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.EnterTheName().sendKeys("W.A.B.J Wanasinhe");
	 Thread.sleep(2000);
}
@When("I Enter the NIC CORP")
public void i_enter_the_nic_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.EntertheNIC().sendKeys("9226124567V");
	 Thread.sleep(2000);
}

@When("I Enter The Address line1 CORP")
public void i_enter_the_address_line1_corp() throws Throwable{
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.Addressline1().sendKeys("20");
	 Thread.sleep(2000);
}
@When("I Enter The Address line2 CORP")
public void i_enter_the_address_line2_corp() throws Throwable{
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.Addressline2().sendKeys("20");
	 Thread.sleep(2000);
}
@When("I Enter The Address line3 CORP")
public void i_enter_the_address_line3_corp() throws Throwable{
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.Addressline3().sendKeys("Main Street");
	 Thread.sleep(2000);
}
@When("I Enter The Address line4 CORP")
public void i_enter_the_address_line4_corp()throws Throwable{
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.Addressline4().sendKeys("Main Street");
	 Thread.sleep(2000);
}
@When("I Enter The Address line5 CORP")
public void i_enter_the_address_line5_corp() throws Throwable{
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.Addressline5().sendKeys("Gampaha");
	 Thread.sleep(2000);
}
@When("I Enter The Address line6 CORP")
public void i_enter_the_address_line6_corp() throws Throwable{
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.Addressline6().sendKeys("Gampaha");
	 Thread.sleep(2000);
}

@When("I Enter The Receipt No\\/PO CORP")
public void i_enter_the_receipt_no_po_corp() throws Throwable{
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
	 var1.ReceiptNo().sendKeys("123456");
	 Thread.sleep(2000);
}

@When("I Scroll to Save BTN CORP")
public void i_scroll_to_save_btn_corp() throws Throwable{
	Thread.sleep(3000);
	 ReleasePendingSub var1=new ReleasePendingSub(driver);
   JavascriptExecutor js = (JavascriptExecutor) driver;
  	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrolltoSaveBtn());
  	Thread.sleep(3000);
}

@When("I click on Save button CORP")
public void i_click_on_save_button_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.clickOnSavebutton().click();
	Thread.sleep(6000);
}

@When("I Click Ok BTN  CORP")
public void i_click_ok_btn_corp() throws Throwable{
	ReleasePendingSub var1=new ReleasePendingSub(driver);
	var1.clickOnOKbutton().click();
	Thread.sleep(6000);
}











}
