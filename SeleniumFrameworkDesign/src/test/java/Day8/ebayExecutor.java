package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ebayExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Thread.sleep(5000);
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,5000)");

		WebElement jobs = driver.findElement(By.linkText("Jobs"));
		js.executeScript("arguments[0].click()", jobs);
		//js.executeScript("arguments[0].scrollIntoView(true);", jobs);
		//js.executeScript("arguments[0].scrollIntoView(true);",jobs);
		jobs.click();
		driver.close();
				//careers.click();
		
		

	}

}
