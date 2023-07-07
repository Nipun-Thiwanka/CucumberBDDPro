package markAsRepossessSeize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarkAsRepossessSeizeSub extends MarkAsRepossessSeizeMain {

public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public MarkAsRepossessSeizeSub(WebDriver driver){
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
	
	public WebElement ClickonMarkasSeizedHandedOver(){
		By var_MarkSeizedHand = By.xpath("//*[@id=\"/AnRkr/mark-as-seized$Menu\"]/li[1]");
		return driver.findElement(var_MarkSeizedHand);
	}
	
	public WebElement ClickonRepossessButton(){
		By var_ClickonRepossessButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/a/div");
		return driver.findElement(var_ClickonRepossessButton);
	}
	
	public WebElement clickOnSearchBar(){
		By var_searchbar = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_searchbar);
	}
	
	public WebElement clickOnDrodown(){
		By var_clickOnDrodown = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[2]/button");
		return driver.findElement(var_clickOnDrodown);
	}
	
	public WebElement clickOnContracNum(){
		By var_clickOnContracNum = By.xpath("/html/body/div[3]/div/div/ul/li[2]");
		return driver.findElement(var_clickOnContracNum);
	}
	
	public WebElement clickOnChassisNum(){
		By var_clickOnChassisNum = By.xpath("/html/body/div[3]/div/div/ul/li[3]");
		return driver.findElement(var_clickOnChassisNum);
	}
	
	public WebElement clickOnSerialNum(){
		By var_clickOnSerialNum = By.xpath("/html/body/div[3]/div/div/ul/li[4]");
		return driver.findElement(var_clickOnSerialNum);
	}
	
	public WebElement clickOnRepossessOrderNum(){
		By var_clickOnRepossessOrderNum = By.xpath("/html/body/div[3]/div/div/ul/li[5]");
		return driver.findElement(var_clickOnRepossessOrderNum);
	}
	
	public WebElement clickOnSearchBtn(){
		By var_search_button = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[3]/button");
		return driver.findElement(var_search_button);
	}
	
	public WebElement clickOnSelectBtn(){
		By var_clickOnSelectBtn = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[2]");
		return driver.findElement(var_clickOnSelectBtn);
	}
	
	public WebElement clickOnSelectBtnWithContractNum(){
		By var_clickOnSelectBtnWithContractNum = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/button");
		return driver.findElement(var_clickOnSelectBtnWithContractNum);
	}
	
	public WebElement clickOnSelectBtnWithSerialNum(){
		By var_clickOnSelectBtnWithSerialNum = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/button");
		return driver.findElement(var_clickOnSelectBtnWithSerialNum);
	}
	
	public WebElement scrollToSelect(){
		By var_scrollToSelect = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div/div/div/div/div/div");
		return driver.findElement(var_scrollToSelect);
	}
	
	public WebElement selectToSave(){
		By var_selectToSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/div/label/span/input");
		return driver.findElement(var_selectToSave);
	}
	
	public WebElement scrollBackToSave(){
		By var_scrollBackToSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div");
		return driver.findElement(var_scrollBackToSave);
	}
	
	public WebElement selectandSave(){
		By var_selectAndSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/button");
		return driver.findElement(var_selectAndSave);
	}
	
	public WebElement yesToSave(){
		  By var_yesToSave = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_yesToSave);
	}
	
    public WebElement yesToSavewithContractNum(){
		  By var_yesToSavewithContractNum = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_yesToSavewithContractNum);
	}
}
