package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		List<WebElement> sortable= driver.findElements(By.xpath("//a[text()='Sortable']"));//By.linkText("Sortable")
		System.out.println(sortable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("ele present");
		}
		else
		{
			System.out.println("ele not present");
		}
		 //Thread.sleep(5000);
		List<WebElement> frame= driver.findElements(By.id("draggable"));//By.id("Draggable")
		System.out.println(frame.size());
		
		if(frame.size()>0)
		{
			System.out.println("frame  present");
		}
		else
		{
			System.out.println("frame not present");
		}
		//switch to frame
		driver.switchTo().frame(0);//index
		//driver.switchTo().frame("demo-frame");//Name or Id, In this case,we cano not use this option as we don't have id or name
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//Webelement
		System.out.println("-------------------");
		

		sortable= driver.findElements(By.xpath("//a[text()='Sortable']"));//By.linkText("Sortable")
		System.out.println(sortable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("ele present");
		}
		else
		{
			System.out.println("ele not present");
		}
		
		frame= driver.findElements(By.id("draggable"));//By.id("Draggable")
		System.out.println(frame.size());
		
		if(frame.size()>0)
		{
			System.out.println("frame  present");
		}
		else
		{
			System.out.println("frame not present");
		}
		System.out.println("------------");
		
		driver.switchTo().defaultContent();
		
		sortable= driver.findElements(By.xpath("//a[text()='Sortable']"));//By.linkText("Sortable")
		System.out.println(sortable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("ele present");
		}
		else
		{
			System.out.println("ele not present");
		}
		
		frame= driver.findElements(By.id("draggable"));//By.id("Draggable")
		System.out.println(frame.size());
		
		if(frame.size()>0)
		{
			System.out.println("frame  present");
		}
		else
		{
			System.out.println("frame not present");
		}
		
		//driver.switchTo().parentFrame();// always switch to parent frame
		
		driver.switchTo().parentFrame();
		
	}

}
