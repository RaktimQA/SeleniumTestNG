package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoaptiveAdmin {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver = null;
	ExtentTest test = null;

	@BeforeTest
	public void setUp(){

		// start reporters
		htmlReporter = new ExtentHtmlReporter("madmin.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		//set driver path
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void Test() throws Exception {

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		//log (status, details)
		test.log(Status.INFO, "starting test case");
		driver.get("https://madmin.goaptive.com");
		test.pass("navigated to madmin.goaptive.com");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		test.pass("maximize browser");


		//valid email id given
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[2]/span[1]/div/input")).sendKeys("raktim.appsbee@gmail.com");		
		Thread.sleep(2000);
		test.pass("valid email id given");

		//valid password given
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[2]/span[2]/div/input")).sendKeys("Appsbee@123");		
		Thread.sleep(2000);
		test.pass("valid password given");

		//click login	
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[3]")).click();		
		Thread.sleep(5000);
		test.pass("click login");

		//select blog	
		driver.findElement(By.xpath("/html/body/app-my-app/app-signed/div/div[1]/app-sidebar-cmp/div[2]/ul/li[2]/a/p")).click();		
		Thread.sleep(7000);
		test.pass("select blog");

		//select blog edit by webdriver
		WebElement element = driver.findElement(By.xpath("/html/body/app-my-app/app-signed/div/div[2]/app-blog/div/div/app-list-blog/div/div[1]/div/div[2]/div/a/span/i"));		
		Actions act = new Actions (driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("/html/body/app-my-app/app-signed/div/div[2]/app-blog/div/div/app-list-blog/div/div[1]/div/div[2]/div/a/span/i")).click();		
		Thread.sleep(3000);
		test.pass("select blog edit");

		//*****************************************************************************************

		//page title validation check by blank
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(" ");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).clear();
		Thread.sleep(2000);
		test.pass("page title validation check by blank");

		//page title validation check by 3 characters
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("abc");
		Thread.sleep(4000);
		test.pass("page title validation check by 3 characters");
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).clear();
		Thread.sleep(2000);

		//page title given
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Appsbee Technology India");
		Thread.sleep(4000);
		test.pass("page title given");

		//*****************************************************************************************

		//meta keyword validation check by blank
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(" ");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).clear();
		Thread.sleep(2000);
		test.pass("meta keyword validation check by blank");

		//meta keyword validation check by 3 characters
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("abc");
		Thread.sleep(4000);
		test.pass("meta keyword validation check by 3 characters");
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).clear();
		Thread.sleep(2000);

		//meta keyword given
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("Appsbee Development");
		Thread.sleep(4000);
		test.pass("meta keyword given");

		//*****************************************************************************************

		//meta description validation check by blank
		driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys(" ");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).clear();
		Thread.sleep(2000);
		test.pass("meta description validation check by blank");

		//meta description validation check by 3 characters
		driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("abc");
		Thread.sleep(4000);
		test.pass("meta description validation check by 3 characters");
		driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).clear();
		Thread.sleep(2000);

		//meta description given
		driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Appsbee Development");
		Thread.sleep(4000);
		test.pass("meta description given");

		//*****************************************************************************************

		//blog heading validation check by blank
		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys(" ");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).clear();
		Thread.sleep(2000);
		test.pass("blog heading validation check by blank");

		//blog heading validation check by 3 characters
		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("abc");
		Thread.sleep(4000);
		test.pass("blog heading validation check by 3 characters");
		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).clear();
		Thread.sleep(2000);

		//blog heading given
		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Appsbee Technology India");
		Thread.sleep(4000);
		test.pass("blog heading given");

		//*****************************************************************************************

		//blog url validation check by blank
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(" ");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).clear();
		Thread.sleep(2000);
		test.pass("blog url validation check by blank");

		//blog url validation check by 3 characters
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("abc");
		Thread.sleep(4000);
		test.pass("blog url validation check by 3 characters");
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).clear();
		Thread.sleep(2000);

		//blog url given
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("appsbee-technology-india1552926733935");
		Thread.sleep(4000);
		test.pass("blog url given");

		//*****************************************************************************************

		//blog blurb validation check by blank
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys(" ");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).clear();
		Thread.sleep(2000);
		test.pass("blog blurb validation check by blank");

		//blog blurb validation check by 3 characters
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("abc");
		Thread.sleep(4000);
		test.pass("blog blurb validation check by 3 characters");
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).clear();
		Thread.sleep(2000);

		//blog blurb given
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("appsbee tester testing");
		Thread.sleep(4000);
		test.pass("blog blurb given");

		//*****************************************************************************************

		//blog content validation check by blank
		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys(" ");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).clear();
		Thread.sleep(2000);
		test.pass("blog content validation check by blank");

		//blog content validation check by 3 characters
		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("abc");
		Thread.sleep(4000);
		test.pass("blog content validation check by 3 characters");
		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).clear();
		Thread.sleep(2000);

		//blog content given
		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,");
		Thread.sleep(4000);
		test.pass("blog content given");

		//*****************************************************************************************

		/*
		//select upload image
		WebElement uploadElement = driver.findElement(By.xpath("/html/body/app-my-app/app-signed/div/div[2]/app-blog/div/div/app-edit-blog/div/div/div/form/div[7]/div/div/div[3]/span/input[2]"));
		test.pass("select upload image button");

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("/root/Desktop/clown02.jpg");
		 */

		//*****************************************************************************************

		//click visual settings	
		driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[1]")).click();		
		Thread.sleep(5000);
		test.pass("click visual settings");

		//select publish	
		driver.findElement(By.xpath("//*[@id=\"mat-option-0\"]/span")).click();		
		Thread.sleep(5000);
		test.pass("select publish");
		
		//click visual settings	
		driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[1]")).click();		
		Thread.sleep(5000);
		test.pass("click visual settings");

		//select unpublish	
		driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span")).click();		
		Thread.sleep(5000);
		test.pass("select unpublish");

		//submit	
		driver.findElement(By.xpath("/html/body/app-my-app/app-signed/div/div[2]/app-blog/div/div/app-edit-blog/div/div/div/form/div[10]/div/button")).click();		
		Thread.sleep(5000);
		test.pass("submitted successfully");


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

