package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinitions {

    EtsySearchPage searchPage = new EtsySearchPage();
    @Given("user is on the search page")
    public void user_is_on_the_search_page() {
        Driver.getDriver().get("https://www.etsy.com");

    }

    @Then("user sees Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void userSeesEtsyShopForHandmadeVintageCustomAndUniqueGiftsForEveryone() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @When("user enter Wooden Spoon in the search box")
    public void user_enter_wooden_spoon_in_the_search_box() {
        searchPage.searchBox.sendKeys("Wooden Spoon");

    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        searchPage.searchButton.click();
    }

    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitle = "Wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("user enter {string} in the search box")
    public void user_enter_in_the_search_box(String string) {

        searchPage.searchBox.sendKeys(string);
    }

    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {

        String expectedTitle = string;
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }



}
