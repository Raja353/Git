package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//1.clear() - If the element is text entry element then it will clear it.
		WebElement clearme = driver.findElement(By.name("username"));
		clearme.clear();
		
		//2. getAttribute() To pull the value stored in the backend at the particular attribute.
		String attr = clearme.getAttribute("name");
		System.out.println(attr.length());
		
		//3. getSize() - Returns size(Height and Width) of the rendered element.)
		System.out.println(clearme.getSize());
		
		
		
		

	}
	

}
