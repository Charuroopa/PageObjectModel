package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BankBazzar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//URL launch

		driver.get("https://www.bankbazaar.com/personal-loan.html");

		WebElement custom = driver.findElementByXPath("//p[text() = 'Custom quote']");

		custom.click();
		
		Thread.sleep(2000);

/*		WebElement radio = driver.findElement(By.xpath("//label[@listkey= 'Female']"));

		radio.click();
*/		driver.findElement(By.xpath("//span[@class ='sprite-gender icon-gender-female']")).click();

		Thread.sleep(2000);

		/*WebElement city = driver.findElement(By.xpath("//input[@id = 'slideForm_form_applicantPlaceHolder_residenceCity_valueCHENNAI']"));

		city.click();*/

		//span[@class ='sprite-city icon-city-chennai']

		driver.findElement(By.xpath("//span[@class ='sprite-city icon-city-chennai']")).click();

		Thread.sleep(2000);
		
	   driver.findElement(By.xpath(("//input[@id ='form_applicantPlaceHolder_companyName_autoComplete']"))).sendKeys("BARCLAYS SHARED SERVICES PVT LTD", Keys.ENTER);;
		
	   Thread.sleep(2000);
	   
	   /*driver.findElementByXPath("(//button[text() = 'Continue'])[1]").click();
		
	   driver.findElementByXPath("(//input[@type= 'tel'])[2]").sendKeys("25,000", Keys.ENTER);*/
	   
		WebElement slider = driver.findElementByXPath("//div[@class ='eform-slider-1 ']");
		
		//slider.click();
		
		Thread.sleep(2000);
		
		System.out.println(slider.getText());
		
		int x=slider.getLocation().getX();
		
		System.out.println("The value is" + x);
		
		int y=slider.getLocation().getY();
		
		System.out.println("The value is" + y);
		
		Actions move=new Actions(driver);
		
		move.dragAndDropBy(slider, 5, 0).build().perform();
		
		Thread.sleep(2000);
		
		/*String maxAmount="42,000";
		int n=1;
		Actions move=new Actions(driver);
		for(int  i=0;i<=n;i++)
		{
						
			move.dragAndDropBy(slider, 5, 0).build().perform();

			x=slider.getLocation().getX();
			
			String oAmount = slider.getText();

			if(oAmount.equalsIgnoreCase(maxAmount))
			{
				System.out.println(oAmount);
				break;
			}
			else
			{
				System.out.println(oAmount);
			}

			n=n+1;
		}
*/

		driver.close();		
		
		
		
	}

}
