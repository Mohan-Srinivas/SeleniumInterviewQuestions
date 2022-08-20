package NavigateAndGet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVSNavigate
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.co.in");// Waits for All DOM Elements Should load
		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}



/* Diff B/w Navigate and get
 * 
 * 	1.	Get() Method will not store the history(not able to perform Refresh(),forward() and Back()
 *		Where as navigate() store the history
 * 	2.	Get() will waits for all DOM elements 
 * 		whereas navigate() method will not wait	
 * */
