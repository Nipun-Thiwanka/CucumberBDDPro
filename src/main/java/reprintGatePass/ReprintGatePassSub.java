package reprintGatePass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReprintGatePassSub extends ReprintGatePassMain {


public WebDriver driver;
	
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	
	public  ReprintGatePassSub(WebDriver driver)
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
	public WebElement clickYardRelease()
	{
		By var_clickYardRelease = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[7]/div");
		return driver.findElement(var_clickYardRelease);
	}
	public WebElement   scrolltoReprintgatepass()
	{
		By var_scrolltoReprintgatepass = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div");
		return driver.findElement(var_scrolltoReprintgatepass);
	}
	public WebElement clickRePrintGatePass()
	{
		By var_clickRePrintGatePass = By.xpath("//*[@id=\"/AnRkr/yard-release$Menu\"]/li[5]");
		return driver.findElement(var_clickRePrintGatePass);
	}
	public WebElement EntervehicleNumber()
	{
		By var_EntervehicleNumber = By.xpath("//*[@id=\"vehicleNo\"]");
		return driver.findElement(var_EntervehicleNumber);
	}
	public WebElement EnterNICNumber()
	{
		By var_EnterNICNumber = By.xpath("//*[@id=\"buyerNic\"]");
		return driver.findElement(var_EnterNICNumber);
	}
	public WebElement buyerName()
	{
		By var_buyerName = By.xpath("//*[@id=\"buyerName\"]");
		return driver.findElement(var_buyerName);
	}
	public WebElement SelectYardName()
	{
		By var_SelectYardName = By.xpath("//*[@id=\"yardName\"]");
		return driver.findElement(var_SelectYardName);
	}
	
	public WebElement ClickAll()
	{
		By var_ClickAll = By.xpath("/html/body");
		return driver.findElement(var_ClickAll);
	}
	public WebElement ClickOnSearchBTN()
	{
		By var_ClickOnSearchBTN = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/form/div/button");
		return driver.findElement(var_ClickOnSearchBTN);
	}
	public WebElement ScrollToPrint()
	{
		By var_ScrollToPrint = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/footer/footer");
		return driver.findElement(var_ScrollToPrint);
	}
	public WebElement ScrollToCheckbox()
	{
		By var_ScrollToCheckbox= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/div/div/div/div");
		return driver.findElement(var_ScrollToCheckbox);
	}
	public WebElement ClickCheckbox()
	{
		By var_ClickCheckbox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div[3]/div/div/div/div/div/div/table/tbody/tr/td[6]/div/div/label/span/input");
		return driver.findElement(var_ClickCheckbox);
	}
	
	public WebElement ScrollToPrintGatePass()
	{
		By var_ScrollToPrintGatePass = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]");
		return driver.findElement(var_ScrollToPrintGatePass);
	}
	public WebElement ClickPrint()
	{
		By var_ClickPrint = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/button[2]");
		return driver.findElement(var_ClickPrint);
	}
	public WebElement ClickOkBTN()
	{
		By var_ClickOkBTN = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOkBTN);
	}
}

