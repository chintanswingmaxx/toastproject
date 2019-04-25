package expert_Register;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class User_profilepage {
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

			// User Profile

			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button[1]"))
					.click();

			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/input"))
					.clear();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/input"))
					.sendKeys("surat");

			driver.findElement(By.name("dateOfBirth")).click();
			for (int x = 0; x <= 2; x++) {
				Thread.sleep(3000);
				driver.findElement(By.xpath(
						"//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div/button"))
						.click();

			}
			driver.findElement(By.xpath(
					"//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[4]"))
					.click();

			driver.findElement(
					By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[3]/input[1]")).click();

			driver.findElement(By.name("linkedInProfileLink")).sendKeys("no data");
			driver.findElement(By.name("personalWebsite")).sendKeys("no data");
			driver.findElement(By.name("timezone")).sendKeys("no data");
			driver.findElement(By.name("expertHeadline")).sendKeys("no data");
			Thread.sleep(2000);

			// Expert Industry

			Actions act = new Actions(driver);

			act.moveToElement(driver.findElement(
					By.xpath("//*[@id='root']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[8]/div/div"))).click()
					.build().perform();
			Thread.sleep(2000);
			act.click(driver.findElement(
					By.xpath("//*[@id='root']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[8]/div/div[2]/div[1]")))
					.build().perform();

			Thread.sleep(2000);

			for (int i = 0; i < 2; i++) {
				Thread.sleep(2000);
				act.moveToElement(driver.findElement(
						By.xpath("//*[@id='root']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[8]/div/div")))
						.click().build().perform();
				Thread.sleep(2000);
				act.click(driver.findElement(By.xpath(
						"//*[@id='root']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[8]/div/div[2]/div[1]/div[1]")))
						.build().perform();
			}

			for (int j = 0; j < 2; j++) {
				Thread.sleep(2000);
				driver.findElement(By.className("css-19bqh2r")).click();
			}

//			 System.out.println("id "
//			 +driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[8]/div/div[2]/div[1]/div[1]")).getAttribute("innerText"));

			driver.findElement(By.name("expertSummary")).sendKeys("no data");

//Languages			

			driver.findElement(By.className("css-1alnv5e")).click();

			Actions act1 = new Actions(driver);

			act1.moveToElement(driver.findElement(By.xpath(
					"//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[11]/div/div/div[1]/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act1.click(driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[11]/div/div/div[1]/div[4]")))
					.build().perform();

//			System.out.println("id " +driver.findElement(
//					By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[11]/div/")).getAttribute("innerText"));

			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button")).click();
			//driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[11]/div/div/div[1]/div[1]/div[2]/svg")).click();
System.out.println("User Profile form done");
			
// Degree

			Actions act2 = new Actions(driver);

			act2.moveToElement(driver.findElement(By
					.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act2.click(driver.findElement(By.xpath(
					"//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div/div[1]/div[4]")))
					.build().perform();
			driver.findElement(By.name("school")).sendKeys("no data");
			driver.findElement(By.name("degree")).sendKeys("no data");
			driver.findElement(By.name("graduationYear")).sendKeys("no data");
			driver.findElement(By.name("activities")).sendKeys("no data");
			driver.findElement(By.name("notes")).sendKeys("no data");
			Thread.sleep(2000);
			
			  driver.findElement(By.xpath(
			  "//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button[3]"))
			  .click();
			  System.out.println("Degree form done");  
			  
			  // Technical Certification : 1
			  
			  driver.findElement(By.name("authority")).sendKeys("no data");
			  driver.findElement(By.name("certificateName")).sendKeys("no data");
			 
				Actions act3 = new Actions(driver);

				act3.moveToElement(driver.findElement(By
						.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[4]/div/div/div[1]")))
						.click().build().perform();
				Thread.sleep(2000);
				act3.click(driver.findElement(By.xpath(
						"//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[4]/div/div/div[1]/div[3]")))
						.build().perform();			  
			  
			  
			  driver.findElement(By.name("certificateNumber")).sendKeys("no data");
			  driver.findElement(By.name("technicalGraduationYear")).sendKeys("no data");
			  
			  Thread.sleep(2000); driver.findElement(By.xpath(
			  "//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button[3]"))
			  .click();
			  System.out.println(" Technical Certification form done");  
			  
			  // WorkExperience
			  
			  driver.findElement(By.name("company")).sendKeys("no data");
			  driver.findElement(By.name("position")).sendKeys("no data");
			  
			   driver.findElement(By.name("startDate")).click(); 
			   for (int x = 0; x <=2; x++) 
			  {  
				   Thread.sleep(3000); 
			  	driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[3]/div[2]/div/button[2]")).click(); 
	
			  }
			   driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[4]")).click();  
			   
			   driver.findElement(By.name("endDate")).click(); 
               for (int y = 0; y <= 2; y++) 
               { 
            	   Thread.sleep(3000); 
            	   driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[4]/div[2]/div/button[2]")).click();
		
		}
               
               driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[4]/div[2]/div/div[2]/div[2]/div[4]/div[1]")).click();
			 
               driver.findElement(By.name("description")).sendKeys("no data");
				
               Actions act4 = new Actions(driver);

				act4.moveToElement(driver.findElement(By
						.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[7]/div/div/div[1]")))
						.click().build().perform();
				Thread.sleep(2000);
				act4.click(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[7]/div/div/div[1]/div[4]"))).build().perform();
               
               
               
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button[3]")).click();
			  System.out.println(" WorkExperience form done"); 
			
			  // ExpertCourses
			  
			  driver.findElement(By.name("courseProvider")).sendKeys("no data");
			  driver.findElement(By.name("courseName")).sendKeys("no data");
			  driver.findElement(By.name("graduationYear")).sendKeys("no data");
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button[3]")).click();
			  System.out.println(" ExpertCourses form done"); 
			  
			  // workProjectExperience
			  
			  driver.findElement(By.name("name")).sendKeys("no data");
			  driver.findElement(By.name("description")).sendKeys("no data");

			  
//			    Actions act5 = new Actions(driver);
//			  
//			  	act5.moveToElement(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[3]/div/div"))).click().build().perform();
//			  	Thread.sleep(2000);
//			  	act5.click(driver.findElement(By.xpath("//*[@id=\'react-select-2-option-0\']"))).build().perform();	
			    Thread.sleep(2000); 
                driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button[3]")).click();
			  
			  //JobReference : 1
			  
			  driver.findElement(By.name("name")).sendKeys("no data");
			  driver.findElement(By.name("position")).sendKeys("no data");

			  Actions act6 = new Actions(driver);

				act6.moveToElement(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[3]/div/div/div[1]"))).click().build().perform();
				Thread.sleep(2000);
				act6.click(driver.findElement(By.xpath("//*[@id=\'react-select-9-option-0\']"))).build().perform();
    		  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button[3]")).click();
			  System.out.println("JobReference");
			
			  
			  //expertSkill
			  
			  driver.findElement(By.name("skillName")).sendKeys("no data");
			  driver.findElement(By.name("skillDescription")).sendKeys("no data");
			  
//			  Actions act7 = new Actions(driver);
//
//				act7.moveToElement(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[3]/div/div/div[1]"))).click().build().perform();
//				Thread.sleep(2000);
//				act7.click(driver.findElement(By.xpath("//*[@id=\'react-select-7-option-0\']"))).build().perform();
//			  
//				 Actions act8 = new Actions(driver);
//
//					act8.moveToElement(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[4]/div/div/div[1]"))).click().build().perform();
//					Thread.sleep(2000);
//					act8.click(driver.findElement(By.xpath("//*[@id=\"react-select-8-option-2\"]"))).build().perform();
					System.out.println("expertSkill");
			System.out.println("sign up");
			  
			  
			  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div[2]/div[2]/div/div/div[1]/button[3]")).click();
		
			  
			  //	  Engagement Form
			  
			 
			driver.findElement(By.xpath("//*[@id=\'navbarSupportedContent\']/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[2]/ul/li[1]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[2]/ul/li[2]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[2]/ul/li[3]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[2]/ul/li[4]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[3]/div[4]/button")).click();

			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[2]/div/input"))
					.sendKeys("my project is good");
			Actions act9 = new Actions(driver);

			act9.moveToElement(driver
					.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[3]/div/div/div/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act9.click(driver.findElement(By.xpath("//*[@id=\'react-select-2-option-1\']"))).build().perform();

			Thread.sleep(2000);

			Actions act10 = new Actions(driver);

			act10.moveToElement(driver
					.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[5]/div/div/div/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act10.click(driver.findElement(By.xpath("//*[@id=\'react-select-3-option-2\']"))).build().perform();

			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[6]/div/div[1]/div/textarea"))
					.sendKeys("hello");

			Actions act11 = new Actions(driver);

			act11.moveToElement(driver.findElement(
					By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[6]/div/div[2]/div/div/div/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act11.click(driver.findElement(By.xpath("//*[@id=\'react-select-4-option-2\']"))).build().perform();

			Actions act12 = new Actions(driver);

			act12.moveToElement(driver.findElement(
					By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[6]/div/div[3]/div/div/div/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act12.click(driver.findElement(By.xpath("//*[@id=\'react-select-5-option-2\']"))).build().perform();

			Actions act13 = new Actions(driver);

			act13.moveToElement(driver.findElement(
					By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[6]/div/div[4]/div/div/div/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act13.click(driver.findElement(By.xpath("//*[@id=\'react-select-6-option-2\']"))).build().perform();

			Actions act14 = new Actions(driver);

			act14.moveToElement(driver.findElement(
					By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[6]/div/div[5]/div/div/div/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act14.click(driver.findElement(By.xpath("//*[@id=\'react-select-7-option-2\']"))).build().perform();

			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[4]/div/div/div[7]/button[2]")).click();

			Actions act15 = new Actions(driver);

			act15.moveToElement(driver
					.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[5]/div/div/div[2]/div/div/div/div[1]")))
					.click().build().perform();
			Thread.sleep(2000);
			act15.click(driver.findElement(By.xpath("//*[@id=\'react-select-8-option-1\']"))).build().perform();
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[5]/div/div/div[3]/div/textarea"))
					.sendKeys("good work");
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div[5]/div/div/div[4]/button[2]")).click();
			System.out.println("Successfully submited project");
		
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		User_profilepage myObj = new User_profilepage();
		myObj.invokeBrowser();
	}

}
