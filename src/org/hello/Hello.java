package org.hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello 
{
	public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	driver.quit();
}
}
