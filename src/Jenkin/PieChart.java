package Jenkin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PieChart {
	
@Test
public void t2()
	{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
Actions act=new Actions(driver);

driver.get("https://www.highcharts.com/demo/pie-basic");
WebElement svg = driver.findElement(By.cssSelector("svg"));
List<WebElement> outer = svg.findElements(By.cssSelector("text"));
for(WebElement o:outer)
{
	act.moveToElement(o).build().perform();
//	Thread.sleep(2000);
	System.out.println(o.getText());
	System.out.println();
}
driver.close();
	}

}
