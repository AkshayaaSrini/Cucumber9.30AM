package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static WebElement e;
	
	public static void launch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
//		return driver;
		
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	
	public static void url(String url) {
		driver.get(url);

	}
	
	public static void fill(WebElement e, String text) {
		e.sendKeys(text);
		
	}
	
	public static void btnClick(WebElement e) {
		e.click();
		
	}
	
}