package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearPage extends SBear_BasePage{


    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameBox;

    @FindBy(id = "ctl00_MainContent_password")
    public  WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

   // @FindBy(linkText = "Order")
    //public WebElement orderLink;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy (linkText = "View all orders")
    public WebElement viewAllProductsButton;

    @FindBy(xpath = "//tr[2]//td[2]")
    public WebElement nameInOrderTable;


    //login method
    public void loginToSmartBear(){
        userNameBox.sendKeys("Tester");
        passwordBox.sendKeys("test");
        loginButton.click();
    }

    public void loginToSmartBear(String username, String password){
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    //login method where we can pass data from configuration.properties
    public void loginToSmartBear_Config(){
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));
        userNameBox.sendKeys(ConfigurationReader.getProperty("smartBearUsername"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("smartBearPassword"));
        loginButton.click();

    }

}
