package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/resources/chromedriver_105");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("e#%5Bh44");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		
		
	   
		

}
}
