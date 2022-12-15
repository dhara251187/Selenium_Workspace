package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;
import utilities.Xls_Reader;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class LoginTest {
	
	LoginPage lp = new LoginPage();
	DataFile df= new DataFile();
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  lp.openBrowser();
	  lp.openLoginPage();
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  //close browser
	  lp.closeBrowser();
  }
  
  @Test (priority = 1)
  public void loginwithSpecialCharEmailTest() throws InterruptedException {
	  lp.login(df.emailWithSpecChar,df.wrongPassword);
	  Assert.assertEquals(lp.readEmailErr(), df.specialCharerr);	  
  }

  
  @Test (priority = 2)
  public void loginwithEmptyEmailTest() throws InterruptedException {
	  lp.login("",df.wrongPassword);
	  Assert.assertEquals(lp.readEmailErr(), df.emptyEmailErr);	  
  }
  
  @Test (priority = 3)
  public void loginwithEmptyPasswordTest() throws InterruptedException {
	 lp.login(df.wrongEmail,"");
	 Assert.assertEquals(lp.readPasswordErr(), df.emtyPassErr);	  
  }
  
  @Test (priority = 4)
  public void loginwithWrongEmailAndPasswordTest() throws InterruptedException {
	  lp.login(df.wrongEmail,df.wrongPassword);
	  Assert.assertEquals(lp.readGlobalErr(), df.globalErr);	  
  }
  
  


}
  
