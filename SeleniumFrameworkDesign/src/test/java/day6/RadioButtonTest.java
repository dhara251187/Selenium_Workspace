package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://echoecho.com/htmlforms10.htm
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//td[@class='table5']/input[@name='group1']"));
		System.out.println(radioButton.size());
		//System.out.println(radioButton..getText());
		for(int i=0 ; i<radioButton.size(); i++)
		{
			//we write get attribute insted of get text because we need to print value attribute text(butter,cheese,Milk
			System.out.println(radioButton.get(i).getAttribute("value")+"---"+radioButton.get(i).isSelected());//Get Text
		}
		
		//click on Cheese
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		radioButton.get(2).click();
		System.out.println("-------------");
		
		for(int i=0; i<radioButton.size(); i++)
		{
			System.out.println(radioButton.get(i).getAttribute("value")+"----"+radioButton.get(i).isSelected());
		}
	}

}
