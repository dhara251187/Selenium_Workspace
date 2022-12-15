package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//xpath i can use
		//div[@id='pageFooterChildren']//li
		//div[@id='pageFooterChildren']/ul/li
		//ul[contains(@class,'pageFooterLinkList')]/li
		
		List<WebElement> Footer=driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(Footer.size());
		for(int i=0; i<Footer.size(); i++)
		{
			System.out.println(Footer.get(i).getText());
		}
		
				
		
				
	}

}
