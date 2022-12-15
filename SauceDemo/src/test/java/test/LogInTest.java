package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LogInPage;

public class LogInTest {
	LogInPage lp = new LogInPage();
	
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		lp.openBrowser();
		lp.openLoginPage();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		lp.closeBrowser();
	}
	
	@Test
	public void wrongUserWrongPassword()
	{
		lp.login("ahjskdhkas", "sdjsaj");
		Assert.assertEquals(lp.error(), "Epic sadface: Username and password do not match any user in this service");
	}
	
	@Test
	public void emptyUserEmptyPassword()
	{
		lp.login("", "");
		Assert.assertEquals(lp.error(), "Epic sadface: Username is required");
	}
	
	@Test
	public void emptyPassword()
	{
		lp.login("dasdasd", "");
		Assert.assertEquals(lp.error(), "Epic sadface: Password is required");
	}
	
	@Test
	public void logInSuccess()
	{
		lp.login("standard_user", "secret_sauce");
	}

}
