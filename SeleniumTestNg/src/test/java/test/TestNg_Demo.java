package test;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNg_Demo {

	static WebDriver driver = null;
	@Test

	@BeforeTest
	public void setUpTest() {

		//set driver path
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		

	}

	@Test
	public static void goaptiveAdminLogin() throws InterruptedException {


		//open browser & open url
		driver.get("https://admin.goaptive.com");}

		//******************************************************************************************

		//validation check

		//******************************************************************************************

		//click login without email & password
		public void test(String T) throws InterruptedException { 
			
		if(T.equalsIgnoreCase("firefox"))
				{
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[3]")).click();		
		Thread.sleep(2000);
		
		
		String actualError = "Unsuccessful";
		String expectError = "Success";
		
		Assert.assertEquals(actualError, expectError);
		Assert.assertFalse(true, "Unsuccessful");
		
		System.out.println("click login without email & password");
		
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[3]")).click();		
		Thread.sleep(2000);
		Assert.assertFalse(false, "Success");
		System.out.println("click login without email & password"); }
		
		else if (T.equalsIgnoreCase("firefox1")){
			
			System.out.println("click login without email & password");
			//Assert.assertFalse(true, "Unsuccessful");
			Assert.assertFalse(false, "Success");
		}
		}

		//******************************************************************************************
/*
		//valid email id given
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[2]/span[1]/div/input")).sendKeys("sourav.hazra@appsbee.com");		
		Thread.sleep(2000);
		System.out.println("valid email id given (sourav.hazra@appsbee.com)");

		//click login without password"
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[3]")).click();		
		Thread.sleep(2000);
		System.out.println("click login without password");

		//******************************************************************************************

		//page refresh
		driver.navigate().to("https://admin.goaptive.com");
		Thread.sleep(2000);

		//******************************************************************************************

		//valid password given
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[2]/span[2]/div/input")).sendKeys("123456");		
		Thread.sleep(2000);
		System.out.println("valid password given (123456)");

		//click login without password"
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[3]")).click();		
		Thread.sleep(2000);
		System.out.println("click login without email");

		//******************************************************************************************

		//page refresh
		driver.navigate().to("https://admin.goaptive.com");
		Thread.sleep(2000);

		//******************************************************************************************

		//valid email id given
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[2]/span[1]/div/input")).sendKeys("sourav.hazra@appsbee.com");		
		Thread.sleep(2000);
		System.out.println("valid email id given (sourav.hazra@appsbee.com)");

		//valid password given
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[2]/span[2]/div/input")).sendKeys("123456");		
		Thread.sleep(2000);
		System.out.println("valid password given (123456)");

		//click login	
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[3]")).click();		
		Thread.sleep(5000);
		System.out.println("click login");

		//valid email id given
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[2]/span[1]/div/input")).sendKeys("sourav.hazra@appsbee.com");		
		Thread.sleep(2000);
		System.out.println("valid email id given (sourav.hazra@appsbee.com)");

		//valid password given
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[2]/span[2]/div/input")).sendKeys("123456");		
		Thread.sleep(2000);
		System.out.println("valid password given (123456)");

		//click login	
		driver.findElement(By.xpath("/html/body/app-my-app/app-unsigned/div/div/app-login/div/div/div/form/div/div[3]")).click();		
		Thread.sleep(5000);
		System.out.println("click login");


	}

*/
	@AfterTest
	public void tearDownTest() {

		//close browser
		driver.close();
		System.out.println("Completed");

	}
}
