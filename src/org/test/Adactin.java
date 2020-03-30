package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.adactin.com/HotelApp");
	d.manage().window().maximize();
	
	WebElement user=d.findElement(By.id("username"));
     user.sendKeys("sivag918@gmail.com");
     
     WebElement pass=d.findElement(By.id("password"));
     pass.sendKeys("08091990");
     
     WebElement btn=d.findElement(By.id("login"));
     btn.click();
     
}
}
