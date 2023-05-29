package clickOnAddNewYardIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickOnAddNewYardInSub extends ClickOnAddNewYardInMain {
	public WebDriver driver;
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	
	public ClickOnAddNewYardInSub(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement typeUserName()
	{
		return driver.findElement(var_username);
		
	}
	public WebElement clickContinueButton()
	{
		return driver.findElement(var_continue_button);
		
	}
	public WebElement typePassword()
	{
		return driver.findElement(var_password);
		
	}
	public WebElement clicksubmit()
	{
		return driver.findElement(var_submit_btn);
		
	}
	public WebElement clickYardManagement()
	{
		By var_clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[1]");
		return driver.findElement(var_clickYardManagement);
	}
	public WebElement clickYardIn()
	{
		By var_clickYardIn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[4]/div");
		return driver.findElement(var_clickYardIn);
	}
	
//@Clickon_Settlement_Letter_Print
	
	public WebElement  ClickTheSettlementLetterPrint()
	{
		By var_ClickTheSettlementLetterPrint= By.xpath("//*[@id=\"/:tenant/yard-in$Menu\"]/li[3]");
		return driver.findElement(var_ClickTheSettlementLetterPrint);
	}
	public WebElement  EnterTheVehicleNumberSettlementLetter()
	{
		By var_EnterTheVehicleNumberSettlementLetter= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/span/input");
		return driver.findElement(var_EnterTheVehicleNumberSettlementLetter);
	}
	public WebElement  EnterSettlementLetterPrintContractNumber()
	{
		By var_EnterSettlementLetterPrintContractNumber= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/span/input");
		return driver.findElement(var_EnterSettlementLetterPrintContractNumber);
	}
	public WebElement ClickSearchBtnforContractNumber()
	{
		By var_ClickSearchBtnforContractNumber= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/span/input");
		return driver.findElement(var_ClickSearchBtnforContractNumber);
	}
	
	
	public WebElement  EntertheSettlementLetterPrintCustomerName()
	{
		By var_EntertheSettlementLetterPrintCustomerName= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[2]/span/input");
		return driver.findElement(var_EntertheSettlementLetterPrintCustomerName);
	}
	public WebElement  SearchBtnforCustomerName()
	{
		By var_SearchBtnforCustomerName= By.xpath("//*[@id=\\\"root\\\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/span/input");
		return driver.findElement(var_SearchBtnforCustomerName);
	}
	public WebElement  SelecttheYardInDateFrom()
	{
		By var_SelecttheYardInDateFrom= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[4]/div/div[2]/div/div/input");
		return driver.findElement(var_SelecttheYardInDateFrom);
	}
	
	public WebElement  ClickOnDate()
	{
		By var_ClickOnDate= By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]/div");
		return driver.findElement(var_ClickOnDate);
	}
	public WebElement  SelecttheYardInDateTo()
	{
		By var_SelecttheYardInDateTo= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[5]/div/div[2]/div/div/input");
		return driver.findElement(var_SelecttheYardInDateTo);
	}
	public WebElement  ClickOnSearch()
	{
		By var_ClickOnSearch= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[5]/div/div[3]/button");
		return driver.findElement(var_ClickOnSearch);
	}
	
	public WebElement  EnterThePrintType()
	{
		By var_EnterThePrintType= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[6]/div/div[2]/button");
		return driver.findElement(var_EnterThePrintType);
	}
	public WebElement  EnterThePrintTypeNotPrinted()
	{
		By var_EnterThePrintTypeNotPrinted= By.xpath("/html/body/div[5]/div/div/ul/li[1]");
		return driver.findElement(var_EnterThePrintTypeNotPrinted);
	}
	
	public WebElement ScrollToDown()
	{
		By var_ScrollToDown= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]");
		return driver.findElement(var_ScrollToDown);
	}
	public WebElement  scrollToTick()
	{
		By var_scrollToTick= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToTick);
	}
	public WebElement  TickthePrintCheckBox()
	{
		By var_TickthePrintCheckBox= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[11]/div/div/label/span/input");
		return driver.findElement(var_TickthePrintCheckBox);
	}
	public WebElement  ClickThePrintBtn()
	{
		By var_ClickThePrintBtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div/div[2]/button");
		return driver.findElement(var_ClickThePrintBtn);
	}
	public WebElement  ClickThePrintOKBtn()
	{
		By var_ClickThePrintOKBtn= By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickThePrintOKBtn);
	}

	
	
	
