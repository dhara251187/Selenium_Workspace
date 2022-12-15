package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://www.td.com/ca/en/personal-banking/
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");

		List<WebElement> tdFooter = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		System.out.println(tdFooter.size());
		for (int i = 0; i < tdFooter.size(); i++)
		{
			System.out.println(tdFooter.get(i).getText());
		}

	}

}
