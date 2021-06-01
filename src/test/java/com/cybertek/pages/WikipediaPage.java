package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox ;

    @FindBy(id = "searchButton")
    public WebElement  searchButton;

    @FindBy(tagName = "h1")
    public WebElement  mainHeader;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement  imageHeader;



}
