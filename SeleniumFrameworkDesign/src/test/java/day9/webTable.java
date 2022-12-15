package day9;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		
		
		List<WebElement>column =driver.findElements(By.xpath("//table[@id='customers']//tr//th"));
		System.out.println(column.size());
		
		for(int i=2; i<=rows.size(); i++)
		{
			for(int j=1; j<=column.size();j++)
			{
				//WebElement table=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]"));
				WebElement text=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]"));
				System.out.println(text.getText());
				System.out.print(" | ");
			}
			System.out.println("\n");
		}
		
	}

}
