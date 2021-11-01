package cucumberTest.hooks;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotHook {
    private static Logger logger = LogManager.getLogger(ScreenshotHook.class);
    public static final String PNG_FILE_EXTENSION = "image/png";

    @After
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, PNG_FILE_EXTENSION, scenario.getName());
            logger.info("The screenshot is taken!");
        }
    }
}