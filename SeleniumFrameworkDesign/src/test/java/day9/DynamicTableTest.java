package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get number of rows
		//number of columns
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement webTable=driver.findElement(By.id("customers"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrolInToView(true);", webTable);
		js.executeScript("window.scrollBy(0,100)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th"));
		System.out.println(column.size());
		
		for(int i=2; i<=rows.size(); i++)
		{
			for(int j=1; j<=column.size(); j++)
			{
				//String s1 = "//table[@id='customers']//tr[";
				//String s2 = "]/td[";
				//String s3 = "]";

				WebElement table=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]"));
				System.out.print(table.getText());
				System.out.print(" | ");
				
			}
			System.out.println("\n");
		}
		
	}

}
