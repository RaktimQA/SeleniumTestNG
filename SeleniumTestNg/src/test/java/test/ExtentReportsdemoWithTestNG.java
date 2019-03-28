package test;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsdemoWithTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver = null;

	@BeforeTest
	public void setUp(){

		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		//set driver path
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void Test1() throws Exception {

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		
		
		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");
		
		test.pass("closed browser");

		test.info("test completed");

	}

	@Test
	public void Test2() throws Exception {

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");
		
		driver.close();
		driver.quit();
		test.pass("closed browser");

		test.info("test completed");

	}

	@AfterTest
	public void Teardown() {

		
		// calling flush writes everything to the log file
		extent.flush();

	}
}
