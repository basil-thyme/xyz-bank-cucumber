package com.bank.pages;

import com.bank.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositMoneyPage extends Utilities {

    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmount;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyDepositText;


    public void clickOnDepositTab(){
        clickOnElement(depositTab);
    }

    public void enterAmount(String amount){
        sendTextToElement(enterAmount, amount);
    }

    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }

    public String verifyDepositText(){
        return getTextFromElement(verifyDepositText);
    }



}
