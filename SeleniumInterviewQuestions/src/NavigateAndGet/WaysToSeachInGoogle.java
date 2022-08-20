package NavigateAndGet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToSeachInGoogle {

	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.co.in");// Waits for All DOM Elements Should load
		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		
		WebElement searchBox=driver.findElement(By.name("q"));
		//searchBox.sendKeys("Trichy"+Keys.ENTER);
		//searchBox.sendKeys("Trichy /n");
		//searchBox.sendKeys("Trichy");
		//searchBox.submit();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
