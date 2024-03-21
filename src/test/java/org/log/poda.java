package org.log;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.Baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class poda extends Baseclass{


	
	 static	WebDriver driver;
	 
	public static void browserlaunch(String url) {
	
		
		   WebDriverManager.chromiumdriver().setup();
		   driver = new ChromeDriver();
		   driver.get(url);
		   driver.manage().window().maximize();   
	   }
		  public static WebElement findElementName(String Name) {
			  WebElement elementClass = driver.findElement(By.id(Name));
			return elementClass;
		   
		  }
		  
		  public WebElement findElementClass(String className) {
			  WebElement elementClass = driver.findElement(By.className(className));
			return elementClass;
		  }
		  
		  public WebElement findElementXpath(String xpath) {
			  WebElement elementXpath = driver.findElement(By.xpath(xpath));
			return elementXpath;
		  }
		  
		  public static void sendValues(WebElement element,String data) {
			  element.sendKeys(data);
		  }
		  public String geTitle() {
	      String title = driver .getTitle();
	       return title;
	       
	       
	       
	       
}
}