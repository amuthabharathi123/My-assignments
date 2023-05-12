package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args)
	
		throws InterruptedException {
			ChromeDriver lead =new ChromeDriver();
			lead.get("http://leaftaps.com/opentaps/control/login");
			lead.findElement(By.id("username")).sendKeys("demosalesmanager");
			lead.findElement(By.id("password")).sendKeys("crmsfa");
			
			lead.findElement(By.className("decorativeSubmit")).click();
			Thread.sleep(1000);
			lead.findElement(By.partialLinkText("CRM")).click();
			lead.findElement(By.linkText("Leads")).click();
			lead.findElement(By.partialLinkText("Create Lead")).click();
			lead.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			lead.findElement(By.id("createLeadForm_firstName")).sendKeys("amutha");
			lead.findElement(By.id("createLeadForm_lastName")).sendKeys("krishnasamy");
			lead.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("bharathi");
			lead.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("hari");
			lead.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
			lead.findElement(By.id("createLeadForm_description")).sendKeys("all good");
			lead.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("amuthabharathi94@gmail.com");
			lead.findElement(By.name("submitButton")).click();
			String title = lead.getTitle();
			System.out.println("title"+title);
			//lead.close();

}
}
