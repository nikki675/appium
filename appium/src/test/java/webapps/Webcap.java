package webapps;

import java.awt.Desktop.Action;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Webcap extends webapplication {
	
AndroidDriver<AndroidElement> driver; // using android driver to click on android element
	
	
	
	
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		driver=cap1();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
	@Test
	public void tc1() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("moolyaed");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
       
		List<AndroidElement> links = driver.findElements(By.tagName("a"));
		links.size();
		System.out.println(links.size());
//     for(int i=0;i<links.size();i++) {
//    	 Thread.sleep(3000);
//      System.out.println(links.get(i).getText());
//       Thread.sleep(5000);
//        System.out.println(links.get(i).getAttribute("href"));
		Thread.sleep(3000);
        AndroidElement star= driver.findElement(By.xpath("//*[@class='//*[@class='TbwUpd NJjxre']"));
        Thread.sleep(3000);
        JavascriptExecutor js= ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", star);
        star.click();
    }
		
}
	

