package clickOnAddNewYardIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAddNewYardInMain {
	public WebDriver driver;
	public WebDriver inheritanceCANYI() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IshankaPu\\eclipse-workspace\\CucumberBDDPro-1\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
