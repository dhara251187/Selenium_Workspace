package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.ca/");
		WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		
		List<WebElement> allLink=footer.findElements(By.tagName("a"));
		System.out.println(allLink.size());
		
		for(int i=0; i<allLink.size();i++)
		{
			System.out.println(allLink.get(i).getText());
	
	
		}
	}

}
