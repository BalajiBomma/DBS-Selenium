package Steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLogin {
	 WebDriver driver=null;
	@Given("browser is openening")
	public void browser_is_openening() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
System.out.println("User opens a browser");	
}

	@When("user is in git page")
	public void user_is_in_git_page() {
		driver.navigate().to("https://github.com/login");
	   System.out.println("user in git login page");
	}
	 @When ("user entered username and password")
	 public void user_entered_username_and_password() {
		 driver.findElement(By.id("login_field")).sendKeys("Balajibomma190@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("8331904069");
		 System.out.println("user entered username and passsword");
	 }
	 
	 @Then ("click Button")
	 public void click_Button() {
		 driver.findElement(By.xpath("//input[@value='Sign in']"));
		 System.out.println("Submit");
	 }

}
