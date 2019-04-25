package com.CyberIO_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Engagement_Form {

	WebDriver driver;

	public void invokeBrowser() {

	
			try {
				System.setProperty("Webdriver.chrome.driver",
						"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

				driver.get("http://toast-frontend-20190228112546-hostingbucket-dev.s3-website-us-east-1.amazonaws.com/");
				driver.findElement(By.name("email")).sendKeys("chintan.s@wingmaxx.com");
				Thread.sleep(2000);
				driver.findElement(By.name("password")).sendKeys("Cvs@12345");
				driver.findElement(By.id("submit")).click();
				Thread.sleep(2000);
				//driver.get("http://toast-frontend-20190228112546-hostingbucket-dev.s3-website-us-east-1.amazonaws.com/engagement-form");
		
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[2]/ul/li[1]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[2]/ul/li[2]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[2]/ul/li[3]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[2]/ul/li[4]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[4]/button")).click();
			
			
			
			
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
	
	
	}
	
	
	public static void main(String[] args) {
		Engagement_Form myObj = new Engagement_Form();
		myObj.invokeBrowser();

	}

}
