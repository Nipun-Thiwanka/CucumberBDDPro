package yardEvaluationn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class YardEvaluationnSub  extends YardEvaluationnMain {
	public WebDriver driver;
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");

public  YardEvaluationnSub(WebDriver driver){
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
public WebElement clickPostYardManagement()
{
	By var_clickPostYardManagement = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[6]/div[1]");
	return driver.findElement(var_clickPostYardManagement);
}
public WebElement clickTheYardValuation()
{
	By var_clickTheYardValuation = By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[1]");
	return driver.findElement(var_clickTheYardValuation);
}
public WebElement AddNewYardValuation()
{
	By var_AddNewYardValuation = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a/div");
	return driver.findElement(var_AddNewYardValuation);
}
public WebElement  ViewOrUpdateYardValuation()
{
	By var_ViewOrUpdateYardValuation = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/a/div");
	return driver.findElement(var_ViewOrUpdateYardValuation);
}
public WebElement EntertheVehicleNumberValuation()
{
	By var_EntertheVehicleNumberValuation = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div[1]/span/input");
	return driver.findElement(var_EntertheVehicleNumberValuation);
}
//public WebElement EntertheContractNumberValuation()
//{
//	By var_EntertheContractNumberValuation = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div[1]/span/input");
//	return driver.findElement(var_EntertheContractNumberValuation);
//}
public WebElement ClicktheSearchBtnValuation()
{
	By var_ClicktheSearchBtnValuation = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div[3]/button");
	return driver.findElement(var_ClicktheSearchBtnValuation);
}
public WebElement clicktheScrollBtnValuation()
{
	By var_clicktheScrollBtnValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div/div/div/div/div");
	return driver.findElement(var_clicktheScrollBtnValuation);
}
public WebElement clicktheScrollBtnValuationview()
{
	By var_clicktheScrollBtnValuationview= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div");
	return driver.findElement(var_clicktheScrollBtnValuationview);
}
public WebElement clicktheReValuationbtn()
{
	By var_clicktheReValuationbtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div/p/a/button");
	return driver.findElement(var_clicktheReValuationbtn);
}
public WebElement ClicktheViewbtnValu()
{
	By var_ClicktheViewbtnValu= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[11]/div/div[1]/button/span");
	return driver.findElement(var_ClicktheViewbtnValu);
}
public WebElement ClicktheCloseBtnValu()
{
	By var_ClicktheCloseBtnValu= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/button");
	return driver.findElement(var_ClicktheCloseBtnValu);
}
public WebElement ClicktheUpdateBtnValu()
{
	By var_ClicktheUpdateBtnValu= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[11]/div/div[2]/p/a");
	return driver.findElement(var_ClicktheUpdateBtnValu);
}

public WebElement EnterTheFSValue()
{
	By var_EnterTheFSValue= By.xpath("//*[@id=\"valuationFSV\"]");
	return driver.findElement(var_EnterTheFSValue);
}
public WebElement ClickValuer()
{
	By var_ClickValuer= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/form[1]/div[2]/div[2]/div[1]/div[6]/div/div/div/div/div[1]/p/a");
	return driver.findElement(var_ClickValuer);
}
public WebElement ClickSelectBtnValue()
{
	By var_ClickSelectBtnValue= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/span");
	return driver.findElement(var_ClickSelectBtnValue);
}
public WebElement ScrollDownValuation()
{
	By var_ScrollDownValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/form[1]/div[2]/div[2]");
	return driver.findElement(var_ScrollDownValuation);
}
public WebElement FileUploadValue()
{
	By var_FileUploadValue= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/form[1]/div[2]/div[2]/div[2]/div[1]/div/div/span/div[1]/span/input");
	return driver.findElement(var_FileUploadValue);
}
public WebElement ClickViewUpload()
{
	By var_ClickViewUpload= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/form[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/button");
	return driver.findElement(var_ClickViewUpload);
}
public WebElement ClickOkBTNViewUpload()
{
	By var_ClickOkBTNViewUpload= By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/button");
	return driver.findElement(var_ClickOkBTNViewUpload);
}
public WebElement ScrollDownBtnValuation()
{
	By var_ScrollDownBtnValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/form[2]/div/div[2]/div");
	return driver.findElement(var_ScrollDownBtnValuation);
}
public WebElement ValuationConditionCheckBoxes()
{
	By var_ValuationConditionCheckBoxes= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/form[2]/div/div[2]/div/div/div/div/div/div/table/tbody/tr[2]/td[2]/label/span/input");
	return driver.findElement(var_ValuationConditionCheckBoxes);
}
public WebElement ScrollDownBtnValuation3()
{
	By var_ScrollDownBtnValuation3= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div");
	return driver.findElement(var_ScrollDownBtnValuation3);
}
public WebElement  ClickAddNewValuation()
{
	By var_ClickAddNewValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div/button");
	return driver.findElement(var_ClickAddNewValuation);
}
public WebElement  ClickOKBtnAddNewValuation()
{
	By var_ClickOKBtnAddNewValuation= By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
	return driver.findElement(var_ClickOKBtnAddNewValuation);
}
public WebElement  ClickExternalValuation()
{
	By var_ClickExternalValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div/form[1]/div/div[2]/div[1]/div[4]/div/div/div/div/div[1]/p/a");
	return driver.findElement(var_ClickExternalValuation);
}
public WebElement ClickSelectBtnEx()
{
	By var_ClickSelectBtnEx= By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/span");
	return driver.findElement(var_ClickSelectBtnEx);
}
public WebElement ScrollDownBtnValuation4()
{
	By var_ScrollDownBtnValuation4=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[4]");
	return driver.findElement(var_ScrollDownBtnValuation4);
}

public WebElement  ClickSavebuttonValuation()
{
	By var_ClickSavebuttonValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[4]/div/button[2]");
	return driver.findElement(var_ClickSavebuttonValuation);
}
public WebElement   ClickOkSaveBtnValuation()
{
	By var_ClickOkSaveBtnValuation= By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
	return driver.findElement(var_ClickOkSaveBtnValuation);
}

public WebElement   ViewUploadedReport()
{
	By var_ViewUploadedReport= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[5]/div/div/form/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[6]/div/div/p");
	return driver.findElement(var_ViewUploadedReport);
}

public WebElement   ScrollUpdateBtn1Valuation()
{
	By var_ScrollUpdateBtn1Valuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div");
	return driver.findElement(var_ScrollUpdateBtn1Valuation);
}
public WebElement   ClickUpdateBtn1Valuation()
{
	By var_ClickUpdateBtn1Valuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div/button");
	return driver.findElement(var_ClickUpdateBtn1Valuation);
}
public WebElement   ClickOKUpdateBtn1Valuation()
{
	By var_ClickOKUpdateBtn1Valuatio= By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
	return driver.findElement(var_ClickOKUpdateBtn1Valuatio);
}
public WebElement   ScrolltosaveBtnValuation()
{
	By var_ScrolltosaveBtnValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[3]");
	return driver.findElement(var_ScrolltosaveBtnValuation);
}
public WebElement   ClickUpdateBtnValuation()
{
	By var_ClickUpdateBtnValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div/button/span[1]");
	return driver.findElement(var_ClickUpdateBtnValuation);
}
public WebElement   ClickSaveUpdateBtnValuation()
{
	By var_ClickSaveUpdateBtnValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[3]/div/button[2]");
	return driver.findElement(var_ClickSaveUpdateBtnValuation);
}
public WebElement   ClickSaveOkUpdateBtnValuation()
{
	By var_ClickSaveOkUpdateBtnValuation= By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
	return driver.findElement(var_ClickSaveOkUpdateBtnValuation);
}





}
