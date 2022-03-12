package com.selenium.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Explicit wait
		List<WebElement> btn;
		btn =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='btn']")));
		WebElement btntxt = driver.findElement(By.xpath("//button[@id='btn']/b"));
//		btntxtyj.click();             
		String gettext1 = btntxt.getText();
		System.out.println(gettext1);
	
		
		
		

	}

}
