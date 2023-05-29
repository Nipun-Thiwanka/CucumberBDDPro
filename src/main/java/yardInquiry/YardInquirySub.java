package yardInquiry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YardInquirySub extends YardInquiryMain {
public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	
	public YardInquirySub(WebDriver driver)
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
	
	public WebElement clickYardIn()
	{
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement ClickonMarkasSeized()
	{
		
		By var_MarkSeized = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[2]");
		return driver.findElement(var_MarkSeized);
	}
	
	public WebElement ClickonMarkasSeizedHandedOver()
	{
		
		By var_MarkSeizedHand = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[2]/span[2]");
		return driver.findElement(var_MarkSeizedHand);
	}
	
	public WebElement SearchVehicleNo()
	{
		By var_SearchVehicleNo = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_SearchVehicleNo);
	}
	
	public WebElement SearchContractNo()
	
	{
		By var_SearchContractNo = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement( var_SearchContractNo);
	}
	
	public WebElement clickOnDrodown()
	{
		By var_clickOnDrodown = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/button");
		return driver.findElement(var_clickOnDrodown);
	}

	public WebElement clickOnContracNum()
	{
		By var_clickOnContracNum = By.xpath("/html/body/div[3]/div/div/ul/li[2]");
		return driver.findElement(var_clickOnContracNum);
	}
	public WebElement  ScrolWithContractNumber()
	{
		By var_ScrolWithContractNumber = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div");
		return driver.findElement(var_ScrolWithContractNumber);
	}
	
	public WebElement clickSelectButtonWithContractNumber()
	{
		By var_clickSelectButtonWithContractNumber = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div/button");
		return driver.findElement(var_clickSelectButtonWithContractNumber);
	}
	
	public WebElement SearchuserName()
	
	{
		By var_SearchuserName = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement( var_SearchuserName);
	}
	
	public WebElement clickOnDrodown123()
	{
		By var_clickOnDrodown123 = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/button");
		return driver.findElement(var_clickOnDrodown123);
	}
	
	public WebElement clickOnuserName()
	{
		By var_clickOnuserName = By.xpath("/html/body/div[3]/div/div/ul/li[3]");
		return driver.findElement(var_clickOnuserName);
	}
	
	public WebElement clickOnSearchBtn()
	{
		By var_search_button = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/button");
		return driver.findElement(var_search_button);
	}
	public WebElement  ScrolWithUserName()
	{
		By var_ScrolWithUserName = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div");
		return driver.findElement(var_ScrolWithUserName);
	}
	public WebElement clickSelectButtonWithUserName()
	{
		By var_yard = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div/button");
		return driver.findElement(var_yard);
	}
	
	public WebElement scrollToSelect()
	{
		By var_scrollToSelect = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div");
		return driver.findElement(var_scrollToSelect);
	}
	
	
	public WebElement clickSelectButton()
	{
		By var_yard = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div/button");
		return driver.findElement(var_yard);
	}
}
