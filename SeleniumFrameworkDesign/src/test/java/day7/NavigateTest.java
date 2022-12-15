package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.ebay.ca/");
		driver.navigate().to("\"https://www.ebay.ca/\"");//open URL	same like driver.get("facebool.com")
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
