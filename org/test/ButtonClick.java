package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClick {

	private static String parentTabHandle;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		 WebElement button = driver.findElement(By.tagName("button")); // Replace with the actual button ID
         button.click();
         driver.close();
      driver.switchTo().window(parentTabHandle);
		

	}

}
