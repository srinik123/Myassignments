package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class selintro {

	public static void main(String[] args) throws InterruptedException {
	{
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.close();

	}


	}

}
