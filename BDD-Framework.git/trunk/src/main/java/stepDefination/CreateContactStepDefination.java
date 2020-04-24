package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContactStepDefination {
	
WebDriver driver;
	
	@Given("^user is create a new contact$")
	public void user_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver","D:\\Prameet 2020\\Eclips STUFFS\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();

}
	
	@When("^user mouse over in contact link$")
	public void user_mouse_over_in_contact_link(){
		WebElement contactLink=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		Actions act=new Actions(driver);
		driver.switchTo().frame("mainpanel");
		act.moveToElement(contactLink).build().perform();
		
	}
	
	@Then("^user click on new contact link$")
	public void user_click_on_new_contact_link(){
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
	}
	
}
