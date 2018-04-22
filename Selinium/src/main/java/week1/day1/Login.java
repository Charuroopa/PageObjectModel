package week1.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

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

		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");

		driver.findElementById("createLeadForm_firstName").sendKeys("Vignesh");

		driver.findElementById("createLeadForm_lastName").sendKeys("Shivan");

		//driver.findElementById("createLeadForm_dataSourceId");

		WebElement findElementById = driver.findElementById("createLeadForm_dataSourceId");

		Select aa = new Select(findElementById);

		aa.selectByVisibleText("Employee");

		List<WebElement> options2 = aa.getOptions();

		options2.size();

		aa.selectByIndex(options2.size());

		//		driver.findElementById("createLeadForm_marketingCampaignId");

		WebElement findElementById2 = driver.findElementById("createLeadForm_marketingCampaignId");

		Select bb = new Select(findElementById2);

		List<WebElement> options = bb.getOptions();

		options.size();

		System.out.println(options.size());

		bb.selectByIndex(options.size() - 2);

		//wait
		Thread.sleep(10000);

		//logout
		//driver.findElementByClassName("decorativeSubmit").click();




	}

}
