package learnReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./report/results.html");
		html.setAppendExisting(true);
		
		// it will allow updating the html file
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("TC001_CreateLead", "Create a new lead");
		
		test.assignAuthor("Charu");
		test.assignCategory("smoke");
		
		test.pass("Data DemoSalesManager entered sucessfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("Data crmsfa entered sucessfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		
		test.pass("Data login button is clicked");

		extent.flush();
	}

}
