package yardFeeCharge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YardFeeChargeSub extends YardFeeChargeMain {
public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public YardFeeChargeSub(WebDriver driver)
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
	
	public WebElement scrollToYardManagement()
	{
		By clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]");
		return driver.findElement(clickYardManagement);
	}
	
	public WebElement clickYardManagement()
	{
		By clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div");
		return driver.findElement(clickYardManagement);
	}
	
	public WebElement YardFeeCharge()
	{
		By YardFeeCharge = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[8]/div");
		return driver.findElement(YardFeeCharge);
	}
	
	public WebElement SelectYardFeeCharge()
	{
		By SelectTemporaryRelease = By.xpath("//*[@id=\"/AnRkr/fee-charge-details$Menu\"]/li[1]");
		return driver.findElement(SelectTemporaryRelease);
	}
	
	public WebElement SelectYardFeeChargeCancellation()
	{
		By SelectYardFeeChargeCancellation = By.xpath("//*[@id=\"/AnRkr/fee-charge-details$Menu\"]/li[2]");
		return driver.findElement(SelectYardFeeChargeCancellation);
	}
	
	public WebElement EnterVehicleNumber()
	{
		By EnterVehicleNumber = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(EnterVehicleNumber);
	}
	
	public WebElement ClickSearchButton()
	{
		By ClickSearchButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/button");
		return driver.findElement(ClickSearchButton);
	}
	
	
	public WebElement ClickSelectButton()
	{
		By ClickSelectButton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/button");
		return driver.findElement(ClickSelectButton);
	}
	
	public WebElement ClickSelectButtonInCancedllation()
	{
		By ClickSelectButtonInCancedllation = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/button");
		return driver.findElement(ClickSelectButtonInCancedllation);
	}
	
}
