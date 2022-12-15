package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("jkwsfhkjsdkn");
		driver.findElement(By.name("lastname")).sendKeys("wejufhwhef");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("slfjesjfjewlkf");
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}

}

