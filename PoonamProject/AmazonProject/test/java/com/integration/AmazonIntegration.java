package com.integration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonIntegration {
	
	@Test
	
	public void AmazonTest() throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("PoonamC");
		driver.findElement(By.id("ap_email")).sendKeys("poonamchennur9@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Poo3010");
		driver.findElement(By.id("ap_password_check")).sendKeys("Poo3010");
		driver.findElement(By.id("continue")).click();
		//otp generated
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13245919089303511233&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198037&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
        
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Led TV");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='55 inch']")).click();
		driver.findElement(By.xpath("//li[@id='p_123/46655']//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']")).click();
		driver.navigate().to("https://www.amazon.in/s?i=toys&bbn=1350380031&rh=n%3A1350380031%2Cp_85%3A10440599031%2Cp_72%3A1318476031%2Cp_28%3A-SPONS%2Cp_n_age_range%3A1480705031%7C1480706031%7C1480707031%7C1480708031%7C1480709031%7C1665125031%2Cp_36%3A-48000&dc&_encoding=UTF8&_encoding=UTF8&content-id=amzn1.sym.e1f4e1a6-d346-4773-8270-ec7a5d81880d&pd_rd_r=eab63c0e-decf-449c-8d19-06ccb7ddc1bf&pd_rd_w=YpHaB&pd_rd_wg=irPmL&pf_rd_p=e1f4e1a6-d346-4773-8270-ec7a5d81880d&pf_rd_r=MAGTYGA40PD6D78SW9TS&qid=1718019024&rnid=2485523031&ref=pd_hp_d_hero_unk");
		
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
		driver.findElement(By.cssSelector(".nav-sprite.hmenu-close-icon")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("air fryer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='air fryer small']")).click();
		//Thread.sleep(1000);
		//.findElement(By.xpath("//div[@id='deliveryRefinements']//li[@id='p_90/20912642031']//i[@class='a-icon a-icon-checkbox']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().to("https://www.amazon.in/b/ref=ohlr_bstof_Budgetstore/?_encoding=UTF8&node=21557580031&pd_rd_w=f4G0K&content-id=amzn1.sym.5f781396-e66a-45eb-8181-60369e123e59&pf_rd_p=5f781396-e66a-45eb-8181-60369e123e59&pf_rd_r=5GWQX2QEGZ6PJ49CDX39&pd_rd_wg=TONoA&pd_rd_r=504e88e5-1f5a-4885-984f-9299b8441916&ref_=pd_hp_d_hero_unk");
		
		driver.findElement(By.xpath("//a[normalize-space()='Best Sellers']")).click();
		driver.findElement(By.xpath("//div[@role='treeitem']//a[contains(text(),'Home & Kitchen')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Coffee, Tea & Espresso']")).click();
		driver.findElement(By.cssSelector("div[id='p13n-asin-index-4'] span div:nth-child(1)")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.navigate().to("https://www.amazon.in/gp/bestsellers/kitchen/ref=zg_bs_nav_kitchen_0");
		
		driver.findElement(By.xpath("//a[contains(text(),'Kitchen & Dining')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Kitchen Storage & Containers']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Jars & Containers']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='RILION Multipurpose Plastic 4 In 1 Masala Box for Kitchen, Transparent Pickel Box, 4 Compartment Storage Container Airtight For Cereal, Dry Fruits Dabba1800 Ml with 4 Spoons(Blue)']")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		driver.navigate().to("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		//driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("yoga mat");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.cssSelector("a[title='Purple'] div[class='colorsprite aok-float-left']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Fitness Mantra® Yoga Mat for Gym Workout and Yoga Exercise with 4mm Thickness, Anti-Slip Yoga Mat for Men & Women Fitness (Qnty.-1 Pcs.) (Purple)(4mm)']")).click();
		
		
		driver.navigate().to("https://www.amazon.in/cart/smart-wagon?newItems=e99c7520-5ce9-4581-902b-4b02fb69cd8a,1&ref_=sw_refresh");
		driver.navigate().to("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_in&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D%26oldCustomerId%3D0%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_in&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.1&suppressSignInRadioButtons=0");
        driver.close();
        driver.quit();
		
		


}
}
