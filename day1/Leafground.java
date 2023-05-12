package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Leafground {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.Leafground.com/select.xhtml");
	driver.manage().window().maximize();
	//driver.findElement(By.id("j_idt88:name")).sendKeys("amutha");
	WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
	Select options= new Select(tool);
	options.selectByIndex(4);
	}

}
