package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.bestbuy.ca/en-ca

		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca?cmp=knc-c-71700000055263530-k-43700045994766983&gclid=EAIaIQobChMIzOfjscPj-gIVLjizAB2txQn6EAAYASAAEgLuQfD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.xpath("//span[@data-automation='x-deals']")).click();
		List<WebElement> deals = driver.findElements(By.xpath("//div[@class='menu_3LP5u menuActive_3neTn']//a"));
		System.out.println(deals.size());
		
		for(WebElement deal: deals)
		{
			System.out.println(deal.getText());
		}
	}

}
