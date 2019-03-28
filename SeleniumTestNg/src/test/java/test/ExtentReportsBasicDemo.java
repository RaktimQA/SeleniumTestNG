package test;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google Search Test One", "this is test to validate google search fuctionality");

		//set driver path
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//test

		//log (status, details)
		test1.log(Status.INFO, "starting test case");
		driver.get("https://google.com");
		test1.pass("navigated to google.com");
		
		driver.manage().window().maximize();


		driver.findElement(By.name("q")).sendKeys("automation");
		test1.pass("entered text");

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		test1.pass("pressed enter");

		driver.close();
		driver.quit();
		test1.pass("closed browser");

		test1.info("test completed");




		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test2 = extent.createTest("Google Search Test Two", "this is test to validate google search fuctionality");

		//set driver path
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//test

		//log (status, details)
		test2.log(Status.INFO, "starting test case");
		driver.get("https://google.com");
		test2.pass("navigated to google.com");

		driver.findElement(By.name("q")).sendKeys("automation");
		test2.pass("entered text");

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		test2.fail("pressed enter");

		driver.close();
		driver.quit();
		test2.pass("closed browser");

		test2.info("test completed");


		// calling flush writes everything to the log file
		extent.flush();



	}

}
