package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     driver.get("https://login.yahoo.com/");
     
     //1.Id: - Unique
    	 
   WebElement id_ex = driver.findElement(By.id("login-username"));
   id_ex.sendKeys("raja");
   driver.findElement(By.id("login-username")).sendKeys("Raja");
    
    //2.Name - Unique
    
  //  WebElement name_ex = driver.findElement(By.name("signin"));
   // name_ex.click();
    
    //3.cssselector
    
   // WebElement css_ex = driver.findElement(By.cssSelector("login-username"));
   // css_ex.sendKeys("Raja");
    //driver.findElement(By.cssSelector("#login-username")).sendKeys("Raja");
    
    //4.linktext
    
    //WebElement link_ex = driver.findElement(By.linkText("Forgot username?"));
    //link_ex.click();
    
    //5.Partial link text
    
  
//    WebElement link_ex = driver.findElement(By.partialLinkText("Forgot"));
//    link_ex.click();
     
     //6. class - IT COULD NOT BE UNIQUE.
     
     WebElement class_ex = driver.findElement(By.className("phone-no"));
     class_ex.sendKeys("Rajasekar");
     
     
     

    
    
    
    
    
    
    
    
    
    
    
    
     
	}

}
