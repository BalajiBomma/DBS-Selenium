package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	WebDriver driver = null;
	@Given("user opens a browser")
	public void user_opens_a_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		driver.manage().window().maximize();
		System.out.println("Browser open");
		Thread.sleep(1000);
	}
		

	@When("user in login page")
	public void user_in_login_page() {
		driver.navigate().to("https://www.facebook.com/login.php/");
System.out.println("user in login page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("user enter username and password");
		driver.findElement(By.id("email")).sendKeys("8331904069");
		driver.findElement(By.id("pass")).sendKeys("Balaji833@");

	}

	@Then("click submit")
	public void click_submit() {
		System.out.println("click on login");
		driver.findElement(By.id("loginbutton")).click();
	}

}


