package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("india");
		List<WebElement> sugBox = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(sugBox.size());
		
		for(int i=0; i<sugBox.size(); i++)
		{
			System.out.println(sugBox.get(i).getText());
		}
	}

}
