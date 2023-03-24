package stepdefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class LoginstepsDefinition {
	WebDriver driver;
	@RunWith(Cucumber.class)
	public class MyStepDefinitions {

	    @Given("^open the browser$")
	    public void open_the_browser() throws Throwable {
            System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
	    }

	    @When("^Enter the URL\"([^\"]*)\"$")
	    public void enter_the_urlsomething(String strArg1) throws Throwable {
	       driver.get("https://admin-demo.nopcommerce.com");
	       
	    }

	    @And("^Enter registered username and password$")
	    public void Enter_registered_username_and_password() throws Throwable {
	        driver.findElement(By.id("Email")).clear();
	        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	        driver.findElement(By.id("Password")).clear();
	        driver.findElement(By.id("Password")).sendKeys("admin");
	    }
	    @Then("^user must successfully login to the webpage$")
	    public void user_must_successfully_login_to_the_webpage$n() throws Throwable {
	    	String exp_tittle=driver.getTitle();
	    	System.out.println(exp_tittle);
	    	if(exp_tittle=="Dashboard/nopcommerce Adinistration")
	    	{
	    		System.out.println("test passed");
	    	}
	    	else
	    	{
	    		System.out.println("test failed");
	    	}
	    }

	    @And("^Click on login button$")
	    public void click_on_login_button() throws Throwable {
	    	driver.findElement(By.xpath("\"//button[text()='Log in']\"")).click();
	    }

	}

}
