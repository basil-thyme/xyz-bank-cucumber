Feature: Bank Test-Open an account

  @smoke @regression
  Scenario:BankManager should open an account successfully
    When BankManager clicks On "Bank Manager Login" Tab
    And BankManager clicks On "Open Account" button
    And BankManager searches customer that created in first test
    And BankManager selects currency "Pound"
    And BankManager clicks on "process" button
    And popup display
    And BankManager verifies "Account created successfully" message
    Then BankManager clicks on "ok" button on popup next.