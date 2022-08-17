package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpCration {
	WebDriver driver;
	@Given("^user navigate orange hrm url\"([^\"]*)\"$")
	public void user_navigate_orange_hrm_url(String url) throws Throwable {
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^user logs in as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_logs_in_as_and_password_as(String user, String pass) throws Throwable {
	   driver.findElement(By.name("txtUsername")).sendKeys(user);
	   driver.findElement(By.name("txtPassword")).sendKeys(pass);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@When("^user click pim$")
	public void user_click_pim() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	}

	@When("^user click add button$")
	public void user_click_add_button() throws Throwable {
		driver.findElement(By.id("btnAdd")).click();
	}

	@When("^user enter as\"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_as_and_and(String fname, String mname, String lname) throws Throwable {
	    driver.findElement(By.name("firstName")).sendKeys(fname);
	    driver.findElement(By.name("middleName")).sendKeys(mname);
	    driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@When("^user click save button$")
	public void user_click_save_button() throws Throwable {
		driver.findElement(By.id("btnSave")).click();
	}

	@Then("^user validates url$")
	public void user_validates_url() throws Throwable {
	  String expected="empNumber";
	  String actual=driver.getCurrentUrl();
	  if(actual.contains(expected))
	  {
		  System.out.println("Emp Creation Success::"+expected+"       "+actual);
	  }
	  else
	  {
		  System.out.println("Emp Creation Fail::"+expected+"       "+actual); 
	  }
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	   driver.close();
	}
}
