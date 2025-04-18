package baseclasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static Map<String, String> mapAANumber = new HashMap<>();
    public static Map<String, String> pannumberMap = new HashMap<>();
    public static WebDriver driver;

    public void initializeBrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = new ChromeOptions();

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            System.out.println("Running in GUI mode on Windows.");
        } else {
            System.out.println("Running in headless mode (CI/CD/Linux).");
            options.addArguments("--headless=new");
            options.addArguments("--disable-gpu");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
        }

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ps.demofms.com/");
        waitForPageLoad();  // ensure page is fully loaded
    }

    // Wait until the document is fully loaded
    public void waitForPageLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(webDriver ->
            ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    // Wait for element to be visible
    public WebElement waitForElement(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Optional: Take screenshot on failure
    public void takeScreenshot(String testName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("target/screenshots/" + testName + ".png"));
        } catch (Exception e) {
            System.out.println("Screenshot capture failed: " + e.getMessage());
        }
    }
}
