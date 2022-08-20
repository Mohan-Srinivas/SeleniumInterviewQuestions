package ScrollingExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TextUnderLinedOrNot 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.navigate().to("https://www.google.co.in/");
		
		WebElement tamil=driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		String beforeHovering=tamil.getCssValue("text-decoration");	
		System.out.println("Before Hovering "+beforeHovering);
		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(tamil);
		actions.build().perform();
		String afterHovering=tamil.getCssValue("text-decoration");	
		System.out.println("Before Hovering "+afterHovering);
		
	}

}
