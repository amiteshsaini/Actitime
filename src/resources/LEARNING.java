package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LEARNING {
	public static void main(String[] args) throws InterruptedException {
	    
        System.setProperty(
            "webdriver.chrome.driver",
            System.getProperty("user.dir")+"/src/resources/chromedriver_105");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://online.actitime.com/cisco/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("e#%5Bh44");
		driver.findElement(By.cssSelector("input#keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		driver.findElement(By.linkText("View Time-Track")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
		
	}
		

}
