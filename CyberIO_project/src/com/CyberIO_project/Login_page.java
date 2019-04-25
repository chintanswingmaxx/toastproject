package com.CyberIO_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {
	WebDriver driver;
	
    public void invokeBrowser()
			{
	
	try {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://toast-frontend-20190228112546-hostingbucket-dev.s3-website-us-east-1.amazonaws.com");
		driver.findElement(By.name("email")).sendKeys("chintan.s1@wingmaxx.com");           
		 driver.findElement(By.name("password")).sendKeys("Cvs@123456"); 
		 driver.findElement(By.id("submit")).click();
		 Thread.sleep(2000);
		 System.out.println("invalid email and valid password");
		 driver.navigate().refresh();
		 
		 
		 driver.findElement(By.name("email")).sendKeys("chintan.s@wingmaxx.com");           
		 Thread.sleep(3000);
		 driver.findElement(By.name("password")).sendKeys("Cvs@13456"); 
		 driver.findElement(By.id("submit")).click();
		 Thread.sleep(3000);
		 System.out.println("valid email and invalid password");
		 driver.navigate().refresh();
		 
		 driver.findElement(By.name("email")).sendKeys("chintan.s1@wingmaxx.com");           
		 Thread.sleep(3000);
		 driver.findElement(By.name("password")).sendKeys("Cvs@13456"); 
		 driver.findElement(By.id("submit")).click();
		 Thread.sleep(3000);
		 driver.navigate().refresh();       
		 System.out.println("invalid email and password");
		 
		 driver.findElement(By.name("email")).sendKeys("chintan.s@wingmaxx.com	");           
		 Thread.sleep(3000);
		 driver.findElement(By.name("password")).sendKeys("Cvs@12345"); 
		 driver.findElement(By.id("submit")).click();
		 System.out.println("Login Done");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/p/button")).click();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
}
	
	
	public static void main(String[] args) 
	{
		Login_page myObj= new Login_page();
		myObj.invokeBrowser();
	
	}

}
