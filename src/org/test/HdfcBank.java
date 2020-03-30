package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://netbanking.hdfcbank.com/");
	Thread.sleep(3000);
	WebElement id=d.findElement(By.xpath("//span[@class='pwd_field']"));
	id.sendKeys("08091990");
	
	d.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
	
}
}
