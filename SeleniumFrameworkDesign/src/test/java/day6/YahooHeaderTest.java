package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://ca.yahoo.com/
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com");
		
		List<WebElement> yahooHeader = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
		System.out.println(yahooHeader.size());
		
		for(int i=0; i<yahooHeader.size(); i++)
		{
			System.out.println(yahooHeader.get(i).getText());
		}
		
		

	}

}
