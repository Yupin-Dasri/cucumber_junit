package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class SmartBearStepDefinitions {

    SmartBearPage smartBearPage = new SmartBearPage();
    @Given("user is on the SmartBear login page")
    public void user_is_on_the_smart_bear_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));

    }
    @When("user enters username")
    public void user_enters_username() {

        smartBearPage.userNameBox.sendKeys(ConfigurationReader.getProperty("smartBearUsername") + Keys.ENTER);
        //smartBearPage.userNameBox.sendKeys(ConfigurationReader.getProperty("smartBearUserName") + Keys.ENTER);

    }
    @When("user enters password")
    public void user_enters_password() {
        smartBearPage.passwordBox.sendKeys(ConfigurationReader.getProperty("smartBearPassword") + Keys.ENTER);
        //smartBearPage.passwordBox.sendKeys(ConfigurationReader.getProperty("smartBearPassword") + Keys.ENTER);

    }
    @And("user click loginButton")
    public void userClickLoginButton(){

        smartBearPage.loginButton.click();
    }

    @Then("user should see WebOrder page")
    public void user_should_see_web_order_page() {

        String expectedTitle = "Web Orders";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));
        Driver.getDriver().close();

    }

    @Given("User is already logged in to SmartBear")
    public void user_is_already_logged_in_to_smart_bear() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));
        smartBearPage.loginToSmartBear_Config();
    }
    @Given("user navigated to OrderPage")
    public void user_navigated_to_order_page() {

        smartBearPage.orderLinks.click();


    }
    @Then("user enters quantity {string}")
    public void user_enters_quantity(String string) {

        smartBearPage.quantity.sendKeys(Keys.BACK_SPACE);
        smartBearPage.quantity.sendKeys(string);

    }
    @Then("user enters address information")
    public void user_enters_address_information(Map<String,String> addressInfo) {

        String customerName = addressInfo.get("customerName");
        String street = addressInfo.get("street");
        String city = addressInfo.get("city");
        String state = addressInfo.get("state");
        String zip = addressInfo.get("zip");

        smartBearPage.customerName.sendKeys(customerName);
        smartBearPage.street.sendKeys(street);
        smartBearPage.city.sendKeys(city);
        smartBearPage.state.sendKeys(state);
        smartBearPage.zip.sendKeys(zip);

    }
    @Then("user enter payment information")
    public void user_enter_payment_information(Map<String,String> paymentInfo) {

        String cardType = paymentInfo.get("cardType");
        String cardNumber = paymentInfo.get("cardNumber");
        String expirationDate = paymentInfo.get("expirationDate");

        smartBearPage.cardType.click();
        smartBearPage.cardType.sendKeys(cardType);
        smartBearPage.cardNumber.sendKeys(cardNumber);
        smartBearPage.expirationDate.sendKeys(expirationDate);

    }
    @When("user clicks to process button")
    public void user_clicks_to_process_button() {

        BrowserUtils.sleep(2);
        smartBearPage.processButton.click();
    }
    @Then("user should see their name in the ViewAllOrders page")
    public void user_should_see_their_name_in_the_view_all_orders_page() {

        BrowserUtils.sleep(2);
        smartBearPage.viewAllProductsButton.click();

        String expectedNameInViewOder = "jamal";
        String actualNameInViewOder = smartBearPage.nameInOrderTable.getText();

        Assert.assertTrue(actualNameInViewOder.equals(expectedNameInViewOder));
    }



}
