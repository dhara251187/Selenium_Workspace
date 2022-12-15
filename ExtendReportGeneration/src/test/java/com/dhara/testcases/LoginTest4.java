package com.dhara.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest4 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("LoginTest3 before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("LoginTest3 before method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("LoginTest3 after class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("LoginTest3 aftger method");
	}
	
	@Test
	public void test1() {
		System.out.println("LoginTest3 test1");
	}
	
	
	
	@Test
	public void test2() {
		System.out.println("LoginTest3 test2");
	}
	
	@Test
	public void test3() {
		System.out.println("LoginTest3 test3");
	}
	
	@Test
	public void test4() {
		System.out.println("LoginTest3 test4");
	}

}
