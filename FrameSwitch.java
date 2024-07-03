package com.Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//div[@class='nWQGrd zwllIb'][2]    
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//switching to frame1 and sending ttext -anupam
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("anupam");
		
		//switching to web page i.e coming out of frame
		driver.switchTo().defaultContent();
		
		//switching to frame3 and clicking on radiobutton:
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
		System.out.println("entered in an iframe-3");
		
		//Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("/ //div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();	
	/* WebElement radioButton=	driver.findElement(By.xpath(" (//div[@class='AB7Lab Id5V1'])[2]"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", radioButton);
	*/
	
	//	driver.close();
		
	}

}
