package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {

	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement eleCreateLead;
	
	@And("Click on Create Lead")
	public CreateLead clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLead();
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	private WebElement eleFindLead;
	
	@And("Click on Find Leads")
	public FindLeadPage clickFindLead()
	{
		click(eleFindLead);
		return new FindLeadPage() ;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Merge Leads")
	private WebElement eleMergeLead;

	@And("Click on Merge Lead")
	public MergeLeads clickMergeLead()
	{
		click(eleMergeLead);
		return new MergeLeads();
	}
}
