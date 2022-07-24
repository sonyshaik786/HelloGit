package org.hello;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robots
{
public static void main(String[] args) throws AWTException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAIK\\eclipse-workspace\\HelloWorld\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_H);
	robot.keyRelease(KeyEvent.VK_H);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_T);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_K);
	robot.keyRelease(KeyEvent.VK_K);
	
}
}
