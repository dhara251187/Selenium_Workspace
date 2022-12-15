package Day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.aliexpress.com/
		//close popup
		//if you get the popup close popup and type computer inthe search box
		//if you don't get popup direct type computer in search box
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aliexpress.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> popup1 = driver.findElements(By.className("_24EHh"));
		if(popup1.size()>0)
		{
			popup1.get(0).click();
		}
		
		List<WebElement> popup2 = driver.findElements(By.xpath("//div[@class='poplayer-content']"));
		System.out.println(popup2.size());
		if(popup2.size()>0)
		{
			popup2.get(0).click();
		}

		driver.findElement(By.id("search-key")).sendKeys("computer");
		
	}

}
