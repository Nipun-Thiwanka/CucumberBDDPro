package yardTransferCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YardTransferCreationSub extends YardTransferCreationMain{
    public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public YardTransferCreationSub(WebDriver driver)
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
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement clickOnYardTransfer()
	{
		By var_clickOnYardTransfer = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[5]/div");
		return driver.findElement(var_clickOnYardTransfer);
	}
	
	public WebElement clickOnYardTransferCreation()
	{
		By var_clickOnYardTransferCreation = By.xpath("//*[@id=\"/AnRkr/yard-transfer$Menu\"]/li[1]");
		return driver.findElement(var_clickOnYardTransferCreation);
	}

	public WebElement EnterSearchValue()
	{
		By var_EnterSearchValue = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/span/input");
		return driver.findElement(var_EnterSearchValue);
	}

	public WebElement ClickSearchButton()
	{
		By var_ClickSearchButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[3]/button");
		return driver.findElement(var_ClickSearchButton);
	}

	public WebElement ClickSelectButton()
	{
		By var_ClickSelectButton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[6]/span");
		return driver.findElement(var_ClickSelectButton);
	}

	public WebElement scrollToTick()
	{
		By var_scrollToTick = By.xpath("/html");
		return driver.findElement(var_scrollToTick);
	}

	public WebElement ClickSidGlassCheckBox()
	{
		By var_ClickSidGlassCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[5]/div/div/label/span/input");
		return driver.findElement(var_ClickSidGlassCheckBox);
	}

	public WebElement EnterSidGlassRemarks()
	{
		By var_EnterSidGlassRemarks = By.xpath("//*[@id=\"remarks0\"]");
		return driver.findElement(var_EnterSidGlassRemarks);
	}

	public WebElement ClickAlternatorCheckBox()
	{
		By var_ClickAlternatorCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[5]/div/div/label/span/input");
		return driver.findElement(var_ClickAlternatorCheckBox);
	}

	public WebElement EnterAlternatorRemarks()
	{
		By var_EnterAlternatorRemarks = By.xpath("//*[@id=\"remarks1\"]");
		return driver.findElement(var_EnterAlternatorRemarks);
	}

	public WebElement ScrollToAshTray()
	{
		By var_ScrollToAshTray = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div/div/div/div/div/div/div/div[2]");
		return driver.findElement(var_ScrollToAshTray);
	}

	public WebElement ClickAlshTrayCheckBox()
	{
		By var_ClickAlshTrayCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[5]/td[5]/div/div/label/span/input");
		return driver.findElement(var_ClickAlshTrayCheckBox);
	}

	public WebElement EnterAlshTrayRemarks()
	{
		By var_EnterAlshTrayRemarks = By.xpath("//*[@id=\"remarks3\"]");
		return driver.findElement(var_EnterAlshTrayRemarks);
	}

	public WebElement ScrollToBottom()
	{
		By var_ScrollToBottom = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/div");
		return driver.findElement(var_ScrollToBottom);
	}

	public WebElement ClickOnDropdownSelecYard()
	{
		By var_ClickOnDropdownSelecYard = By.xpath("//*[@id=\"toYardId\"]");
		return driver.findElement(var_ClickOnDropdownSelecYard);
	}

	public WebElement SelectGrandpass()
	{
		By var_SelectGrandpass = By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[3]/div");
		return driver.findElement(var_SelectGrandpass);
	}

	public WebElement EnterRemarks()
	{
		By var_EnterRemarks = By.xpath("//*[@id=\"remark\"]");
		return driver.findElement(var_EnterRemarks);
	}

	public WebElement ScrollToSave()
	{
		By var_ScrollToSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/div");
		return driver.findElement(var_ScrollToSave);
	}

	public WebElement ClickSaveButton()
	{
		By var_ClickSaveButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div[2]/button");
		return driver.findElement(var_ClickSaveButton);
	}

	public WebElement ClickOkButton()
	{
		By var_ClickOkButton = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOkButton);
	}


}
