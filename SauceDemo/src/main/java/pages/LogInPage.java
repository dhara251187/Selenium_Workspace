package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInPage {

	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement emailId;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement logIn;
	
	@FindBy(xpath = "//div[contains(@class,'error')]")
	WebElement err;
	
	public void openBrowser() throws IOException {
		FileInputStream f = new FileInputStream("C:\\QA\\Testing\\pro1.properties");
		Properties prop = new Properties();
		prop.load(f);
		String browser = prop.getProperty("browser");

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			Assert.assertTrue(false);
		}
		
		PageFactory.initElements(driver, this);

	}
	
	public void openLoginPage()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void login(String userName, String passWord)
	{
		emailId.sendKeys(userName);
		this.password.sendKeys(passWord);
		logIn.click();
	}
	
	public String error()
	{
		return err.getText();
	}
}