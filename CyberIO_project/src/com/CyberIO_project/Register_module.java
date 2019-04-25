package com.CyberIO_project;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Register_module {
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
					
					driver.findElement(By.linkText("Register")).click();
					
					//Customer Register
					
					driver.findElement(By.linkText("Customer Register")).click();
					Thread.sleep(3000);
					driver.findElement(By.id("submit")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/div[2]/div/div/div[2]/div/button/span")).click();
					driver.findElement(By.name("firstName")).sendKeys("chintan");
					driver.findElement(By.name("middleName")).sendKeys("v");
					driver.findElement(By.name("lastName")).sendKeys("shastri");
					driver.findElement(By.name("email")).sendKeys("chintan.s@wingmaxx.com");
					driver.findElement(By.name("password")).sendKeys("Cvs@123");
					driver.findElement(By.name("password")).sendKeys("Cvs@123");
					driver.findElement(By.id("submit")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[1]/a/div/img")).click();
					Thread.sleep(3000);
					
					
					//Expert Register
					
					
					driver.findElement(By.linkText("Register")).click();
					driver.findElement(By.linkText("Expert Register")).click();
					driver.findElement(By.name("firstName")).sendKeys("chintan");
					driver.findElement(By.name("middleName")).sendKeys("v");
					driver.findElement(By.name("lastName")).sendKeys("shastri");
					driver.findElement(By.name("email")).sendKeys("chintan.s@wingmaxx.com");
					driver.findElement(By.name("password")).sendKeys("Cvs@123");
					driver.findElement(By.name("password")).sendKeys("Cvs@123");
					driver.findElement(By.id("submit")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[1]/a/div/img")).click();
					
			} catch (Exception e) {
				
				e.printStackTrace();
			}
				
				}
	public static void main(String[] args) {
		Register_module myObj= new Register_module();
		myObj.invokeBrowser();

	}

}
