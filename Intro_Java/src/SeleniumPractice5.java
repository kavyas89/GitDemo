import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)","");
			
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Kavya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[placeholder='Business Name']")).sendKeys("TestBusiness");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("KS@gmail.com");
		driver.findElement(By.cssSelector("button.btn-block")).click();
			
		
		
		
	}

}
