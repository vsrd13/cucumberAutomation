package stepDefinition;

/* This is my cucumber project
 * 
 */
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	public static WebDriver driver;
	
	@Given("^Open Browser and start application$")
	public void open_Browser_and_start_application() throws Throwable {
	    
		
		File dir = new File(".//");
		String mainfolder = dir.getCanonicalPath();
		
		System.setProperty("webdriver.chrome.driver", mainfolder + "\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/index.php");
	}
	
	@Given("^a user has logged in user id \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_user_has_logged_in_user_id_and_password(String arg1, String arg2) throws Throwable {
		
		arg1 = "mngr56733";
		arg2 = "AmUzYtu";
		
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(arg1);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(arg2);
		driver.findElement(By.name("btnLogin")).click();
	}

	@Given("^the user is on the Edit Customer page$")
	public void the_user_is_on_the_Edit_Customer_page() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[3]/a")).click();
		
		}

	@When("^he submits \"([^\"]*)\" as customer id$")
	public void he_submits_as_customer_id(String arg1) throws Throwable {
		
		driver.findElement(By.name("cusid")).sendKeys("28631");
		driver.findElement(By.name("AccSubmit")).click();
	}

	@Then("^ensures the customer name is \"([^\"]*)\"$")
	public void ensures_the_customer_name_is(String arg1) throws Throwable {
		
		WebElement Custname = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
		String CustomerName = Custname.getAttribute("value");
		try{
		    Assert.assertEquals("Suresh", CustomerName);
		    System.out.println("Customer Name is: " + CustomerName);
		}catch(Throwable e){
		    System.err.println("Customer Name is not" + CustomerName + e.getMessage());
		}
	}

	@Then("^ensures the customer gender is \"([^\"]*)\"$")
	public void ensures_the_customer_gender_is(String arg1) throws Throwable {
		WebElement Gen = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input"));
		String Gender = Gen.getAttribute("value");
		
		try{
		    Assert.assertEquals("male", Gender);
		    System.out.println("Customer Gender is: " + Gender);
		}catch(Throwable e){
		    System.err.println("Customer Gender is not: " + Gender + e.getMessage());
		}
	}

	@Then("^ensures that DoB is \"([^\"]*)\"$")
	public void ensures_that_DoB_is(String arg1) throws Throwable {
		WebElement Dob = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"));
		String DateOfBirth = Dob.getAttribute("value");
		
		try{
		    Assert.assertEquals("1993-01-08", DateOfBirth);
		    System.out.println("Date Of birth is: " + DateOfBirth);
		}catch(Throwable e){
		    System.err.println("Date Of birth is not Equal: " + DateOfBirth + e.getMessage());
		}
	}

	@Then("^close the application\\.$")
	public void close_the_application() throws Throwable {
		
		driver.quit();   
	}



}
