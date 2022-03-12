package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://jqueryui.com/slider/");
     WebElement frame1= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
     driver.switchTo().frame(frame1);
     WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider')]"));
     Actions action = new Actions(driver);
     int size = slider.getSize().width;
     
     action.clickAndHold(slider).moveByOffset(size+100, 0).release(slider).build().perform();
    // slider.click();
     
     
	}

}
