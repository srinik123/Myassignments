package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		//Thread.sleep(1000);
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title of the current page is: "+ title);
		
		driver.close();
		
		
		
			
		
		

	}

	

}
