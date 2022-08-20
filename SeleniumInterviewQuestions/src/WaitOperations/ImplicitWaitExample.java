package WaitOperations;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplicitWaitExample
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 	
		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		WebElement gotIt=driver.findElement(By.xpath("//*[@id=\'cookie_stop\']"));
		gotIt.click();
		 
		WebElement loginButton=driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		loginButton.click();
		
		WebElement myProfile=driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a"));
		myProfile.click();
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File destinationFile=new File("C:\\Users\\srinivasan.a.mohan\\OneDrive - Accenture\\Desktop\\Selenium Java\\Text Files\\fail.png");
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sourceFile, destinationFile);
		driver.quit();
		
	}

}
