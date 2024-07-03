package com.Day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class SubmitDetails {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		WebElement username= driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		//Thread.sleep(5000);
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		//Thread.sleep(5000);
		WebElement loginButton= driver.findElement(By.tagName("button"));
		loginButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement name= driver.findElement(By.id("name"));
				name.sendKeys("aana");
			
		WebElement fname= driver.findElement(By.id("lname"));
				fname.sendKeys("john");
		
		WebElement postaladdr= driver.findElement(By.id("postaladdress"));
				postaladdr.sendKeys("23045");
		
		WebElement personaladdr= driver.findElement(By.id("personaladdress"));
				personaladdr.sendKeys("xyz");		
			
		WebElement femaleRadioButton = driver.findElement(By.id("radiobut"));	
				if(!femaleRadioButton.isSelected()) {
					femaleRadioButton.click();
					System.out.println("female radio button is selected");
					}
				else {
					System.out.println("female radio button is not selected");}
		WebElement cityDropDown= driver.findElement(By.id("city"));
		Select se=new Select(cityDropDown);
		se.selectByVisibleText("GOA");
		//se.selectByIndex(1);
		
		WebElement courseDropDown= driver.findElement(By.id("course"));
		Select se1=new Select(courseDropDown);
		se1.selectByVisibleText("MCA");
		
		WebElement districtDropDown= driver.findElement(By.id("district"));
		Select se2=new Select(districtDropDown);
		se2.selectByIndex(2);
		
		WebElement stateDropDown= driver.findElement(By.id("state"));
		Select se3=new Select(stateDropDown);
		se3.selectByIndex(2);
		
		WebElement pin= driver.findElement(By.id("pincode"));
		pin.sendKeys("1234");
		
		WebElement email= driver.findElement(By.id("emailid"));
		email.sendKeys("abc@tekarch.com");
		
		WebElement submitButton= driver.findElement(By.className("bootbutton"));
		submitButton.click();
	
	}
	}
