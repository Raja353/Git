package com.selenium.webdriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame1);
		driver.switchTo().frame("frame2");
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='Click1']")).click();

	}

}
