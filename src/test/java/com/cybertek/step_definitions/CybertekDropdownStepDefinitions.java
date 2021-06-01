package com.cybertek.step_definitions;

import com.cybertek.pages.CybertekDropdownPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CybertekDropdownStepDefinitions {

    CybertekDropdownPage dropdownPage = new CybertekDropdownPage();

    @Given("User is on the dropdown page of practice tool")
    public void user_is_on_the_dropdown_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonthList) {

        Select monthDropdown = new Select(dropdownPage.monthDropdown);

        List<String> actual = BrowserUtils.convertWebElementLisToStringList(monthDropdown.getOptions());

        Assert.assertTrue(expectedMonthList.equals(actual));




        //*****   convert list of webElement to list of String   ***********

      /*  List<WebElement> monthAsWebElement =  monthDropdown.getOptions();

        List<String> monthAsString = new ArrayList<>();

        for (WebElement eachMonth : monthAsWebElement) {

            monthAsString.add(eachMonth.getText());
        }

        Assert.assertTrue(monthAsString.equals(expectedMonthList));


       */
    }




}
