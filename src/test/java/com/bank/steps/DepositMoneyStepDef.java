package com.bank.steps;

import com.bank.pages.DepositMoneyPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DepositMoneyStepDef {
    @When("^I click on \"([^\"]*)\" tab$")
    public void i_click_on_tab(String arg1)  {
        new DepositMoneyPage().clickOnDepositTab();

    }

    @When("^I enter amount (\\d+)$")
    public void i_enter_amount(int arg1)  {
        new DepositMoneyPage().enterAmount("100");

    }

    @When("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1)  {
        new DepositMoneyPage().clickOnDepositButton();

    }

    @Then("^I verify the message \"([^\"]*)\"$")
    public void i_verify_the_message(String arg1)  {
        Assert.assertEquals(new DepositMoneyPage().verifyDepositText(), "Deposit Successful", "Error message");

    }




}
