package com.CyberIO_project;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Forgot_password {
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
				
				driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/div[2]/div/div/form/div[3]/a")).click();
				driver.findElement(By.id("submit")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/div[2]/div/div[1]/div/div/button/span")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[2]/div[2]/div/div[1]/form/div[1]/input")).sendKeys("chintan.s@wingmaxx.com");
				Thread.sleep(3000);
				driver.findElement(By.id("submit")).click();
				Thread.sleep(3000);
				//driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[1]/a/div/img")).click();
				System.out.println("Code successfully send in your mail");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
				}
	public static void main(String[] args) {
		Forgot_password myObj= new Forgot_password();
		myObj.invokeBrowser();
	

	}

}
