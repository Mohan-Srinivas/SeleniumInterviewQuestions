package ExtentsReports;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentsReportsUsingSelenium 
{
	WebDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter sparkReporter;
	ExtentTest testCase;
	@BeforeSuite
	public void openBrowser()
	{
		//System.setProperty("webdriver.chrome.driver", "");
		extentReport=new ExtentReports();
		sparkReporter=new ExtentSparkReporter("target/Spark.html");
		extentReport.attachReporter(sparkReporter);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void openGoogle() throws IOException, AWTException
	{
		testCase=extentReport.createTest("Check Google Title");
		driver.get("https://www.google.co.in/");
		if(driver.getTitle().equalsIgnoreCase("Google"))
		{
			testCase.log(Status.PASS,"Actual and Expected output are same");
		}
		else
		{
			testCase.log(Status.FAIL,"Actual and Expected output are not same");
			Robot robot=new Robot();
			Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle=new Rectangle(screenSize);
			BufferedImage robotsourceFile=robot.createScreenCapture(rectangle);
			
			File robotdestinationFile=new File("google.png");
			ImageIO.write(robotsourceFile,"png",robotdestinationFile);
			testCase.addScreenCaptureFromPath("google.png");
		}
		extentReport.flush();
	}
	@Test
	public void openBing() throws IOException, AWTException
	{
		testCase=extentReport.createTest("Check Bing Title");
		driver.get("https://www.bing.com/");
		if(driver.getTitle().equalsIgnoreCase("Search"))
		{
			testCase.log(Status.PASS,"Actual and Expected output are same");
		}
		else
		{
			testCase.log(Status.FAIL,"Actual and Expected output are not same");
			/*
			 * Robot robot=new Robot(); Dimension
			 * screenSize=Toolkit.getDefaultToolkit().getScreenSize(); Rectangle
			 * rectangle=new Rectangle(screenSize); BufferedImage
			 * robotsourceFile=robot.createScreenCapture(rectangle);
			 * 
			 * File robotdestinationFile=new File("bing.png");
			 * ImageIO.write(robotsourceFile,"png",robotdestinationFile);
			 */
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File destinationFile=new File("test-output/failedScreens/bing.png");
			File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sourceFile, destinationFile);
			testCase.addScreenCaptureFromPath("bing.png");
		}
		extentReport.flush();
	}
	@Test
	public void openWiki() throws IOException, AWTException
	{
		testCase=extentReport.createTest("Check Wiki Title");
		driver.get("https://en.wikipedia.org/wiki/Wiki");
		if(driver.getTitle().equalsIgnoreCase("Wiki - Wikipedia"))
		{
			testCase.log(Status.PASS,"Actual and Expected output are same");
		}
		else
		{
			testCase.log(Status.FAIL,"Actual and Expected output are not same");
			Robot robot=new Robot();
			Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle=new Rectangle(screenSize);
			BufferedImage robotsourceFile=robot.createScreenCapture(rectangle);
			
			File robotdestinationFile=new File("wiki.png");
			ImageIO.write(robotsourceFile,"png",robotdestinationFile);
			testCase.addScreenCaptureFromPath("wiki.png");
		}
		extentReport.flush();
	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
}
