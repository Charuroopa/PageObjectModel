package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FresherJobs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//URL launch

		driver.get("https://www.indeed.co.in/Fresher-jobs");
		
		WebElement path = driver.findElementByXPath("(//a[@target='_blank']");
		
		System.out.println(path.getText());
		
			
		Actions builder = new Actions(driver);
		
		path.click();
		
		//builder.click(path).perform();
		
		builder.sendKeys(Keys.CONTROL).click().perform();
		
	/*	for (WebElement jobs : path) {
			
			Set<String> windowHandles = driver.getWindowHandles();

			List<String> winList = new ArrayList<String>();

			winList.addAll(windowHandles);

			//winList.get(1);

			driver.switchTo().window(winList.get(1));

			System.out.println("Window switched sucessfully");

			System.out.println(driver.getTitle());
			
			driver.switchTo().window(winList.get(0));*/
		
		/*package others; import java.util.ArrayList; import java.util.List; import java.util.Set; import java.util.concurrent.TimeUnit; import org.openqa.selenium.Keys; import org.openqa.selenium.WebElement; import org.openqa.selenium.chrome.ChromeDriver; import org.openqa.selenium.interactions.Actions; import org.testng.annotations.Test; public class Indeed { 	ChromeDriver driver; 	Actions builder; 	@Test 	public void indeed() { 		driver = new ChromeDriver(); 		driver.manage().window().maximize(); 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		driver.get("https://www.indeed.co.in/Fresher-jobs"); 		List<WebElement> joblinks = 				driver.findElementsByXPath("(//td[@id='resultsCol'])//a[@data-tn-element='jobTitle']");		 		int i =1; 		for (WebElement clcikOneByOne : joblinks) { 			openInNewTab(clcikOneByOne); 			switchToWindow(i); 			System.out.println(driver.getTitle() +"\n"); 			driver.close(); 			switchToWindow(0); 		} 		driver.quit(); 	} 	public void switchToWindow(int index) { 		Set<String> allWindowHandles = driver.getWindowHandles(); 		List<String> allHandles = new ArrayList<String>(); 		allHandles.addAll(allWindowHandles); 		driver.switchTo().window(allHandles.get(index)); 	} 	public void openInNewTab(WebElement ele) { 		builder = new Actions(driver); 		ele.click(); 		builder.sendKeys(Keys.CONTROL).click(ele).perform(); 	} }*/
		
		
		
	}

}
