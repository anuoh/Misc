package com.demoqa.automation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice ");
		driver.manage().window().maximize();
		WebElement wt = driver.findElement(By.id("product"));
		
		//get table headings
	List<WebElement> tableHeading	=wt.findElements(By.xpath("//th"));
	List<String> texts = new ArrayList<String>();
	for( WebElement heading:tableHeading)
		{
		 String text=heading.getText();
		 texts.add(text);
	}
			
	
String ColName="Price";
int colIndex=texts.indexOf(ColName);
	List<WebElement> colDatas=wt.findElements(By.xpath("//td["+(colIndex+1)+"]"));
	for( WebElement colData:colDatas)
	{
		System.out.println(colData.getText());
}
	driver.quit();
}}