package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		
		//setup the driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiyagu\\eclipse-workspace\\Project06Mar\\Driver\\chromedriver.exe");
		
		//Launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		//go to the URL
		
		driver.get("https://www.facebook.com/");
		
		//maximize
		
		driver.manage().window().maximize();
		
		//find the element
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Text12345");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123456789");
		
		WebElement bttnLogin = driver.findElement(By.name("login"));
		bttnLogin.click();
		
		
		
		
		
		
		
		
		 
		
	}
	
	
	
	

}
