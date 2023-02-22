Feature: Add item to cart

  Scenario: Successful login user adds an item to cart
    Given User is on inventory page
    When User adds 1 item to cart
    Then Verifies items on cart
    And Logs out
