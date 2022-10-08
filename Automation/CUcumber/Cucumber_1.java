package FinalWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber_1 {
	
	private static WebDriver driver = null;
		@Given("browser is open and application is in login page")
		public void browser_is_open_and_application_is_in_login_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Aravind\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}

		@When("user enters user name and password")
		public void user_enters_user_name_and_password() throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		}

		@Then("apply leave")
		public void home_page_is_displayed() {
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.xpath("//nav/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='yyyy-M-dd']")).sendKeys("2022-09-22");
		//driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]")).sendKeys("2022-09-24");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
		}
	

	
		
}