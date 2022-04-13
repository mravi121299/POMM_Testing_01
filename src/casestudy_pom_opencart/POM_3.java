package casestudy_pom_opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM_3 {
	WebDriver driver;
	
	public POM_3(WebDriver driver) {
		this.driver=driver;
			
		}
	@FindBy(how = How.ID, using="input-email")
	WebElement email;

	@FindBy(how = How.ID, using="input-password")
	WebElement Password;

	@FindBy(how = How.XPATH, using="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement LoginBtn;
	public void LogininOpencart(String Uname, String Psd) {
		email.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}
	}
