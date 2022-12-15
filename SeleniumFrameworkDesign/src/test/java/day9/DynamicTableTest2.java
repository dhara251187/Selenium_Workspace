package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest2 {

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
		
		for(int i=1; i<rows.size(); i++) {
			List<WebElement> colums = rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0; j < colums.size(); j++) {
				System.out.print(colums.get(j).getText());
				System.out.print(" | ");
			}
			System.out.println("");
		}
	}

}

