package WaitOperations;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net/login");
		 	
		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		WebElement gotIt=driver.findElement(By.xpath("//*[@id=\'cookie_stop\']"));
		gotIt.click();
		 
		WebElement loginButton=driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		loginButton.click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		//Apply method
		WebElement profile=wait.until(
		new Function<WebDriver,WebElement>() 
		{

			@Override
			public WebElement apply(WebDriver t) 
			{
				// TODO Auto-generated method stub
				return t.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a"));
			}
		});
		profile.click();
	}

}
