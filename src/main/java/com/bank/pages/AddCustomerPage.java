package com.bank.pages;

import com.bank.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utilities {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postcodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;


    public void clickOnBankManagerLogin() {
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomerTab);
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstNameField, fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastNameField, lName);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postcodeField, postcode);
    }

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
    }

    public void clickOnAlertMessage() {
        acceptAlert();
    }


}
