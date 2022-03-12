package com.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int count = 0;
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> elmnts = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		//To find the column number
		String Column = "Country";
		
		for (WebElement webElement : elmnts) {
			count++;
			if(webElement.getText().equalsIgnoreCase(Column))
			{
				
				break;
			}
			
			
		}

		System.out.println("The column count is: "+count);
		
		String ctrytofnd = "UK";
		
//		List<WebElement> fnd = driver.findElements(By.xpath("//table[@id='customers']//tr//following-sibling::tr/td"));
	WebElement fnd1 = driver.findElement(By.xpath("//td[text()='"+ctrytofnd+"']/parent::tr/td["+count+"]"));
//		for (WebElement webElement : fnd) {
//			
//			if(webElement.getText().equalsIgnoreCase(ctrytofnd))
//			{
//				System.out.println("Country is found");
//			}
//			
			
			
//		}
	System.out.println("The country name is "+ fnd1.getText());

	}

}
