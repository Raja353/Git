package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.iciciprulife.com/");
		//WebElement link = driver.findElement(By.xpath("//div[text()='Guide to Healthy Living for Indian Women']//following-sibling::span"));
		//System.out.println(link.getText());
		
		//li//span[text()='Library']
		WebElement link = driver.findElement(By.xpath("//li//span[text()='Library']"));
		link.click();
	}

}
