package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//hover on men and get size and text for second column-shoes
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement men=driver.findElement(By.linkText("Men"));
		Actions a = new Actions(driver);
		a.moveToElement(men).build().perform();
		Thread.sleep(2000);
		
		////a[contains(@aria-label,'main-menu, Men, Shoes')]-best x-path we can use for men shoes links
		List<WebElement> shoesLinks = driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']/div/div[2]/a"));//a[contains(
		System.out.println(shoesLinks.size());
		
		for(int i=0; i<shoesLinks.size(); i++)
		{
			System.out.println(shoesLinks.get(i).getText());
		}
		
		//*[@data-path='men:shoes']/following-sibling::a
		//div[@id='DesktopMenu-0-1-0']/div/div[2]/a
		//div[@id='DesktopMenu-0-3-0']/descendant::div[3]//a
	}

}
