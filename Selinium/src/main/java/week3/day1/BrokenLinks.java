package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//URL launch

		driver.get("http://www.leaftaps.com/opentaps");		
		
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Password

		driver.findElementById("password").sendKeys("crmsfa");

		//login

		driver.findElementByClassName("decorativeSubmit").click();
		
		
		/*WebElement path = driver.findElementByXPath("//div[@id = 'label']/a");
		
		driver.findElementByXPath("//div[@id = 'label']/a").click();
		
		String text = path.getText();*/
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		elements.size();
		
		System.out.println("The size of the link is : " + elements.size());
		
		/*for (WebElement url : elements) {
			
			
		}*/
		
	}

}
