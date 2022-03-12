package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		try
		{
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		WebElement tip =  driver.findElement(By.xpath("//input[@id='age']"));
		//tip.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", tip);
		Actions action = new Actions(driver);
		Thread.sleep(4000);
		action.moveToElement(tip).build().perform();
		Thread.sleep(4000);
		String expcted_tiptext="We ask for your age only for statistical purposes.";
		String String_1 = tip.getAttribute("title");
		System.out.println(String_1);
		if(String_1.equals(expcted_tiptext))
		{
			System.out.println("The text is matching: "+String_1);
		}
		else
			
		{
			System.out.println("The text is not matching");
		}
		
		Thread.sleep(3000);
		
	

	}
		
		finally
		{
			driver.quit();
		}
		
	

	

}
}
