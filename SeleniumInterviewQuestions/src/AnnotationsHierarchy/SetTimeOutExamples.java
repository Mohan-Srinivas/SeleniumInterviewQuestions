package AnnotationsHierarchy;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class SetTimeOutExamples 
{
	@Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
	public void f() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("This is TestCase");
	}
}

/* Handle Exceptions in TestNG
ExpectedExceptions parameters we can use

*/