package stepDefination;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class DealStepWithMap {
WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page(){
		System.setProperty("webdriver.chrome.driver","D:\\Prameet 2020\\Eclips STUFFS\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com");
	}
	
	/*@When("^verify title of login page$")
	public void verify_title_of_login_page(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
	}*/
	
	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credentials){
		for(Map<String, String> data : credentials.asMaps(String.class,String.class)){
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
	}
	}
	
	
	
	@Then("^user clicking on login button$")
	public void user_clicking_on_login_button(){
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
	}
	
	@Then("^user navigate to home page$")
	public void user_navigate_to_home_page(){
		String title=driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
		
	}
	
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() {
		driver.switchTo().frame("mainpanel");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();   
	
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	    
	}
	
	//data table with map: for parameterization of test cases
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable credentials)  {
		for(Map<String, String> data : credentials.asMaps(String.class,String.class)){
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get("title"));
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(data.get("amount"));
		driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(data.get("probability"));
		driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(data.get("comission"));
		driver.findElement(By.xpath("//input[@type='submit'  and  @value='Save']")).click();
	
		//moove to deal page
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();   
	
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	}
	
	
	@Then("^Quit the browser$")
	 public void quit_the_browser(){
		driver.quit();
	}

}
