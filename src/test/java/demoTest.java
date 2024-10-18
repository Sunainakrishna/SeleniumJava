import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//import Webdriver.ChromeDriver;
//import Webdriver.WebDriver;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;


public class demoTest {

	@Test
		public void method1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunai\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String text = "abc";
		driver.get("https://google.com");
		driver.close();
	}

}
