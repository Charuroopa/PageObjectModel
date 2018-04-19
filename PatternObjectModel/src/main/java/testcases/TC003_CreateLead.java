package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods
{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a Lead in leaftaps";
		testNodes="Create Lead";
		category="Smoke";
		authors="Charu";
		browserName="chrome";
		dataSheetName="TC003";
	}

	@Test(dataProvider = "fetchData")
	public void createLead(String uName,String pwd,String CName,
										String FName,String LName)
	{
		new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogIn()
		.clickCRMSFA().clickLeads().clickCreateLead().typeCompanyName(CName).typeFirstName(FName)
		.typeLastName(LName).clickCreateLeadbtn().verifyFName(FName);
	}
}
