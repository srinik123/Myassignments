package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//webdriver method to enter input value 
		driver.findElement(By.id("username")).sendKeys("democsr");
		// attribute valu is duplicate //
		//driver.findElement By.classname ("input login").sendkeys("crmsfa")
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestleafSelenium");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement selectDropdown = driver.findElement(By.xpath("//select[@class='inputBox']"));
		
		//syntax to implement the select class
				Select options = new Select(selectDropdown);
				
				options.selectByIndex(3);
				
				Thread.sleep(1000);
				options.selectByVisibleText("Cypress");
	   
		Thread.sleep (1000);
		//driver.wait (100)
		driver.close();
		
	}

}
