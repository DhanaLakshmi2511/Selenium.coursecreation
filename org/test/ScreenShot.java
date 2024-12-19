package org.test;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		File AD=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(AD, new File("E:\\Dhanam - Official\\pic\\screenshot.jpg"));
		
		driver.quit();
	}

}
