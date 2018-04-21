package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import pages.MyLeads;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete a Lead in leaftaps";
		testNodes="Delete Lead";
		category="Smoke";
		authors="Charu";
		browserName="chrome";
		dataSheetName="TC005";
	}

	@Test(dataProvider = "fetchData")
	public void deleteLead(String uName,String pwd,String cname, String FName, 
					String LName, String Vtext) throws InterruptedException
	{
		 String typeGetIndex = new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogIn()
		.clickCRMSFA().clickLeads().clickFindLead().typeFName(FName).clickFindLeadsbtn()
		.typeGetText();
		 new FindLeadPage()
		 .clickFirstIndex().clickDelete().clickFindLead().typeLeadId(text)
		 .clickFindLeadsbtn()
		 .typeVerifyText(Vtext);
		 
		 System.out.println(typeGetIndex);
	}

}
