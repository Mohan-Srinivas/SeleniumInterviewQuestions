package RefreshBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshBrowserExample 
{
	public static void main(String[] args) throws AWTException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");// Waits for All DOM Elements Should load
		//driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		//JavascriptExecutor Executor=(JavascriptExecutor) driver;
		//Executor.executeScript("history.go(0)");
		
		  Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_F5);
		  robot.keyRelease(KeyEvent.VK_F5);
		 
		
	}

}

/*

	1. If u r using navigate
	//driver.navigate().refresh();

	2. If you are using Get()
	driver.get(driver.getCurrentUrl());

	3.using JavaScriptExecutor
	JavascriptExecutor Executor=(JavascriptExecutor) driver;
	Executor.executeScript("location.Reload()");	
	history.go(0);
	
	4.Using Robot Class
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_F5);
	
*/