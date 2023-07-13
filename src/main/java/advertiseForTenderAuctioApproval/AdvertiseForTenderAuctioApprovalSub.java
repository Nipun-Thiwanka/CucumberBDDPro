package advertiseForTenderAuctioApproval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertiseForTenderAuctioApprovalSub extends AdvertiseForTenderAuctioApprovalMain {

public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public  AdvertiseForTenderAuctioApprovalSub(WebDriver driver)
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
		By var_ScrollToYardManagement= By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[2]");
		return driver.findElement(var_ScrollToYardManagement);
	}
	public WebElement clickYardManagement()
	{
		By var_clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[1]");
		return driver.findElement(var_clickYardManagement);
	}
	public WebElement clickPostYardManagement()
	{
		By var_clickPostYardManagement = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[6]/div[1]");
		return driver.findElement(var_clickPostYardManagement);
	}
	public WebElement AdvertiseForTenderAuctionApproval()
	{
		By var_AdvertiseForTenderAuctionApproval= By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[4]");
		return driver.findElement(var_AdvertiseForTenderAuctionApproval);
	}
	public WebElement  SearchApprovalUse()
	{
		By var_SearchApprovalUse = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/span/input");
		return driver.findElement(var_SearchApprovalUse);
	}
	public WebElement  ClickSearchBtn()
	{
		By var_ClickSearchBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[3]/button");
		return driver.findElement(var_ClickSearchBtn);
	}
	public WebElement  ScrollToViewBtn()
	{
		By var_ScrollToViewBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/div/div/div/div");
		return driver.findElement(var_ScrollToViewBtn);
	}
	public WebElement  ClickViewBtnCAFTA()
	{
		By var_ClickViewBtnCAFTA = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[9]");
		return driver.findElement(var_ClickViewBtnCAFTA);
	}
	public WebElement  ScrollToCheckBox()
	{
		By var_ScrollToCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div");
		return driver.findElement(var_ScrollToCheckBox);
	}
	public WebElement  ApproveorRejectcheckboxes()
	{
		By var_ApproveorRejectcheckboxes = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/div/label/span/input");
		return driver.findElement(var_ApproveorRejectcheckboxes);
	}
	public WebElement  EnterTheComment()
	{
		By var_EnterTheComment = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[9]/div/div/textarea");
		return driver.findElement(var_EnterTheComment);
	}
	public WebElement  ClickONSaveBtn()
	{
		By var_ClickONSaveBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/button");
		return driver.findElement(var_ClickONSaveBtn);
	}
	public WebElement  ClickOKSaveBtn()
	{
		By var_ClickOKSaveBtn = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOKSaveBtn);
	}
	
	// @Click_on_Approved_Vehicle_List_For_Advertise
	
	public WebElement  ApprovedVehicleList()
	{
		By var_ApprovedVehicleList = By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[5]");
		return driver.findElement(var_ApprovedVehicleList);
	}
	public WebElement AssetSubType()
	{
		By var_AssetSubType = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/span/input");
		return driver.findElement(var_AssetSubType);
	}
	public WebElement  VehicleNo ()
	{
		By var_VehicleNo  = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/span/input");
		return driver.findElement(var_VehicleNo );
	}
	public WebElement  YardName ()
	{
		By var_YardName  = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[2]/span/input");
		return driver.findElement(var_YardName );
	}
	public WebElement  AdvertiseDateFrom ()
	{
		By var_AdvertiseDateFrom = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[4]/div/div[2]/div/div/input");
		return driver.findElement(var_AdvertiseDateFrom );
	}
	public WebElement  AdvertiseDateTo()
	{
		By var_AdvertiseDateTo  = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[5]/div/div[2]/div/div/input");
		return driver.findElement(var_AdvertiseDateTo);
	}
	public WebElement  ClickSearchBTN()
	{
		By var_ClickSearchBTN = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[5]/div/div[3]/button");
		return driver.findElement(var_ClickSearchBTN);
	}
	public WebElement ScrollToExportBtn()
	{
		By var_ScrollToExportBtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]");
		return driver.findElement(var_ScrollToExportBtn);
	}
	public WebElement ClickExportBtn()
	{
		By var_ClickExportBtn= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/button");
		return driver.findElement(var_ClickExportBtn);
	}
}
