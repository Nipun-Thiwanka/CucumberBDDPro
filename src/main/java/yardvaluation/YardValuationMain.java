package yardvaluation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YardValuationMain {

	public WebDriver driver;
	public WebDriver inheritanceYV() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IshankaPu\\eclipse-workspace\\CucumberBDDPro-1\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}

