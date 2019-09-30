package com.arm.webtester;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtester {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://dev/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void subaruGoogleSearch() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		searchBox.sendKeys("subaru" + Keys.RETURN);
				
		Thread.sleep(2000);
	}
	
	//This is an example of poor code, not maintainable and extremely fragile. Should make an object that represents
	//a page
	@Test
	public void demoSiteActivity() {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");
		
		driver.findElement(By.xpath
				("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"))
				.click();
		
		driver.findElement(By.xpath
				("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"))
				.sendKeys("yourda");
		
		driver.findElement(By.xpath
				("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"))
				.sendKeys("atest");
		
		driver.findElement(By.xpath
				("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"))
				.click();
		
		driver.findElement(By.xpath
				("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"))
				.click();
		
	}
}
