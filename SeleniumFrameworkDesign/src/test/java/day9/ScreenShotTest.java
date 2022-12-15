package day9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.netty.handler.codec.http.multipart.FileUpload;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE);//This is for FireFoxDriver,
		//File scrFile = ((TakesScrrenshot)driver).getScreenShotAs(OutputType.FILE);// This line is for Webdriver
		FileUtils.copyFile(screenShotFile, new File("C:\\QA\\Testing\\screenshot.png"));
		
	}

}
