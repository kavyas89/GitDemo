import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://qatechhub.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		System.out.println(driver.getTitle());
		String str=driver.getTitle();
		SeleniumPractice2 a1=new SeleniumPractice2();
		a1.getStatus(str);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
				driver.findElement(By.linkText("https://www.facebook.com/qatechhub")).click();
				
			}

	
	public void getStatus(String str)
	{
		if(str.contains("QA Automation Tools Trainings and Tutorials | QA Tech Hub"))
		{
			System.out.println("PASS");
		}
		else
			System.out.println("FAIL");
		
	}
	
}
