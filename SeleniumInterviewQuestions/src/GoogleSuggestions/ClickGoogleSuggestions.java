package GoogleSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGoogleSuggestions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Games of thornes");
		Thread.sleep(3000);
		
		//Click the 3rd suggestions
		int position=0;
		List<WebElement> searchSuggestions=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement webElement : searchSuggestions) 
		{
			System.out.println(webElement.getText());
			position=position+1;
			if(position==3)
			{
				webElement.click();
				break;
			}
		}
	}

}
