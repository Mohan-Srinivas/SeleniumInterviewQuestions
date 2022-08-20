package ScreenShotInSelenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotExample
{
	public static void main(String[] args) throws IOException, AWTException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");

		//Take Screenshot logic here
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File destinationFile=new File("C:\\Users\\srinivasan.a.mohan\\OneDrive - Accenture\\Desktop\\Selenium Java\\image.png");
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sourceFile, destinationFile);

		
		//Click the button to display a alert box.
		WebElement alertBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();
		
		Robot robot=new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage robotsourceFile=robot.createScreenCapture(rectangle);
		
		File robotdestinationFile=new File("C:\\Users\\srinivasan.a.mohan\\OneDrive - Accenture\\Desktop\\Selenium Java\\Robot_snap.png");
		ImageIO.write(robotsourceFile,"png",robotdestinationFile);
	}

}




/*Isn't Selenium TakesScreenshot enough?

It's more than enough.but if we have below requirements

1.	Take Screenshot when an Alert is open..
	it will give you an exception stating "org.openqa.selenium.UnhandledAlertException".
2. 	Take Screenshot including address bar and tab opened (ie) Full Screenshot
			
*/

