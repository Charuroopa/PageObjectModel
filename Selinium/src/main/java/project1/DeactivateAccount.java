package project1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2.day1.ProjectMethods;

public class DeactivateAccount extends ProjectMethods {

	@Test
	public void account() throws InterruptedException
	{
		///login();
		click(locateElement("xpath", "//div[@for='crmsfa']/a"));
		click(locateElement("xpath", "//a[text() = 'Accounts']"));
		click(locateElement("xpath", "//a[text() = 'Find Accounts']"));
		type(locateElement("xpath", "//input[@name = 'id']"), "11344");
		type(locateElement("xpath", "(//input[@name = 'accountName'])[2]"), "Prasanth");
		click(locateElement("xpath", "//button[text() = 'Find Accounts']"));
		getText(locateElement("xpath", "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
		
		Thread.sleep(2000);
		
		click(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		verifyTitle("Account Details | opentaps CRM");
		clickWithNoSnap(locateElement("xpath", "//a[text() = 'Deactivate Account']"));
		
		//alert()//;
		getAlertText();
	
		Thread.sleep(2000);
		
		acceptAlert();
		
		verifyPartialText(locateElement("xpath", "//span[@class = 'subSectionWarning']"), "This account was deactivated");
		click(locateElement("xpath", "//a[text()= 'Find Accounts']"));
		type(locateElement("xpath", "//input[@name = 'id']"), "11344");
		type(locateElement("xpath", "(//input[@name = 'accountName'])[2]"), "Prasanth");
		click(locateElement("xpath", "//button[text() = 'Find Accounts']"));
		verifyExactText(locateElement("xpath", "//div[text() = 'No records to display']"), "No records to display");
		closeBrowser();
	
	}
}
