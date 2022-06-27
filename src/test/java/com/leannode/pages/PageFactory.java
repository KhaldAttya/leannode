package com.leannode.pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private final WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {
        return new HomePage(driver);
    }

    public JoinUsTestCommunityPage joinUsTestCommunityPage() {
        return new JoinUsTestCommunityPage(driver);
    }
}
