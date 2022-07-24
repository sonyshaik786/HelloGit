package org.waits;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit2
{
	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement btnclickme1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btnclickme1.click();
	WebDriverWait driverWait=new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement until=driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First name']")));
	until.sendKeys("welcome all");
}
}