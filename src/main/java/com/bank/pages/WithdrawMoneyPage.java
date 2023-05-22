package com.bank.pages;

import com.bank.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WithdrawMoneyPage extends Utilities {

    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawalTab;

    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawalButton;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withdrawalText;


    public void clickOnWithdrawalTab() {
        clickOnElement(withdrawalTab);
    }

    public void clickOnWithdrawalButton() {
        clickOnElement(withdrawalButton);
    }

    public String VerifyWithdrawalText() {
                return  getTextFromElement(withdrawalText);
    }


}
