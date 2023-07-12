package temporaryReleaseYardIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TemporaryReleaseYardInSub extends TemporaryReleaseYardInMain  {
public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public TemporaryReleaseYardInSub(WebDriver driver)
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
	
	public WebElement clickOnYardReleas()
	{
		By clickOnYardReleas = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[7]/div");
		return driver.findElement(clickOnYardReleas);
	}
	
	public WebElement SelectTemporaryRelease()
	{
		By SelectTemporaryRelease = By.xpath("//*[@id=\"/AnRkr/yard-release$Menu\"]/li[6]");
		return driver.findElement(SelectTemporaryRelease);
	}
	
	public WebElement SelectSoldAndReturns()
	{
		By SelectSoldAndReturns = By.xpath("//*[@id=\"/AnRkr/yard-release$Menu\"]/li[7]");
		return driver.findElement(SelectSoldAndReturns);
	}
	
	public WebElement enterVehicleNumber()
	{
		By enterVehicleNumber = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[1]/span/input");
		return driver.findElement(enterVehicleNumber);
	}
	
	public WebElement scrollToClick()
	{
		By scrollToClick = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/form/div/div/div/div/div/div");
		return driver.findElement(scrollToClick);
	}
	
	public WebElement TickOnCheckBox()
	{
		By TickOnCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[5]/div/div/label/span/input");
		return driver.findElement(TickOnCheckBox);
	}
	
	public WebElement EnterRemark()
	{
		By EnterRemark = By.xpath("//*[@id=\"comment0\"]");
		return driver.findElement(EnterRemark);
	}
	
	public WebElement ClickSaveButton()
	{
		By ClickSaveButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/button");
		return driver.findElement(ClickSaveButton);
	}
	
	public WebElement ClickOkButton()
	{
		By ClickOkButton = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(ClickOkButton);
	}
	
	
}
