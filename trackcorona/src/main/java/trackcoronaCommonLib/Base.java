package trackcoronaCommonLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver;

	@BeforeTest
	public void lunchBrowser() {
		System.out.println("in BM");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://trackcorona.online/");
	}

	@AfterTest
	public void close() {
		System.out.println("in BM");
		driver.close();
	}

//	public void click(WebElement x) {
//		x.click();
//	}

}
