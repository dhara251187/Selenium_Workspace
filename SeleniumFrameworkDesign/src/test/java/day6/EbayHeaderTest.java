package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print all text from header from home,saved,fashion
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		//ul[@class='hl-cat-nav_container']/li/a -xpath
		List<WebElement> mississauga=driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(mississauga.size());
		
		for(int i=0; i<mississauga.size(); i++)
		{
			System.out.println(mississauga.get(i).getText());
		}
	}

}
