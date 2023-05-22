package com.bank.pages;

import com.bank.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utilities {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountTab;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;


    public void clickOnOpenAccountTab() {
        clickOnElement(openAccountTab);
    }

    public void clickOnProcessButton() {
        clickOnElement(processButton);
    }

    public void searchCustomer() {
        selectByVisibleTextFromDropDown(searchCustomer, "Harry Potter");

    }

    public void searchCurrency() {
        selectByVisibleTextFromDropDown(selectCurrency, "Pound");

    }


}
