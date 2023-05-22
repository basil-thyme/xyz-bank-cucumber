Feature: Bank Test-Add customer
  bank manager should be able to add customer successfully

@sanity
  Scenario: BankManager should add customer successfully
    When BankManager clicks On "Bank Manager Login" Tab
    And BankManager clicks On "Add Customer" Tab next
    And BankManager enters FirstName
    And BankManager enters LastName
    And BankManager enters PostCode
    And BankManager clicks On "Add Customer" Button
    And popup display
    And BankManager verifies message "Customer added successfully"
    Then BankManager clicks on "ok" button on popup.
