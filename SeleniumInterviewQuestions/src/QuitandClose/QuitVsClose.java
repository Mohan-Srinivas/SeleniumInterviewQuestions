package QuitandClose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Window.html");
		
		//Click button to open home page in New Window
		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();
		driver.close();
	}

}
