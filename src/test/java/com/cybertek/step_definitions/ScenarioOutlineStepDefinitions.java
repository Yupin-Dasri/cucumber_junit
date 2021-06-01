package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class ScenarioOutlineStepDefinitions {


    SmartBearPage smartBearPage = new SmartBearPage();


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {

        smartBearPage.loginToSmartBear_Config();
        smartBearPage.orderLinks.click();

    }

    @When("User fills out the form as followed from the table below:")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {

    }

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {

        Select productDropdown = new Select(smartBearPage.productDropdown);
        productDropdown.selectByVisibleText(string);
    }

    @When("User enter {string} to quantity")
    public void user_enter_to_quantity(String string) {
        smartBearPage.quantity.sendKeys(Keys.BACK_SPACE + string);

    }

    @When("User enter {string} to customer name")
    public void user_enter_to_customer_name(String string) {
        smartBearPage.customerName.sendKeys(string);
    }

    @When("User enter {string} to street")
    public void user_enter_to_street(String string) {
        smartBearPage.street.sendKeys(string);
    }

    @When("User enter {string} to city")
    public void user_enter_to_city(String string) {
        smartBearPage.city.sendKeys(string);
    }

    @When("User enter {string} to state")
    public void user_enter_to_state(String string) {
        smartBearPage.state.sendKeys(string);
    }

    @When("User enter {string} to zip")
    public void user_enter_to_zip(String string) {
        smartBearPage.zip.sendKeys(string);
    }

    @When("User enter {string} as card type")
    public void user_enter_as_card_type(String string) {
        smartBearPage.cardType.click();
    }

    @When("User enter {string} to card number")
    public void user_enter_to_card_number(String string) {
        smartBearPage.cardNumber.sendKeys(string);
    }

    @When("User enter {string} to expiration date")
    public void user_enter_to_expiration_date(String string) {
        smartBearPage.expirationDate.sendKeys(string);
    }
    @When("User click process button")
    public void user_click_process_button() {
        smartBearPage.processButton.click();
    }
    @When("User enter {string} is in the list")
    public void user_enter_is_in_the_list(String string) {
        smartBearPage.viewAllOrdersLink.click();

       String expectedName = string;
       String actualName = smartBearPage.nameInOrderTable.getText();

        Assert.assertTrue(actualName.equals(expectedName));


    }

}
