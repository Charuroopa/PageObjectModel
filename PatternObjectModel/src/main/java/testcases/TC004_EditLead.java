package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit a Lead in leaftaps";
		testNodes="Edit Lead";
		category="Smoke";
		authors="Charu";
		browserName="chrome";
		dataSheetName="TC004";
	}

	@Test(dataProvider = "fetchData")
	public void editLead(String uName,String pwd,String name, String fName, String EFname ) throws InterruptedException
	{
		new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogIn()
		.clickCRMSFA().clickLeads().clickFindLead().typeCName(name).typeFName(fName).clickFindLeadsbtn()
		.clickFirstIndex().clickEditLead().typeEditFName(EFname).clickUpdate();
	}

}
