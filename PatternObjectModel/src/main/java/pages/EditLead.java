package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}

	//(//input[@name = 'submitButton'])[1]
	
	@FindBy(how = How.XPATH, using = "(//input[@name = 'submitButton'])[1]")
	private WebElement eleUpdateBtn;
	
	@When("Click on Update button")
	public ViewLead clickUpdate()
	{
		
		click(eleUpdateBtn);
		return new ViewLead();
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	private WebElement eleEditCName;
	
	public EditLead typeEditCName(String data)
	{
		
		type(eleEditFName , data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_firstName")
	private WebElement eleEditFName;
	
	@And("Change the First name as (.*)")
	public EditLead typeEditFName(String data)
	{
		type(eleEditFName , data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_lastName")
	private WebElement eleEditLName;
	
	public EditLead typeEditLName(String data)
	{
		
		type(eleEditLName , data);
		return this;
	}
	
	@Then("Changes has been done")
	public void confirm()
	{
		System.out.println("Edited the data sucessfully");
	}
	
}
