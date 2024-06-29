package AmazonProject.AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSearch {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
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
		
		
		
		
		
		
		
		
	}

}
