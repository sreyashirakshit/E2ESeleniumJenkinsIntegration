package e2e.selenium.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookInitials {

	@Test
	public void loginPage()
	{
	  System.setProperty("webdriver.chrome.driver","C:\\TestProjects\\E2E_Selenium_Jenkins\\Drivers\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().fullscreen();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("test");
	  driver.quit();
	}
	
}
