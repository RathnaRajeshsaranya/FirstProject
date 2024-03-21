package org.pom;





import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;






public class Baseclass  {
	

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Acer\\Downloads\\chromedriver_win32\\chromedriver.exe"
				);
		
		WebDriver d = new ChromeDriver();
		
	    
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		
		TakesScreenshot screenshot = (TakesScreenshot) d;
		File s1 = screenshot.getScreenshotAs(OutputType.FILE);
		File s2 = new File("C:\\Users\\Acer\\Pictures\\Saved Pictures");
		FileHandler.copy(s1, s2);
		 }
}


