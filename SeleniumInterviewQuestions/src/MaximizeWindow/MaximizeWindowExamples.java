package MaximizeWindow;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindowExamples 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.google.co.in");// Waits for All DOM Elements Should load
		//driver.manage().window().maximize();
		/*
		 * Dimension dim=new Dimension(1920,1080);
		 * driver.manage().window().setSize(dim);
		 */
		
		
	}

}


/* 	1. driver.manage().window().maximize();
	2. Dimension dim=new Dimension(1920,1080);
	   driver.manage().window().setSize(dim);
	3. ChromeOptions chromeOptions=new ChromeOptions();
	   chromeOptions.addArguments("--start-maximized");
	   
	  differences between Thread.sleep() method and
	  selenium.setSpeed() method. setSpeed() is not present in Selenium Webdriver. 
	  It was present in the IDE and Remote Control version of Selenium 
	  but is now deprecated.
	
	 Thread.Sleep(3000)						Selenium.setSpeed(3000) IDE,RC now it's
	 Operation1								Operation1				deprecated	
	 Thread.Sleep(3000)						Operation2
	 Operation2								Operation3
	 Thread.Sleep(3000)
	 Operation3
	 	
	
*
*/