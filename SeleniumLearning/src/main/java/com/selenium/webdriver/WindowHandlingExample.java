package com.selenium.webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		String parent_window = driver.getWindowHandle();
		System.out.println("parent window:"+parent_window);
		driver.findElement(By.xpath("//a[text()='SeleniumTutorial']")).click();
		Set<String> all_window = driver.getWindowHandles();
		
		System.out.println("Children windows");
		for(String handles:all_window)
		{
			if(!(parent_window.equals(handles)))
			{
				driver.switchTo().window(handles);
				System.out.println(handles);
			}
			
		}
		driver.switchTo().window(parent_window);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		System.out.println("Sessions saved in List");
		
		List<String> sessions = new ArrayList<String>(driver.getWindowHandles());
		//List<String> session1= (ArrayList<String>) driver.getWindowHandles();
		driver.switchTo().window(sessions.get(0));
		System.out.println("session id"+sessions.get(0));
			
		System.out.println(driver.getTitle());
		driver.switchTo().window(sessions.get(1));
		System.out.println(driver.getTitle());
		System.out.println(sessions.size());
		
		
		
}

}
