package com.bank.pages;

import com.bank.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utilities {

    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @FindBy(css = ".btn.logout")
    WebElement logOutTab;

    @FindBy(xpath = "//div[@class='form-group']/label")
    WebElement VerifyText;


    public void customerLogin() {
        clickOnElement(customerLogin);
    }

    public void searchCustomerName() {
        selectByVisibleTextFromDropDown(searchCustomer, "Harry Potter");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String logoutText() {
        return getTextFromElement(logOutTab);
    }

    public void clickOnLogoutTab() {
        clickOnElement(logOutTab);
    }

    public String verifyText() {
        return getTextFromElement(VerifyText);
    }

}
