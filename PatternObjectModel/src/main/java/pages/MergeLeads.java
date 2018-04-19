package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods {
	public MergeLeads() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}

		
	@FindBy(how = How.XPATH, using = "(//img[@alt = 'Lookup'])[1]")
	private WebElement eleFromLead;
	
	@And("Click the from lead icon")
	public MFindLeads clickFromLead()
	{
		
		click(eleFromLead);
		switchToWindow(1);
		return new MFindLeads();
	}

	@FindBy(how = How.XPATH, using = "(//img[@alt = 'Lookup'])[2]")
	private WebElement eleToLead;
	
	@And("Click the to lead icon")
	public MFindLeads clickToLead()
	{
		
		click(eleToLead);
		switchToWindow(1);
		return new MFindLeads();
	}
	
	//Merge
	
	@FindBy(how = How.LINK_TEXT, using = "Merge")
	private WebElement eleclickMergeBtn;
	
	@And("Click on the Merge Lead button")
	public ViewLead clickMergeBtn()
	{
		
		click(eleclickMergeBtn);
		acceptAlert();
		return new ViewLead();
		
	}
	@FindBy(how = How.XPATH, using = "(//a[@class = 'linktext'])[1]")
	private WebElement eleGetText;
	
	@And("Go to get text")
	public String typeGetText()
	{
		text = getText(eleGetText);
		System.out.println(text);
		return text;
	}
	
	}
