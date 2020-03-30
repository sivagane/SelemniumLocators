package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.redbus.in/");
	d.manage().window().maximize();
	
 WebElement from=d.findElement(By.id("src"));
 from.sendKeys("Pudhucherry");
 
 WebElement to=d.findElement(By.id("dest"));
 to.sendKeys("Cuddalore");
 
 WebElement btn=d.findElement(By.id("search_btn"));
 btn.click();
}
}
