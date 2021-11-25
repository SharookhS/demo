package parallel;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
//import utilities.BaseClass;
import utils.ConfigReader;
import utils.LoggerHelper;

public class ApplicationHooks {
	
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	public static Logger LOGGER;
	

//	public static Logger LOGGER;
	
	
//	@BeforeMethod(alwaysRun = true)
//	@Parameters({"browser"})		
//	public void launchBrowser2(String browser) {
//		
//		System.out.println("===============================browser value is: " + browser);		
//
//	}
	
	
		
		
	@Before(value = "@Skip", order = 0)
	public void skip_scenario(Scenario scenario) {
		System.out.println("SKIPPED SCENARIO is : " + scenario.getName());
		Assume.assumeTrue(false);
		

	}

	@Before(order = 1)
	public void getProperty() {
		
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
//
////	@Before(order = 2)
////	public void launchBrowser() {
////		String browserName = prop.getProperty("browser");
////		driverFactory = new DriverFactory();
////		driver = driverFactory.init_driver(browserName);		
////	}
//	
////	@Before(value = "@GB",order = 2)
////	public void launchBrowser1() {
////		String browserName = "chrome";
////		driverFactory = new DriverFactory();
////		driver = driverFactory.init_driver(browserName);		
////	}
//	
//	@Before(value = "@GB",order = 2)
//	public void launchBrowser1() {
//		String browserName = "chrome";
//		/**
//		 * Run at Local Machine
//		 */
////		driverFactory = new DriverFactory();
////		driver = driverFactory.init_driver(browserName);
//		
//		/**
//		 * Run at Remote (AWS)
//		 */
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("browserName", "chrome");
//		try {
//			driver = new RemoteWebDriver(new URL("http://13.233.157.149:4444/wd/hub"), cap);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	
////		@Before(value = "FB",order = 2)
////		public void launchBrowser2() {
////		String browserName = "firefox";
////		/**
////		 * Run at Local Machine
////		 */
////		driverFactory = new DriverFactory();
////		driver = driverFactory.init_driver(browserName);
////
////		
////		/**
////		 * Run at Remote (AWS)
////		 */
////		
////		
//////		https://www.browserstack.com/guide/geckodriver-vs-marionette
////		
//////		DesiredCapabilities cap = new DesiredCapabilities();
//////		cap.setCapability("browserName", "firefox");		
//////		try {
//////			driver = new RemoteWebDriver(new URL("http://13.233.157.149:4444/wd/hub"), cap);
//////		} catch (MalformedURLException e) {
//////			e.printStackTrace();
//////		}
////		
////	}
//	
//	
//	
//	
//
//	
//	
//	@Before(value = "@Edge",order = 2)
//	public void launchBrowser3() {
//		String browserName = "edge";
//		/**
//		 * Run at Local Machine
//		 */
//		driverFactory = new DriverFactory();
//		driver = driverFactory.init_driver(browserName);	
//
//		
//		/**
//		 * Run at Remote (AWS)
//		 */
//
//		
//	}
//

	
//	@Before(value = "@GB",order = 2)
//	public void browser1()
//	{
//		launchBrowser("chrome");
//	}
//	@Before(value = "@FB",order = 2)
//	public void browser2()
//	{
//		launchBrowser("firefox");
//	}
//	@Before(value = "@Edge",order = 2)
//	public void browser3()
//	{
//		launchBrowser("edge");
//	}
	
	

	
	@Before(order = 2)
//	@Parameters ({"browser"})
	public void launchBrowser() {	
		LOGGER = LoggerHelper.getLogger(LoggerHelper.class);
		
		String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
		System.out.println("%%%%%%%%%%%%%%%%%%%%"+browser+"%%%%%%%");
		
//		EventLogger = Logger.getLogger(String.valueOf(DriverFactory.class));
		
		System.out.println("########################################browser value is: " + browser);

		if (browser.equals("chrome")) {
			
			/**
			 * Run at Local Machine
			 */
			

			
			driverFactory = new DriverFactory();
			driver = driverFactory.init_driver(browser);
			LOGGER.info("Launched "+browser+" Browser");

			
			/**
			 * Run at Remote (AWS)
			 */
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability("browserName", "chrome");
//			try {
//				driver = new RemoteWebDriver(new URL("http://13.233.157.149:4444/wd/hub"), cap);
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
			
		} else if (browser.equals("firefox")) {
			
			System.out.println("=======Inside Firefox=======");
			
			/**
			 * Run at Local Machine
			 */
			
			
			driverFactory = new DriverFactory();
//			driver = driverFactory.init_driver(browserName);
			driver = driverFactory.init_driver(browser);
			LOGGER.info("Launched "+browser+" Browser");

			
			/**
			 * Run at Remote (AWS)
			 */
			
			
//			https://www.browserstack.com/guide/geckodriver-vs-marionette
			
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability("browserName", "firefox");		
//			try {
//				driver = new RemoteWebDriver(new URL("http://13.233.157.149:4444/wd/hub"), cap);
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
		} else if (browser.equals("safari")) {
			
		} else if (browser.equals("edge")) {
			
//			String browserName = "edge";
			/**
			 * Run at Local Machine
			 */
			driverFactory = new DriverFactory();
			driver = driverFactory.init_driver(browser);	
			LOGGER.info("Launched "+browser+" Browser");
	
//			
//			/**
//			 * Run at Remote (AWS)
//			 */
	//
//			
		}
		else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
	}
	
	
	
	
	
	
	
	
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		System.out.println("+++++++++++++++++++++++++Inside screenshot method+++++++++++++++++++++++++++++");
		if (scenario.isFailed()) {	
			System.out.println("+++++++++++++++++++++++++Test Fail : Take screenshot+++++++++++++++++++++++++++++");
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}
	
}
