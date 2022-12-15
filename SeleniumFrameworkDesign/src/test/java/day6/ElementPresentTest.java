package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.ca/");
		
		List<WebElement> element = driver.findElements(By.linkText("sfsdfsdfsd"));
		System.out.println(element.size());
		
		if(element.size()>0)
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not present");
		}

	}

}
