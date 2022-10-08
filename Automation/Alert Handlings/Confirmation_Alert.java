package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sana\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html ");//navigate to page
		driver.manage().window().maximize();//maximize the window
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();//find the element to prompt alert
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();//find the element to get alert
		Alert confirm_alert = driver.switchTo().alert();//switch to the alert frame
		Thread.sleep(1000);
		confirm_alert.dismiss();//click on cancel
	}

}
