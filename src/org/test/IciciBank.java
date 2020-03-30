package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement userBtn = d.findElement(By.xpath("//img[@class='goahead']"));
    userBtn.click();
    Thread.sleep(3000);
    WebElement User1 = d.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']"));
    User1.sendKeys("sivaabi");
    WebElement pass=d.findElement(By.xpath("//input[@class='login-input-password']"));
    pass.sendKeys("08091990");

    WebElement btn=d.findElement(By.xpath("//input[@class='cta']"));
    btn.click();
}
}
