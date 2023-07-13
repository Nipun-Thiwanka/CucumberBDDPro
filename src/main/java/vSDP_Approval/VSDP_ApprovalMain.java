package vSDP_Approval;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VSDP_ApprovalMain {

	public WebDriver driver;
	public WebDriver inheritanceCVA () 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ThiwankaRa\\Downloads\\CucumberBDDPro\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		return driver;
	}
}

