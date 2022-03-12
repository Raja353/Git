package com.selenium.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/upload.html");
		WebElement click = driver.findElement(By.xpath("//input[@name='filename']"));
		Actions action = new Actions(driver);
		action.moveToElement(click).click().build().perform();
		Robot robt = new Robot();
		//robt.keyPress(KeyEvent.VK_PERIOD);
		robt.keyPress(KeyEvent.VK_G);
		robt.keyPress(KeyEvent.VK_I);
		robt.keyPress(KeyEvent.VK_T);
		robt.keyPress(KeyEvent.VK_PERIOD);
		robt.keyPress(KeyEvent.VK_T);
		robt.keyPress(KeyEvent.VK_X);
		robt.keyPress(KeyEvent.VK_T);
		robt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		//robt.keyRelease(KeyEvent.VK_M);
		driver.quit();
		
		
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
