package week1.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		//URL launch

		driver.get("http://leafground.com/");
		
		driver.findElementByLinkText("Drop down").click();
						
		WebElement drd1 = driver.findElementById("dropdown1");
		
		Select list =new Select(drd1);
		
		List<WebElement> options = list.getOptions();
		
		options.size();
		
		System.out.println("The Size using Index: " + options.size());
		
		list.selectByIndex(options.size()-2);
		
		
		/*WebElement drd2 = driver.findElementById("dropdown2");
		
		Select list2 = new Select(drd2);
		
		List<WebElement> options2 = list.getOptions();
		
		options2.size();
		
		System.out.println("The Size using text: " + options2.size());
		
		list2.selectByValue(options2.size()-2);*/
		
		
	}

}
