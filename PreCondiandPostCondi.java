package week5.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PreCondiandPostCondi {
	public ChromeDriver driver;
	@BeforeMethod
	public void startbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}	
	@BeforeSuite
	public void ss() {
		System.out.println("Lead Created");
	}
	@BeforeTest
	public void sp() {
		System.out.println("");
	}
	@BeforeClass()
	public void nn() {
		System.out.println("");
	}
	@AfterClass
	public void mm() {
		System.out.println("");
	}
	@AfterSuite
	public void zz() {
		System.out.println("");
	}
	@AfterMethod
	public void endBrowser() {
		driver.close();
	}


}
