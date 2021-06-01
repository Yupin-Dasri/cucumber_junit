package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefinition {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        String url = ConfigurationReader.getProperty("wikipediaUrl");
        Driver.getDriver().get(url);
    }

    @When("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikipediaPage.searchBox.sendKeys("Steve Jobs");
    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchButton.click();
    }

    @Then("user sees Steve Jos is in the wiki title")
    public void user_sees_steve_jos_is_in_the_wiki_title() {
        String expectedTitle = "Steve Jobs";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("user sees Steve Jos is in the main header")
    public void user_sees_steve_jos_is_in_the_main_header() {
        String expectedMainHeader = "Steve Jobs";
        String actualMainHeader = wikipediaPage.mainHeader.getText();

        Assert.assertTrue(actualMainHeader.contains(expectedMainHeader));
    }

    @Then("user sees Steve Jos is in the image header")
    public void user_sees_steve_jos_is_in_the_image_header() {
        String expectedImageHeader = "Steve Jobs";
        String actualImageHeader = wikipediaPage.imageHeader.getText();

        Assert.assertTrue(actualImageHeader.contains(expectedImageHeader));


    }




    @When("user types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
    }

    @Then("user sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String arg0) {
    }
}
