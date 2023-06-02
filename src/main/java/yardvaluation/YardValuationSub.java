package yardvaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YardValuationSub extends YardValuationMain {
	public WebDriver driver;
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");

public  YardValuationSub(WebDriver driver){
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
	By var_clicktheScrollBtnValuation= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div/div/div/div/div/div/div");
	return driver.findElement(var_clicktheScrollBtnValuation);
}
public WebElement clicktheReValuationbtn()
{
	By var_clicktheReValuationbtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div/p/a/button/span");
	return driver.findElement(var_clicktheReValuationbtn);
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
	By var_FileUploadValue= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/span");
	return driver.findElement(var_FileUploadValue);
}
public WebElement ValuationConditionCheckBoxes()
{
	By var_ValuationConditionCheckBoxes= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/span");
	return driver.findElement(var_ValuationConditionCheckBoxes);
}


}
