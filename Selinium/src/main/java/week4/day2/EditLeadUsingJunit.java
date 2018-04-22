package week4.day2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import wdMethods.SeMethods;
import week2.day1.ProjectMethods;

public class EditLeadUsingJunit extends ProjectMethods{

	@Test
	
	public void editLead() throws InterruptedException {
	
	/*startApp("chrome", "http://www.leaftaps.com/opentaps");

	type(locateElement("id", "username"),"DemoSalesManager");

	type(locateElement("id", "password"),"crmsfa");

	click(locateElement("class", "decorativeSubmit"));
*/
	click(locateElement("link", "CRM/SFA"));

	click(locateElement("link", "Leads"));

	clickWithNoSnap(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
	
	type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"),"Trilok");
	
	Thread.sleep(3000);
	
	clickWithNoSnap(locateElement("xpath", "//button[text() = 'Find Leads']"));
	
	Thread.sleep(3000);
	
	clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	
	verifyTitle("View Lead | opentaps CRM");
	
	click(locateElement("xpath", "//a[text()='Edit']"));
	
	clear(locateElement("xpath", "//input[@id='updateLeadForm_companyName']"));
	
	type(locateElement("updateLeadForm_companyName"), "TestLeaf 123");
	
	click(locateElement("xpath", "(//input[@class='smallSubmit'])[1]"));
	
	Thread.sleep(2000);
	
	//closeBrowser();
	}
}
