package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {

	public  FindLeadPage() {
			PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how = How.NAME, using = "id")
	private WebElement eleLeadId;
	
	public FindLeadPage typeLeadId(String data)
	{
		type(eleLeadId,data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name = 'firstName'])[3]")
	private WebElement eleFName;
	
	@And("Enter First name as (.*)")
	public FindLeadPage typeFName(String data)
	{
		type(eleFName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name = 'lastName'])[3]")
	private WebElement eleLName;
	
	public FindLeadPage typeLName(String data)
	{
		type(eleLName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name = 'companyName'])[2]")
	private WebElement eleCName;
	
	public FindLeadPage typeCName(String data)
	{
		type(eleCName, data);
		return this;
	}
	
	////button[text()= 'Find Leads']
	
	@FindBy(how = How.XPATH, using = "//button[text()= 'Find Leads']")
	private WebElement eleFindLeadsbtn;
	
	@And("Click on Find Lead button")
	public FindLeadPage clickFindLeadsbtn() throws InterruptedException
	{
		click(eleFindLeadsbtn);
		Thread.sleep(2000);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//span[@class= 'x-tab-strip-text '])[2]")
	private WebElement eleph;
	
	public FindLeadPage typePhoneNumber(String data)
	{
		type(eleph, data);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "phoneAreaCode")
	private WebElement eleCode;
	
	public FindLeadPage typeCode(String data)
	{
		type(eleCode,data);
		return this;
	}
	//emailAddress
	
	@FindBy(how = How.NAME, using = "emailAddress")
	private WebElement eleMail;
	
	public FindLeadPage typeMail(String data)
	{
		type(eleMail,data);
		return this;
	}
	
	//Advanced
	
	@FindBy(how = How.XPATH, using = "//span[text() = 'Advanced']")
	private WebElement eleAdvanced;
	
	public FindLeadPage clickAdvanced()
	{
		click(eleAdvanced);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "phoneNumber")
	private WebElement eleNumber;
	
	public FindLeadPage typeNumber(String data)
	{
		type(eleNumber,data);
		return this;
	}
	
	
	@FindBy(how = How.XPATH, using = "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleGetText;
	
	public String typeGetText()
	{
		text = getText(eleGetText);
		System.out.println(text);
		return text;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstIndex;
	
	@And("Select the first index")
	public ViewLead clickFirstIndex()
	{
		clickWithNoSnap(eleFirstIndex);
		return new ViewLead();
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleVerifyText;
	
	public String typeVerifyText(String data)
	{
		verifyPartialText(eleVerifyText, data);
		return data;
	}
}
