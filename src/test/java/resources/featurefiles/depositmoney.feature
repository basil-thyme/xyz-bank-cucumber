Feature: Bank Test-Deposit money

  As a customer I should be able to deposit money successfully
  @smoke @regression
  Scenario: I should be able to deposit money successfully
    When I click on "Customer Login" Tab
    And  I search customer that I have created
    And I click on "Login" Button
    And I click on "Deposit" tab
    And I enter amount 100
    And I click on "Deposit" button
    Then I verify the message "Deposit Successful"
