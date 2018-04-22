package week1.day2;

import java.util.concurrent.TimeUnit;

//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//Open the browser
			ChromeDriver driver = new ChromeDriver();
			
			//Maximize the browser
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//URL launch
			
			driver.get("http://www.leaftaps.com/opentaps");		
		//username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Password
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		//login
		
		driver.findElementByClassName("decorativeSubmit").click();
				
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("b");
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		
		//need to use wait
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		
		driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		
		
	}

}
