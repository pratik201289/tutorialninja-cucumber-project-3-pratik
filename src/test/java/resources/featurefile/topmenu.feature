Feature: TopMenu Test
  As user I want to test TopMenu into tutorial ninja Website

  @sanity @regression
  Scenario: Verify the User Should navigate to Desktop Page Successfully
    Given I am on homepage
    When Mouse Hover on Desktop tab and click
    And  select show all desktop
    Then verify the text Desktops

  @smoke @regression
  Scenario: Verify the User Should navigate to Laptop and Notebook Page Successfully
    Given I am on homepage
    When Mouse Hover on Laptop & Notebook tab and click
    And  select show all laptops and notebooks
    Then verify the text Laptops & Notebooks

  @regression
  Scenario: Verify the User Should navigate to Components Page Successfully
    Given I am on homepage
    When Mouse Hover on Components tab and click
    And  select show all Components
    Then verify the text Components
