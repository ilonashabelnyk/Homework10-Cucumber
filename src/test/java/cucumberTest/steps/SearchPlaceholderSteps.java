package cucumberTest.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import pages.SearchAttributesPage;

public class SearchPlaceholderSteps {
    private static Logger logger = LogManager.getLogger(SearchPlaceholderSteps.class);
    private SearchAttributesPage searchAttributesPage = new SearchAttributesPage();

    @When("search input field is found")
    public void findSearchInputField() {
        searchAttributesPage.findSearchInput();
        logger.info("Search input field is found.");
    }

    @Then("there is placeholder {string}")
    public void verifyPlaceholder(String placeholder) {
        Assert.assertEquals("Incorrect placeholder for search input field.", placeholder, searchAttributesPage.getSearchPlaceholder());
        logger.info("Search placeholder is found.");
        logger.debug("Search placeholder is " + "''" + placeholder + "''.");

    }
}