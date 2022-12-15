package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.linkText("Store")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleContains("Store"));
		System.out.println(driver.getTitle());//Store Page Title
		
		driver.navigate().back();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println(driver.getTitle()); //Google Page Title
		
		driver.navigate().forward();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleContains("Store"));
		System.out.println(driver.getTitle());
		
	}

}
