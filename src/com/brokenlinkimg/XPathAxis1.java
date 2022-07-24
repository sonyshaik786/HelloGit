package com.brokenlinkimg;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxis1
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		/*WebElement txtMobileNo = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtMobileNo.sendKeys("9025994066");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtPassword.sendKeys("ZAK143RESHMA");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btnLogin.click();*/
		WebElement txtProductname = driver.findElement(By.xpath("//input[@name='q']"));
		txtProductname.sendKeys("iphone 13");
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnSearch.click();
		/*List<WebElement> price=driver.findElements(By.xpath("//div[contains(text(),'71')]//parent::div");
		String text=price.get(0).getText();
		System.out.println(text);*/
		
		
		
		////div[contains(text(),'APPLE')]//parent::div//following_sibling:://div[contains(text(),'71')]
		////div[contains(text(),'71')]/descedent::div[contains(text(),'APPLE')]
		
		
		

}
}