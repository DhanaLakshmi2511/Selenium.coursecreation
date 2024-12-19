package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class RandomCharacterTest {
    public static void main(String[] args) {
        // Set up WebDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to a test page
            driver.get("https://example.com");
            
            // Generate a random character
            char randomChar = getRandomCharacter();
            System.out.println("Generated Random Character: " + randomChar);
            
            // Example: Locate a text input and enter the random character
            WebElement inputField = driver.findElement(By.id("exampleInputField"));
            inputField.sendKeys(String.valueOf(randomChar));
            
            // Perform further actions (e.g., submit form, validate results, etc.)
        } finally {
            // Close the browser
           // driver.quit();
        }
    }

    // Method to generate a random character
    public static char getRandomCharacter() {
        Random random = new Random();
        // Generate a random character between 'a' and 'z'
        return (char) (random.nextInt(26) + 'a');
    }
}


//public class RandomCharacterTest {

