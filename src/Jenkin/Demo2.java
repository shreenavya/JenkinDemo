package Jenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void t1()
	{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.seleniumhq.org/download/");
		System.out.println(	driver.getTitle());
	}

}
