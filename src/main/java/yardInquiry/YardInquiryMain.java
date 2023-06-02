package yardInquiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YardInquiryMain {
	public WebDriver driver;
	public WebDriver inheritance2() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ThiwankaRa\\\\Downloads\\\\CucumberBDDPro\\\\ChromeDriver\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
}
