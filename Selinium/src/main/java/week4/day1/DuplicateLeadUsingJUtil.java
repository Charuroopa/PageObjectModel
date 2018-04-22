package week4.day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;
import week2.day1.ProjectMethods;

public class DuplicateLeadUsingJUtil extends ProjectMethods{

	@Test(groups = "sanity", dependsOnGroups = {"smoke"})
	public void duplicateLead () throws InterruptedException
	{
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));*/
		click(locateElement("link","CRM/SFA"));
		click(locateElement("link","Leads"));
		click(locateElement("xpath", "//a[text() = 'Find Leads']"));
		click(locateElement("xpath", "//span[text() ='Phone']"));
		typeUsingKeys(locateElement("xpath", "//input[@name = 'phoneAreaCode']"), "91", Keys.TAB);
		type(locateElement("xpath", "//input[@name = 'phoneNumber']"), "9156395862");
		clickWithNoSnap(locateElement("xpath", "//button[text() = 'Find Leads']")); 
		
		Thread.sleep(2000);
		
		clickWithNoSnap(locateElement("xpath", "//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
	//10238
		click(locateElement("xpath", "//a[text()= 'Duplicate Lead']"));
		
		clickWithNoSnap(locateElement("xpath", "//input[@class = 'smallSubmit']"));
		
		/*WebElement verify = locateElement("xpath","//input[@value = 'Sample-3']");
		
		String msg = verify.getText();
		
		String content = "Sample-3";
		
		if(msg.equals(content))
		{
			System.out.println("content is correct");
		}
		else
		{
			System.out.println("content is incorrect");
		}*/
		
		//closeBrowser();
	}
}
