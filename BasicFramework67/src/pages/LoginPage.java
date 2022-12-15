package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver1;
	/*WebElement email = driver1.findElement(By.id("usernameInput-input"));
	WebElement pass = driver1.findElement(By.name("password"));
	WebElement logIn = driver1.findElement(By.id("signIn"));
	WebElement emailErr = driver1.findElement(By.id("UsernameTextField__errors-usernameInput"));
	WebElement passwordErr = driver1.findElement(By.id("PasswordTextField__errors-password"));
	WebElement globalErr = driver1.findElement(By.id("globalError"));*/
	
	@FindBy(id = "usernameInput-input")
    public WebElement email;
	
	@FindBy(name = "password")
    public WebElement pass;
	
	@FindBy(id = "signIn")
    public WebElement signIn;
	
	@FindBy(id = "globalError")
    public WebElement globalErr;
	
	@FindBy(id = "UsernameTextField__errors-usernameInput")
    public WebElement emailErr;
	
	@FindBy(id = "PasswordTextField__errors-password")
    public WebElement passwordErr;

	
	public void openBrowser() throws IOException {
		FileInputStream f = new FileInputStream("C:\\QA\\Testing\\pro1.properties");
		Properties prop = new Properties();
		prop.load(f);
		String browser=prop.getProperty("browser");
		
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
			driver1=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
			driver1=new FirefoxDriver();
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		PageFactory.initElements(driver1, this);

		
	}
	
	public void openLoginPage() {
		driver1.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=pxfLodSsRZc&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJweGZMb2RTc1JaYyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjY4MjcyNzc0LCJpYXQiOjE2NjgyNzE1NzQsImp0aSI6ImNlNmNmNzU5LWIwMDQtNGU3Zi1iMTYxLWJhY2ZmZTdlMDA3MyIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.j-nfkHt5ZcmI3Ez9c0CrJSvQtv7qnGcRj8KIcPE4GG3mFB9GJgtlp-iQDCNsFGW1LbpaY_Cc6BlRqrgpQdCkVKKlWP6Cte4wuU6G4PunwLpInMd6C-pOysLnC42RZ1uQ6zMewIzOABYTCwyPYl0s-5rcfYfNKXfII26YhDa3eRWlkxFYcZamrSz8elLMQ7kW7LRuJ8Ulhhjtni3jsJ9JnpXOpht06smqgcOcAxyLOfwXkvMWzQQ-tiNkSV3WJV0cg7535KcYIbmgnsdkEb_nxNdjQoPJvXlsli2y33ZnRhejw6cTsuGPpUwGiWfBgDV9Yy-8NGv0mK827QVdd9k2kQ&preferred_environment=");
	}
	
	public void closeBrowser() {
		driver1.quit();
	}
	
	public void login(String userName,String password) throws InterruptedException
	{
		email.sendKeys(userName);
		pass.sendKeys(password);
		signIn.click();	
		Thread.sleep(3000);
	}
	
	public String readEmailErr() {
		String actualErr = emailErr.getText();
		return actualErr;
	}
	
	public String readPasswordErr() {
		String actualErr = passwordErr.getText();
		return actualErr;
	}
	
	public String readGlobalErr() {
		String actualErr = globalErr.getText();
		return actualErr;
	}
}
