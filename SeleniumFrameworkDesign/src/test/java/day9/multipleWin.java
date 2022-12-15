package day9;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1124656868%3A1666453422509384&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqL7GMg8KhwnAPGA2e2S9v4m9i1TRVZvFOdSma9xxN8hmX__3lkiptsZOHVdbSZ96WkJuaoOw");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.linkText("Help")).click();
		Set<String> allWind= driver.getWindowHandles();
		Iterator<String> itr= allWind.iterator();
		String mainWin=itr.next();
		String childWin=itr.next();
		System.out.println(mainWin);
		System.out.println(childWin);
		driver.switchTo().window(childWin);//driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
	}

}
