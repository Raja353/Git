package com.selenium.webdriver;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/Dropdown.html");
	  WebElement drpdwn1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
	  WebElement drpdwn2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
	  WebElement drpdwn3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
	Select index = new Select(drpdwn1);
	index.selectByIndex(1);
	Select value = new Select(drpdwn2);
	value.selectByValue("2");
	Select vistext = new Select(drpdwn3);
	vistext.selectByVisibleText("Appium");
	java.util.List<WebElement> count = driver.findElements(By.xpath("//select[@id='dropdown3']/option"));
	System.out.println("The size is "+ count.size());
	for (WebElement webElement : count) {
		System.out.println(webElement.getText());
		
	}
	
	  
	 
	}

}
