package com.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	
		WebDriver  driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.switchTo().frame(driver.findElement(By.xpath(" //iframe[@class='demo-frame']")));
		
		//using xpath locate the element:
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//using css selector locate the element: syntax->.classname
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		//driver.findElement(By.id("draggable")).click();
		Actions ac =new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(source, target).build().perform();
driver.close();
}
}