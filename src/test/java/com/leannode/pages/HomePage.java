package com.leannode.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LeanNodeWebBasePage {
    //Web elements
    @FindBy(partialLinkText = "Home")
    WebElement home;
    @FindBy(partialLinkText = "Join Us")
    WebElement joinUs;
    @FindBy(xpath = "//*[@class = 'dropdown show']//a[contains(.,'Testers')]")
    WebElement testers;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        fluentWaitForElement(home);
    }

    public void goToJoinUsTesters() {
        joinUs.click();
        testers.click();
    }
}