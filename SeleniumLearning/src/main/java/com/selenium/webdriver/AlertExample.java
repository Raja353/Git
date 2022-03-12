package com.selenium.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/alerts");
    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
    //We have to move the driver focus to that particular alert.
    //If you want to 
    Alert simplealrt,cnfrmalrt,prmptalrt;
    //For switching the driver focus to alert, we have switchTo().alert()
    //We need to assign the particular alert to the created alert instance so that we can perform some operations on the alert.
    simplealrt = driver.switchTo().alert();
    Thread.sleep(3000);
    simplealrt.accept();
    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
    cnfrmalrt = driver.switchTo().alert();
    Thread.sleep(3000);
    cnfrmalrt.dismiss();
     WebElement bttn = driver.findElement(By.xpath("//button[@id='promtButton']"));
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    Thread.sleep(3000);
    jse.executeScript("arguments[0].click();",bttn);
    prmptalrt = driver.switchTo().alert();
    Thread.sleep(3000);
    prmptalrt.sendKeys("Rajasekar");
   
    //prmptalrt.accept();
    Thread.sleep(3000);

    
    
    
	}

}
