package com.dhara.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest1 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("LoginTest1 before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("LoginTest1 before method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("LoginTest1 after class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("LoginTest1 aftger method");
	}
	
	@Test
	public void test1() {
		System.out.println("LoginTest1 test1");
	}
	
	
	
	@Test
	public void test2() {
		System.out.println("LoginTest1 test2");
	}
	
	@Test
	public void test3() {
		System.out.println("LoginTest1 test3");
	}
	
	@Test
	public void test4() {
		System.out.println("LoginTest1 test4");
	}

}
