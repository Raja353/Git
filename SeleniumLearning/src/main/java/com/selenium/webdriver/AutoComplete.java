package com.selenium.webdriver;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Lists;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ChromeOptions copt = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("//input[@id='tags']"));
		click.sendKeys("s");
		Thread.sleep(4000);
		java.util.List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(options.size());
		for (WebElement webElement : options) {
		 if(webElement.getText().equals("Web Services"))
		 {
			 webElement.click();
			 break;
		 }
			
		}
		

	}

}
