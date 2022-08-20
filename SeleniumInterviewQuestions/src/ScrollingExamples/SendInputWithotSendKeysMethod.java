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

public class SendInputWithotSendKeysMethod
{
	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.navigate().to("https://www.google.co.in/");
		
		WebElement searchBox=driver.findElement(By.name("q"));
		//searchBox.sendKeys("Duckling");
		
		//Using Javascript Executor
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsByName('q')[0].value='Duckling'", "");
		//executor.executeAsyncScript("arguments[0].value='srini'", searchBox);
		
		driver.switchTo().activeElement();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		
		
	}

}
