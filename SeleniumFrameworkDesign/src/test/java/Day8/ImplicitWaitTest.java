package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month= driver.findElement(By.id("month"));         
		Select m = new Select(month);
		m.selectByValue("7");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("15");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y= new Select(year);
		y.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();

	}

}
