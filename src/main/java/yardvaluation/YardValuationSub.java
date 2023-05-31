package yardvaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YardValuationSub extends YardValuationMain {
	public WebDriver driver;
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");

public  YardValuationSub(WebDriver driver){
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
	By var_clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[1]");
	return driver.findElement(var_clickYardManagement);
}
public WebElement clickPostYardManagement()
{
	By var_clickPostYardManagement = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[6]/div[1]");
	return driver.findElement(var_clickPostYardManagement);
}
public WebElement clickTheYardValuation()
{
	By var_clickTheYardValuation = By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[1]");
	return driver.findElement(var_clickTheYardValuation);
}
}
