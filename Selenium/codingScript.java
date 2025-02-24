package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class codingScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//webdriver method to enter input value 
		driver.findElement(By.id("username")).sendKeys("democsr");
		// attribute valu is duplicate //
		//driver.findElement By.classname ("input login").sendkeys("crmsfa")
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//Webdriver methods click() //
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestleafSelenium");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		//driver.findElement By.classname button dangerous
		String actual_title ="Create Account | opentaps CRM";
		String title = driver.getTitle();
		System.out.println("Title of the current page is:"+title);
		if(actual_title.equals(title))
			System.out.println("Correct Title");
		else
			System.out.println("Incorrect Title");
		
		
		Thread.sleep (1000);
		//driver.wait (100)
		driver.close();
		}


	}


