/*package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateNewDeal {
WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page(){
		System.setProperty("webdriver.chrome.driver","D:\\Prameet 2020\\Eclips STUFFS\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com");
	}
	
	@When("^verify title of login page$")
	public void verify_title_of_login_page(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
	}
	
	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credentials){
		List<List<String>> data=credentials.raw();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
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
		WebElement dealsLink=driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		Actions act=new Actions(driver);
		act.moveToElement(dealsLink).build().perform();   
	
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	    
	}
	
	
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealData)  {
		List<List<String>> datas=dealData.raw();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(datas.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(datas.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(datas.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(datas.get(0).get(3));
	
	}
	
	
	@Then("^Quit the browser$")
	 public void quit_the_browser(){
		driver.quit();
	}

}
*/