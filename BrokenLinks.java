package com.Day3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
	List<WebElement> links	=(List<WebElement>) driver.findElements(By.tagName("a"));
	System.out.println("No. of links present" +links.size());
	
	//to print all the links:
	
	/*for(int i=0; i<links.size(); i++) {
		System.out.println(links.get(i).getText());
		System.out.println(links.get(i).getAttribute("href"));*/
	
	//to print broken links:
	int brokenLinks=0;
	for(WebElement ele:links)
	{String url= ele.getAttribute("href");
	if(url==null || url.isEmpty())
	{
		System.out.println("URL is empty");
		continue;
	}
	URL link = new URL(url);
	try {
		HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
		httpconn.connect();
		if(httpconn.getResponseCode()>400)
		{System.out.println(httpconn.getResponseCode()+url+"is "+"  Broken Link");
		brokenLinks++;
		}
		else {
			System.out.println(httpconn.getResponseCode()+url+"is "+"  Valid Link");
			
		}
	} catch (Exception e) {

	}
	
	}
	System.out.println("no.of broken links:" +brokenLinks);
	driver.quit();
	}
	}


