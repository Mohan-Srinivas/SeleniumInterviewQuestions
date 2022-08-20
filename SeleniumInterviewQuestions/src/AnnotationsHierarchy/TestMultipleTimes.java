package AnnotationsHierarchy;

import org.testng.annotations.Test;

public class TestMultipleTimes 
{
  @Test(invocationCount = 3)
  public void f() 
  {
	  System.out.println("I am inside Test");
  }
}
