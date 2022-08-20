package ExtentsReportsViaTestNG;



import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport 
{
	ExtentReports extent;
	ExtentTest extentTest;
	ExtentSparkReporter reporter;
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		String Path=System.getProperty("user.dir")+"/test-output/ExtentReport.html";
		reporter=new ExtentSparkReporter(Path);
		reporter.config().setDocumentTitle("Automation Reports via Extent");
		reporter.config().setReportName("Functional Report");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("HostName", "HP ThinClient");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "Chrome");

		driver=new ChromeDriver();
	}
	@Test
	public void openGoogle() throws IOException
	{
		extentTest=extent.createTest("Check Google Title");
		driver.get("https://www.google.co.in/");
		Assert.assertEquals(driver.getTitle(),"Google");
	}
	@Test
	public void openWiki() throws IOException
	{
		extentTest=extent.createTest("Check Chrome Title");
		driver.get("https://www.google.co.in/");
		Assert.assertEquals(driver.getTitle(),"joogle");
	}
	@AfterMethod
	public void getResultTest(ITestResult result) throws IOException  
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			extentTest.log(Status.FAIL, "Test Case failed is " + result.getThrowable());
			extentTest.log(Status.FAIL,"Test Case failed is " +result.getName());
			
			String screenShotPath=GenerateExtentReport.getScreenShot(driver, result.getName());
			extentTest.addScreenCaptureFromPath(screenShotPath);
		}
		else if (result.getStatus()==ITestResult.SKIP)
		{
			extentTest.log(Status.SKIP,  "Test Case skipped is"+result.getName());
		}
		else
		{
			extentTest.log(Status.PASS, "Test Case passed is"+result.getName());
		}
		
	}
	@AfterTest
	public void flushReport()
	{
		extent.flush();
		driver.quit();
		
	}
	public static String getScreenShot(WebDriver driver,String Screenshotname) throws IOException 
	{
		String date=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File SourceFile=ts.getScreenshotAs(OutputType.FILE);
		//String destination=System.getProperty("user.dir")+ "/FailedTestsScreenshots/" +Screenshotname+".png";
		String Path=System.getProperty("user.dir")+"/FailedTestsScreenshots/" + Screenshotname + date + ".png";
		File destinationFile=new File(Path);
		FileHandler.copy(SourceFile, destinationFile);
		return Path;

	}
}




/*Robot robot=new Robot();
Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
Rectangle rectangle=new Rectangle(screenSize);
BufferedImage robotsourceFile=robot.createScreenCapture(rectangle);

File robotdestinationFile=new File(destination);
ImageIO.write(robotsourceFile,"png",robotdestinationFile);
*/