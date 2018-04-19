package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCmpnyName;
	
	@And("Enter the Company name as (.*)")
	public CreateLead typeCompanyName(String data)
	{
		type(eleCmpnyName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement elefirstName;
	
	@And("Enter the First name as (.*)")
	public CreateLead typeFirstName(String data)
	{
		type(elefirstName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;
	
	@And("Enter the Last name as (.*)")
	public CreateLead typeLastName(String data)
	{
		type(eleLastName, data);
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement eleEmailID;
	
	public CreateLead typeEmailID(String data)
	{
		type(eleEmailID, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement elePhNumber;
	
	public CreateLead typePhoneNumber(String data)
	{
		type(elePhNumber, data);
		return this;
	}
	
	//createLeadForm_primaryPhoneAreaCode
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAreaCode")
	private WebElement eleAreaCode;
	
	public CreateLead typeAreaCode(String data)
	{
		type(eleAreaCode, data);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement eleClickCreate;
	
	@When("Click on the Create Lead button")
	public ViewLead clickCreateLeadbtn()
	{
		click(eleClickCreate);
		return new ViewLead();
	}
	
	@Then("Verify the new lead is created")
	public void verify()
	{
		System.out.println("Lead has been created");
	}
}
