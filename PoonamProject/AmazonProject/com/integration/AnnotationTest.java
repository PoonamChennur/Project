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
  @Test
  public void f() {
	  System.out.println("Item added to cart");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Led TV");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='55 inch']")).click();
		driver.findElement(By.xpath("//li[@id='p_123/46655']//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']")).click();
		driver.navigate().to("https://www.amazon.in/s?i=toys&bbn=1350380031&rh=n%3A1350380031%2Cp_85%3A10440599031%2Cp_72%3A1318476031%2Cp_28%3A-SPONS%2Cp_n_age_range%3A1480705031%7C1480706031%7C1480707031%7C1480708031%7C1480709031%7C1665125031%2Cp_36%3A-48000&dc&_encoding=UTF8&_encoding=UTF8&content-id=amzn1.sym.e1f4e1a6-d346-4773-8270-ec7a5d81880d&pd_rd_r=eab63c0e-decf-449c-8d19-06ccb7ddc1bf&pd_rd_w=YpHaB&pd_rd_wg=irPmL&pf_rd_p=e1f4e1a6-d346-4773-8270-ec7a5d81880d&pf_rd_r=MAGTYGA40PD6D78SW9TS&qid=1718019024&rnid=2485523031&ref=pd_hp_d_hero_unk");
		
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Buy Now");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13245919089303511233&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198037&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");

  }

  @AfterClass
  public void afterClass() {
	  WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Most Reliable App";
		Assert.assertEquals(ActualTitle, ExpectedTitle);

  }

  @BeforeTest
  public void beforeTest() {
	  driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
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
	  
	  System.out.println("Custmer feedback");
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
