package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		List<WebElement> dropDown = driver.findElements(By.xpath("//div[@id='gh-cat-box']//option"));
		System.out.println(dropDown.size());

		for (int i = 0; i < dropDown.size(); i++)
		{
			System.out.println(dropDown.get(i).getText() + "----" + dropDown.get(i).isSelected());
		}

		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);

		s.selectByIndex(5);
		Thread.sleep(3000);

		s.selectByValue("625");
		Thread.sleep(3000);

		s.selectByVisibleText("Art");

		for (int i = 0; i < dropDown.size(); i++)
		{
			System.out.println(dropDown.get(i).getText() + "------" + dropDown.get(i).isSelected());
		}

		System.out.println("----------");
		System.out.println(s.getFirstSelectedOption().getText());
		
	}

}
