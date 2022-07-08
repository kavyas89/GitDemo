import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class SelIntro {

//	private static final File TakesScreenshot = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
				//TakesScreenshot sht=((TakesScreenshot)driver);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\somav\\OneDrive\\Desktop\\Testing Preparation\\screenshot.jpg"));
		
		
		
	}

		
}
