package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import wdMethods.SeMethods;
import week2.day1.ProjectMethods;

public class CreateLeadUsingJUtil extends ProjectMethods{

	@Test(dataProvider = "fetchdata")
	public void createlead(String cName, String fName, String lName,String eMail, String ph)
	{
		click(locateElement("link","CRM/SFA"));
		click(locateElement("link","Leads"));
		click(locateElement("link","Create Lead"));
		type(locateElement("createLeadForm_companyName"), cName);
		type(locateElement("createLeadForm_firstName"), fName);
		type(locateElement("createLeadForm_lastName"), lName);
		selectDropDownUsingIndex(locateElement("createLeadForm_dataSourceId"), 4);
		selectDropDownUsingIndex(locateElement("createLeadForm_marketingCampaignId"), 3);
		type(locateElement("id", "createLeadForm_primaryEmail"),eMail);
		type(locateElement("createLeadForm_primaryPhoneAreaCode"), "91");
		type(locateElement("createLeadForm_primaryPhoneNumber"), ph);
		click(locateElement("class", "smallSubmit"));
	}
}
