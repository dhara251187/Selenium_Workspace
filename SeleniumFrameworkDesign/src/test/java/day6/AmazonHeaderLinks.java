package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.amazon.ca/
		//footerlinks
		//div[contains(@class,'navFooterVerticalRow ')]//a - xpath for footer links
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		List<WebElement> amazonHeader = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(amazonHeader.size());
		
		for(int i=0; i<amazonHeader.size(); i++)
		{
			System.out.println(amazonHeader.get(i).getText());
		}
		
		
	}

}
