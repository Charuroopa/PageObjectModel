package week3.day1;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action; interface
import org.openqa.selenium.interactions.Actions;

public class LearnDroppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int x,y;
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//URL launch

		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");

		WebElement drop = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
	
		x = drag.getLocation().getX();
		System.out.println("X " + x);
		y = drag.getLocation().getY();
		System.out.println("Y " + y);
	
		builder.dragAndDrop(drag, drop).perform();
		
		//builder.dragAndDropBy(drag, -x, -y).perform();

		int x1 = drag.getLocation().getX();
		System.out.println("X1 " + x1);
		int y1 = drag.getLocation().getY();
		System.out.println("Y1 " + y1);
		
		builder.dragAndDropBy(drag, -(x1-x), -(y1-y)).perform();
				
		Thread.sleep(2000);
		driver.close();
	}

}
