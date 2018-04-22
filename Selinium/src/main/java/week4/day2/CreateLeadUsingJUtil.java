package week4.day2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import wdMethods.SeMethods;
import week2.day1.ProjectMethods;

public class CreateLeadUsingJUtil extends ProjectMethods{

	@Test
	public void createlead()
	{
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));*/
		click(locateElement("link","CRM/SFA"));
		click(locateElement("link","Leads"));
		click(locateElement("link","Create Lead"));
		type(locateElement("createLeadForm_companyName"), "TestLeaf");
		//type(locateElement("createLeadForm_parentPartyId"), "TeatLeafHead");
		type(locateElement("createLeadForm_firstName"), "Trilok");
		type(locateElement("createLeadForm_lastName"), "Vignesh");
		selectDropDownUsingIndex(locateElement("createLeadForm_dataSourceId"), 4);
		selectDropDownUsingIndex(locateElement("createLeadForm_marketingCampaignId"), 3);
		type(locateElement("createLeadForm_primaryPhoneAreaCode"), "91");
		type(locateElement("createLeadForm_primaryPhoneNumber"), "9156395862");
		click(locateElement("class", "smallSubmit"));
		//closeBrowser();
	}
}
