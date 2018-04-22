package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class filpKartMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//URL launch

		driver.get("https://www.flipkart.com/");
		
		driver.findElementByXPath("//button[text() = '✕']").click();
		
		WebElement tv = driver.findElementByXPath("//span[text() = 'TVs & Appliances']");
		
		WebElement samsung = driver.findElementByXPath("(//span[text() = 'Samsung'])[2]");

		Actions builder = new Actions(driver);
		
		Thread.sleep(2000);
		
		builder.moveToElement(tv).perform();
		
		Thread.sleep(2000);
		
		builder.click(samsung).perform();
		
		driver.close();
	}

}
