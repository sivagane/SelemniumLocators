package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.irctc.co.in/");
	d.manage().window().maximize();
	
	WebElement from=d.findElement(By.xpath("//input[@placeholder='From*']"));
    from.sendKeys("Pudhucherry");
    
  WebElement to=d.findElement(By.xpath("//input[@placeholder='To*']"));
   to.sendKeys("Villupuram");
   
}
}