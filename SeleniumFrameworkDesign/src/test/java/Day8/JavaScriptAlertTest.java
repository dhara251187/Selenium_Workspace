package Day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/javascript4.htm");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1. confirm box
		driver.findElement(By.name("B2")).click();
		Thread.sleep(3000);
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();//click on ok button
	//	a1.dismiss();//click on dismiss
		
		//2.prompt box
		driver.findElement(By.name("B3")).click();
		Thread.sleep(3000);
		
		a1.sendKeys("Hello Selenium");
		Thread.sleep(3000);
		a1.accept();
	
			
	}

}
