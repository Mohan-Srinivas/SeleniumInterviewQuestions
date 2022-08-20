package LaunchChromeWithoutSetProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launchChromeWithoutSetPropertyExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);
	}

}
