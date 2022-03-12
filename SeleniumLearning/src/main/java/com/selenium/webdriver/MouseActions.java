package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class= 'demo-frame']"));
		
		driver.switchTo().frame(frame1);
		WebElement source = driver.findElement(By.xpath("//div[@id= 'draggable']"));
		WebElement Dest = driver.findElement(By.xpath("//div[@id= 'droppable']"));
		//
	    Actions action = new Actions(driver);
	    //action.clickAndHold(source).moveToElement(Dest).release().build().perform();
	    //action.dragAndDrop(source, Dest).build().perform();
	    System.out.println(Dest.getSize());
	    action.dragAndDropBy(source, 150, 18).build().perform();
	    //action.dragAndDropBy(source,168,168).build().perform();
	   
		
	    

	}

}
