package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts
{
	public static void main(String[] args)
			
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("amutha");
		driver.findElement(By.id("lastNameField")).sendKeys("krishnasamy");
		driver.findElement(By.name("submitButton")).click();
		String firstName=driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println("firstName"+firstName);
		String title = driver.findElement(By.id("ext-gen1164")).getText();
		System.out.println("title"+title);
		driver.close();
		}
	
}
		
			