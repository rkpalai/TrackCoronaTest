package trackcoronaCommonLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver Driver;

	@BeforeTest
	public void lunchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\palai\\eclipse-workspace\\trackcorona\\src\\main\\Drivers\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://trackcorona.online/");
	}

	@AfterTest
	public void close() {
		Driver.close();
	}

}
