package com.demoqa.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//switching to iframe
	WebElement 	frame1=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
	driver.switchTo().frame(frame1);
	
	//switching to Interview tab inside a iframe
	driver.findElement(By.linkText("INTERVIEW")).click();
	
		//driver.quit();

	}

}
