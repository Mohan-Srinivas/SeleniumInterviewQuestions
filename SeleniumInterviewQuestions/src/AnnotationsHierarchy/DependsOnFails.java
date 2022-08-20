package AnnotationsHierarchy;

import org.testng.annotations.Test;

public class DependsOnFails 
{
	@Test(timeOut = 2000)
	public void ParentsPermission() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Permission granted");
		
	}
	@Test(dependsOnMethods ="ParentsPermission", alwaysRun = true)
	public void LoveMarriage()
	{
		System.out.println("Marriage happened");
	}
}
