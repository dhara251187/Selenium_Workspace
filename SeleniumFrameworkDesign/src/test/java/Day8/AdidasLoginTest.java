package Day8;

import java.time.Duration;

import javax.security.auth.kerberos.KerberosKey;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdidasLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.adidas.ca/en/account-login
		//enter wrong id
		//enter wrong password
		//verify error
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("login-email")).sendKeys("sfgsdjdow@ssfs.com");
		driver.findElement(By.id("login-password")).sendKeys("jwfkljjf");
		driver.findElement(By.xpath("//button[@aria-label='Email Log in']")).click();
		
		String expectedErr="Your request timed out – please retry";
		String actualErr=driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		if(expectedErr.equalsIgnoreCase(actualErr))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
