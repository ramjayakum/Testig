package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstDay {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");

		//driver.manage().window().maximize();
		
		//Thread.sleep(2000);

		WebElement tsin = driver.findElement(By.id("departmentsFlyout"));
		
		Actions value=new Actions(driver);
		
		value.moveToElement(tsin).perform();
		
		
/*		tsin.sendKeys("Ramjayakumar14@gmail.com");
		String user = tsin.getAttribute("value");
		System.out.println(user);
		
		
		WebElement tsin1 = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		tsin1.sendKeys("venchandra");
		String user1 = tsin1.getAttribute("value");
		System.out.println(user1);
		
		WebElement tsi = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		tsi.click();
		
		Thread.sleep(3000);
		WebElement tsin2 = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
		
		tsin2.click();
		
		WebElement tsin3 = driver.findElement(By.xpath("(//a[@class='_3ko_Ud']"));
		
		tsin3.click();
		
		
		
		
		
		/*WebElement tsin1 = driver.findElement(By.xpath("(//div[@id='add-cart-button-id']"));
		Thread.sleep(4000);
		tsin1.click(); */
		 
		
		
		
			}

}
