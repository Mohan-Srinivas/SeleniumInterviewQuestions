package ExtentsReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class openGoogle 
{
	@Test
	public void get() 
	{
		// TODO Auto-generated method stub
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chrome);
		driver.get("https://www.google.co.in");
		ExtentReports report=new ExtentReports();
		ExtentSparkReporter reporter=new ExtentSparkReporter("reportGoogle.html");
		report.createTest("Open google");
		WebElement tamil=driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		String beforeHovering=tamil.getCssValue("text-decoration");
		System.out.println("Before hovering : "+beforeHovering);
		
		Actions action=new Actions(driver);
		action.clickAndHold(tamil).build().perform();
		String afterHovering=tamil.getCssValue("text-decoration");
		System.out.println("After Hovering : "+afterHovering);
		
		report.attachReporter(reporter);
		driver.quit();
		report.flush();
	}

}
