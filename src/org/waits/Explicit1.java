package org.waits;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit1 
{
	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");

	WebElement btnclickme1 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	btnclickme1.click();
	WebDriverWait driverWait=new WebDriverWait(driver,Duration.ofSeconds(30));
	driverWait.until(ExpectedConditions.alertIsPresent());
	//Alert al=driver.switchTo().alert();
	//al.accept();
}
}