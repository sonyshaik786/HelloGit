package com.brokenlinkimg;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
List<WebElement> allLinks = driver.findElements(By.tagName("a"));
int count = allLinks.size();
System.out.println(count);
for(WebElement links:allLinks)
{
	String attribute = links.getAttribute("href");
	//System.out.println(attribute);
	if(attribute!=null)
	{
		URL url=new URL(attribute);
	URLConnection open=url.openConnection();
	HttpsURLConnection http=(HttpsURLConnection) open;
	int responseCode = http.getResponseCode();
	if(responseCode>=400)
	{
		System.out.println(attribute);
	}	
	}	
}
}
}
