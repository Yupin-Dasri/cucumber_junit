package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataTableStepDefinition {

   SmartBearPage smartBearPage = new SmartBearPage();

    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> fruitList) {


        System.out.println("fruitList = " + fruitList .size());
        System.out.println("fruitList = " + fruitList);
        for (String eachFruit : fruitList) {
            System.out.println("eachFruit = " + eachFruit);
            
        }
    }

    @Given("User is on the login page of SmartBear When User enters below info")
    public void user_is_on_the_login_page_of_smart_bear_when_user_enters_below_info() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));

    }

    @When("User enter below information")
    public void user_enter_below_information(Map<String, String> loginInfo) {

        String  username = loginInfo.get("username");
        String password = loginInfo.get("password");
        smartBearPage.loginToSmartBear(username,password);


       // smartBearPage.loginToSmartBear_Config(); // we can use this too
        // smartBearPage.loginToSmartBear();       // we can use this too

       /* smartBearPage.userNameBox.sendKeys(username);
        smartBearPage.passwordBox.sendKeys(password);
        smartBearPage.loginButton.click();

        */

    }

    @Then("User should see title change to Web Orders")
    public void user_should_see_title_change_to_web_orders() {
        String expectedTitle = "Web Orders";

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));



       // BrowserUtils.titleVerification(expectedTitle);
    }

}
