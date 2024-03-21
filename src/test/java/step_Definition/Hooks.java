package step_Definition;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.DataReader;
import Utils.driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	// before hook runs before every scenario. 
		@Before
		public void setup() {
			driver.getDriver().get(DataReader.getProperty("crater_url"));
			driver.getDriver().manage().window().maximize();
			driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
		
		// after hook runs after the last step of each scenario
		@After
		public void wrapup(Scenario scenario) {
			if (scenario.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) 
						driver.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "screenshot");
			}
			driver.getDriver().quit();
		}

}
