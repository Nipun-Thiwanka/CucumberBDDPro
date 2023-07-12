package advertiseForTenderAndAuction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertiseForTenderAndAuctionSub extends AdvertiseForTenderAndAuctionMain {
    public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public AdvertiseForTenderAndAuctionSub(WebDriver driver)
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
	
	public WebElement SelectAdvertiseForTender()
	{
		By var_SelectAdvertiseForTender = By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[3]");
		return driver.findElement(var_SelectAdvertiseForTender);
	}

	public WebElement EnterBranch()
	{
		By var_EnterBranch = By.xpath("//*[@id=\"basic_branch\"]");
		return driver.findElement(var_EnterBranch);
	}

	public WebElement ClickOnDropDown()
	{
		By var_ClickOnDropDown = By.xpath("//*[@id=\"basic\"]/div[2]/div[2]/div/div/div/div");
		return driver.findElement(var_ClickOnDropDown);
	}

	public WebElement SelectAll()
	{
		By var_SelectAll = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectAll);
	}

	public WebElement EnterVehicleNumber()
	{
		By var_EnterVehicleNumber = By.xpath("//*[@id=\"basic_searchq\"]/div/span/input");
		return driver.findElement(var_EnterVehicleNumber);
	}

	public WebElement ClickSearchButton()
	{
		By var_ClickSearchButton = By.xpath("//*[@id=\"basic_searchq\"]/div/button");
		return driver.findElement(var_ClickSearchButton);
	}

	public WebElement ClickOnTypeDropDown()
	{
		By var_ClickOnTypeDropDown = By.xpath("//*[@id=\"submitForm\"]/div[1]/div[1]/div[2]/div/div/div/div");
		return driver.findElement(var_ClickOnTypeDropDown);
	}

	public WebElement SelectTender()
	{
		By var_SelectTender = By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[2]/div");
		return driver.findElement(var_SelectTender);
	}

	public WebElement AdvertiseDate()
	{
		By var_AdvertiseDate = By.xpath("//*[@id=\"submitForm_advertisingDate\"]");
		return driver.findElement(var_AdvertiseDate);
	}

	public WebElement AuctionDate()
	{
		By var_AuctionDate = By.xpath("//*[@id=\"submitForm_tenderAuctionDate\"]");
		return driver.findElement(var_AuctionDate);
	}

	public WebElement ClickApprovalUser()
	{
		By var_ClickApprovalUser = By.xpath("//*[@id=\"submitForm\"]/div[1]/div[4]/div[2]/div/div/p/a");
		return driver.findElement(var_ClickApprovalUser);
	}

	public WebElement EnterApprovalUser()
	{
		By var_EnterApprovalUser = By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/span/input");
		return driver.findElement(var_EnterApprovalUser);
	}

	public WebElement scrollToSelect()
	{
		By var_scrollToSelect = By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToSelect);
	}

	public WebElement ClickSelectButton()
	{
		By var_ClickSelectButton = By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/button");
		return driver.findElement(var_ClickSelectButton);
	}

	public WebElement ScrollToSave()
	{
		By var_ScrollToSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div[1]");
		return driver.findElement(var_ScrollToSave);
	}

	public WebElement scrollToTick()
	{
		By var_scrollToTick = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToTick);
	}

	public WebElement ClickOnCheckBox()
	{
		By var_ClickOnCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[13]/div/div/label/span/input");
		return driver.findElement(var_ClickOnCheckBox);
	}

	public WebElement ClickOnSaveButton()
	{
		By var_ClickOnSaveButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[4]/div/div[2]/button");
		return driver.findElement(var_ClickOnSaveButton);
	}

	public WebElement ClickOnOkButton()
	{
		By var_ClickOnOkButton = By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOnOkButton);
	}
}
