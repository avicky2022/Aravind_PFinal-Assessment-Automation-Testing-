package FinalWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test_NG_Assignment {


@Test
  public void hrmleave_login() {
System.setProperty("webdriver.chrome.driver","C:\\Aravind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='username']")).sendkeys("Admin");
		  driver.findElement(By.xpath("//input[@name='password']")).sendkeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Test
  public void hrmleave_application() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Aravind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-10-25");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
	@Test
	public void search(String username) throws InterruptedException {

		driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

	}

	@Test
	public void search(String username,String Employeename) throws InterruptedException {

		driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
		driver .findElement(By.xpath("//button[@type='submit']")).click();


	}


}