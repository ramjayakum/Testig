package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;

	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement element, String name ) {
		element.sendKeys(name);
	}
	
	public static void loginbutton(WebElement element) {
		element.click();
	}
	
	public static void winmax() {
		driver.manage().window().maximize();
		
	}
	
	public static void Attri(WebElement element,String name) {
		element.getAttribute("value");
	}
	
	

}
