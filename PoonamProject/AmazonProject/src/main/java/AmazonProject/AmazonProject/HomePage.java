package AmazonProject.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13245919089303511233&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198037&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");


	}

}
