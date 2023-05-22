$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WithdrawMoney.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "\r\nAs a customer I should be able to withdraw money successfully",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3578811800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "I should be able to withdraw money successfully",
  "description": "",
  "id": "bank-test;i-should-be-able-to-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I click on \"Customer Login\" Tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I search customer that I have created",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Login\" Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Deposit\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter amount 100",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \"Deposit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \"Withdrawal\" Tab next",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter withdrawal amount 50",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on \"Withdraw\" button next",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the \"Transaction Successful\"  message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Login",
      "offset": 12
    }
  ],
  "location": "CustomerLoginStepDef.i_click_on_Tab(String)"
});
formatter.result({
  "duration": 384288300,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginStepDef.i_search_customer_that_I_have_created()"
});
formatter.result({
  "duration": 332143200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    }
  ],
  "location": "CustomerLoginStepDef.i_click_on_Button(String)"
});
formatter.result({
  "duration": 48223700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit",
      "offset": 12
    }
  ],
  "location": "DepositMoneyStepDef.i_click_on_tab(String)"
});
formatter.result({
  "duration": 231626700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 15
    }
  ],
  "location": "DepositMoneyStepDef.i_enter_amount(int)"
});
formatter.result({
  "duration": 265173900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit",
      "offset": 12
    }
  ],
  "location": "DepositMoneyStepDef.i_click_on_button(String)"
});
formatter.result({
  "duration": 62176300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Withdrawal",
      "offset": 12
    }
  ],
  "location": "WithdrawMoneyStepDef.i_click_on_Tab_next(String)"
});
formatter.result({
  "duration": 50625000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 26
    }
  ],
  "location": "WithdrawMoneyStepDef.i_enter_withdrawal_amount(int)"
});
formatter.result({
  "duration": 2062033500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Withdraw",
      "offset": 12
    }
  ],
  "location": "WithdrawMoneyStepDef.i_click_on_button_next(String)"
});
formatter.result({
  "duration": 59906000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction Successful",
      "offset": 14
    }
  ],
  "location": "WithdrawMoneyStepDef.i_verify_the_message(String)"
});
formatter.result({
  "duration": 3032882400,
  "status": "passed"
});
formatter.after({
  "duration": 76300,
  "status": "passed"
});
formatter.uri("addcustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "bank manager should be able to add customer successfully",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2166861600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "BankManager should add customer successfully",
  "description": "",
  "id": "bank-test;bankmanager-should-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "BankManager clicks On \"Bank Manager Login\" Tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "BankManager clicks On \"Add Customer\" Tab next",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "BankManager enters FirstName",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "BankManager enters LastName",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "BankManager enters PostCode",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "BankManager clicks On \"Add Customer\" Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "popup display",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "BankManager verifies message \"Customer added successfully\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "BankManager clicks on \"ok\" button on popup.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Bank Manager Login",
      "offset": 23
    }
  ],
  "location": "AddCustomerStepDef.bankmanagerClicksOnTab(String)"
});
formatter.result({
  "duration": 371736200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Customer",
      "offset": 23
    }
  ],
  "location": "AddCustomerStepDef.bankmanagerClicksOnTabNext(String)"
});
formatter.result({
  "duration": 231814600,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDef.bankmanagerEntersFirstName()"
});
formatter.result({
  "duration": 2075270400,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDef.bankmanagerEntersLastName()"
});
formatter.result({
  "duration": 2075503300,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDef.bankmanagerEntersPostCode()"
});
formatter.result({
  "duration": 2070924100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Customer",
      "offset": 23
    }
  ],
  "location": "AddCustomerStepDef.bankmanagerClicksOnButton(String)"
});
formatter.result({
  "duration": 72727400,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDef.popupDisplay()"
});
formatter.result({
  "duration": 21100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully",
      "offset": 30
    }
  ],
  "location": "AddCustomerStepDef.bankmanagerVerifiesMessage(String)"
});
formatter.result({
  "duration": 6705100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ok",
      "offset": 23
    }
  ],
  "location": "AddCustomerStepDef.bankmanagerClicksOnButtonOnPopup(String)"
});
formatter.result({
  "duration": 9307300,
  "status": "passed"
});
formatter.after({
  "duration": 37500,
  "status": "passed"
});
});