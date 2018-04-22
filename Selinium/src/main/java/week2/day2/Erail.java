package week2.day2;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Erail extends SeMethods {

		@Test
		public void erail() throws InterruptedException
		{
			startApp("chrome", "https://erail.in/");
			clear(locateElement("txtStationFrom"));
			typeUsingKeys(locateElement("txtStationFrom"), "MAS", Keys.TAB);
			//Keys.TAB;
			clear(locateElement("txtStationTo"));
			typeUsingKeys(locateElement("txtStationTo"), "SBC", Keys.TAB);
			click(locateElement("chkSelectDateOnly"));
			Thread.sleep(3000);
			List<WebElement> tra = locateElements("xpath", "//table[@class='DataTable TrainList']/tbody/tr/td[2] ");
			for (WebElement trna : tra) {
			System.out.println(trna.getText());	
			}
			
		}
	}


