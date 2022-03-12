package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;


public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver(); //creating object for firefox with reference of webdriver interface.
     driver.navigate().to("https://www.google.co.in/");
      WebElement chk_nav = driver.findElement(By.name("q"));
      
      
 /* Navigate example */
      
      chk_nav.sendKeys("Raja");
      chk_nav.sendKeys(Keys.ENTER);
      //chk_nav.click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      driver.navigate().forward();
      
 /* getclass() */
      
      System.out.println(driver.getClass());
  String str = "Rajasekar";
 System.out.println(str.getClass());
 
 /* getCurrentUrl() - Returns url of the page currently loaded into the browser*/
 
 String currurl = driver.getCurrentUrl();
 System.out.println(currurl);
 
 /* getPageSource - Returns source of the current page. */
 
// String pgsource = driver.getPageSource();
 //System.out.println(pgsource);  
      
 
/* getTitle - Returns title of the current page. */
 String gettitle=driver.getTitle();
 System.out.println(gettitle);
 
/*toString - Returns string representation of the object. */
 
 System.out.println(driver.toString());
 System.out.println(driver);
 
 //driver.quit();
 driver.close();
 
 WebDriver driver1= new FirefoxDriver();
 driver1.get("http://www.leafground.com/pages/Dropdown.html");
 WebElement drp1 = driver1.findElement(By.id("dropdown1"));
 
 drp1.click();
 //driver1
 driver1.findElements(null);
 
 
 
 
 
 
	}

}
