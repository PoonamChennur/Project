package com.integration;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
	
	private static WebDriver driver = null;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']")).click();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Led TV");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='55 inch']")).click();
		driver.findElement(By.xpath("//li[@id='p_123/46655']//i[@class='a-icon a-icon-checkbox']")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Transaction page");
  }

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13245919089303511233&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198037&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");

  }

  @AfterClass
  public void afterClass() {
	  String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Most Reliable App";
		Assert.assertEquals(ActualTitle, ExpectedTitle);


  }

  @BeforeTest
  public void beforeTest() {
	  driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("PoonamC");
		driver.findElement(By.id("ap_email")).sendKeys("poonamchennur9@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Poo3010");
		driver.findElement(By.id("ap_password_check")).sendKeys("Poo3010");
		driver.findElement(By.id("continue")).click();
		//otp generated
		
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Customer review");
  }

  @BeforeSuite
  public void beforeSuite() {
	  WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  driver.quit();
  }

}
