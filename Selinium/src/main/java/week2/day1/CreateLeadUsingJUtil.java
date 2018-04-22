package week2.day1;

import org.junit.Test;

import wdMethods.SeMethods;

public class CreateLeadUsingJUtil extends SeMethods{

	@Test
	public void createlead()
	{
		startApp("chrome", "http://www.leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link","CRM/SFA"));
		click(locateElement("link","Leads"));
		click(locateElement("link","Create Lead"));
		type(locateElement("createLeadForm_companyName"), "TestLeaf");
		//type(locateElement("createLeadForm_parentPartyId"), "TeatLeafHead");
		type(locateElement("createLeadForm_firstName"), "Abhinav");
		type(locateElement("createLeadForm_lastName"), "Shankar");
		selectDropDownUsingIndex(locateElement("createLeadForm_dataSourceId"), 4);
		selectDropDownUsingIndex(locateElement("createLeadForm_marketingCampaignId"), 3);
		click(locateElement("class", "smallSubmit"));
	}
}
