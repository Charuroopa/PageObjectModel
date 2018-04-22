package week4.day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


import wdMethods.SeMethods;
import week2.day1.ProjectMethods;

public class DeleteLeadsUsingJUtil extends ProjectMethods{

		@Test(groups = "sanity", dependsOnGroups = {"smoke"})
		public void deleteLeads() throws InterruptedException
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
			
			/*WebDriverWait wait = new WebDriverWait(null, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a")));
			*/
			
			Thread.sleep(2000);
			
			WebElement value = locateElement("xpath", "//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
			
			String text = value.getText();
			
			System.out.println("The value is: " + value.getText());
			
			clickWithNoSnap(locateElement("xpath", "//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
			
			//clickWithNoSnap(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
			
			clickWithNoSnap(locateElement("xpath", "//a[@class = 'subMenuButtonDangerous']"));
			
			click(locateElement("xpath", "//a[text() = 'Find Leads']"));
			//10392
			
			type(locateElement("xpath", "//label[text() = 'Lead ID:']/following :: div/ input[1]"), text);
			
			clickWithNoSnap(locateElement("xpath", "//button[text() = 'Find Leads']"));
			
			Thread.sleep(2000);
			
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
