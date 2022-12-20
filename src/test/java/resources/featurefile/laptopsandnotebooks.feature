Feature: Laptops and notebooks Test
  As a user I can sort product by price and place order successfully

  @sanity @regression
  Scenario: Verify that products price displayed high to low successfully
    Given I am on home page
    When I should hover laptops and notebooks tab and click
    And I click on show laptops and notebooks
    And I select sort by price high to low
    Then I should verify the product price will arrange in high to low order

  @smoke @regression
  Scenario: User can place order successfully
    Given I am on home page
    When I click on currency link
    And I should hover laptops and notebooks tab and click
    And I click on show laptops and notebooks
    And I select sort by price high to low
    And I select product macbook
    And I am verify text "MacBook"
    And I click on add cart button
    And Verify the message Success: You have added MacBook to your shopping cart!
    And I am clicking on shopping cart text that display in to success message
    And I can verify the text "Shopping Cart"
#    And I am verify product name "MacBook"
    And I change the quantity
    And I should click on update tab
    And I am verifying message Success: You have modified your shopping cart!
    And I can verify the total "£737.45"
    And I click on checkout button
    And I Verify the text "Checkout"
    And Verify the text "New Customer"
    And I click on guest checkout radio button
    And I click continue tab
    And I fill all mandatory field
    And I click on continue button
    And I am adding comment about order into text area
    And I check the terms and conditions check box
    And I clicking on continue button
    Then I get Warning message
