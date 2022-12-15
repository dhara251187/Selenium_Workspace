package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.ca/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//type canada in search box
		driver.findElement(By.name("q")).sendKeys("Canada");
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@class='G43f7e']/li"), 10));
		//Get Size of dropdown
		List<WebElement> dropDown=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));//ul[@role='listbox']/li
		System.out.println(dropDown.size());
		for(int i=0 ; i<dropDown.size(); i++)
		{
			System.out.println(dropDown.get(i).getText());//Get Text
		}
		
		
	}

}
