
// RADIOBUTTON

package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Emailbox = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		Emailbox.sendKeys("dhanam2023");
		
		//WebElement radioButton=driver.findElement(By.name("radioButton"));
		//radioButton.click();
		System.out.println("Current URL: " + driver.getCurrentUrl());
		driver.quit();
	}

}
