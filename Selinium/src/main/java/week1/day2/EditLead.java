package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {

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

		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("s");
		
		Thread.sleep(2000);

		driver.findElementByXPath("//button[text() = 'Find Leads']").click();

		Thread.sleep(2000);

		//Click on first resulting lead

		WebDriverWait wait= new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))).click();

		//Verify the title
		String actualtitle = "View Lead | opentaps CRM";

		String currenttitle= driver.getTitle();
		
		if(currenttitle.equals(actualtitle)) {

			System.out.println("Title of the page is matched");
		}
		else {

			System.out.println("Title of the page is not matched");
		}
		//Click on Edit

		driver.findElementByXPath("//a[text()='Edit']").click();
		//Change the company name

		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();

		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("TestLeaf 123");

		//Click update button

		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();

		//Confirm the changed company name appears

		String currentcompany= "TestLeaf 123 (10159)";
		
		//System.out.println(currentcompany);

		String confirmcompany = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		
		//System.out.println(confirmcompany);

		if (currentcompany.contains(confirmcompany)) {

			System.out.println("Company name is matched");

		}
		else
		{
			System.out.println("Company name is not matched");
		}
		driver.close();
	}

}
