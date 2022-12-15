package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adidas.ca/en");
		
		//option1
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement careers = driver.findElement(By.linkText("Careers"));
		//System.out.println(careers.getLocation());
		//js.executeScript("window.scrollBy(0,5000)");
		//careers.click();
		
		//option2-scroll until the element is in the view
		
		//js.executeScript("arguments[0].scrollIntoView(true);", careers);
		//careers.click();
		
		//option 3-direct click using JavasriptExecutor class
		js.executeScript("arguments[0].click();", careers);

	}

}
