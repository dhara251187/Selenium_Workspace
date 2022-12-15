package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		//Thread.sleep(2000);
		
		List<WebElement> ebaySugList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(ebaySugList.size());
		
		for(int i=0; i<ebaySugList.size(); i++)
		{
			System.out.println(ebaySugList.get(i).getText());
		}
		
	}

}
