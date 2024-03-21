package Utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driver {

	static WebDriver driver;

	public static WebDriver getDriver() {
		
		String browser = System.getProperty("browser");
		
		if(browser==null) {
			browser= DataReader.getProperty("Broswer_type");
		}
		if(driver==null|| ((RemoteWebDriver)driver).getSessionId()== null) {
			switch(browser) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case"chrome-headless":
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--headless");
				chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				driver = new ChromeDriver(chromeOptions);
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "firefox-headless":
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.addArguments("--headless");
				firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				driver = new FirefoxDriver(firefoxOptions);
				break;
			case "safri":
				driver = new SafariDriver();
				break;
			case "saucelabs":
				ChromeOptions browserOptions = new ChromeOptions();
				browserOptions.setPlatformName("Windows 11");
				browserOptions.setBrowserVersion("latest");
				Map<String, Object> sauceOptions = new HashMap<>();
				sauceOptions.put("username", "oauth-morales.jon8-302ce");
				sauceOptions.put("accessKey", "*****cc54");
				sauceOptions.put("build", "<your build id>");
				sauceOptions.put("name", "<your test name>");
				browserOptions.setCapability("sauce:options", sauceOptions);

				URL url;
				try {
					url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//	RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
			break;
			default:
			driver= new ChromeDriver();
			break;
			
			}
		}
		
		return driver;
		
		
	}

	public static void quitDriver() {
		// TODO Auto-generated method stub
		
	}
}	
	
	

