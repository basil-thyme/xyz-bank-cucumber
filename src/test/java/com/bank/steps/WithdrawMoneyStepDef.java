package com.bank.steps;

import com.bank.pages.DepositMoneyPage;
import com.bank.pages.WithdrawMoneyPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WithdrawMoneyStepDef {

    @When("^I click on \"([^\"]*)\" Tab next$")
    public void i_click_on_Tab_next(String arg1) {
        new WithdrawMoneyPage().clickOnWithdrawalTab();
    }

    @When("^I enter withdrawal amount (\\d+)$")
    public void i_enter_withdrawal_amount(int arg1) throws InterruptedException {
        Thread.sleep(2000);
        new DepositMoneyPage().enterAmount("50");
    }

    @When("^I click on \"([^\"]*)\" button next$")
    public void i_click_on_button_next(String arg1) {
        new WithdrawMoneyPage().clickOnWithdrawalButton();
    }

    @Then("^I verify the \"([^\"]*)\"  message$")
    public void i_verify_the_message(String arg1) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(new WithdrawMoneyPage().VerifyWithdrawalText(), "Transaction successful", "Error message");
    }

}
