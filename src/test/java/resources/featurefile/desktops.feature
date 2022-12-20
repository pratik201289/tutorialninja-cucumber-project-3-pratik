Feature: DesktopPage Test
  As user I want to test DesktopPage into tutorial ninja Website

  @sanity @regression
  Scenario: Verify the product arrange in Alphabetical Order
    Given I am on the DesktopPage
    When Mouse Hover on Desktop tab and click
    And select show all desktop
    And select sort by position Name: Z to A
    Then Verify the product will arrange in descending order

  @smoke @regression
  Scenario: Verify product added to shopping cart successfully
    Given I am on the DesktopPage
    When Mouse Hover on Desktop tab and click
    And select show all desktop
    And select sort by position Name: A to Z
    And select product "HP LP3065"
    Then Verify the Text "HP LP3065"
    And enter Quantity 1 using select class
    And select delivery date
    And click on Add to cart button
    Then verify the Message Success: You have added HP "LP3065" to your shopping cart
    And click on the link shopping cart display into success message
    Then verify the text Shopping Cart
    Then verify the product name "HP LP3065"
    Then verify the delivery date "Delivery Date: 2023-11-30"
    Then verify the model "Product 21"
    Then select the currency
    Then verify the Total "£74.73"

