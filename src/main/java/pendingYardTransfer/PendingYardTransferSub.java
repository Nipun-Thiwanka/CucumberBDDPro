package pendingYardTransfer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PendingYardTransferSub extends PendingYardTransferMain {
    public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public PendingYardTransferSub(WebDriver driver)
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

    public WebElement clickOnPendingYardTransfer()
	{
		By var_clickOnPendingYardTransfer = By.xpath("//*[@id=\"/AnRkr/yard-transfer$Menu\"]/li[3]");
		return driver.findElement(var_clickOnPendingYardTransfer);
	}

	public WebElement EnterSearchValues()
	{
		By var_EnterSearchValues = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_EnterSearchValues);
	}

	public WebElement clickSearchButton()
	{
		By var_clickSearchButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/button");
		return driver.findElement(var_clickSearchButton);
	}

	public WebElement scrollToClick()
	{
		By var_scrollToClick = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToClick);
	}

	public WebElement clickViewButton()
	{
		By var_clickViewButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div[1]/p");
		return driver.findElement(var_clickViewButton);
	}

	public WebElement clickOkButton()
	{
		By var_clickOkButton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button");
		return driver.findElement(var_clickOkButton);
	}

	public WebElement clickYardInButton()
	{
		By var_clickYardInButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div[2]/p/a");
		return driver.findElement(var_clickYardInButton);
	}

	public WebElement clickSelectYard()
	{
		By var_clickSelectYard = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[1]/form/div[1]/div[13]/div[1]/div/div/div/div/div");
		return driver.findElement(var_clickSelectYard);
	}

	public WebElement selectYardWallampitiya()
	{
		By var_selectYardWallampitiya = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_selectYardWallampitiya);
	}

	public WebElement clickYardSubCate()
	{
		By var_clickYardSubCate = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[1]/form/div[1]/div[11]/div[1]/div/div/div/div/div");
		return driver.findElement(var_clickYardSubCate);
	}

	public WebElement selectYardSubCate()
	{
		By var_selectYardSubCate = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div");
		return driver.findElement(var_selectYardSubCate);
	}

	public WebElement ScrollToAirCleanser()
	{
		By var_ScrollToAirCleanser = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]");
		return driver.findElement(var_ScrollToAirCleanser);
	}

	public WebElement tickAirCleanser()
	{
		By var_tickAirCleanser = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/div/label/span/input");
		return driver.findElement(var_tickAirCleanser);
	}

	public WebElement enterItemDesc()
	{
		By var_enterItemDesc = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[3]/div/div/div/textarea");
		return driver.findElement(var_enterItemDesc);
	}

	public WebElement enterItemCount()
	{
		By var_enterItemCount = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/div/div/div[2]/input");
		return driver.findElement(var_enterItemCount);
	}

	public WebElement ScrollToExportCheck()
	{
		By var_ScrollToExportCheck = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[2]");
		return driver.findElement(var_ScrollToExportCheck);
	}

	public WebElement clickExportCheck()
	{
		By var_clickExportCheck = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[2]/button");
		return driver.findElement(var_clickExportCheck);
	}

	public WebElement ClickToUploadFile()
	{
		By var_ClickToUploadFile = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[3]/div[2]/span/div[1]/span/input");
		return driver.findElement(var_ClickToUploadFile);
	}

	public WebElement enterRemarks()
	{
		By var_enterRemarks = By.xpath("//*[@id=\"detailRemark\"]");
		return driver.findElement(var_enterRemarks);
	}

	public WebElement clickSave()
	{
		By var_clickSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[5]/div/button[2]");
		return driver.findElement(var_clickSave);
	}

	public WebElement clickOkToSave()
	{
		By var_clickOkToSave = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_clickOkToSave);
	}
}
