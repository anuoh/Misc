package com.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
WebElement frame1=	driver.findElement(By.xpath("//iframe[@class='demo-frame']"))	;
driver.switchTo().frame(frame1);
		
System.out.println("entered in an iframe");
WebElement slider=driver.findElement(By.xpath("//*[@id=\"green\"]/span"))	;



		Actions ac =new Actions(driver);
		ac.dragAndDropBy(slider, 100, 130).perform();

	}

}
