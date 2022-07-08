import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy.com");
		driver.findElement(By.name("inputPassword" )).sendKeys("test123");
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.partialLinkText("Forgot your password")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Rahul@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("3028426545");
		
		
	}

}
