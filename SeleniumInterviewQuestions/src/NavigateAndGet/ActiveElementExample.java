package NavigateAndGet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElementExample 
{
	//static WebElement q;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//PageFactory.initElements(driver,ActiveElementExample.class);
		driver.get("https://www.google.co.in");// Waits for All DOM Elements Should load
		//q.sendKeys("Trichy\n");
		driver.switchTo().activeElement().sendKeys("Trichy\n");
	}

}
