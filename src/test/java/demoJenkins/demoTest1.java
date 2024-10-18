package demoJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest1 {
	@Test
	public void method1() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunai\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//String text = "abc";
	driver.get("https://google.com");
	driver.close();
}
}
