package viewUpdateYardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewUpdateYardOperationSub extends ViewUpdateYardOperationMain{
	public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public ViewUpdateYardOperationSub(WebDriver driver)
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
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement clickOnYardIn()
	{
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[4]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement ClickOnYardOperation()
	{
		By var_MarkSeizedHand = By.xpath("//*[@id=\"/:tenant/yard-in$Menu\"]/li[2]");
		return driver.findElement(var_MarkSeizedHand);
	}
	
	public WebElement ClickOnViewUpdateYardOperation()
	{
		By var_MarkSeizedHand = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/a/div");
		return driver.findElement(var_MarkSeizedHand);
	}
	
	public WebElement EnterSearchValue()
	{
		By var_EnterSearchValue = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_EnterSearchValue);
	}
	
	public WebElement ClickViewButton()
	{
		By var_ClickViewButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div[1]/button");
		return driver.findElement(var_ClickViewButton);
	}
	
	public WebElement ScrollToDown()
	{
		By var_ScrollToDown = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[6]/div/div[1]");
		return driver.findElement(var_ScrollToDown);
	}
	
	public WebElement ClickViewOkBtton()
	{
		By var_ClickViewOkBtton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button");
		return driver.findElement(var_ClickViewOkBtton);
	}
	
}
