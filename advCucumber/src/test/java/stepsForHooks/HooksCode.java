package stepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksCode {
	WebDriver driver;
	@Before ("@Smoke")
	public void setup() {
		System.out.println("Inside setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://example.testproject.io/web/");
		
	}
	
	@Before(order=1)
	public void setup1() {
		System.out.println("Inside setup 1");
	}
	
	@Before(value= "@Smoke", order=1)
	public void setup2() {
		System.out.println("Inside setup 2");
	}
	
	@After ("@Smoke")
	public void tearDown() {
		System.out.println("Inside teardown");

		driver.close();
		driver.quit();
	}
	
	@After (order=2)
	public void tearDown1() {
		System.out.println("Inside teardown");
	}
	
	@BeforeStep
	public void bStep() {
		System.out.println("Inside before step");
	}
	@AfterStep
	public void aStep() {
		System.out.println("Inside after step");
	}
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	System.out.println("Inside precondition");
	}

	@And("some other precondition")
	public void some_other_precondition() {
		System.out.println("Inside another precondition");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("Inside action completed");
	}


}
