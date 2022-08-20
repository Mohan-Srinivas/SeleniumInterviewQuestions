package GoogleSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchReslutLinks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("12 angry men \n");
		Thread.sleep(3000);
		
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		
		/*
		 * for (WebElement webElement : totalLinks) {
		 * System.out.println(webElement.getAttribute("href")); }
		 */
		
		System.out.println("Size is "+totalLinks.size());
		
		//To fetch Main Links
		List<WebElement> MainLinks=driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		for (WebElement webElement : MainLinks)
		{
			System.out.println(webElement.getText());
		}
		System.out.println(MainLinks.size());
	}

}
