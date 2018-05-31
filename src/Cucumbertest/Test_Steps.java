package Cucumbertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver ;
	
	
	
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AAkash DATA\\Profile DATA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
	}
	
	

	public void user_is_on_Home_Page() throws Throwable {
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://mapworks-integration.skyfactor.com");
        
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prod1@mailinator.com");
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Qait@123");
		driver.findElement(By.xpath("//button[@type='submit'][@tabindex=2]")).click();
		driver.wait(10000);
        
        
       /* 
        String expectedtitle= "Mapworks - Login";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expectedtitle)){
			System.out.println("I am on Skyfactor login page");	
		}else
		{
			System.out.println("I am not on skyfactor login as page");
		}
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		
		Thread.sleep(2000);
		
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		String expectedtitle= "Mapworks - Overview";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expectedtitle)){
			System.out.println("I am on Skyfactor Overview page");	
		}else
		{
			System.out.println("I am not on skyfactor overview as page");
		}
	    // Write code here that turns the phrase above into concrete actions
	   
	}

@When("^User LogOut from the Application$")
public void user_LogOut_from_the_Application() throws Throwable {
	driver.findElement (By.xpath("//a[@id='acountaccordian']")).click();
	driver.wait(2000);
	
	driver.findElement(By.xpath("//a[@title='Click to Sign out']")).click();
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Message displayed LogOut Successfully$")
public void message_displayed_LogOut_Successfully() throws Throwable {
	 System.out.println("LogOut Successfully");
    // Write code here that turns the phrase above into concrete actions
    
}*/

}
}
