package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
		} catch (NullPointerException e) {
			System.err.println("Browser not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch(NoSuchSessionException e) {
			System.err.println("Browser not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch(Exception e) {
			System.err.println("Browser not found");
			e.printStackTrace();
			throw new RuntimeException();
		}finally
		{
			takeSnap();
		}

	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "link":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "tag":
				ele = driver.findElementByTagName(locValue);
				break;
			case "cssSelector":
				ele = driver.findElementByCssSelector(locValue);
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}finally
		{
			takeSnap();
		}
		return ele;

	}
	@SuppressWarnings("unchecked")
	public List<WebElement> locateElements(String locator, String locValue) {
		List<WebElement> ele = null;
		try {
			switch (locator) {
			case "id":
				ele = (List<WebElement>) driver.findElementById(locValue);
				break;
			case "class":
				ele = (List<WebElement>) driver.findElementByClassName(locValue);
				break;
			case "link":
				ele = (List<WebElement>) driver.findElementByLinkText(locValue);
				break;
			case "xpath":
				ele = driver.findElementsByXPath(locValue);
				break;
			case "tag":
				ele = (List<WebElement>) driver.findElementByTagName(locValue);
				break;
			case "cssSelector":
				ele = (List<WebElement>) driver.findElementByCssSelector(locValue);
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}finally
		{
			takeSnap();
		}
		return ele;

	}

	//Only for ID
	public WebElement locateElement(String locValue) {
		try {
			return driver.findElementById(locValue);
		}catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}finally
		{
			takeSnap();
		}

	}

	//This method is to get the value like sendkeys
	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The given value is entered "+ data);
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}finally
		{
			takeSnap();
		}
	}

	// This method is used for buttons and link
	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (ElementNotVisibleException e) {
			System.err.println("Not a clickable one");
			e.printStackTrace();
			throw new RuntimeException();
		}catch(WebDriverException e)
		{
			System.err.println("Not a clickable one");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Not a clickable one");
			e.printStackTrace();
			throw new RuntimeException();
		}finally
		{
			takeSnap();
		}
	}

	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (ElementNotVisibleException e) {
			System.err.println("Not a clickable one");
			e.printStackTrace();
			throw new RuntimeException();
		}catch(WebDriverException e)
		{
			System.err.println("Not a clickable one");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Not a clickable one");
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public String getText(WebElement ele) {
		String text = null;
		try {
			text = ele.getText();
			System.out.println("The value is " + text);
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch(WebDriverException e)
		{
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Element not found");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			new Select(ele).selectByVisibleText(value);
			System.out.println("Enter the dropdown value: " + value);
		} catch (ElementNotSelectableException e) {
			System.err.println("Options not found in dropdown");
			e.printStackTrace();
			throw new RuntimeException();
		}catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		/*WebElement ele = null;
		WebElement ele1 = driver.findElementById("");
		 */
		try {
			Select value = new Select(ele);

			List<WebElement> options = value.getOptions();

			options.size();

			System.out.println(options.size());

			value.selectByIndex(options.size()-index);

			System.out.println("The options are: ");

			for(WebElement eachOptions: options)
			{
				System.out.println(eachOptions.getText());
			}
		} catch (ElementNotVisibleException e) {
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}

	}

	public boolean verifyTitle(String expectedTitle) {
		try {
			String title = driver.getTitle();
			if (title.equals(expectedTitle))
			{
				System.out.println("The title verified is correct and proceed further " + expectedTitle);
			}
			else
			{
				System.out.println("Mismatches in title exit " + expectedTitle);
			}
			takeSnap();
		} catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			String text = ele.getText();
			if(text.equals(expectedText))
			{
				System.out.println("The exact text is verified "+ expectedText + "sucessfully");
			}
			else
			{
				System.out.println("The text is mismatched exit " + expectedText);
			}
		} catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			String partial = ele.getText();
			if(partial.contains(expectedText))
			{
				System.out.println("The exact text is verified "+ expectedText + "sucessfully");
			}

			else
			{
				System.out.println("The text is mismatched exit" + expectedText);
			}
		}catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			String atext = ele.getAttribute(attribute);
			if(atext.equals(value))
			{
				System.out.println("The exact " + attribute + " and "+ value + " is verified sucessfully");
			}
			else
			{
				System.out.println("The exact " + attribute + " and " + value + " doesnt Matches");
			}
		}catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			String patext = ele.getAttribute(attribute);
			if (patext.contains(value))
			{
				System.out.println("The partial " + attribute + " and "+ value + " is verified sucessfully");
			}
			else
			{
				System.out.println("The partial " + attribute + " and " + value + " doesnt Matches");
			}
		} catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			boolean select = ele.isSelected();
			if(select)
			{
				System.out.println("The Radio button or Check box " + select + " selected sucessfully");
			}
			else
			{
				System.out.println("The Radio button or Check box " + select + " is de selected sucessfully");
			}
		} catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			boolean display = ele.isDisplayed();
			if (display)
			{
				System.out.println("The element " + display + " is verified");
			}
			else
			{
				System.out.println("The element " + display + " is not verified and not correct");			
			}
		} catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void switchToWindow(int index) {

		try {
			Set<String> windowHandles = driver.getWindowHandles();

			List<String> winList = new ArrayList<String>();

			winList.addAll(windowHandles);

			//winList.get(1);

			driver.switchTo().window(winList.get(index));

			System.out.println("Window switched sucessfully");

			System.out.println(driver.getTitle());
		} catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			System.out.println("Switched to the frame "+ ele);
		} catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void acceptAlert() {
		
			driver.switchTo().alert().accept();
			System.out.println("Alert get accepted");
		
	}

	public void dismissAlert() {
		
			driver.switchTo().alert().dismiss();
			System.out.println("Alert get dismissed");
		
	}

	public String getAlertText() {

			String altext = driver.switchTo().alert().getText();
			System.out.println("Alert text " + altext);
			return null;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}

	@Override
	public void clear(WebElement ele) {
		ele.clear();

	}

	@Override
	public void typeUsingKeys(WebElement ele, String data, Keys keys) {
		try {
			ele.sendKeys(data , keys);
			System.out.println("The given value is entered "+ data);
		} catch(WebDriverException e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e)
		{
			System.err.println("Options not found in dropdown by index");
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			takeSnap();
		}


	}

	@Override
	public void alert() {
		
			driver.switchTo().alert();
			System.out.println("Alert get opened");
		

	}

	public  void webTable(WebElement table, int rowNum) {
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Totla no.of Rows = "+rows.size());
		System.out.println("Trains Names:");
		for (WebElement eachrow : rows) {
			System.out.println(eachrow.findElements(By.tagName("td")).get(rowNum).getText());
		}
	}
	
	public void typeWithTab(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data, Keys.TAB);
			
		} catch (WebDriverException e) {
			
		} catch (Exception e) {
			
		}
	}

}
