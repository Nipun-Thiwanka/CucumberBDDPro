package releasePending;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReleasePendingSub extends ReleasePendingMain{

public WebDriver driver;
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	
	public ReleasePendingSub(WebDriver driver)
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
		By clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]");
		return driver.findElement(clickYardManagement);
	}
	public WebElement clickYardManagement()
	{
		By var_clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[1]");
		return driver.findElement(var_clickYardManagement);
	}
	public WebElement clickYardRelease()
	{
		By var_clickYardRelease = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[7]/div");
		return driver.findElement(var_clickYardRelease);
	}
	public WebElement ReleasePendingReleaseToBuyer()
	{
		By var_ReleasePendingReleaseToBuyer = By.xpath("//*[@id=\"/AnRkr/yard-release$Menu\"]/li[2]");
		return driver.findElement(var_ReleasePendingReleaseToBuyer);
	}
	public WebElement  SearchvehicleNum()
	{
		By var_SearchvehicleNum = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/span/input");
		return driver.findElement(var_SearchvehicleNum);
	}
	public WebElement  ClickSearchButton()
	{
		By var_ClickSearchButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button");
		return driver.findElement(var_ClickSearchButton);
	}
	public WebElement ScrollToReleaseToBuyer()
	{
		By var_ScrollToReleaseToBuyer = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div/div");
		return driver.findElement(var_ScrollToReleaseToBuyer);
	}
	public WebElement ClickToReleaseToBuyer()
	{
		By var_ClickToReleaseToBuyer = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div/p/a");
		return driver.findElement(var_ClickToReleaseToBuyer);
	}
	public WebElement SelectYardMethod()
	{
		By var_SelectYardMethod = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div/div/span[2]");
		return driver.findElement(var_SelectYardMethod);
	}
	public WebElement SelectSaleValue()
	{
		By var_SelectSaleValue= By.xpath("//*[@id=\"saleValue\"]");
		return driver.findElement(var_SelectSaleValue);
	}
	public WebElement SelectTender()
	{
		By var_SelectTender = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div/div/span[2]");
		return driver.findElement(var_SelectTender);
	}
	public WebElement SelectSaleDate()
	{
		By var_SelectSaleDate = By.xpath("//*[@id=\"saleDate\"]");
		return driver.findElement(var_SelectSaleDate);
	}
	public WebElement SelectReleaseDate()
	{
		By var_SelectReleaseDate = By.xpath("//*[@id=\"releaseDate\"]");
		return driver.findElement(var_SelectReleaseDate);
	}
	public WebElement ScrollToBuyer()
	{
		By var_ScrollToBuyer = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div/div/div[2]/div[2]");
		return driver.findElement(var_ScrollToBuyer);
	}
	public WebElement EnterTheName()
	{
		By var_EnterTheName = By.xpath("//*[@id=\"releasePersonName\"]");
		return driver.findElement(var_EnterTheName);
	}
	public WebElement EntertheNIC()
	{
		By var_EntertheNIC = By.xpath("//*[@id=\"releasePersonNic\"]");
		return driver.findElement(var_EntertheNIC);
	}
	public WebElement Addressline1()
	{
		By var_Addressline1 = By.xpath("//*[@id=\"customerAddress1\"]");
		return driver.findElement(var_Addressline1)    ;
	}
	public WebElement Addressline2()
	{
		By var_Addressline2 = By.xpath("//*[@id=\"releasePersonAddress1\"]");
		return driver.findElement(var_Addressline2);
	}
	public WebElement Addressline3()
	{
		By var_Addressline3 = By.xpath("//*[@id=\"customerAddress2\"]");
		return driver.findElement(var_Addressline3);
	}
	public WebElement Addressline4()
	{
		By var_Addressline4 = By.xpath("//*[@id=\"releasePersonAddress2\"]");
		return driver.findElement(var_Addressline4);
	}
	public WebElement Addressline5()
	{
		By var_Addressline5 = By.xpath("//*[@id=\"customerAddress3\"]");
		return driver.findElement(var_Addressline5);
	}
	public WebElement Addressline6()
	{
		By var_Addressline6 = By.xpath("//*[@id=\"releasePersonAddress3\"]");
		return driver.findElement(var_Addressline6);
	}
	public WebElement ReceiptNo()
	{
		By var_Addressline6 = By.xpath("//*[@id=\"receiptNo\"]");
		return driver.findElement(var_Addressline6);
	}
	public WebElement ScrolltoSaveBtn()
	{
		By var_ScrolltoSaveBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/form/div[3]");
		return driver.findElement(var_ScrolltoSaveBtn);
	}
	public WebElement uploadfile()
	{
		By var_uploadfile = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div/div/div[2]/div[3]/div/div/span/div[1]/span/input");
		return driver.findElement(var_uploadfile);
	}
	
	public WebElement clickOnSavebutton()
	{
		By var_clickOnSavebutton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/form/div[3]/div/div/div/div/div/button[2]");
		return driver.findElement(var_clickOnSavebutton);
	}
	public WebElement clickOnOKbutton()
	{
		By var_clickOnOKbutton = By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_clickOnOKbutton);
	}

}
