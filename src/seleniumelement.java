import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumelement {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/resources/chromedriver_105");
			WebDriver driver = new ChromeDriver();
			driver.get("https://online.actitime.com/sdb");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("amiteshsainilkct@gmail.com");
			driver.findElement(By.name("pwd")).sendKeys("PTynpJSN");
			driver.findElement(By.name("remember")).click();
			driver.findElement(By.id("loginButton")).click();
			WebDriverWait wait = new WebDriverWait(driver,40);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Task']")));
			driver.findElement(By.cssSelector("button[data-tip='Add tasks to the timesheet']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'components-TaskItem')])[1]")));
			driver.findElement(By.xpath("(//div[contains(@class,'components-TaskItem-wrapper') and @data-tip-disable='true'])[1]/div[contains(@class,'title')]")).click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Sales strategy']/ancestor::div[contains(@class,'components-TaskItem-wrapper') and @data-tip-disable='true']")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sales strategy']/ancestor::div[contains(@class,'components-TaskItem-wrapper') and @data-tip-disable='false']")));
			driver.findElement(By.cssSelector("button[data-tip='Add tasks to the timesheet']")).click();
			if(driver.findElements(By.xpath("//h3[contains(text(),'Add tasks')]")).size()!=0) {
				driver.findElement(By.cssSelector("button[data-tip='Add tasks to the timesheet']")).click();
			}
			if(driver.findElements(By.xpath("//span[text()='Sales strategy']")).size()>0) {
				driver.findElement(By.xpath("//span[text()='Sales strategy']/ancestor::div[contains(@class,'RecordTaskSection')]/following-sibling::div//div[@data-test-id='removeRowCell']")).click();
				Thread.sleep(100);
				
			}
			
			
		}
	}	



	
