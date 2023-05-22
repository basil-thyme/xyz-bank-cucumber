package com.bank.steps;

import com.bank.pages.CustomerLoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CustomerLoginStepDef {

    @When("^I click on \"([^\"]*)\" Tab$")
    public void i_click_on_Tab(String arg1)  {
        new CustomerLoginPage().customerLogin();
            }

    @When("^I search customer that I have created$")
    public void i_search_customer_that_I_have_created()  {
        new CustomerLoginPage().searchCustomerName();
    }

    @When("^I click on \"([^\"]*)\" Button$")
    public void i_click_on_Button(String arg1) {
        new CustomerLoginPage().clickOnLoginButton();

    }

    @When("^I verify \"([^\"]*)\" Tab displayed$")
    public void i_verify_Tab_displayed(String arg1) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(new CustomerLoginPage().logoutText(), "Logout", "Error message");
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) throws InterruptedException {
        Thread.sleep(3000);
        new CustomerLoginPage().clickOnLogoutTab();

    }

    @Then("^I verify \"([^\"]*)\" text displayed$")
    public void i_verify_text_displayed(String arg1) {
        Assert.assertEquals(new CustomerLoginPage().verifyText(), "Your Name :", "Error message");
    }

}
