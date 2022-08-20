package NavigateAndGet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToURLWithoutUsingGetandNavigate 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//Using javaScriptExecutor
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.location='https://google.co.in'","");
	}

}


/*
 
 GitHub Link : https://github.com/bonigarcia/webdrivermanager
 
  How  web driver manager works?
 
		1. Web driver manager checks the browser version installed on your machine
		2. Finds the matching web driver as per our browser version
		3. Checks if the driver is already present in our system
		4. If yes, it does nothing, if not it downloads and sets the environmental path

*/