//@Clickon_Settlement_Letter_Print

	public WebElement YardInDetails()
	{
		By var_YardInDetails = By.xpath("//*[@id=\"/:tenant/yard-in$Menu\"]/li[1]");
		return driver.findElement(var_YardInDetails);
	}
	public WebElement AddNeweYard()
	{
		
		By var_AddNeweYard = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a/div");
		return driver.findElement(var_AddNeweYard);
	}
	public WebElement ClickSearchBtnforvehicleNumber()
	{
		
		By var_ClickSearchBtnforvehicleNumber= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[5]/div/div[3]/button");
		return driver.findElement(var_ClickSearchBtnforvehicleNumber);
	}
	
//@Clickon_View_Or_Update_YArd_In

	public WebElement ViewOrUpdateYArdIn()
	{
		
		By var_ViewOrUpdateYArdIn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/a/div");
		return driver.findElement(var_ViewOrUpdateYArdIn);
	}
	public WebElement UpdateEnterTheVehicleNo()
	{
		By var_UpdateEnterTheVehicleNo = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_UpdateEnterTheVehicleNo);
	}
	public WebElement  UpdateclickOnSearchBtn()
	{
		By var_UpdateclickOnSearchBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/button");
		return driver.findElement(var_UpdateclickOnSearchBtn);
	
	}
	public WebElement  UpdateScrollToSelectYardIn()
	{
		By var_UpdateScrollToSelectYardIn  = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div");			
		return driver.findElement(var_UpdateScrollToSelectYardIn);
	}
	public WebElement clickOnUpdateBtn()
	{
		By var_clickOnUpdateBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div[2]/a/button/span");
		return driver.findElement(var_clickOnUpdateBtn);
	}
	public WebElement UpdateSelectYardDropDown()
	{
		By var_UpdateSelectYardDropDown= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[13]/div[1]/div/div/div/div/div");
		return driver.findElement(var_UpdateSelectYardDropDown);
	}
	
	public WebElement UpdateSelectYardDropDownOption()
	{
		By var_UpdateSelectYardDropDownOption = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_UpdateSelectYardDropDownOption);
	}
	public WebElement YardInSubCategoryDropDown()
	{
		By var_UpdateSelectYardDropDown= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[11]/div[1]/div/div/div/div/div");
		return driver.findElement(var_UpdateSelectYardDropDown);
	}
	
	public WebElement YardInSubCategoryDropDownOption()
	{
		By var_UpdateSelectYardDropDownOption = By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_UpdateSelectYardDropDownOption);
	}
	public WebElement UpdateClickTheSideMirror()
	{
		By var_UpdateClickTheSideMirror = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[4]/td[2]/div/div/label/span/input");
		return driver.findElement(var_UpdateClickTheSideMirror);
	}
	
	public WebElement UpdateEnterItemDescription()
	{
		By var_UpdateEnterItemDescription= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[4]/td[3]/div/div/div/textarea");
		return driver.findElement(var_UpdateEnterItemDescription);
	
	}
	public WebElement UpdateEnterItemCount()
	{
		By var_UpdateEnterItemCount= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[4]/td[4]/div/div/div/div[2]/input");
		return driver.findElement(var_UpdateEnterItemCount);
	}
	public WebElement UpdateEnterClicktheSeats()
	{
		By var_UpdateEnterClicktheSeats= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[5]/td[2]/div/div/label/span/input");
		return driver.findElement(var_UpdateEnterClicktheSeats);
	}
	public WebElement UpdateClickSeatsItemDescription()
	{
		By var_UpdateClickSeatsItemDescription= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[5]/td[3]/div/div/div/textarea");
		return driver.findElement(var_UpdateClickSeatsItemDescription);
	}
	public WebElement UpdateEnterTheSeatsItemCount()
	{
		By var_UpdateEnterTheSeatsItemCount= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[5]/td[4]/div/div/div/div[2]/input");
		return driver.findElement(var_UpdateEnterTheSeatsItemCount);
	}
	public WebElement UpdatescrolldivToChecklist()
	{
		By var_UpdatescrolldivToChecklist= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]");
		return driver.findElement(var_UpdatescrolldivToChecklist);
	}
	public WebElement UpdateClickTheExportCheckList()
	{
		By var_UpdateClickTheExportCheckList= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/button");
		return driver.findElement(var_UpdateClickTheExportCheckList);
	}
	
	public WebElement  UpdateClickTheClickToUpload()
	{
		By var_UpdateClickTheClicktoUpload= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[3]/div[2]/span/div[1]/span/button");
		return driver.findElement(var_UpdateClickTheClicktoUpload);
	}
	
	public WebElement UpdateEnterTheRemark()
	{
		By var_UpdateEnterTheRemark= By.xpath("//*[@id=\"detailRemark\"]");
		return driver.findElement(var_UpdateEnterTheRemark);
	}
	
	public WebElement ScrollToUpdate()
	{
		By var_ScrollToUpdate= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[5]");
		return driver.findElement(var_ScrollToUpdate);
	}
	
	
	public WebElement ClickTheUpdateBtn()
	{
		By var_ClickTheUpdateBtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[5]/div/div[2]/button");
		return driver.findElement(var_ClickTheUpdateBtn);
	}
	
	public WebElement UpdateClickTheOKBtn()
	{
		By var_UpdateClickTheOKBtn= By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_UpdateClickTheOKBtn);
	}
	
			
