package OnlineMavenproject.OnlineMavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrm3 {
	WebDriver driver = new ChromeDriver();
void login()
{	
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	

}
void Search(String username)
{   driver.findElement(By.linkText("Admin")).click();
driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
	driver.findElement(By.xpath("//form//div//button[2]")).click();
}
void Search(String username,String empnam)

{driver.findElement(By.linkText("Admin")).click();
	driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys(empnam);
	driver.findElement(By.xpath("//form//div//button[2]")).click();
}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Aravind\\chromedriver.exe");
		Hrm3 a = new Hrm3();
	a.login();
	a.Search("Admin");
	a.Search("Admin","Paul Collings");
	
	}

}