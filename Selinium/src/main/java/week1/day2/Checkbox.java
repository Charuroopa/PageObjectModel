package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		//URL launch

		driver.get("http://leafground.com/");
		
		driver.findElementByLinkText("Checkbox").click();
		
		WebElement chk = driver.findElementByXPath("//input[@type = 'checkbox'][2]");
		
		chk.isSelected();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(chk));
		
		Select_The_Checkbox(chk);
	}

	private static void Select_The_Checkbox(WebElement chk) {
		// TODO Auto-generated method stub
		try {
            if (chk.isSelected()) {
               System.out.println("Checkbox: " + chk + "is already selected");
            } else {
            	// Select the checkbox
                chk.click();
            }
        } catch (Exception e) {
        	System.out.println("Unable to select the checkbox: " + chk);
        }
	}

}
