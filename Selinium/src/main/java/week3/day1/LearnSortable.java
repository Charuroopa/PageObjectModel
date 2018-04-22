package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action; interface
import org.openqa.selenium.interactions.Actions;

public class LearnSortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//URL launch

		driver.get("http://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementByXPath("//li[text() = 'Item 1']");

		WebElement drop = driver.findElementByXPath("//li[text() = 'Item 3']");
		
		Actions builder = new Actions(driver);
				
		builder.dragAndDropBy(drag, drop.getLocation().getX(), drop.getLocation().getY()).perform();
		
		driver.close();
	}

}
