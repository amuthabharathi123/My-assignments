package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) 
			throws InterruptedException
	{

		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//driver.manage().window().maximize();
		//driver.close();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("amutha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("krishnasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("bharathi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("hari");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("all good");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("amuthabharathi94@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		
	}

}