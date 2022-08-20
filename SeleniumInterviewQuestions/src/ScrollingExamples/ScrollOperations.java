package ScrollingExamples;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollOperations 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.navigate().to("https://www.phptravels.net/login");
		 	
		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		WebElement gotIt=driver.findElement(By.xpath("//*[@id=\'cookie_stop\']"));
		gotIt.click();
		 
		WebElement loginButton=driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		loginButton.click();
		
		WebElement profile=driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a"));
		profile.click();
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		
		/*
		 * executor.executeScript("window.scroll(0,450)", ""); // To scroll down
		 * Thread.sleep(3000); 
		 * executor.executeScript("window.scroll(0,-450)", ""); //To
		 * scroll UP
		 */
	
		// Go tO Bottom of the Image
		/*
		 * executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		 * //Bottom down to page Thread.sleep(3000);
		 * executor.executeScript("window.scrollTo(0,0)",""); // Top of the page
		 */	
		// Go to a specific WebElement
		
		WebElement AddressText=driver.findElement(By.name("address2"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].scrollIntoView(true);", AddressText);
		Thread.sleep(2000); 
		// Using Robot Class
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	
	}

}
