package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics =driver.findElement(By.linkText("Electronics"));
		Actions a = new Actions(driver);
		a.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		//grab links for top categories link in electronics link 
		List<WebElement> eleDrpDwn = driver.findElements(By.xpath("//div[@class='hl-cat-nav__flyout']"));//(//nav[@aria-label='Top Categories']/ul)[3]/li

		System.out.println(eleDrpDwn.size());
		
		for(int i=0 ; i<eleDrpDwn.size(); i++)
		{
			System.out.println(eleDrpDwn.get(i).getText());
		}
		
		
	}

}
