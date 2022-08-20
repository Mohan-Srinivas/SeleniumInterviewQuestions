package AnnotationsHierarchy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTest 
{
	
	@Test
	public void f() 
	{
		System.out.println("I am inside test1");
	}
	@Test
	public void f1() 
	{
		System.out.println("I am inside test2");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("I am inside beforeMethod");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I am inside afterMethod");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I am inside beforeClass");
	}

	@AfterClass
	public void afterClass() 
	{
		System.out.println("I am inside afterClass");
	}

	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("I am inside beforeTest");
	}

	@AfterTest
	public void afterTest() 
	{
		System.out.println("I am inside afterTest");
	}

	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("I am inside beforeSuite");
	}

	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("I am inside afterSuite");
	}

}
