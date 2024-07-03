
package com.Day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("selenium143")).click();
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> winIds=driver.getWindowHandles();
		for(String winId:winIds) {
			driver.switchTo().window(winId);
			try {
			 String text=driver.findElement(By.xpath("/html/body/div/h3")).getText();
			System.out.println(text);
			driver.quit();
			break;
			
		}catch(NoSuchElementException e) {
			driver.close();
	}

}}}
