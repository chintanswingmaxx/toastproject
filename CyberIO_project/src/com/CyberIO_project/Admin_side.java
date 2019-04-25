package com.CyberIO_project;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.CyberIO_project.Environment;

public class Admin_side {
	WebDriver driver;

	public void invokeBrowser() {

			try {
				System.setProperty("Webdriver.chrome.driver",
						new Environment().getPath());

				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

				driver.get("http://toast-admin-frontend.s3-website-us-east-1.amazonaws.com/");
				driver.findElement(By.name("email")).sendKeys("chintan.so@wingmaxx.com");
				Thread.sleep(2000);
				driver.findElement(By.name("password")).sendKeys("Cc_963852");
				driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/form/div/button")).click();
		
				
				WebElement htmltable=driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/table/thead"));
			
				List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
			
				for(int rnum=0;rnum<rows.size();rnum++)
			
				{
			
				List<WebElement> columns=rows.get(rnum).findElements(By.tagName("th"));
			
				System.out.println(" Number of columns 	 	: "   +columns.size());
			
				 
			
				for(int cnum=0;cnum<columns.size();cnum++)
				
				{
				
				System.out.println(columns.get(cnum).getText());
			
				}
				
		}
				
				
			
				driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/table/tbody/tr[1]/td[6]/button[2]")).click();
			
				WebElement htmltable1=driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/table/tbody"));
				
				List<WebElement> rows1=htmltable1.findElements(By.tagName("tr"));
			
			
			
				for(int rnum=0;rnum<rows1.size();rnum++)
			
				{
			
				List<WebElement> columns=rows1.get(rnum).findElements(By.tagName("td"));
			
				System.out.println("Number of row:"+rows1.size());
			
	
			
				for(int cnum=0;cnum<columns.size();cnum++)
				
				{
				
				System.out.println(columns.get( cnum ).getText());
			
				}
				
		}
				
				Thread.sleep(3000);
		
				driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/div/div/a")).click();
				
			
			
			} 	catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}

	
	
	
	public static void main(String[] args) 
			{
				Admin_side myObj = new Admin_side();
				myObj.invokeBrowser();

			}

}
