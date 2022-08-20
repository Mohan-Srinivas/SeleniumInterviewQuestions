package MaximizeWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SleepVSSetspeed 
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.google.co.in");// Waits for All DOM Elements Should load
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);
		
		//Selenium.setSpeed(2000);
		
/*		  differences between Thread.sleep() method and
		  selenium.setSpeed() method. setSpeed() is not present in Selenium Webdriver. 
		  It was present in the IDE and Remote Control version of Selenium 
		  but is now deprecated.
		
		 Thread.Sleep(3000)						Selenium.setSpeed(3000) IDE,RC now it's
		 Operation1								Operation1				deprecated	
		 Thread.Sleep(3000)						Operation2
		 Operation2								Operation3
		 Thread.Sleep(3000)
		 Operation3
	*/	
	}

}
