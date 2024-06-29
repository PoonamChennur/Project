package AmazonProject.AmazonProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	private static WebDriver driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		    
	        // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);

	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("AmazonProductSearch Functinality by Poonam chennur", "This is a Test to validate Amazon search Functionality");
	        
	        String path = System.getProperty("user.dir")+"\\reports\\AmazonExtent.html";
	        
	       // System.setProperty("weddriver.gecko.driver", path+"\\reports\\\\index.html\");
			
	        test.log(Status.INFO, "Starting Test Case");
			driver = new ChromeDriver(); //create an object
			
			driver.get("https://www.amazon.in/");
			test.pass("Navigated to amazon.in");
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			test.pass("iphone product searched successfully");
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Led TV");
			test.pass("Led TV product searched successfully");
			
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("air fryer");
			test.pass("air fryer product searched successfully");
			
			driver.findElement(By.xpath("//a[normalize-space()='Best Sellers']")).click();
			test.pass("best seller searched successfully");
			
			driver.findElement(By.xpath("//div[@role='treeitem']//a[contains(text(),'Home & Kitchen')]")).click();
			test.pass("Home & Kitchen searched successfully");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[normalize-space()='Coffee, Tea & Espresso']")).click();
			test.pass("Coffee, Tea & Espresso searched successfully");
			
			driver.findElement(By.cssSelector("div[id='p13n-asin-index-4'] span div:nth-child(1)")).click();
			test.pass("Coffee fother searched successfully");
			
			driver.findElement(By.id("add-to-cart-button")).click();
			test.pass("Item added successfully");
			
			driver.navigate().to("https://www.amazon.in/gp/bestsellers/kitchen/ref=zg_bs_nav_kitchen_0");
			test.pass("navigated to url");
			
			
			driver.findElement(By.xpath("//a[contains(text(),'Kitchen & Dining')]")).click();
			test.pass("Kitchen & Dinning searched successfully");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[normalize-space()='Kitchen Storage & Containers']")).click();
			test.pass("Kitchen Storage & Containers searched successfully");
			
			
			driver.findElement(By.xpath("//a[normalize-space()='Jars & Containers']")).click();
			test.pass("Jars & Containers searched successfully");
			

			driver.findElement(By.xpath("//div[normalize-space()='RILION Multipurpose Plastic 4 In 1 Masala Box for Kitchen, Transparent Pickel Box, 4 Compartment Storage Container Airtight For Cereal, Dry Fruits Dabba1800 Ml with 4 Spoons(Blue)']")).click();
			test.pass("Item searched successfully");
			
			
			driver.findElement(By.id("add-to-cart-button")).click();
			test.pass("Added to cart successfully");
			
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("yoga mat");
			test.pass("yoga mat product searched successfully");
			
			driver.findElement(By.id("nav-search-submit-button")).click();
			test.pass("page opened successfully");
			
			driver.findElement(By.cssSelector("a[title='Purple'] div[class='colorsprite aok-float-left']")).click();
			test.pass("Purple colour selected successfully");
			
			driver.findElement(By.xpath("//span[normalize-space()='Fitness Mantra® Yoga Mat for Gym Workout and Yoga Exercise with 4mm Thickness, Anti-Slip Yoga Mat for Men & Women Fitness (Qnty.-1 Pcs.) (Purple)(4mm)']")).click();
			test.pass("Item opened successfully");
			
			driver.close();
	        test.pass("close the browser");
	        
	        test.pass("Test completed");
	        
	        extent.flush();
		
	}
	
	
	
	
	
}
