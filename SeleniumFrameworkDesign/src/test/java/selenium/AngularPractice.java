package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("name")).sendKeys("Dhara");
		driver.findElement(By.name("email")).sendKeys("dhara25@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("D@_251187");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='exampleCheck1']")).isSelected());
	//	WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	//	Select dropdown = new Select(staticDropdown);
	//	dropdown.selectByVisibleText("Female");
		//driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).getText();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='exampleFormControlSelect1']/option"));
		for(WebElement option : options) {
			option.getText();
			if(option.getText().equalsIgnoreCase("Male")) {
				option.click();
				break;
			}
		}
	}

}
