package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;

	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://classic.freecrm.com/index.html");
	}

	@When("title of login page is Free CRM")
	public void title_of_login_page_is_free_crm() {
	    String title = driver.getTitle();
	    System.out.println("Title of the page is: "+title);
	    Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);    
	}

	@Then("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.name("username")).sendKeys("naveenk");
	    driver.findElement(By.name("password")).sendKeys("test@12345");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    String title = driver.getTitle();
	    System.out.println("Home page title:: "+title);
	    Assert.assertEquals("CRMPRO", title);
	}
	
}
