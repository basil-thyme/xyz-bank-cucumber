package com.bank.steps;

import com.bank.pages.OpenAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class OpenAnAccountStepDef {

    @When("^BankManager clicks On \"([^\"]*)\" button$")
    public void bankmanager_clicks_On_button(String arg1)  {
    new OpenAccountPage().clickOnOpenAccountTab();

    }

    @And("^BankManager searches customer that created in first test$")
    public void bankmanager_searches_customer_that_created_in_first_test() throws InterruptedException {
        Thread.sleep(2000);
        new OpenAccountPage().searchCustomer();

    }

    @And("^BankManager selects currency \"([^\"]*)\"$")
    public void bankmanager_selects_currency(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        new OpenAccountPage().searchCurrency();

    }

    @And("^BankManager clicks on \"([^\"]*)\" button$")
    public void bankmanager_clicks_on_button(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        new OpenAccountPage().clickOnProcessButton();

    }

    @And("^BankManager verifies \"([^\"]*)\" message$")
    public void bankmanager_verifies_message(String arg1)  {
        Assert.assertEquals(new OpenAccountPage().getTextFromAlert(),"Account created successfully with account Number :1016", "Error message");

    }

    @Then("^BankManager clicks on \"([^\"]*)\" button on popup next\\.$")
    public void bankmanagerClicksOnButtonOnPopupNext(String arg0){
        new OpenAccountPage().acceptAlert();

    }
}
