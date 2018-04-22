package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//URL launch

		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=fTWlWvfMNbSIX9GTjng");

		driver.findElementById("lst-ib").sendKeys("Madhuvanthi", Keys.ENTER);


		List<WebElement> allLink = driver.findElementsByTagName("a");

		int count = 0;
		for (WebElement eachLink : allLink)
		{
			if(eachLink.getText().contains("Madhuvanthi")) {
				count = count+1;
			}
		}

		System.out.println(count);



	}

}
