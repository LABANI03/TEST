package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo {

    public static void main(String[] args) throws InterruptedException, Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).click();
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("shoes for woman");
		//Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone");
	Thread.sleep(1000);
	Robot rt=new Robot();
	rt.keyPress(KeyEvent.VK_ENTER);
	rt.keyRelease(KeyEvent.VK_ENTER);
	JavascriptExecutor jsExec = (JavascriptExecutor) driver;
	jsExec.executeScript("window.scrollBy(0,800)");
	Thread.sleep(10000);
	jsExec.executeScript("window.scrollBy(0,-200)");
	driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();
	jsExec.executeScript("window.scrollBy(0,-800)");
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//span[@class='nav-line-2'])[3]")).click();
	Thread.sleep(10000);
	//WebElement doubleClickLink = driver.findElement(By.id("testdoubleclick"));
	//Actions action = new Actions(driver);
	//action.doubleClick(doubleClickLink).build().perform();
	//rt.keyPress(KeyEvent.VK_ENTER);
	//rt.keyRelease(KeyEvent.VK_ENTER);
	//Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8617851913");
	driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']")).click();
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Welcome@123");
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
    }

}
