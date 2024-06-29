package com.integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	
	@Test
	
	public  void assertdemo() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Most Reliable App";
		Assert.assertEquals(ActualTitle, ExpectedTitle);

}
}
