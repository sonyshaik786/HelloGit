package org.whandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH1
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("iphone",Keys.ENTER);
	WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - Black']"));
	iphone.click();
	String pwId = driver.getWindowHandle();
	System.out.println("paret window id:"+pwId);
	Set<String> allwIds = driver.getWindowHandles();
	System.out.println(allwIds);
	List<String> l=new ArrayList<>();
	l.addAll(allwIds);
	driver.switchTo().window(l.get(1));
	WebElement btnAddcart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	btnAddcart.click();
}
}