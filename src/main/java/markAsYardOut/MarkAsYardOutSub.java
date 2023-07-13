package markAsYardOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarkAsYardOutSub extends MarkAsYardOutMain{

public WebDriver driver;
	
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	
	public MarkAsYardOutSub(WebDriver driver)
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
		By var_ScrollToYardManagement= By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[2]");
		return driver.findElement(var_ScrollToYardManagement);
	}
	public WebElement clickYardManagement()
	{
		By var_clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[1]");
		return driver.findElement(var_clickYardManagement);
	}
	public WebElement clickYardRelease()
	{
		By var_clickYardRelease = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[7]/div[1]");
		return driver.findElement(var_clickYardRelease);
	}
	public WebElement ScrollToMarkAsYardOut()
	{
		By var_ScrollToMarkAsYardOut = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]");
		return driver.findElement(var_ScrollToMarkAsYardOut);
	}
	public WebElement clickMarkAsYardOut()
	{
		By var_clickMarkAsYardOut = By.xpath("//*[@id=\"/AnRkr/yard-release$Menu\"]/li[8]");
		return driver.findElement(var_clickMarkAsYardOut);
	}
	public WebElement EntervehicleNumber()
	{
		By var_EntervehicleNumber = By.xpath("//*[@id=\"vehicleNo\"]");
		return driver.findElement(var_EntervehicleNumber);
	}
	public WebElement ClickOnSearchBTN()
	{
		By var_ClickOnSearchBTN = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/form/div/button");
		return driver.findElement(var_ClickOnSearchBTN);
	}
	
	public WebElement ScrollToCheckbox()
	{
		By var_ScrollToCheckbox= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[3]/form/div/div/div/div/div/div");
		return driver.findElement(var_ScrollToCheckbox);
	}
	public WebElement SelectDateTime()
	{
		By var_SelectDateTime = By.xpath("//*[@id=\"releaseDateTime0\"]");
		return driver.findElement(var_SelectDateTime);
	}
	
	public WebElement OKDateTime()
	{
		By var_SelectDateTime = By.xpath("/html/body/div[3]/div/div/div/div/div[2]/ul/li[2]/button");
		return driver.findElement(var_SelectDateTime);
	}
	
	public WebElement ClickCheckbox()
	{
		By var_ClickCheckbox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[3]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div/label/span/input");
		return driver.findElement(var_ClickCheckbox);
	}
	
	public WebElement ScrollToUpdate()
	{
		By var_ScrollToUpdate = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]");
		return driver.findElement(var_ScrollToUpdate);
	}
	public WebElement ClickUpdate()
	{
		By var_ClickUpdate = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/button[2]");
		return driver.findElement(var_ClickUpdate);
	}
	
		
}
