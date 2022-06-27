package com.leannode.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class LeanNodeWebBasePage {
    protected WebDriver driver;
    protected Actions actions;

    public LeanNodeWebBasePage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    protected void fluentWaitForElement(WebElement webElement) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofMillis(1000))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOf(webElement));
    }

    protected void fluentWaitForElementToBeClickable(WebElement webElement) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofMillis(1000))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected void scrollToElement(WebElement webElement) {
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].scrollIntoView(true);", webElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement);
        actions.perform();
    }
}
