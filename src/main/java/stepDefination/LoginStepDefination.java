package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver","D:\\Prameet 2020\\Eclips STUFFS\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com");
	}
	
	@When("^title of login page is free CRM$")
	public void title_login_page_is_free_CRM(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
	}
	
	/*@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
	}*/
	//without example keyword
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String un,String pw){
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
	}
	
	
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String title=driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
		
	}
	
	@Then("^close the browser$")
	 public void close_the_browser(){
		driver.quit();
	}
	
	
}

