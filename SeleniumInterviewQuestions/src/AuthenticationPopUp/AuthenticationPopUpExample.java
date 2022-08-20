package AuthenticationPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@url.com //Sending credentials via URL
		// We can use 3rd party tools like Sikuli,AutoIt
	}

}
