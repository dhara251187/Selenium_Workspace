package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=FagxBUrJx0M&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiRmFneEJVckp4ME0iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2NTIzNjg5NywiaWF0IjoxNjY1MjM1Njk3LCJqdGkiOiJmYTYyM2U1Mi1kODMyLTQ5YzctYWFlYy1jYmRiY2ViZGEwNDAiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.b_dUgVHHzadEMQEhbIeGkyQgLnjCSRdbAIPQqvNEgHOBuR1xEukHLkaCHtfLlnUQFw8tI-ajuCXHu4joVVbKrFMo7z-M6UoiJQ1DBVM6HbqnHeyx7zLNSfk-v1XsoQTT8sdCngREUGrCAtLkPbubEXbBV1veCgV5tEmSpThc1OtM5MF2LVJN9zARy9OjpkKYKQoVOyByeaGPJW6JqA6S5MD4ZR8grolfaGKC076dd7ly-5sMOjE-CCqTo9ZdDbCMfv0Xv1NRoWVcvAligf80WscZ3R0okjI6NDZ3s68j_aKgiPvsiSjoEmt3s8iUBhrEfNkwkQuxikxY-zPGDHNW2A&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("shfiushfeiowe#$%");
		driver.findElement(By.name("password")).sendKeys("wehfuiwefhweh");
		driver.findElement(By.id("signIn")).click();
		
		String expErr="Please enter a username or card number without special characters.";
		String actErr=driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
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
