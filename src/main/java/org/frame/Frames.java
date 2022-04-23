package org.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame(0);
	driver.findElement(By.name("fldLoginUserId")).sendKeys("1234445655");
	driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
	String l = driver.getCurrentUrl();
	System.out.println(l);

	
	}

}
