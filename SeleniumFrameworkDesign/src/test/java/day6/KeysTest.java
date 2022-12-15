package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=WZAc0SjZbW0&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiV1pBYzBTalpiVzAiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2NTMzMDAyMCwiaWF0IjoxNjY1MzI4ODIwLCJqdGkiOiJiM2Q5YjBlZi1mOWQ5LTRhYzktODMyZS02M2I4ZWEzMzExOWQiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.Es3oXW2rHXLPL7VdTs7YcBXC0yCnyK2FtZjXRVplBO0BuCe2elJ0Vnrih6ZdUZZAUDbgzZSm3NgB-A-cXyRhe1W38OR0ibLw3TlQ2ZYrElQrUX6lU1VjH5tbLnNWCX-T8KpFfP5p_8_vPOgQ98RS_hKFAVf1miDOKpHDdp2LyLcYtSK3fCnX_WaffRRbLszKIHEWVwFuPjZejFsYSbGqOmP3b3ByUT8xoid8DFzhF6UxMf8k7P8Q1ypHmCusDwxetNooAuByZgoZ0Rt1FMTEHoIyZirpVU63ZD3Ny3OYQJw2BJ6Db5h1USyJdenuPx8rugFpDGSckhzLLDQtjUG3wQ&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("shfiushfeiowe#$%");
		driver.findElement(By.name("password")).sendKeys("wehfuiwefhweh"+Keys.ENTER );
	//	driver.findElement(By.name("password")).sendKeys(Keys.ENTER);//either way i can write code for Press Enter Key

	}

}
