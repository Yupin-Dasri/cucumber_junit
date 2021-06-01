package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com/");
    }

    @When("User search for apple")
    public void user_search_for_apple() {

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String expectedTitle = "apple";
        String actualInTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualInTitle.contains(expectedTitle));
    }

   @Then("User should see title is Google")
    public void userShouldSeeTitleIsGoogle() {

        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));

       // Assert.assertTrue(Driver.getDriver().getTitle().equals("Google")); //can be done in one line
    }

    @When("User search for {string}")
    public void userSearchFor(String keyword) {

        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys(keyword + Keys.ENTER);

    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String keyword) {
        String expectedTitle = keyword;
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("User should see following links")
    public void user_should_see_following_links(List<String> expectedFooterLinks){

        System.out.println("FooterLinks = " + expectedFooterLinks);

        for (WebElement eachLink : googleSearchPage.footerLinks) {
            System.out.println("eachLink = " + eachLink.getText());
        }



    }
}
