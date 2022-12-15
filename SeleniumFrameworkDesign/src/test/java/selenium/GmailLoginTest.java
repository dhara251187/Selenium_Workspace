package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-922297090%3A1665243310646075&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqlUnqnHDVA09RLisnxDH7WdWrIywe5WitDclv-XZBcGoerpTJi0MUHwYBmFCivSeiHAim-Bw");
		
		driver.findElement(By.id("identifierId")).sendKeys("weyudgyuwe4545@#$%");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		
		String expErr="Enter a valid email or phone number";
		String actErr= driver.findElement(By.className("LXRPh")).getText();
		System.out.println(actErr);
		
		if(expErr.equals(actErr))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
	}

}
