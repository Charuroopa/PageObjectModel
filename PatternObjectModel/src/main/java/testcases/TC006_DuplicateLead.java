package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import pages.MyLeads;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate a Lead in leaftaps";
		testNodes="Duplicate Lead";
		category="Smoke";
		authors="Charu";
		browserName="chrome";
		dataSheetName="TC006";
	}

	@Test(dataProvider = "fetchData")
	public void duplicateLead(String uName,String pwd,String cname, String FName, String LName) 
			throws InterruptedException
	{
		 String typeGetIndex = new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogIn()
		.clickCRMSFA().clickLeads().clickFindLead().typeCName(cname).typeFName(FName).typeLName(LName)
		.clickFindLeadsbtn().typeGetText();
		 new FindLeadPage()
		 .clickFirstIndex().clickDuplicate().clickCreatebtn();
		 System.out.println(typeGetIndex);
	}

}
