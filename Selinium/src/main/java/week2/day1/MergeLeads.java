package week2.day1;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeads {

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

		driver.findElementByLinkText("Merge Leads").click();

		driver.findElementByXPath("//img[@alt = 'Lookup']").click();

		System.out.println(driver.getCurrentUrl());

		Set<String> values = driver.getWindowHandles();

		List<String> allValues = new ArrayList<String>();

		allValues.addAll(values);

		//winList.get(1);

		driver.switchTo().window(allValues.get(1));

		System.out.println(driver.getCurrentUrl());
		//enter the lead id
		
		String fromLeadNo = "12";

		driver.findElementByXPath("//input[@name = 'id']").sendKeys(fromLeadNo);

		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		
		WebDriverWait waitfromLead=new WebDriverWait(driver,10);
		
		waitfromLead.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a")));
		//Thread.sleep(2000);

		//driver.findElementByXPath("//a[@class = 'linktext']").click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a")));

		String fromLead = driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a").getText();
		
		System.out.println(fromLead);
		
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a").click();
		
		Thread.sleep(2000);

		driver.switchTo().window(allValues.get(0));

		System.out.println(driver.getCurrentUrl());

		driver.findElementByXPath("(//img[@alt = 'Lookup'])[2]").click();

		Set<String> toLead = driver.getWindowHandles();

		List<String> id = new ArrayList<String>();

		id.addAll(toLead);

		driver.switchTo().window(id.get(1));

		System.out.println(driver.getCurrentUrl());

		String toLeadNo = "21";
		
		driver.findElementByXPath("//input[@name = 'id']").sendKeys(toLeadNo);

		driver.findElementByXPath("//button[text() = 'Find Leads']").click();

		//Thread.sleep(2000);
		
		WebDriverWait waittolead = new WebDriverWait(driver, 10);
		
		waittolead.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a")));
		
		String lead = driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a").getText();
		
		System.out.println(lead);
		
		//driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a").click();
		
		driver.findElementByXPath("//a[@class = 'linktext']").click();

		Thread.sleep(2000);

		driver.switchTo().window(id.get(0));

		System.out.println(driver.getCurrentUrl());

		driver.findElementByXPath("//a[@class = 'buttonDangerous']").click();

		driver.switchTo().alert();

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		driver.findElementByXPath("//a[text() = 'Find Leads']").click();

		driver.findElementByXPath("//input[@name = 'id']").sendKeys(fromLeadNo);
		
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();

		WebElement error = driver.findElementByXPath("//div[text() = 'No records to display']");

		String msg = error.getText();

		String content = "No records to display";

		if (msg.equals(content))
			System.out.println("Correct");
		else
			System.out.println("Incorrect");
		
		driver.close();
	}

}
