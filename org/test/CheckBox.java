
//CheckBox

	package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement CheckBox= driver.findElement(By.id("checkBoxOption1"));
		CheckBox.click();
		System.out.println("Current URL: " + driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		}
}

