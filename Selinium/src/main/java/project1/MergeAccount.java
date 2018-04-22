package project1;

import org.junit.Test;

import week2.day1.ProjectMethods;

public class MergeAccount extends ProjectMethods{
@Test

public void mergeacc() throws InterruptedException {
	//login();
	click(locateElement("xpath", "//div[@for='crmsfa']/a"));
	click(locateElement("xpath", "//a[text() = 'Accounts']"));
	click(locateElement("xpath", "//a[text()= 'Merge Accounts']"));
	click(locateElement("xpath", "(//img[@alt = 'Lookup'])[1]"));
	switchToWindow(1);
	type(locateElement("xpath", "//input[@name = 'id']"), "11518");
	type(locateElement("xpath", "//input[@name = 'accountName']"), "Ravikanth");
	click(locateElement("xpath", "//button[text()= 'Find Accounts']"));
	Thread.sleep(2000);
	clickWithNoSnap(locateElement("xpath", "(//a[@class = 'linktext'])[1]"));
	switchToWindow(0);
	click(locateElement("xpath", "(//img[@alt = 'Lookup'])[2]"));
	switchToWindow(1);
	type(locateElement("xpath", "//input[@name = 'id']"), "11519");
	type(locateElement("xpath", "//input[@name = 'accountName']"), "Prem");
	click(locateElement("xpath", "//button[text()= 'Find Accounts']"));
	Thread.sleep(2000);
	clickWithNoSnap(locateElement("xpath", "(//a[@class = 'linktext'])[1]"));
	switchToWindow(0);
	clickWithNoSnap(locateElement("xpath", "//a[@class = 'buttonDangerous']"));
	alert();
	Thread.sleep(2000);
	acceptAlert();
	click(locateElement("xpath", "//a[text()= 'Find Accounts']"));
	type(locateElement("xpath", "//input[@name = 'id']"), "11518");
	type(locateElement("xpath", "(//input[@name = 'accountName'])[2]"), "Ravikanth");
	click(locateElement("xpath", "//button[text()= 'Find Accounts']"));
	Thread.sleep(2000);
	verifyExactText(locateElement("xpath", "//div[text() = 'No records to display']"), "No records to display");
	Thread.sleep(3000);
	closeBrowser();
}
}
