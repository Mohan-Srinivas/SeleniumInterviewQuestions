package AlertExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alertsExample 
{
	@Test
	public void normalAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		WebElement alertButton=driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]"));
		alertButton.click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	@Test
	public void promptBoxAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		WebElement promptAlert=driver.findElement(By.xpath("//button[contains(text(),'Prompt Box')]"));
		promptAlert.click();
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Srini");
		alert.accept();
			
	}

}
