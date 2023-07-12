package mark_As_Seized_Cancellation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarkAsSeizedCancellationSub extends MarkAsSeizedCancellationMain {

public WebDriver driver;
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	
	
	
	public MarkAsSeizedCancellationSub(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement typeUserName(){
		return driver.findElement(var_username);
		
	}
	
	public WebElement clickContinueButton(){
		return driver.findElement(var_continue_button);
	}
	
	public WebElement typePassword(){
		return driver.findElement(var_password);
	}
	
	public WebElement clicksubmit(){
		return driver.findElement(var_submit_btn);
	}
	
	public WebElement scrollToYardManagement()
	{
		By clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]");
		return driver.findElement(clickYardManagement);
	}
	
	public WebElement clickYardIn(){
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement ClickonMarkasSeized(){
		By var_MarkSeized = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[3]/div[1]");
		return driver.findElement(var_MarkSeized);
	}
	
	public WebElement ClickonMarkasSeizedHandedOverCancellation(){
		By var_ClickonMarkasSeizedHandedOverCancellation = By.xpath("//*[@id=\"/AnRkr/mark-as-seized$Menu\"]/li[2]");
		return driver.findElement(var_ClickonMarkasSeizedHandedOverCancellation);
	}
	
	public WebElement clickOnSearchBar(){
		By var_searchbar = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_searchbar);
	}
	
	public WebElement clickOnSearchBtn(){
		By var_search_button = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[3]/button");
		return driver.findElement(var_search_button);
	}
	
	public WebElement clickOnSelectBtn(){
		By var_clickOnSelectBtn = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[4]/button");
		return driver.findElement(var_clickOnSelectBtn);
	}
	
	public WebElement scrollToEdit(){
		By var_scrollToEdit = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToEdit);
	}
	
	public WebElement enterRemarks(){
		By var_enterRemarks = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/div/input");
		return driver.findElement(var_enterRemarks);
	}
	
	public WebElement clickOnCheckBox(){
		By var_clickOnCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[9]/div/div/label/span/input");
		return driver.findElement(var_clickOnCheckBox);
	}
	
	public WebElement clickSaveBtn(){
		By var_clickSaveBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/button");
		return driver.findElement(var_clickSaveBtn);
	}
	
	public WebElement clickOkBtn(){
		By var_clickOkBtn = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_clickOkBtn);
	}
}
