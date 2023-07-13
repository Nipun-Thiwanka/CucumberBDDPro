package vSDP_Approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VSDP_ApprovalSub extends VSDP_ApprovalMain  {

public WebDriver driver;
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	
	public VSDP_ApprovalSub(WebDriver driver)
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
	public WebElement ScrollToYardManagement()
	{
		By clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]");
		return driver.findElement(clickYardManagement);
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
	public WebElement ScrollToOfferApproval()
	{
		By var_ScrollToOfferApproval= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div/canvas");
		return driver.findElement(var_ScrollToOfferApproval);
	}
	public WebElement clickVSDPApproval()
	{
		By var_clickVSDPApproval = By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[9]");
		return driver.findElement(var_clickVSDPApproval);
	}
	public WebElement SearchVehicleNumber()
	{
		By var_SearchVehicleNumber= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_SearchVehicleNumber);
	}
	public WebElement ClickOnSerachBTN()
	{
		By var_ClickOnSerachBTN= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/button");
		return driver.findElement(var_ClickOnSerachBTN);
	}

}
