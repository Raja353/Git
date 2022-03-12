package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathexamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		//driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(3000);
		//WebElement test = driver.findElement(By.xpath("//a[@data-action='sign in']"));
		//test.click();
		//WebElement frgt_link = driver.findElement(By.xpath("//button[text()='Forgot email?']"));
		//frgt_link.click();
		
		WebElement forwrk = driver.findElement(By.xpath("//a[starts-with(@data-category,'cta') and @data-action='for work' and @data-label='header']"));
		forwrk.click();
		
	
		//WebElement 
		
		

	}

}
