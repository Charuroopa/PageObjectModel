package week1.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCWebsite {

	public static void main(String[] args) throws InterruptedException {
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

		countries.selectByVisibleText("India");

		driver.findElementById("userRegistrationForm:email").sendKeys("abcd.gmail.com");

		//driver.findElementById("userRegistrationForm:isdCode").sendKeys("+91");

		driver.findElementById("userRegistrationForm:mobile").sendKeys("123456789");

		//driver.findElementById("userRegistrationForm:nationalityId");

		WebElement findElementById8 = driver.findElementById("userRegistrationForm:nationalityId");

		Select national = new Select(findElementById8);

		national.selectByVisibleText("India");

		driver.findElementById("userRegistrationForm:address").sendKeys("15, Gandhi road");

		driver.findElementById("userRegistrationForm:street").sendKeys("21st Street");

		driver.findElementById("userRegistrationForm:area").sendKeys("Nanganallur");

		driver.findElementById("userRegistrationForm:pincode").sendKeys("600061", Keys.TAB);

		Thread.sleep(2000);

		//	driver.findElementById("userRegistrationForm:statesName").sendKeys("TamilNadu");

		//driver.findElementById("userRegistrationForm:cityName");

		WebElement findElementById9 = driver.findElementById("userRegistrationForm:cityName");

		Select city = new Select(findElementById9);

		city.selectByVisibleText("Kanchipuram");

		/*List<WebElement> options6 = city.getOptions();

		System.out.println("Get the Size of city : " + options6.size());

		city.selectByIndex(options6.size() - 1);
*/
		//driver.findElementById("userRegistrationForm:postofficeName");
		
		Thread.sleep(2000);

		WebElement findElementById10 = driver.findElementById("userRegistrationForm:postofficeName");

		Select postOffice = new Select(findElementById10);

		postOffice.selectByValue("Nanganallur S.O");

		/*//postOffice.getOptions();

		List<WebElement> options7 = postOffice.getOptions();

		options7.size();

		System.out.println("Get the size of Post Office: " + options7.size());

		postOffice.selectByIndex(options7.size() - 1);
		 */
		driver.findElementById("userRegistrationForm:landline").sendKeys("044 458965213");

		driver.findElementById("userRegistrationForm:resAndOff:0").click();


	}

}
