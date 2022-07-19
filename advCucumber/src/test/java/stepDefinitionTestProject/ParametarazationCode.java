package stepDefinitionTestProject;

import java.util.List;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.Parameter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametarazationCode {
	WebDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
//		System.out.println("Inside user is on the login page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
	}

	@When("^user enters ([^\"]*) and ([^\"]*)$")
	public void user_enters_rahul_and(String username, String password) {
//		System.out.println("This is a username: "+username +  password);
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
//		System.out.println("Inside clicks on the login button");
		driver.findElement(By.id("login")).click();
	}

	@Then("^user is navigated to the home page and select ([^\"]*)$")
	public void user_is_navigated_to_the_home_page(String country) {
		Select countryName = new Select(driver.findElement(By.id("country")));
		countryName.selectByValue(country);
		driver.findElement(By.id("logout")).click();
		driver.quit();
	}

}
