package markAsRepossessSeize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarkAsRepossessSeizeMain {
	public WebDriver driver;
	public WebDriver inheritance1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThiwankaRa\\Downloads\\CucumberBDDPro\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
