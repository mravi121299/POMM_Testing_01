package casestudy_pom_opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome", "https://demo.opencart.com/index.php?route=account/login");
		POM_3 loginOpencart = PageFactory.initElements(driver, POM_3.class);
		loginOpencart.LogininOpencart("Ravi", "Ravi@123");
	}

}

