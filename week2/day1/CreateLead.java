package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Parthasarathy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sarathy");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Learning automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sarathisarathit@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
