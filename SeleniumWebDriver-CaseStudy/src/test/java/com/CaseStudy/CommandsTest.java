package com.CaseStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CommandsTest {
	WebDriver driver;
	
	@Test
	public void easyCalculationTest1() {
		driver = new ChromeDriver();
		driver.get("https://www.login.hiox.com/register?referrer=easycalculation.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource().length());
		System.out.println(driver.getPageSource());
		driver.quit();
	}
	
	@Test
	public void easyCalculationTest2() {
		driver = new ChromeDriver();
		driver.get("https://easycalculation.com/");
		driver.findElement(By.xpath("//input[@id='googleSearchId']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource().length());
		System.out.println(driver.getPageSource());
//		driver.quit();
	}
	
	@Test
	public void easyCalculationTest3() {
		driver = new ChromeDriver();
		driver.get("https://easycalculation.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			System.out.println(link.isDisplayed());
			System.out.println(link.isEnabled());
			System.out.println("URL       : " + url);
		}
//		driver.quit();
	}
	
	@Test
	public void Webkul() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://store.webkul.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("link count " + links.size());

		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
	@Test
	public void AutomationPractice() {
		ChromeDriver driver = new ChromeDriver();

        String expectedUrl = "http://automationpractice.com/index.php";
        driver.get(expectedUrl);
        String title = driver.getTitle();

        System.out.println("Page Title: " + title);
        System.out.println("Title Length: " + title.length());

        String actualUrl = driver.getCurrentUrl();

        System.out.println("Current URL: " + actualUrl);


        if(expectedUrl.equals(actualUrl))
        	System.out.println("URL verification successful");
        else
        	System.out.println("Not a desired URL");

        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        
		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
	

}
