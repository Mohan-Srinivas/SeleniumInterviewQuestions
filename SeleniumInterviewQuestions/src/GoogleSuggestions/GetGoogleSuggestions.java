package GoogleSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetGoogleSuggestions
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//ChromeOptions chromeOptions=new ChromeOptions();
		//chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		Dimension dim=new Dimension(1920, 1080);
		driver.manage().window().setSize(dim);
		driver.get("https://www.google.co.in");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Games of thornes");
		Thread.sleep(3000);
		
		List<WebElement> searchSuggestions=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement webElement : searchSuggestions) 
		{
			System.out.println(webElement.getText());
		}
		
		//Click the 3rd element in the suggestions
	}

}
