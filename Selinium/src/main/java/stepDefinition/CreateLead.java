/*package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	public static RemoteWebDriver driver;
	
	@Given("Open the browser")
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("Maximize the browser")
	public void maximizeBrw() {
		driver.manage().window().maximize();
	}
	
	@And("Use the timeouts")
	public void timeOuts() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@And("Launch the url")
	public void loadURL() {
		driver.get("http://www.leaftaps.com/opentaps/");
	}
	
	@And("Enter the Username as (.*)")
	public void userName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("Enter the Password as (.*)")
	public void password(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@And("Click on login")
	public void login() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click on CRMSFA")
	public void crmsfalink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on Leads")
	public void leadsLink() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click on Create Lead")
	public void createLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter the Company name as (.*)")
	public void companyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And("Enter the First name as (.*)")
	public void firstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("Enter the Last name as (.*)")
	public void lastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@When("Click on the Create Lead button")
	public void clickCreateLead() {
		driver.findElementByXPath("//input[@value = 'Create Lead']").click();
	}
	
	@Then("Verify the new lead is created")
	public void verifyText() {
		System.out.println("Lead has been created");
	}
	
}
*/