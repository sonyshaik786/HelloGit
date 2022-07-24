package org.hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinNormal 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
	

	WebElement txtName=driver.findElement(By.id("username"));
	txtName.sendKeys("sonyshaik786");

	WebElement txtPass=driver.findElement(By.id("password"));
	txtPass.sendKeys("shaikrsr");

	WebElement txtLogin=driver.findElement(By.id("login"));
	txtLogin.click();

	WebElement location = driver.findElement(By.id("location"));

	Select select = new Select(location);
	select.selectByIndex(5);

	WebElement Hotels = driver.findElement(By.id("hotels"));

	Select selecthotel = new Select(Hotels);
	selecthotel.selectByIndex(3);

	WebElement roomType = driver.findElement(By.id("room_type"));

	Select selectType = new Select(roomType);
	selectType.selectByIndex(2);

	WebElement numRoom = driver.findElement(By.id("room_nos"));

	Select selectNumRoom = new Select(numRoom);
	selectNumRoom.selectByIndex(2);

	WebElement adultsRoom = driver.findElement(By.id("adult_room"));

	Select selectAdultsRoom = new Select(adultsRoom);
	selectAdultsRoom.selectByIndex(3);

	WebElement childRoom = driver.findElement(By.id("child_room"));

	Select selectChildRoom = new Select(childRoom);
	selectChildRoom.selectByIndex(2);

	WebElement submit= driver.findElement(By.id("Submit"));

	submit.click();

	WebElement radioButton= driver.findElement(By.id("radiobutton_0"));

	radioButton.click();

	WebElement clickContinue= driver.findElement(By.id("continue"));

	clickContinue.click();
	

	WebElement txtUserName= driver.findElement(By.id("first_name"));

	txtUserName.sendKeys("Banupriya");

	WebElement txtPassword= driver.findElement(By.id("last_name"));

	txtPassword.sendKeys("Sakthi");

	WebElement txtAddress= driver.findElement(By.id("address"));

	txtAddress.sendKeys("Omalur,Salem");


	WebElement ccType = driver.findElement(By.id("cc_type"));

	Select  creditcard= new Select(ccType);
	creditcard.selectByIndex(2);

	WebElement ccNum = driver.findElement(By.id("cc_num"));

	ccNum.sendKeys("31294372575847448");

	WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));

	Select  creditCardMonth= new Select(ccExpMonth);
	creditCardMonth.selectByIndex(8);

	WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));

	Select  creditCardYear= new Select(ccExpYear);
	creditCardYear.selectByIndex(8);

	WebElement ccV = driver.findElement(By.id("cc_cvv"));


	ccV.sendKeys("355");

	WebElement clckButton = driver.findElement(By.id("book_now"));

	clckButton.click();
}
}
