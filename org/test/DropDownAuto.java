package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAuto {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		  WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		  Select select = new Select(dropdown);
          select.selectByIndex(2);
          //select.
          System.out.println("Current URL: " + driver.getCurrentUrl());
	}

}
