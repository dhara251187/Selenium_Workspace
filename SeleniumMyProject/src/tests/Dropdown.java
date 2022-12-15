package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.ca/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> allOptions=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		//System.out.println(allOptions.size());
		for(WebElement option:allOptions)
		{
			option.getText();
			if(option.getText().equals("selenium"))
			{
				option.click();
			}
		}
	}

}
