/*package stepDefinitionformethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateleadUsingMethods {


	public static RemoteWebDriver driver;
	
	@Before
	public void before(Scenario sc) {
		
		sc.getName();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
	
	@Then("Verify the new lead is failed")
	public void verifyfailedText() {
		System.out.println("Login is failed");
	}
	@After
	public void after(Scenario sc) {
		
		sc.getStatus();
		driver.close();
		
		
	}
}
*/