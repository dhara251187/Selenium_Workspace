package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.ca/");
		
		WebElement Header= driver.findElement(By.className("o3j99"));
		List<WebElement> Link=Header.findElements(By.tagName("a"));
		for(int i=0; i<Link.size() ; i++)
			{
			System.out.println(Link.get(i).getText());
			}
			}

}
//driver.findElement(By.xpath("xpathvalue"))