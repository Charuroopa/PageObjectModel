package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{


	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleVerifyFName;
	
	public ViewLead verifyFName(String data)
	{
		verifyExactText(eleVerifyFName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'Edit']")
	private WebElement eleEditLead;
	
	@And("Click on Edit button")
	public EditLead clickEditLead()
	{
		click(eleEditLead);
		return new EditLead();
	}
	
	
	@FindBy(how = How.CLASS_NAME, using = "subMenuButtonDangerous")
	private WebElement eleDeleteBtn;
	
	@And("Click on Delete button")
	public MyLeads clickDelete()
	{
		
		click(eleDeleteBtn);
		return new MyLeads();
	}

	@FindBy(how = How.XPATH, using = "(//a[@class = 'subMenuButton'])[1]")
	private WebElement eleDuplicateBtn;
	
	@And("Click on Duplicate button")
	public DuplicateLead clickDuplicate()
	{
		
		click(eleDuplicateBtn);
		return new DuplicateLead();
		
	}
	
	
}
