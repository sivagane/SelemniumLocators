package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.instagram.com/accounts/login/?h1=en)login page");
	d.manage().window().maximize();
	
	WebElement user=d.findElement(By.name("username"));
	user.sendKeys("9750364952");
	
	WebElement pass=d.findElement(By.name("password"));
	pass.sendKeys("08091990");
	
	WebElement btn=d.findElement(By.xpath("//button[@type='submit']"));        
	btn.click();	
}
}
