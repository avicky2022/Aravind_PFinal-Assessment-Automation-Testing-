package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sana\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html ");//navigate to page
		driver.manage().window().maximize();//maximize the window
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();//find the element to prompt alert
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();//find the element to get alert
		Alert prompt_alert = driver.switchTo().alert();//switch to the alert frame
		System.out.println(prompt_alert.getText());//get the field to send data
		Thread.sleep(1000);
		prompt_alert.sendKeys("sana");//send the data
		Thread.sleep(1000);
		prompt_alert.accept();//click on OK
		
		
	}

}
