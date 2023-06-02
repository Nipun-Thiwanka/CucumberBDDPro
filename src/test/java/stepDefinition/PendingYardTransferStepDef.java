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
import pendingYardTransfer.PendingYardTransferMain;
import pendingYardTransfer.PendingYardTransferSub;

public class PendingYardTransferStepDef extends PendingYardTransferMain {
    @Given("^I need to navigate LOLC FusionX Loging page for PYT$")
    public void i_need_to_navigate_lolc_fusionx_loging_page_for_pyt() throws Throwable {
        driver=inheritancePYT();
        driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("^I enter PYT1 (.+)$")
    public void i_enter_pyt1(String username) throws Throwable {
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
    } 

    @And("^I click continue button PYT$")
    public void i_click_continue_button_pyt() throws Throwable {
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickContinueButton().click();
    }

    @And("^I enter PYT (.+)$")
    public void i_enter_pyt(String password) throws Throwable {
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.typePassword().sendKeys("Hecember@1234");
    }

    @And("^I click the sign in button PYT$")
    public void i_click_the_sign_in_button_pyt() throws Throwable {
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clicksubmit().click();
    }

    @And("^I click Yard Management option PYT$")
    public void i_click_yard_management_option_pyt() throws Throwable {
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickYardManagement().click();
		Thread.sleep(5000);
    }

    @And("^I click on Yard Transfer PYT$")
    public void i_click_on_yard_transfer_pyt() throws Throwable {
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
	    driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1.clickOnYardTransfer().click();
    }

    @And("^I select Pending Yard Transfer PYT$")
    public void i_select_pending_yard_transfer_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickOnPendingYardTransfer().click();
    }

    @And("^I enter search values PYT$")
    public void i_enter_search_values_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.EnterSearchValues().sendKeys("65");
    }

    @And("^I click search button PYT$")
    public void i_click_search_button_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickSearchButton().click();
    }

    @And("^I scroll div horizontally PYT$")
    public void i_scroll_div_horizontally_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", var1.scrollToClick());
    }

    @And("^I click view button PYT$")
    public void i_click_view_button_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickViewButton().click();
    }

    @And("^I click ok button PYT$")
    public void i_click_ok_button_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickOkButton().click();
    }

    @And("^I click yard in button PYT$")
    public void i_click_yard_in_button_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickYardInButton().click();
    }

    @And("^I select yard PYT$")
    public void i_select_yard_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickSelectYard().click();
        Thread.sleep(1000);
        var1.selectYardWallampitiya().click();
    }

    @And("^I select yard in sub category PYT$")
    public void i_select_yard_in_sub_category_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickYardSubCate().click();
        Thread.sleep(1000);
        var1.selectYardSubCate().click();
    }

    @And("^I scroll down to yard in check list PYT$")
    public void i_scroll_down_to_yard_in_check_list_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToAirCleanser());
    }

    @And("^I tick on availability checkbox PYT$")
    public void i_tick_on_availability_checkbox_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.tickAirCleanser().click();
    }

    @And("^I enter item description PYT$")
    public void i_enter_item_description_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.enterItemDesc().sendKeys("description");
    }

    @And("^I enter item count PYT$")
    public void i_enter_item_count_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.enterItemCount().sendKeys("2");
    }

    @And("^I scroll down to export check list PYT$")
    public void i_scroll_down_to_export_check_list_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToExportCheck());
    }

    @And("^I click export check list button PYT$")
    public void i_click_export_check_list_button_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickExportCheck().click();
    }

    @And("^I upload a file PYT$")
    public void i_upload_a_file_pyt() throws Throwable {
    Thread.sleep(1000);
    String fileURL = "https://www.orimi.com/pdf-test.pdf";
    URL url = new URL(fileURL);
    InputStream inputStream = url.openStream();
    File tempFile = File.createTempFile("temp", ".pdf");
    FileUtils.copyInputStreamToFile(inputStream, tempFile);
    String filePath = tempFile.getAbsolutePath();
    PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
    var1.ClickToUploadFile().sendKeys(filePath);
    Thread.sleep(1000);
}

    @And("^I enter remarks PYT$")
    public void i_enter_remarks_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.enterRemarks().sendKeys("remarks");
    }

    @And("^I click save button PYT$")
    public void i_click_save_button_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickSave().click();
    }

    @And("^I click ok PYT$")
    public void i_click_ok_pyt() throws Throwable {
        Thread.sleep(1000);
        PendingYardTransferSub var1 = new PendingYardTransferSub(driver);
        var1.clickOkToSave().click();
    }
}
