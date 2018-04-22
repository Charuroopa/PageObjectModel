package week2.day1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;
import week5.day1.LearningImportCreatelead;

public class ProjectMethods extends SeMethods{
	@Parameters({"url", "username" , "password"})
		@BeforeMethod
		public void login(String url, String username, String pwd)
		{
			startApp("chrome", url);
			WebElement uName = locateElement("id", "username");
			type(uName, username);
			WebElement password = locateElement("id", "password");
			type(password,pwd);
			WebElement click = locateElement("class", "decorativeSubmit");
			click(click);
		/*	click(locateElement("linkText", "CRM/SFA"));
			click(locateElement("linkText", "Leads"));*/

		}
		@AfterMethod
		public void close() {
				closeBrowser();
		}
		
		@DataProvider(name = "fetchdata")
		public Object[][] getData() throws IOException {
			
			LearningImportCreatelead lExcel = new LearningImportCreatelead();
			return lExcel.learningExcel();
			 
		}

	}


