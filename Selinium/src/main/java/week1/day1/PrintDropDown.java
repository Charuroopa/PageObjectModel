package week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		//URL launch

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		driver.findElementById("userRegistrationForm:userName").sendKeys("Vignesh");

		driver.findElementById("userRegistrationForm:password").sendKeys("abcd");

		driver.findElementById("userRegistrationForm:confpasword").sendKeys("abcd");

		//driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?");

		WebElement findElementById = driver.findElementById("userRegistrationForm:securityQ");

		Select securityQ = new Select(findElementById);

		//securityQ.getOptions(); for this option need to extract the list in the webpage so we have to give ctrl+2,L this command

		List<WebElement> options = securityQ.getOptions();

		options.size();

		System.out.println("The Security Question size is: " + options.size());

		securityQ.selectByIndex(options.size()-8);
		
		System.out.println("The options are: ");
		
		for(WebElement eachOptions: options)
		{
			System.out.println(eachOptions.getText());
		}

		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Tiger");

		//driver.findElementById("userRegistrationForm:prelan").sendKeys("English");

		WebElement findElementById2 = driver.findElementById("userRegistrationForm:prelan");

		Select lang = new Select(findElementById2);

		//lang.getOptions(); same as above comment line

		List<WebElement> options2 = lang.getOptions();

		options2.size();

		System.out.println("The languaage Size is : " + options2.size());

		lang.selectByIndex(options2.size()-2);

		driver.findElementById("userRegistrationForm:firstName").sendKeys("Kavitha");

		driver.findElementById("userRegistrationForm:middleName").sendKeys("rani");

		driver.findElementById("userRegistrationForm:lastName").sendKeys("mathi");

		driver.findElementById("userRegistrationForm:gender:1").click();

		driver.findElementById("userRegistrationForm:maritalStatus:0").click();

		//driver.findElementById("userRegistrationForm:dobDay");

		WebElement findElementById3 = driver.findElementById("userRegistrationForm:dobDay");

		Select date = new Select(findElementById3);

		//date.getOptions();

		List<WebElement> options3 = date.getOptions();

		options3.size();

		System.out.println("For DOB the Date Size is : " + options3.size());

		date.selectByIndex(options3.size()-21);

		//	driver.findElementById("userRegistrationForm:dobMonth");

		WebElement findElementById4 = driver.findElementById("userRegistrationForm:dobMonth");

		Select month = new Select(findElementById4);

		//month.getOptions();

		List<WebElement> options4 = month.getOptions();

		options4.size();

		System.out.println("For DOB the month Size is : " + options4.size());

		month.selectByIndex(options4.size() - 11);

		//driver.findElementById("userRegistrationForm:dateOfBirth");

		WebElement findElementById5 = driver.findElementById("userRegistrationForm:dateOfBirth");

		Select year = new Select(findElementById5);

		year.selectByVisibleText("1990");
		/*
		List<WebElement> options5 = year.getOptions();

		options5.size();
		 */	
		//driver.findElementById("userRegistrationForm:occupation")

		WebElement findElementById6 = driver.findElementById("userRegistrationForm:occupation");

		Select occu = new Select(findElementById6);

		//occu.getOptions();

		List<WebElement> options5 = occu.getOptions();

		options5.size();

		System.out.println("The Occupation Size is : " + options5.size());

		occu.selectByIndex(options5.size()-4);

		driver.findElementById("userRegistrationForm:uidno").sendKeys("1234 5678 9012");

		driver.findElementById("userRegistrationForm:idno").sendKeys("AD2569LK");

		//driver.findElementById("userRegistrationForm:countries");

		WebElement findElementById7 = driver.findElementById("userRegistrationForm:countries");

		Select countries = new Select(findElementById7);

	//	countries.selectByVisibleText("India");
		List<WebElement> options6 = countries.getOptions();
		
		options6.size();
		
		System.out.println("The size of the countries: " + options6.size());
		
		for (WebElement allCountries : options6)
		{
			System.out.println(allCountries.getText());
		}
	}

}
