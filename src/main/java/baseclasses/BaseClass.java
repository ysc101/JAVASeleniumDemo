package baseclasses;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public static Map<String, String> mapAANumber = new HashMap<String, String>();
public static Map<String, String> pannumberMap = new HashMap<String, String>();
	public static WebDriver driver;
	public void initializeBrowser() throws IOException {
		//String uniqueDir = "/tmp/chrome-profile-" + UUID.randomUUID();
		ChromeOptions options = new ChromeOptions();
		String uniqueDir = "/tmp/chrome-profile-" + System.currentTimeMillis();
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");
	        options.addArguments("--headless=new"); // use headless if running in CI
	        options.addArguments("--disable-gpu");
	        options.addArguments("--remote-allow-origins=*");
	    	options.addArguments("--user-data-dir=" + uniqueDir);
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.get("https://ps.demofms.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}




	 	 


