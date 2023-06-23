package yardRelease;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YardReleaseMain {
	public WebDriver driver;
	public WebDriver inheritancYR() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThiwankaRa\\Downloads\\CucumberBDDPro\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
