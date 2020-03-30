package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.snapdeal.com/login");
	d.manage().window().maximize();
	
	WebElement user=d.findElement(By.className("col-xs-24"));
	user.sendKeys("9750364952");
	
	WebElement btn=d.findElement(By.id("checkUser"));
	btn.click();
}
}