// @Clickon_View_Or_Update_YArd_In
	
	
	public WebElement EnterTheVehicleNo ()
{
		By var_EnterTheVehicleNo = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_EnterTheVehicleNo);
	}
	public WebElement clickOnSearchBtn()
	{
		By var_clickOnSearchBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/button");
		return driver.findElement(var_clickOnSearchBtn);
	
	}
	public WebElement scrollToSelectYardIn()
	{
		By var_scrollToSelectYardIn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToSelectYardIn);
	}

	public WebElement selectYardInBtn()
	{
		By var_selectYardInBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[10]/div/div/a/button/span");
		return driver.findElement(var_selectYardInBtn);
	}
	public WebElement selectYardDropDown()
	{
		By var_selectYardDropDown = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[13]/div[1]/div/div/div/div/div");
		return driver.findElement(var_selectYardDropDown);
	}
	public WebElement selectYardDropDownOption()
	{
		By var_selectYardDropDownOption = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_selectYardDropDownOption);
	}
	
	public WebElement YardInSubCategory()
	{
		By var_YardInSubCategory = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[11]/div[1]/div/div/div/div/div");
		return driver.findElement(var_YardInSubCategory);
	}
	public WebElement selectSubCategoryDropDownOption()
	{
		By var_selectSubCategoryDropDownOption = By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_selectSubCategoryDropDownOption);
	}
	
	public WebElement ScrollToCheckList()
	{
		By var_ScrollToCheckList = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]");
		return driver.findElement(var_ScrollToCheckList);
	}
	
	public WebElement ClickTheSideMirror()
	{
		By var_ClickTheSideMirror = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/div/label/span/input");
		return driver.findElement(var_ClickTheSideMirror);
	}
	
	public WebElement EnterItemDescription()
	{
		By var_EnterItemDescription= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[3]/div/div/div/textarea");
		return driver.findElement(var_EnterItemDescription);
	
	}	
	public WebElement EnterItemCount()
	{
		By var_EnterItemCount= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/div/div/div[2]/input");
		return driver.findElement(var_EnterItemCount);
		
	}	
	public WebElement ClickTheideSeats()
	{
		By var_ClickTheideSeats = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[3]/td[2]/div/div/label/span/input");
		return driver.findElement(var_ClickTheideSeats);
	}
	public WebElement EnterSeatsItemDescription()
	{
		By var_EnterItemDescription= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[3]/td[3]/div/div/div/textarea");
		return driver.findElement(var_EnterItemDescription);
	
	}	
	public WebElement EnterSeatsItemCount()
	{
		By var_EnterSeatsItemCount= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[3]/td[4]/div/div/div/div[2]/input");
		return driver.findElement(var_EnterSeatsItemCount);
		
	}	
	public WebElement ScrollToExportCheckList()
	{
		By var_ScrollToExportCheckList= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[2]");
		return driver.findElement(var_ScrollToExportCheckList);
	}
	
	
	public WebElement FileUpload()		
	{
		By var_FileUpload = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[3]/div[2]/span/div[1]/span/input");
		return driver.findElement(var_FileUpload);
	}
	public WebElement EnterTheRemark()		
	{
		By var_EnterTheRemark = By.xpath("//*[@id=\"detailRemark\"]");
		return driver.findElement(var_EnterTheRemark);
	}
	
	public WebElement ClickTheExportCheckLists()
	{
	By var_ClickTheExportCheckLists = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/button");
		return driver.findElement(var_ClickTheExportCheckLists);
	}
	public WebElement ClickTheSaveBtn()
	{
		By var_ClickTheSaveBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[5]/div/div[2]/button");
		return driver.findElement(var_ClickTheSaveBtn);
	}
	public WebElement ClickOkBtn()
	{
		By var_ClickOkBtn = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOkBtn);
	}
}

