import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.gmail.com");
		//System.out.println(driver.getTitle());
		
		Test1 t=new Test1();
		String test2=t.TestMethod();
		System.out.println(test2);
		
	}

	
	public String TestMethod()
	{
		String s="My New World";
		String[] str=s.split("New");
			System.out.println(str[0]);
			System.out.println((str[1]).trim());
				
				for(int i=0;i<s.length();i++)
				{
					System.out.println(s.charAt(i));
				}
         return "Hello is Returned from the Method";
	}
	
}
