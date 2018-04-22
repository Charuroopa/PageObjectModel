package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		//URL launch

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> winList = new ArrayList<String>();
		
		winList.addAll(windowHandles);
		
		//winList.get(1);
		
		driver.switchTo().window(winList.get(1));
		
		System.out.println(driver.findElementByXPath("//div[@class='content-ele']/p[2]").getText());
		
		driver.switchTo().window(winList.get(0));

		driver.findElementById("usernameId").sendKeys("Charu");
	}

}
