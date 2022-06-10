package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commons.AllActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.ContinuePage;
import objects.GetQuatoPage;
import objects.LandingPage;
import objects.PolicyholderDetails;
import objects.ZipCodePage1;
import objects.ZipCodePage2;
import utils.ReadConfigFile;

public class BaseClass {
	public static WebDriver driver;
	protected AllActions allActions;
	protected LandingPage landingPage;
	protected ZipCodePage1 zipCodePage1;
	protected GetQuatoPage getQuatoPage;
	protected ZipCodePage2 zipCodePage2;
	protected PolicyholderDetails policyholderDetails;
	protected ContinuePage continuePage;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ReadConfigFile.getInstance().getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ReadConfigFile.getInstance().getPageLoadTime()));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ReadConfigFile.getInstance().getImplicitlyWaitTime()));
		initClasses();
	}
	
	@AfterMethod
	public void cleaningUp() {
		//driver.quit();
	}
	
	public void initClasses() {
		allActions = new AllActions();
		landingPage = new LandingPage(driver);
		zipCodePage1 = new ZipCodePage1(driver);
		getQuatoPage = new GetQuatoPage(driver);
		zipCodePage2 = new ZipCodePage2(driver);
		policyholderDetails = new PolicyholderDetails(driver);
		continuePage = new ContinuePage(driver);
		
	}

}
