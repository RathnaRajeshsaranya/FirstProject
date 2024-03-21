package org.pom;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class login extends Baseclass
{
	

public static	WebDriver driver;
 public static void main(String[] args) {
	
}
   public static void browserlaunch(String url) {
	   
	   browserlaunch("https://en-gb.facebook.com/");
	   WebElement userName = findelementid("email");
	   userName.sendKeys("anand");
	   findelementid("pass").sendKeys("anand@123");
	   driver.navigate().refresh();
	   userName.sendKeys("Hello");
	   
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	
	}
    public static WebElement findElementbrowserlaunch(String launch) {
    	WebElement elementClass = driver.findElement(By.className(launch));
		return elementClass;
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

   
      public static WebElement findelementid (String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
		
      }
      public void sendvalues(WebElement element,String data) {
		element.sendKeys(data);
	}
		
		
		
		
		
				 
		
	}

	
		
	  
	
		
	


	


