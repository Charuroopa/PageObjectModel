package week4.day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;
import week2.day1.ProjectMethods;

public class MergeLeadsUsingJUtil extends ProjectMethods{
	@Test(groups = "smoke")
	public void mergeLead() throws InterruptedException {
	/*startApp("chrome", "http://www.leaftaps.com/opentaps");
	type(locateElement("id", "username"), "DemoSalesManager");
	type(locateElement("id", "password"), "crmsfa");
	click(locateElement("class", "decorativeSubmit"));*/
	click(locateElement("link","CRM/SFA"));
	click(locateElement("link","Leads"));
	click(locateElement("link", "Merge Leads"));
	click(locateElement("xpath", "//img[@alt = 'Lookup']"));
	switchToWindow(1);
	String fromLeadNo = "25";
	type(locateElement("xpath", "//input[@name = 'id']"), fromLeadNo);
	click(locateElement("xpath", "//button[text() = 'Find Leads']"));
	/*WebDriverWait waitfromLead=new WebDriverWait(null, 10);
	
	waitfromLead.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a")));
	*/
	Thread.sleep(2000);
    
	WebElement value = locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
	
	String text = value.getText();
	
	System.out.println("The value is: " + text);
	
	Thread.sleep(2000);
	
	clickWithNoSnap(locateElement("xpath", "//a[@class = 'linktext']"));
	
	switchToWindow(0);
	
	Thread.sleep(2000);
	
	clickWithNoSnap(locateElement("xpath", "(//img[@alt = 'Lookup'])[2]"));
	
	switchToWindow(1);
	
	String toLeadNo = "05";
	
	type(locateElement("xpath", "//input[@name = 'id']"), toLeadNo);
	
	click(locateElement("xpath", "//button[text() = 'Find Leads']"));
	
	Thread.sleep(2000);
	
	//clickWithNoSnap(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));

	clickWithNoSnap(locateElement("xpath", "//a[@class = 'linktext']"));
	
	Thread.sleep(2000);
	
	switchToWindow(0);
	
	clickWithNoSnap(locateElement("xpath", "//a[@class = 'buttonDangerous']"));
	
	alert();
	
	Thread.sleep(2000);
	
	acceptAlert();
	
	click(locateElement("xpath", "//a[text() = 'Find Leads']"));
	
	type(locateElement("xpath", "//input[@name = 'id']"), text);
	
	click(locateElement("xpath","//button[text()= 'Find Leads']"));
	
	WebElement error = locateElement("xpath", "//div[text() = 'No records to display']");
	
	String msg = error.getText();
	
	String content = "No records to display";
	
	if(msg.equals(content))
	{
		System.out.println("Correct");
	}
	else
	{
		System.out.println("Incorrect");
	}
	
	Thread.sleep(2000);
	//closeBrowser();
	
	}
}
