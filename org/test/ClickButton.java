package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButton {

	//public static void main(String[] args) throws InterruptedException {
		public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to the login page
	            driver.get("https://uatapp.banyanpro.com");

	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Find the email/user id field and input value
	            WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email or User id']"));
	            emailField.sendKeys("your_email@example.com");

	            // Find the password field and input value
	            WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	            passwordField.sendKeys("your_password");

	            // Find the Sign In button and click it
	            WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
	            signInButton.click();

	            // Optional: Verify successful login or capture any error messages

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}
