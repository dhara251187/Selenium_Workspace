package day6;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	//static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month= driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("15");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y= new Select(year);
		y.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();

		
		//WebElement month = driver.findElement(By.id("month"));
		//selDrpDwn(month, "Dec");
		//WebElement date = driver.findElement(By.id("day"));
		//selDrpDwn(date, "11");
		//WebElement year = driver.findElement(By.id("year"));
		//selDrpDwn(year, "1989");
	}
}

//	
	
	//public static void selDrpDwn(WebElement ele, String Value)
	//{
	//	Select s = new Select(ele);
		
	//	List<WebElement> options = s.getOptions();
	//	System.out.println(options.size());
		
		//for(WebElement option: options)
		//{
			//if(option.getText().equals(Value))
		//	{
			//	option.click();
		//	}
		//}
	//}

//}
