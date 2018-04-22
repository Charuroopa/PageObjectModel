package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("DemoSalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		//Click on Phone
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		//Enter Phone Number
		
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("91" , Keys.TAB);
		
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9741177668");
		
		// Click on find lead button
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
			
		Thread.sleep(2000);

		//Click on first resulting lead

		WebDriverWait wait= new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))).click();

		//Click on Delete button
		
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		//Click on Find Leads
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		//Enter the captured Lead ID
		
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("11423");
		
		// Click on Find leads button
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		
		Thread.sleep(5000);
		
		//Verify the error message
		
		driver.findElementByXPath("//div[text()='No records to display']");
		
		driver.close();
	}

}
