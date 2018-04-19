package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import pages.MFindLeads;
import pages.MergeLeads;
import pages.MyLeads;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge a Lead in leaftaps";
		testNodes="Merge Lead";
		category="Smoke";
		authors="Charu";
		browserName="chrome";
		dataSheetName="TC007";
	}

	@Test(dataProvider = "fetchData")
	public void mergeLead(String uName,String pwd, String FName, String LName, String vText) throws InterruptedException
	{
		 String typeGetText = new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogIn()
		 .clickCRMSFA().clickLeads().clickMergeLead().clickFromLead().typeMFName(FName)
		 .clickMFind().typeGetText();
		 
		 new MFindLeads().clickMFElement();
		 
		 new MergeLeads().clickToLead().typeMFName(LName).clickMFind().clickMFElement()
		 .clickMergeBtn();
		 
		 new MyLeads().clickFindLead().typeLeadId(text).clickFindLeadsbtn();
		 
		 //.typeVerifyText(vText);
		 
		 System.out.println(typeGetText);
	}

}
