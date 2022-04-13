package casestudy_pom_opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver BrowserOptions(String browserName, String url) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\DXC Training testing tools\\DXC Selenium Automation  Class\\LaunchChromeBroweser\\chromebrowersjars\\chromedriver.exe");
			 driver= new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
		
		        System.setProperty("webdriver.gecko.driver","D:\\DXC Training testing tools\\DXC Selenium Automation  Class\\Launchfbinfirefox\\openfbJars\\geckodriver.exe");
			    
				 driver = new FirefoxDriver();
		}
			driver.get(url);
			return driver;
	}

}


