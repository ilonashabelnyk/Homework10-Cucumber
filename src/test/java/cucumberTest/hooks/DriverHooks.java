package cucumberTest.hooks;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DriverHooks {
    private static Logger logger = LogManager.getLogger(DriverHooks.class);

    @Before
    public void setUpDriver() {
       DriverManager.getDriver();
       logger.info("WebDriver is created!");
    }

    @After
    public void quitDriver() {
        DriverManager.quitDriver();
        logger.info("WebDriver is closed!");
    }
}