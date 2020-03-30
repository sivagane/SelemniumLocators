package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.swiggy.com/");
	
	d.manage().window().maximize();
	
	WebElement name =d.findElement(By.name("location"));
	name.sendKeys("No83, Ambalathadaiyar Madam Streeet, Pudhucherry-605001");
	
	d.findElement(By.xpath("//span[text()='FIND FOOD']")).click();
}
}
