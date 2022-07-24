package org.waits;

import java.io.File;	
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait2 
{
	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://omrbranch.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	WebElement btn1 = driver.findElement(By.xpath("//a[text()='Sign up']"));
	btn1.click();
	/*WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name*']"));
	txtFirstName.sendKeys("Suhana");
	WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name*']"));
	txtLastName.sendKeys("Shaik");*/
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	File source=screenshot.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\screenshot\\sinup.png");
	FileUtils.copyFile(source,dest);
}
}
