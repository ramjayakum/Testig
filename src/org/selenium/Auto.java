package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auto {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\Selenium\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	   // Thread.sleep(5000);
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    
	   WebElement twoman= driver.findElement(By.xpath("//a[text()='Women']"));
	   
	   Actions ac=new Actions(driver);
	   
	   ac.moveToElement(twoman).perform();
	   
	   WebElement tshirt= driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
			   tshirt.click();
			   WebDriverWait w=new WebDriverWait(driver,100);
			   WebElement down=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='available-now']")));
			   //Thread.sleep(3000);
			 //  WebElement down=driver.findElement(By.xpath("//span[@class='available-now']"));
			   js.executeScript("arguments[0].scrollIntoView(true)", down);
			  
			   WebElement image=  driver.findElement(By.xpath("//div[@class='right-block']"));
			   ac.moveToElement(image).perform();
			   WebElement addtocart=  driver.findElement(By.xpath("//span[text()='Add to cart']"));
			   addtocart.click();
			   Wait w1=new FluentWait(driver)
			   .withTimeout(50,TimeUnit.SECONDS)
			   .pollingEvery(10,TimeUnit.MILLISECONDS)
			   .ignoring(Exception.class);
			   //Thread.sleep(5000);
			   driver.quit();
			   
	    
	}

}
