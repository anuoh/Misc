package com.demoqa.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CountColNRows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//To find rows://tr
		java.util.List<WebElement> rows=driver.findElements(By.xpath(" //table[@id='table1']//tr"));
		System.out.println("Rows are:" +rows.size());
		
		
		//To find cols://th
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println("Cols are:" +cols.size());
	}

}
