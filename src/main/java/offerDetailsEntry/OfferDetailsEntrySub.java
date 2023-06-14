package offerDetailsEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferDetailsEntrySub extends OfferDetailsEntryMain {
public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public OfferDetailsEntrySub(WebDriver driver)
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

	public WebElement   SelectOfferDetailsEntry()
	{
		By var_SelectOfferDetailsEntry= By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[6]");
		return driver.findElement(var_SelectOfferDetailsEntry);
	}

	public WebElement clickOnAddNewOfferDetailsEntry()
	{
		By var_clickOnAddNewOfferDetailsEntry= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a");
		return driver.findElement(var_clickOnAddNewOfferDetailsEntry);
	}

	public WebElement enterVehicleNum()
	{
		By var_enterVehicleNum= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_enterVehicleNum);
	}

	public WebElement clickSearchButton()
	{
		By var_clickSearchButton= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div[3]/button");
		return driver.findElement(var_clickSearchButton);
	}

	public WebElement clickSelectButton()
	{
		By var_clickSelectButton= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[5]/button");
		return driver.findElement(var_clickSelectButton);
	}

	public WebElement clickMethodDropdown()
	{
		By var_clickMethodDropdown= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/div/div/div/div/div/div");
		return driver.findElement(var_clickMethodDropdown);
	}

	public WebElement SelectAuction()
	{
		By var_SelectAuction= By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[2]");
		return driver.findElement(var_SelectAuction);
	}

	public WebElement clickReferenceDropdown()
	{
		By var_clickReferenceDropdown= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/form/div[4]/div[1]/div[1]/div/div/div/div/div");
		return driver.findElement(var_clickReferenceDropdown);
	}

	public WebElement SelectReference()
	{
		By var_SelectReference= By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectReference);
	}

	public WebElement ScrollDownToSelectBuyer()
	{
		By var_ScrollDownToSelectBuyer= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div");
		return driver.findElement(var_ScrollDownToSelectBuyer);
	}

	public WebElement TickNewBuyer()
	{
		By var_TickNewBuyer= By.xpath("//*[@id=\"buyerType\"]/label[1]/span[1]/input");
		return driver.findElement(var_TickNewBuyer);
	}

	public WebElement enterName()
	{
		By var_enterName= By.xpath("//*[@id=\"buyerName\"]");
		return driver.findElement(var_enterName);
	}

	public WebElement enterNic()
	{
		By var_enterNic= By.xpath("//*[@id=\"buyerNic\"]");
		return driver.findElement(var_enterNic);
	}

	public WebElement enterMobileNum()
	{
		By var_enterMobileNum= By.xpath("//*[@id=\"buyerMobileNo\"]");
		return driver.findElement(var_enterMobileNum);
	}

	public WebElement enterOffer()
	{
		By var_enterOffer= By.xpath("//*[@id=\"offer\"]");
		return driver.findElement(var_enterOffer);
	}

	public WebElement clickPaymentDropdown()
	{
		By var_clickPaymentDropdown= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[4]/div[1]/form/div[5]/div/div/div/div/div");
		return driver.findElement(var_clickPaymentDropdown);
	}

	public WebElement SelectCash()
	{
		By var_SelectCash= By.xpath("/html/body/div[6]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectCash);
	}

	public WebElement clickMarketingOfficerSelect()
	{
		By var_clickMarketingOfficerSelect= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[4]/div[1]/form/div[8]/div/div/div/div[1]/p/a");
		return driver.findElement(var_clickMarketingOfficerSelect);
	}

	public WebElement enterMarketingOffName()
	{
		By var_enterMarketingOffName= By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/span/input");
		return driver.findElement(var_enterMarketingOffName);
	}

	public WebElement scrollToClickSelectBtn()
	{
		By var_scrollToClickSelectBtn= By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToClickSelectBtn);
	}

	public WebElement clickOfficerSelectButton()
	{
		By var_clickOfficerSelectButton= By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/button");
		return driver.findElement(var_clickOfficerSelectButton);
	}

	public WebElement UploadImg()
	{
		By var_UploadImg= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[4]/div[2]/div/div/div/div[2]/span/div/div/span/input");
		return driver.findElement(var_UploadImg);
	}

	public WebElement ScrollDownToAdd()
	{
		By var_ScrollDownToAdd= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]");
		return driver.findElement(var_ScrollDownToAdd);
	}

	public WebElement clickAddButton()
	{
		By var_clickAddButton= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/button");
		return driver.findElement(var_clickAddButton);
	}

	public WebElement ScrollDownToSave()
	{
		By var_ScrollDownToSave= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[4]");
		return driver.findElement(var_ScrollDownToSave);
	}

	public WebElement clickSaveButton()
	{
		By var_clickSaveButton= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[4]/div/div[2]/button");
		return driver.findElement(var_clickSaveButton);
	}

	public WebElement clickOkButton()
	{
		By var_clickOkButton= By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_clickOkButton);
	}

	public WebElement clickViewOrUpdate()
	{
		By var_clickViewOrUpdate= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/a/div");
		return driver.findElement(var_clickViewOrUpdate);
	}

	public WebElement EnterValue()
	{
		By var_EnterValue= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/span/input");
		return driver.findElement(var_EnterValue);
	}

	public WebElement scrollToView()
	{
		By var_scrollToView= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToView);
	}

	public WebElement clickViewButton()
	{
		By var_clickViewButton= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[3]/td[8]/div/div[1]/p");
		return driver.findElement(var_clickViewButton);
	}

	public WebElement ScrollToClickOk()
	{
		By var_ScrollToClickOk= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]");
		return driver.findElement(var_ScrollToClickOk);
	}

	public WebElement clickOkBtn()
	{
		By var_clickOkBtn= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button");
		return driver.findElement(var_clickOkBtn);
	}

	public WebElement clickUpdateBtn()
	{
		By var_clickUpdateBtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[3]/td[8]/div/div[2]/p/a");
		return driver.findElement(var_clickUpdateBtn);
	}

	public WebElement ScrollToUpdate()
	{
		By var_ScrollToUpdate= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]");
		return driver.findElement(var_ScrollToUpdate);
	}

	public WebElement UpdateOffer()
	{
		By var_UpdateOffer= By.xpath("//*[@id=\"offer\"]");
		return driver.findElement(var_UpdateOffer);
	}

	public WebElement ClickSaveBtn()
	{
		By var_ClickSaveBtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
		return driver.findElement(var_ClickSaveBtn);
	}

	public WebElement ClickOkBtn()
	{
		By var_ClickOkBtn= By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOkBtn);
	}

}
