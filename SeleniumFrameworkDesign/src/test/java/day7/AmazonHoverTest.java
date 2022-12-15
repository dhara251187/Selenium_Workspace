package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//grab links in your lists
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		WebElement hover= driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(hover).build().perform();
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++)//for(WebElement link : links)
		{
			System.out.println(links.get(i).getText());//system.out.println(link.getText());
		}
		
			
	}
////div[@id='nav-al-wishlist']/a
}
