Feature: Bank Test-Withdraw money

  As a customer I should be able to withdraw money successfully

  @sanity
  Scenario: I should be able to withdraw money successfully
    When I click on "Customer Login" Tab
    And  I search customer that I have created
    And I click on "Login" Button
    And I click on "Deposit" tab
    And I enter amount 100
    And I click on "Deposit" button
    And I click on "Withdrawal" Tab next
    And I enter withdrawal amount 50
    And I click on "Withdraw" button next
    Then I verify the "Transaction Successful"  message

