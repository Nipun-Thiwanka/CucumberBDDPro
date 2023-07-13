package offerApproval;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfferApprovalMain {

	public WebDriver driver;
	public WebDriver inheritanceCOA () 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThiwankaRa\\Downloads\\CucumberBDDPro\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		return driver;
	}
}

