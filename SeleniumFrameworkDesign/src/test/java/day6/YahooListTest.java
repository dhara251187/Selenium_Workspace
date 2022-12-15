package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Trending Now links
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> tendingNowLinks = driver.findElements(By.xpath("//div[contains(@class,'trendingNowTextList')]//a"));
		System.out.println(tendingNowLinks.size());
		
		for(int i=0; i<tendingNowLinks.size(); i++)
		{
			System.out.println(tendingNowLinks.get(i).getText());
		}
		
	}

}
