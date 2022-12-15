package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://accounts.google.com/v3/signin/identifier?dsh=S1124656868%3A1666453422509384&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqL7GMg8KhwnAPGA2e2S9v4m9i1TRVZvFOdSma9xxN8hmX__3lkiptsZOHVdbSZ96WkJuaoOw
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1124656868%3A1666453422509384&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqL7GMg8KhwnAPGA2e2S9v4m9i1TRVZvFOdSma9xxN8hmX__3lkiptsZOHVdbSZ96WkJuaoOw");
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles.size());
		Iterator<String> itr = allWindowHandles.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());//Help page title
		driver.close();
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());// gmail page title
	}

}
