package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
       String url = getconfiguData("Url");
        driver.get(url);
        driver.manage().window().maximize();
        
         System.out.println("Page title is: " + driver.getTitle());
       // driver.quit();
    }

 public static String getconfiguData(String propertyName) throws IOException 
 {
	 Properties prob = new Properties();
	 
	File file = new File("config.properties");
	
	FileInputStream filInp = new FileInputStream(file);
	
	prob.load(filInp);
	
	String probValue = prob.getProperty(propertyName);
	 
	return probValue;
 }
 
}
	 





















