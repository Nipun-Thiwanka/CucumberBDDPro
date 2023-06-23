package yardRelease;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YardReleaseSub extends YardReleaseMain {
public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public YardReleaseSub(WebDriver driver)
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
		By clickOnPostYardManagement = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[7]/div");
		return driver.findElement(clickOnPostYardManagement);
	}

	public WebElement SelectYardReleas()
	{
		By var_SelectOfferConfirmation= By.xpath("//*[@id=\"/AnRkr/yard-release$Menu\"]/li[1]");
		return driver.findElement(var_SelectOfferConfirmation);
	}

	public WebElement ClickAddNewYardRelease()
	{
		By var_ClickAddNewYardRelease= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a");
		return driver.findElement(var_ClickAddNewYardRelease);
	}

	public WebElement ClickReleaseType()
	{
		By var_ClickReleaseType= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[1]/div/div[1]/div[1]/div/div/div/div/div/div");
		return driver.findElement(var_ClickReleaseType);
	}

	public WebElement SelectTemporary()
	{
		By var_SelectTemporary= By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div");
		return driver.findElement(var_SelectTemporary);
	}

	public WebElement ClickReleaseSubType()
	{
		By var_ClickReleaseSubType= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[1]/div/div[1]/div[2]/div/div/div/div/div/div");
		return driver.findElement(var_ClickReleaseSubType);
	}

	public WebElement SelectGeneral()
	{
		By var_SelectGeneral= By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[2]/div");
		return driver.findElement(var_SelectGeneral);
	}

	public WebElement enterVehicleNum()
	{
		By var_enterVehicleNum= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[1]/div/div[2]/div/div[1]/span/input");
		return driver.findElement(var_enterVehicleNum);
	}

	public WebElement ClickSearchBtn()
	{
		By var_ClickSearchBtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[1]/div/div[2]/div/div[3]/button");
		return driver.findElement(var_ClickSearchBtn);
	}

	public WebElement scrollToSelect()
	{
		By var_scrollToSelect= By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div");
		return driver.findElement(var_scrollToSelect);
	}

	public WebElement ClickSelectBtn()
	{
		By var_ClickSelectBtn= By.xpath("//*[@id=\"vehicleData\"]");
		return driver.findElement(var_ClickSelectBtn);
	}

	public WebElement enterReturnDate()
	{
		By var_enterReturnDate= By.xpath("//*[@id=\"returnDate\"]");
		return driver.findElement(var_enterReturnDate);
	}

	public WebElement enterReleaseReason()
	{
		By var_enterReleaseReason= By.xpath("//*[@id=\"releaseReason\"]");
		return driver.findElement(var_enterReleaseReason);
	}

	public WebElement ClickOnCheckedByLink()
	{
		By var_ClickOnCheckedByLink= By.xpath("");
		return driver.findElement(var_ClickOnCheckedByLink);
	}

	public WebElement SearchCheckedPerson()
	{
		By var_SearchCheckedPerson= By.xpath("");
		return driver.findElement(var_SearchCheckedPerson);
	}

	public WebElement SelectPerson()
	{
		By var_SelectPerson= By.xpath("");
		return driver.findElement(var_SelectPerson);
	}

	public WebElement ScrollDowntToCheckLis()
	{
		By var_ScrollDowntToCheckLis= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div[4]/div/div");
		return driver.findElement(var_ScrollDowntToCheckLis);
	}

	public WebElement ScrollHorizontallyToCheckLis()
	{
		By var_ScrollHorizontallyToCheckLis= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div[4]/div/div/div/div/div/div/div/div");
		return driver.findElement(var_ScrollHorizontallyToCheckLis);
	}

	public WebElement TickCheckBox()
	{
		By var_TickCheckBox= By.xpath("//*[@id=\"isAvailableOutForItemId7009\"]");
		return driver.findElement(var_TickCheckBox);
	}

	public WebElement ScrollDowntToForm()
	{
		By var_ScrollDowntToForm= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div[5]/div/div[1]/div");
		return driver.findElement(var_ScrollDowntToForm);
	}

	public WebElement HandoverPersonName()
	{
		By var_HandoverPersonName= By.xpath("//*[@id=\"handOverPersonName\"]");
		return driver.findElement(var_HandoverPersonName);
	}

	public WebElement HandoverPersonContact()
	{
		By var_HandoverPersonContact= By.xpath("//*[@id=\"handOverPersonContactNo\"]");
		return driver.findElement(var_HandoverPersonContact);
	}

	public WebElement HandoverPersonAddress1()
	{
		By var_HandoverPersonAddress1= By.xpath("//*[@id=\"handOverPersonAddressLine1\"]");
		return driver.findElement(var_HandoverPersonAddress1);
	}

	public WebElement HandoverPersonAddress2()
	{
		By var_HandoverPersonAddress2= By.xpath("//*[@id=\"handOverPersonAddressLine2\"]");
		return driver.findElement(var_HandoverPersonAddress2);
	}

	public WebElement HandoverPersonAddress3()
	{
		By var_HandoverPersonAddress3= By.xpath("//*[@id=\"handOverPersonAddressLine3\"]");
		return driver.findElement(var_HandoverPersonAddress3);
	}

	public WebElement HandoverPersonCity()
	{
		By var_HandoverPersonCity= By.xpath("//*[@id=\"handOverPersonAddressCity\"]");
		return driver.findElement(var_HandoverPersonCity);
	}

	public WebElement HandoverPersonRemark()
	{
		By var_HandoverPersonRemark= By.xpath("//*[@id=\"specialRemark\"]");
		return driver.findElement(var_HandoverPersonRemark);
	}

	public WebElement ScrollDowntToSave()
	{
		By var_ScrollDowntToSave= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[4]");
		return driver.findElement(var_ScrollDowntToSave);
	}

	public WebElement ClickSaveBtn()
	{
		By var_ClickSaveBtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[4]/div/div/div/div/div/button[2]");
		return driver.findElement(var_ClickSaveBtn);
	}

	public WebElement ClickOkBtn()
	{
		By var_ClickOkBtn= By.xpath("");
		return driver.findElement(var_ClickOkBtn);
	}

	public WebElement SelectDealerPoint()
	{
		By var_SelectDealerPoint= By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectDealerPoint);
	}

	public WebElement scrollToSelect2()
	{
		By var_scrollToSelect2= By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div");
		return driver.findElement(var_scrollToSelect2);
	}

	public WebElement EnterDealerName()
	{
		By var_EnterDealerName= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div[5]/div/div[1]/div[1]/div/div/div/div/div/div[1]/span/input");
		return driver.findElement(var_EnterDealerName);
	}

	public WebElement ClickSelectSearchKey()
	{
		By var_ClickSelectSearchKey= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div[5]/div/div[1]/div[1]/div/div/div/div/div/div[2]/button");
		return driver.findElement(var_ClickSelectSearchKey);
	}

	public WebElement SelectName()
	{
		By var_SelectName= By.xpath("/html/body/div[6]/div/div/ul/li[1]");
		return driver.findElement(var_SelectName);
	}

	public WebElement ClickSearchButton()
	{
		By var_ClickSearchButton= By.xpath("");
		return driver.findElement(var_ClickSearchButton);
	}

	public WebElement DealerPersonName()
	{
		By var_DealerPersonName= By.xpath("//*[@id=\"dealerName\"]");
		return driver.findElement(var_DealerPersonName);
	}

	public WebElement DealerPersonNIC()
	{
		By var_DealerPersonNIC= By.xpath("//*[@id=\"dealerNic\"]");
		return driver.findElement(var_DealerPersonNIC);
	}

	public WebElement DealerPersonPO()
	{
		By var_DealerPersonPO= By.xpath("//*[@id=\"receiptNo\"]");
		return driver.findElement(var_DealerPersonPO);
	}
	
	public WebElement SelectPermenent()
	{
		By var_SelectPermenent= By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectPermenent);
	}
	
	public WebElement SelectToCustomer()
	{
		By var_SelectToCustomer= By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]");
		return driver.findElement(var_SelectToCustomer);
	}
	
	public WebElement ClickSettlementType()
	{
		By var_ClickSettlementType= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[1]/div[2]/div/div/div/div/div/div");
		return driver.findElement(var_ClickSettlementType);
	}
	
	public WebElement SelectFull()
	{
		By var_SelectFull= By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectFull);
	}
	
	public WebElement ScrollToFill()
	{
		By var_ScrollToFill= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]");
		return driver.findElement(var_ScrollToFill);
	}
	
	public WebElement ClickSameCustomerReleaseCheckBox()
	{
		By var_ClickSameCustomerReleaseCheckBox= By.xpath("//*[@id=\"sameCustomerRelease\"]");
		return driver.findElement(var_ClickSameCustomerReleaseCheckBox);
	}
	
	public WebElement ReceiptNo()
	{
		By var_ReceiptNo= By.xpath("//*[@id=\"receiptNo\"]");
		return driver.findElement(var_ReceiptNo);
	}
	
	public WebElement ClickToUploadImg()
	{
		By var_ClickToUploadImg= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[3]/div/div/span/div[1]/span/input");
		return driver.findElement(var_ClickToUploadImg);
	}
	
	public WebElement SelectToBuyer()
	{
		By var_SelectToBuyer= By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[2]/div");
		return driver.findElement(var_SelectToBuyer);
	}
	
	public WebElement ClickSaleMethod()
	{
		By var_ClickSaleMethod= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div/div");
		return driver.findElement(var_ClickSaleMethod);
	}
	
	public WebElement SelectTender()
	{
		By var_SelectTender= By.xpath("/html/body/div[6]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectTender);
	}
	
	public WebElement SaleValue()
	{
		By var_SaleValue= By.xpath("//*[@id=\"saleValue\"]");
		return driver.findElement(var_SaleValue);
	}
	
	public WebElement scrollToSelect3()
	{
		By var_scrollToSelect3= By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div");
		return driver.findElement(var_scrollToSelect3);
	}
	
	public WebElement Address1()
	{
		By var_Address1= By.xpath("//*[@id=\"customerAddress1\"]");
		return driver.findElement(var_Address1);
	}
	
	public WebElement Address2()
	{
		By var_Address2= By.xpath("//*[@id=\"customerAddress2\"]");
		return driver.findElement(var_Address2);
	}
	
	public WebElement Address3()
	{
		By var_Address3= By.xpath("//*[@id=\"customerAddress3\"]");
		return driver.findElement(var_Address3);
	}
	
	public WebElement ScrollToFill2()
	{
		By var_ScrollToFill= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div[2]/div[2]");
		return driver.findElement(var_ScrollToFill);
	}
	
}
