package Day8;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
	//	Actions a = new Actions(driver);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		wait.until(ExpectedConditions.textToBePresentInElement(drop,"Dropped!"));
		
		//explicit wait text to be present
		
		System.out.println(drop.getText());
		if(drop.getText().equals("Dropped!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	//	List<WebElement> dropped= driver.findElements(By.xpath("//div[@text='Dropped!']"));
		//if(dropped.size()>0)
		//{
		//	System.out.println("pass");
	//	}
	//	else
	//	{
		//	System.out.println("fail");
		//}
		
	}

}
