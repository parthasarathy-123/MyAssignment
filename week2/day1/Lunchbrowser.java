package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lunchbrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps");
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
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumID"));
		Select A=new Select(ownership);
		       A.selectByIndex(0);
		       A.selectByValue("OWN_PARTHERSHIP");
		       A.selectByVisibleText("Public Corporation");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//driver.close();
		

	}

}
