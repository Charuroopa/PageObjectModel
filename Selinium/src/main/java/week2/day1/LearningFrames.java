package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//URL launch

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");	
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		//String text = promptAlert.getText(); it will display in prompt box
		
		promptAlert.sendKeys("Test Leaf");
		
		Thread.sleep(3000);
		
		promptAlert.accept();
		
		//driver.switchTo().parentFrame(); if there is multiple frame we use it
		
		String text = driver.findElementById("demo").getText();
		
		if(text.contains("Test Leaf"))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
	}

}
