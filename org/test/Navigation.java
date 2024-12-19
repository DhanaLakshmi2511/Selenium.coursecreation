package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement radioButton=driver.findElement(By.name("radioButton"));
		radioButton.click();
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		WebElement usernameField = driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
        //WebElement passwordField = driver.findElement(By.name("password"));
        usernameField.sendKeys("Dhanamuruga2002");
       // passwordField.sendKeys("Dhanamilk");
		Thread.sleep(5000);
		driver.navigate().back();
		}

}
