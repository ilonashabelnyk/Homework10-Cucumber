package cucumberTest.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class SignInJoinButtonSteps {
    private static Logger logger = LogManager.getLogger(SignInJoinButtonSteps.class);
    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();

    @When("SigninJoin button is clicked")
    public void clickOnButton() {
        homePage.clickOnSignInJoinBtn();
        logger.info("SigninJoin button is clicked.");
    }

    @Then("Login page is opened")
    public void verifyCurrentURL() {
        Assert.assertEquals("Incorrect redirection clicking on SignInJoin button.", loginPage.getExpectedRedirectURLSignInJoin(), loginPage.getLoginPage());
        logger.info("Login page is opened.");
        logger.debug("User is redirected into correct URL " + loginPage.getLoginPage() + " of Login page.");
    }
}