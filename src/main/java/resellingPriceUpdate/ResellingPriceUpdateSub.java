package resellingPriceUpdate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResellingPriceUpdateSub extends ResellingPriceUpdateMain {
    public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public ResellingPriceUpdateSub(WebDriver driver)
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
		By clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div");
		return driver.findElement(clickYardManagement);
	}
	
	public WebElement clickOnPostYardManagement()
	{
		By clickOnPostYardManagement = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[6]/div");
		return driver.findElement(clickOnPostYardManagement);
	}
	
	public WebElement SelectResellingPriceUpdate()
	{
		By var_SelectResellingPriceUpdate = By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[2]");
		return driver.findElement(var_SelectResellingPriceUpdate);
	}

	public WebElement YardInDate()
	{
		By var_YardInDate = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div/input");
		return driver.findElement(var_YardInDate);
	}
	
	public WebElement ClickOnThree()
	{
		By var_ClickOnThree = By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[3]/div");
		return driver.findElement(var_ClickOnThree);
	}

	public WebElement TardInDateTo()
	{
		By var_TardInDateTo = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/input");
		return driver.findElement(var_TardInDateTo);
	}

	public WebElement SelectToDay()
	{
		By var_SelectToDay = By.xpath("/html/body/div[4]/div/div/div/div/div[2]/a");
		return driver.findElement(var_SelectToDay);
	}

	public WebElement VehicleNumber()
	{
		By var_VehicleNumber = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[2]/span/input");
		return driver.findElement(var_VehicleNumber);
	}

	public WebElement ClickSearchButton()
	{
		By var_ClickSearchButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[3]/button");
		return driver.findElement(var_ClickSearchButton);
	}

	public WebElement scrollToClick()
	{
		By var_scrollToClick = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToClick);
	}

	public WebElement ClickUpdateButton()
	{
		By var_ClickUpdateButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[9]/div/div[2]/button");
		return driver.findElement(var_ClickUpdateButton);
	}

	public WebElement ScrollToSave()
	{
		By var_ScrollToSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div[2]");
		return driver.findElement(var_ScrollToSave);
	}

	public WebElement ClickSaveButton()
	{
		By var_ClickSaveButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div[2]/button");
		return driver.findElement(var_ClickSaveButton);
	}

	public WebElement ClickOkButton()
	{
		By var_ClickOkButton = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOkButton);
	}
}
