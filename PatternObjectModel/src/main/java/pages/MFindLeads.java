package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MFindLeads extends ProjectMethods{

	public MFindLeads() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}

		
	@FindBy(how = How.XPATH, using = "//input[@class =' x-form-text x-form-field ']")
	private WebElement eleLeadID;
	
	public MFindLeads typeLeadID(String data)
	{
		
		type(eleLeadID, data);
		return this;
	}
	
	////input[@name = 'firstName']
	
	@FindBy(how = How.XPATH , using = "//input[@name = 'firstName']")
	private WebElement eletypeMFirstName;
	
	@And("Go to new window and enter the first name as (.*)")
	public MFindLeads typeMFName(String data)
	{
		type(eletypeMFirstName , data);
		return this;
		
	}
	
	//(//span[@class = 'x-tab-strip-text '])[2]
	
	@FindBy(how = How.XPATH , using = "(//span[@class = 'x-tab-strip-text '])[2]")
	private WebElement eleclickMPh;
	
	public MFindLeads clickMPh()
	{
		click(eleclickMPh );
		return this;
		
	}
	
	@FindBy(how = How.XPATH , using = "//button[@class = 'x-btn-text']")
	private WebElement eleclickMFind;
	
	@And("Click on find button on that page")
	public MFindLeads clickMFind() throws InterruptedException
	{
		click(eleclickMFind );
		Thread.sleep(2000);
		return this;
		
	}
	
	
	@FindBy(how = How.XPATH , using = "(//a[@class = 'linktext'])[1]")
	private WebElement eleclickMFElement;
	
	@And("Click on first index of it.")
	public MergeLeads clickMFElement()
	{
		clickWithNoSnap(eleclickMFElement );
		switchToWindow(0);
		return new MergeLeads();
		
	}

	@FindBy(how = How.XPATH, using = "(//a[@class = 'linktext'])[1]")
	private WebElement eleGetText;
	
	@And("Enter the Lead ID from the get text")
	public String typeGetText()
	{
		text = getText(eleGetText);
		System.out.println(text);
		return text;
	}

	
	
	
}
