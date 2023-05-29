package yardTransferCancellation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YardTransferCancellationSub extends YardTransferCancellationMain {
    public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public YardTransferCancellationSub(WebDriver driver)
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
	
	public WebElement clickOnYardTransfer()
	{
		By var_clickOnYardTransfer = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[5]/div");
		return driver.findElement(var_clickOnYardTransfer);
	}

    public WebElement clickOnYardTransferCancellation()
	{
		By var_clickOnYardTransferCancellation = By.xpath("//*[@id=\"/AnRkr/yard-transfer$Menu\"]/li[2]");
		return driver.findElement(var_clickOnYardTransferCancellation);
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
		By var_ClickSelectButton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]");
		return driver.findElement(var_ClickSelectButton);
	}

	public WebElement scrollToTick()
	{
		By var_scrollToTick = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div");
		return driver.findElement(var_scrollToTick);
	}

    public WebElement EnterRemarks()
	{
		By var_EnterRemarks = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div/input");
		return driver.findElement(var_EnterRemarks);
	}

    public WebElement ClickCheckBox()
	{
		By var_ClickCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div/label/span/input");
		return driver.findElement(var_ClickCheckBox);
	}

    public WebElement ClickSaveButton()
	{
		By var_ClickSaveButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div[2]/button");
		return driver.findElement(var_ClickSaveButton);
	}

    public WebElement ClickOkButton()
	{
		By var_ClickOkButton = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOkButton);
	}
} 
