package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class MultipleBrowserTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		Xls_Reader d=new Xls_Reader("C:\\QA\\Testing\\Book1.xlsx");
		String browser=d.getCellData("Sheet1", "browser", 2);
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			Assert.assertTrue(false);
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sfjksfsdjfsfsdf");
		driver.findElement(By.id("pass")).sendKeys("swfdjsjfhsdj");
		driver.findElement(By.name("login")).click();
	}

}
