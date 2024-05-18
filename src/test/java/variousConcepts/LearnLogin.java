package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLogin {
WebDriver driver;
	
	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testLogin() throws InterruptedException {
		//driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("demo@codefios.com");
        //type name=value;
		// storing WEB ELEMENT
  
		//WEB ELEMENT TYPE
	
	WebElement USER_NAME_ELEMENT=driver.findElement(By.xpath("//input[@id='user_name']"));
	WebElement PASSWORD_ELEMENT=driver.findElement(By.xpath("//input[@id='password']"));
	WebElement SIGNIN_BUTTON_ELEMENT=driver.findElement(By.xpath("//button[@id='login_submit']"));
	
	
	//BY TYPE
	
//	By USER_NAME_FIELD=By.xpath("//input[@id='user_name']");
//	By PASSWORD_FIELD=By.xpath("//input[@id='password']");
//	By SIGNIN_BUTTON_FIELD=By.xpath("//button[@id='login_submit']");
//	By Dashboard_Header_Field=By.xpath("//strong[text()='Dashboard']");
	//driver.findElement(USER_NAME_FIELD).sendKeys("demo@codefios.com");
	//driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
	//driver.findElement(SIGNIN_BUTTON_FIELD).click();
	
//	USER_NAME_ELEMENT.sendKeys("demo@codefios.com");
//	USER_NAME_ELEMENT.sendKeys("FFDDSS");
//	Thread.sleep(2000);
	USER_NAME_ELEMENT.clear();
	USER_NAME_ELEMENT.sendKeys("demo@codefios.com");
	PASSWORD_ELEMENT.sendKeys("abc123");
	SIGNIN_BUTTON_ELEMENT.click();
	
	WebElement Dashboard_Header_ELEMENT=driver.findElement(By.xpath("//strong[text()='Dashboard']"));
	Assert.assertFalse("OOPS page not loadind right!", Dashboard_Header_ELEMENT.isDisplayed());	
	//driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("demo@codefios.com");
	
	}
}


