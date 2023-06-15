package offerConfirmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferConfirmationSub extends OfferConfirmationMain {
public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public OfferConfirmationSub(WebDriver driver)
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
	
	public WebElement clickOnPostYardManagement()
	{
		By clickOnPostYardManagement = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[6]/div");
		return driver.findElement(clickOnPostYardManagement);
	}

	public WebElement   ScrollToDown()
	{
		By var_ScrollToDown= By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul");
		return driver.findElement(var_ScrollToDown);
	}

	public WebElement   SelectOfferConfirmation()
	{
		By var_SelectOfferConfirmation= By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[8]");
		return driver.findElement(var_SelectOfferConfirmation);
	}

	public WebElement EnterVehicleNum()
	{
		By var_EnterVehicleNum= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_EnterVehicleNum);
	}

	public WebElement scrollToClick()
	{
		By var_scrollToClick= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToClick);
	}

	public WebElement ClickViewButton()
	{
		By var_ClickViewButton= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div/a/button");
		return driver.findElement(var_ClickViewButton);
	}

	public WebElement ClickPaymentMethod()
	{
		By var_ClickPaymentMethod= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div/div/div");
		return driver.findElement(var_ClickPaymentMethod);
	}

	public WebElement SelectPaymentMethod()
	{
		By var_SelectPaymentMethod= By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]");
		return driver.findElement(var_SelectPaymentMethod);
	}

	public WebElement scrollToTick()
	{
		By var_scrollToTick= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToTick);
	}

	public WebElement TickApproved()
	{
		By var_TickApproved= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/div/label/span/input");
		return driver.findElement(var_TickApproved);
	}

	public WebElement ClickSaveButton()
	{
		By var_ClickSaveButton= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/button");
		return driver.findElement(var_ClickSaveButton);
	}

	public WebElement ClickOkButton()
	{
		By var_ClickOkButton= By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOkButton);
	}
}
