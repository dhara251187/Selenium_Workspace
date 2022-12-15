package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.mississauga.ca/
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul[@class='main-nav-links']/li[3]/button")).click();////ul[@class='main-nav-links']/li[3]/button
		List<WebElement> mississauga=driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//a"));
		System.out.println(mississauga.size());
		
		for(int i=0; i<mississauga.size(); i++)
		{
			System.out.println(mississauga.get(i).getText());
		}

			
	}

}
