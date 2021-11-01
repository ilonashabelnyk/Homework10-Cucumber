package cucumberTest.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import pages.HomePage;

public class OpenWebPageSteps {
    private static Logger logger = LogManager.getLogger(OpenWebPageSteps.class);
    private HomePage homePage = new HomePage();

    @Given("Bookdepository website is opened on the main page")
    public void openBookdepositoryWebsite() {
        homePage.openBookdepository();
        logger.info("Webpage is opened!");
    }

    @Then("user is redirected into proper Home page")
    public void verifyHomePage() {
        Assert.assertTrue("Home page is not opened!", homePage.isHomePageContentIsDisplayed());
        logger.info("The correct home page is opened!");
    }
}