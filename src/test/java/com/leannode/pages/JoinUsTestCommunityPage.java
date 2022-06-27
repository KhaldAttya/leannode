package com.leannode.pages;

import com.leannode.models.TesterApplicationForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JoinUsTestCommunityPage extends LeanNodeWebBasePage {
    //Web elements
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Name')]]/following-sibling::div/input")
    WebElement name;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Email')]]/following-sibling::div/input")
    WebElement email;
    @FindBy(xpath = "//*[@class = 'iti__selected-flag']")
    WebElement selectedCountry;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Phone number')]]/following-sibling::div//input")
    WebElement phoneNumber;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Gender')]]/following-sibling::div/span")
    WebElement gender;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Birthday')]]/following-sibling::div/input")
    WebElement birthday;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Country')]]/following-sibling::div/span")
    WebElement country;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'City')]]/following-sibling::div/input")
    WebElement city;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'What languages do you speak?')]]/following-sibling::div/input")
    WebElement language;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Level of Education')]]/following-sibling::div/span")
    WebElement education;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Education Major')]]/following-sibling::div/span")
    WebElement educationMajor;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Hobbies/interests')]]/following-sibling::div/span")
    WebElement hobbies;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Tech level')]]/following-sibling::div/span")
    WebElement techLevel;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'Do you play games?')]]/following-sibling::div/span")
    WebElement doYouPlayGames;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'What kind of games do you play?')]]/following-sibling::div/span")
    WebElement gameGenre;
    @FindBy(xpath = "//*[@class='gfield_label' and text()[contains(.,'How often do you play games?')]]/following-sibling::div/span")
    WebElement gamingFrequency;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitButton;
    @FindBy(xpath = "//*[text()[contains(.,'Thanks for contacting us! We will get in touch with you shortly.')]]")
    WebElement confirmationMessage;

    public JoinUsTestCommunityPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        fluentWaitForElement(name);
    }

    public void PopulateTestCommunityForm(TesterApplicationForm testerApplicationForm) {
        if (testerApplicationForm.getName() != null) {
            scrollToElement(name);
            name.sendKeys(testerApplicationForm.getName());
        }
        if (testerApplicationForm.getEmail() != null) {
            scrollToElement(email);
            email.sendKeys(testerApplicationForm.getEmail());
        }
        if (testerApplicationForm.getPhoneNumber() != null) {
            scrollToElement(selectedCountry);
            fluentWaitForElementToBeClickable(selectedCountry);
            //TODO: investigate issue with country iso code click intercepted
            /*selectedCountry.click();
            scrollToElement(countryListPicker(testerApplicationForm.getPhoneNumber().getCountry()));
            countryListPicker(testerApplicationForm.getPhoneNumber().getCountry()).click();*/
            phoneNumber.sendKeys(testerApplicationForm.getPhoneNumber().getPhoneNumber());
        }
        if (testerApplicationForm.getGender() != null) {
            scrollToElement(gender);
            gender.click();
            dropDownPicker(testerApplicationForm.getGender().toString()).click();
        }
        if (testerApplicationForm.getBirthday() != null) {
            scrollToElement(birthday);
            DateFormat dateFormat = new SimpleDateFormat("yy.MM.dd");
            String date = dateFormat.format(testerApplicationForm.getBirthday());
            birthday.sendKeys(date);
        }
        if (testerApplicationForm.getCountry() != null) {
            scrollToElement(country);
            country.click();
            dropDownPicker(testerApplicationForm.getCountry()).click();
        }
        if (testerApplicationForm.getCity() != null) {
            scrollToElement(city);
            city.sendKeys(testerApplicationForm.getCity());
        }
        if (testerApplicationForm.getLanguage() != null) {
            scrollToElement(language);
            language.sendKeys(testerApplicationForm.getLanguage());
        }
        if (testerApplicationForm.getLevelOfEducation() != null) {
            scrollToElement(education);
            education.click();
            dropDownPicker(testerApplicationForm.getLevelOfEducation().toString()).click();
        }
        if (testerApplicationForm.getEducationMajor() != null) {
            scrollToElement(educationMajor);
            educationMajor.click();
            dropDownPicker(testerApplicationForm.getEducationMajor().toString()).click();
        }
        if (testerApplicationForm.getHobbies() != null) {
            scrollToElement(hobbies);
            hobbies.click();
            dropDownPicker(testerApplicationForm.getHobbies().toString()).click();
        }
        if (testerApplicationForm.getTechLevel() != null) {
            scrollToElement(techLevel);
            techLevel.click();
            dropDownPicker(testerApplicationForm.getTechLevel().toString()).click();
        }
        if (testerApplicationForm.getMobileOS() != null) {
            scrollToElement(mobileOSPicker(testerApplicationForm.getMobileOS().toString()));
            mobileOSPicker(testerApplicationForm.getMobileOS().toString()).click();
        }
        if (testerApplicationForm.getJob() != null) {
            scrollToElement(jobPicker(testerApplicationForm.getJob().toString()));
            jobPicker(testerApplicationForm.getJob().toString()).click();
        }
        if (testerApplicationForm.getPlayingGames() != null) {
            scrollToElement(doYouPlayGames);
            doYouPlayGames.click();
            if (testerApplicationForm.getPlayingGames()) {
                dropDownPicker("Yes").click();
            } else {
                dropDownPicker("No").click();
            }
        }
        if (testerApplicationForm.getGameGenres() != null) {
            scrollToElement(gameGenre);
            gameGenre.click();
            dropDownPicker(testerApplicationForm.getGameGenres().toString()).click();
        }
        if (testerApplicationForm.getGamingFrequency() != null) {
            scrollToElement(gamingFrequency);
            gamingFrequency.click();
            dropDownPicker(testerApplicationForm.getGamingFrequency().toString()).click();
        }
    }

    public void clickSubmit() {
        scrollToElement(submitButton);
        submitButton.click();
    }

    public void verifySuccessfulApplication() {
        fluentWaitForElement(confirmationMessage);
    }

    private WebElement countryListPicker(String countryName) {
        return driver.findElement(By.xpath(String.format("//span[@class = 'iti__country-name' and text()[contains(.,'%s')]]/parent::*[@role='option']", countryName)));
    }

    private WebElement dropDownPicker(String value) {
        return driver.findElement(By.xpath(String.format("//*[@role='option' and text()[contains(.,'%s')]]", value)));
    }

    private WebElement mobileOSPicker(String value) {
        return driver.findElement(By.xpath(String.format("//*[@class = 'value_nwItem' and text()[contains(.,'%s')]]", value)));
    }

    private WebElement jobPicker(String value) {
        return driver.findElement(By.xpath(String.format("//*[@class = 'check_label' and text()[contains(.,'%s')]]", value)));
    }
}