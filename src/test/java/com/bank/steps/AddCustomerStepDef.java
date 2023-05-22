package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddCustomerStepDef {


    @When("^BankManager clicks On \"([^\"]*)\" Tab$")
    public void bankmanagerClicksOnTab(String arg0) {
        new AddCustomerPage().clickOnBankManagerLogin();

    }

    @And("^BankManager clicks On \"([^\"]*)\" Tab next$")
    public void bankmanagerClicksOnTabNext(String arg0) {
        new AddCustomerPage().clickOnAddCustomerTab();
    }


    @And("^BankManager enters FirstName$")
    public void bankmanagerEntersFirstName() throws InterruptedException {
        Thread.sleep(2000);
        new AddCustomerPage().enterFirstName("John");
    }

    @And("^BankManager enters LastName$")
    public void bankmanagerEntersLastName() throws InterruptedException {
        Thread.sleep(2000);
        new AddCustomerPage().enterLastName("Smith");
    }

    @And("^BankManager enters PostCode$")
    public void bankmanagerEntersPostCode() throws InterruptedException {
        Thread.sleep(2000);
        new AddCustomerPage().enterPostcode("xy27ct");
    }

    @And("^BankManager clicks On \"([^\"]*)\" Button$")
    public void bankmanagerClicksOnButton(String arg0) {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("^popup display$")
    public void popupDisplay() {

    }

    @And("^BankManager verifies message \"([^\"]*)\"$")
    public void bankmanagerVerifiesMessage(String arg0) {
        Assert.assertEquals(new AddCustomerPage().getTextFromAlert(), "Customer added successfully with customer id :6", "Error message");


    }

    @Then("^BankManager clicks on \"([^\"]*)\" button on popup\\.$")
    public void bankmanagerClicksOnButtonOnPopup(String arg0) {
        new AddCustomerPage().acceptAlert();
    }
}


