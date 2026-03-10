package org.bus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {

	static WebDriver driver;

	@BeforeClass
	public static void Launch() {

		driver = new ChromeDriver();

		driver.get("https://www.redbus.in");

		driver.manage().window().maximize();

	}

	@Test
	public void Login() throws AWTException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys("Coimbatore");

		Thread.sleep(3000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("Bangalore");

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		driver.findElement(By.xpath("(//i[@role='button'])[2]")).click();

		driver.findElement(By.xpath("//span[text()='22']")).click();
		driver.findElement(By.xpath("//button[@class='primaryButton___af12b1 searchButtonWrapper___7ffc91 ']")).click();

		driver.findElement(By.xpath("//div[text()='SNB Travels']")).click();

		driver.findElement(By.xpath("//span[@id='08']")).click();
		driver.findElement(By.xpath("//button[text()='Select boarding & dropping points']")).click();

		driver.findElement(By.xpath("//div[text()='Avinashi']")).click();

		driver.findElement(By.xpath("(//div[text()='GST Road, Perungalathur'])[1]")).click();

		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("8675905302");
		driver.findElement(By.xpath("//input[@placeholder='Enter email id']")).sendKeys("Psasikala23@gmail.com");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement click = driver.findElement(By.xpath("//label[text()='State of Residence *']"));

		wait.until(ExpectedConditions.elementToBeClickable(click));

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement Tamilnadu = driver.findElement(By.xpath("//div[text()='Tamil Nadu']"));

		wait1.until(ExpectedConditions.elementToBeClickable(Tamilnadu)).click();

		Tamilnadu.click();

		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Sasikala P");

		driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("32");
		driver.findElement(By.xpath("//div[@aria-label='Female']")).click();

	}

}
