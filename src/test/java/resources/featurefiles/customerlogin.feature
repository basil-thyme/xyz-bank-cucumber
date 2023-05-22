Feature: Bank Test-Customer login

  As a customer I should be able to login and logout successfully
@regression
  Scenario: I should login and logout successfully
    When I click on "Customer Login" Tab
    And  I search customer that I have created
    And I click on "Login" Button
    And I verify "Logout" Tab displayed
    And I click on "Logout"
    Then I verify "Your Name" text displayed
