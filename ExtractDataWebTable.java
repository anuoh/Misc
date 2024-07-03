package com.demoqa.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtractDataWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/tables ");
		driver.manage().window().maximize();
		List<WebElement> tableSel=driver.findElements(By.xpath("//table[@id='table1']"));
		//WebDriverWait wait = new WebDriverWait(driver,30);
		
		//2.To get no.of rows:
		List<WebElement> allRowEle=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println(allRowEle.size());
		int rowsize=allRowEle.size();
		//3.To get no.of col:
		List<WebElement> allColEle=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));
		System.out.println(allColEle.size());	
		int colsize=allColEle.size();
		//4.iterate using for loop...||store allRowEle in vari-rowsize || store allColEle in colsize
for(int i=0;i<=rowsize;i++){
	for(int j=0;j<=colsize;j++) {
		
		WebElement aa=driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]"));
		System.out.println(aa.getText());
	}

}

}}