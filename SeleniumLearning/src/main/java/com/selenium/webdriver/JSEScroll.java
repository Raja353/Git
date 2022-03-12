package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEScroll {
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.iciciprulife.com/");
		driver.manage().window().maximize();
		//WebElement button = driver.findElement(By.xpath("//div[text()='Complete protection for your family through ']//following::a[1]"));
		//h2[text()='People also viewed']
		WebElement button = driver.findElement(By.xpath("//h2[text()='People also viewed']"));
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].scrollIntoView(false);", button);
		//jse.executeScript("window.scrollBy(0,350)", "");
		
		
		Thread.sleep(3000);
		//button.click();
		
	}

}
