package org.test;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CourseCreation {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://uatapp.banyanpro.com/");
			driver.manage().window().maximize();


			WebElement usernameField = driver.findElement(By.id("email"));
			WebElement passwordField = driver.findElement(By.id("Passwordtxt"));

			usernameField.sendKeys("dhanamuruga2002@gmail.com");
			passwordField.sendKeys("Welcome@2023");

			WebElement loginButton = driver.findElement(By.id("save_post"));
			loginButton.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			WebElement  Solutiondesigner= driver.findElement(By.xpath("//span[@class=\"d-b mx-auto SolutionDesigner\"]"));

			Solutiondesigner.click();

			WebElement Course = driver.findElement(By.xpath("//span[@title=\"Courses\"]"));
			Course.click();

			WebElement NewCourse = driver.findElement(By.xpath("//button[@ng-click=\"CreateCourse()\"]"));
			NewCourse.click();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//char rendomchar = getRandomCharacter();
			 

			WebElement Namefield = driver.findElement(By.xpath("//input[@id=\"CourseName\"]"));
			
			String userInput = "Polymorphism";
			
			String randomChars = generateRandomCharacters(3);
			
			String finalInput = userInput+ randomChars;

			//Namefield.sendKeys(String.valueOf(rendomchar));
			Namefield.sendKeys(finalInput);

			WebElement Author = driver.findElement(By.id("Author"));
			Author.sendKeys("Dhanalakshmi,Mca");

			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(5000);

			driver.switchTo().frame(0);

			WebElement Description = driver.findElement(By.xpath("//*[@data-cke-title=\"Rich Text Editor, description1\"]/../../../html/body/p"));
			Description.sendKeys("Java is a popular, high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle) in the mid-1990s. It is designed to be platform-independent, meaning code written in Java can run on different types of computers without modification, thanks to the Java Virtual Machine (JVM).");

			driver.switchTo().defaultContent();


			driver.switchTo().frame(1);


			WebElement Purpose = driver.findElement(By.xpath("//*[@data-cke-title=\"Rich Text Editor, Purpose\"]/../../../html/body/p"));
			Purpose.sendKeys("Object-Oriented Programming (OOP) in Java is a programming paradigm that organizes software design around data, or objects, rather than functions and logic. ");

			driver.switchTo().defaultContent();

			WebElement Checkbox = driver.findElement(By.id("courseasdefault"));
			Checkbox.click();

			WebElement Checkbox2 = driver.findElement(By.id("checkbox2"));
			Checkbox2.click();

			WebElement submit = driver.findElement(By.xpath("//button[@class=\"btn btn--primary ng-binding ng-scope\"]"));
			submit.click();

			WebElement AddTopic = driver.findElement(By.id("AddTopic"));
			AddTopic.click();

			WebElement Topicname = driver.findElement(By.name("name"));
			Topicname.sendKeys("Polymorphism");

			WebElement mandatory = driver.findElement(By.id("setMandatory"));
			mandatory .click();

			WebElement topic1save = driver.findElement(By.id("addtopicBtn"));
			topic1save.click();

			WebElement hoverElement = driver.findElement(By.xpath("//div[@class=\"p-5 p-l-10 p-r-10 clearfix topics-list ng-scope\"]"));

			// Create an instance of Actions class
			Actions actions = new Actions(driver);

			// Perform the mouseover action
			actions.moveToElement(hoverElement).perform();

			// Add a pause to observe the hover effect (optional)
			Thread.sleep(2000);

			WebElement Addsubtopic = driver.findElement(By.id("subTopicSlide"));
			Addsubtopic.click();

			WebElement Subtopicname = driver.findElement(By.id("subtopicname"));
			Subtopicname.sendKeys("Types of polymorphism ");

			WebElement SubtopicDes = driver.findElement(By.id("subdesc"));
			SubtopicDes.sendKeys("(Compile-time Polymorphism): Multiple methods in the same class with the same name but different parameter lists.Run-Time Polymorphism (Dynamic Polymorphism)\r\n"
					+ "This type of polymorphism is resolved during runtime.");

			WebElement NewsubtopicSave = driver.findElement(By.id("addsubtopicBtn"));
			NewsubtopicSave.click();
			Thread.sleep(5000);

			WebElement Plussymbol = driver.findElement(By.xpath("//*[@class=\"p-5 p-l-10 p-r-10 clearfix topics-list ng-scope\"]"));
			Plussymbol.click();

			WebElement hoverElementinsb = driver.findElement(By.xpath("//div[@ng-click=\"getcontentsbysubtopicid(y.subtopicid)\"]"));

			Actions actions1 = new Actions(driver);

			actions.moveToElement(hoverElementinsb).perform();

			Thread.sleep(2000);

			WebElement fileupload = driver.findElement(By.xpath("//i[@class=\"fa fa-folder-open\"]"));
			fileupload.click();

			WebElement pdffile = driver .findElement(By.xpath("//button[@class=\"btn btn-info btn-lg pdf-btn activity_btns\"]"));
			pdffile.click();

			WebElement Wordname = driver.findElement(By.xpath("//input[@name=\"ActivityName\"]"));
			Wordname.sendKeys("Example code");


			Thread.sleep(5000);
		//manual	//driver.findElement(By.id("input-folder-1")).sendKeys("C:\\Users\\Kavin\\Downloads\\Polymorphism.pdf");
			
		
			String projectpath = System.getProperty("user.dir");
			driver.findElement(By.id("input-folder-1")).sendKeys(projectpath+"\\Wordfile\\polymorphism.pdf");
			
			WebElement Wordfileok = driver.findElement(By.id("myBtn")) ;
			Wordfileok.click();
			
			Thread.sleep(5000);
			
			WebElement connext = driver.findElement(By.xpath("//button[@ng-click=\"NextBtnNavigation()\"]"));
			connext.click();

			WebElement Approve = driver.findElement(By.id("searchtextbox")) ;
			Approve.sendKeys("dhanamuruga2002@gmail.com");
			
			WebElement Commentinlast = driver.findElement(By.xpath("//textarea[@name=\"textareacomments\"]"));
			Commentinlast.sendKeys("The topic is Polymorpism");
			
			WebElement sendapp = driver .findElement(By.xpath("//button[@type=\"submit\"]"));
			sendapp.click();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			//driver.quit();
		}

	}

	private static String generateRandomCharacters(int length) {
		String Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		
		//Initializes a Random object to generate random numbers.
		Random random = new Random();
		
		StringBuilder  randomString = new StringBuilder();
		 
		for( int i=0; i<length;i++) {
			
			int index = random.nextInt(Chars.length());
			
			//Adds characters to the end of the StringBuilder.
			randomString.append(Chars.charAt(index));
		}
		return randomString.toString();
	}

	//private static char getRandomCharacter() {
		//Random random = new Random();
		// TODO Auto-generated method stub
		//return (char) (random.nextInt(26)+'a');
	//}

}
