package day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("C:\\QA\\Testing\\pro1.properties");
		Properties pop = new Properties();
		pop.load(f);
		
		String browser = pop.getProperty("browser");
		//	String browser = "Chrome";
		// webdriver driver;//you can declare driver at method level
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sfjksfsdjfsfsdf");
		driver.findElement(By.id("pass")).sendKeys("swfdjsjfhsdj");
		driver.findElement(By.name("login")).click();
		
	}

}
