Feature: My Account Test
  As a user I can register account and login and logout account successfully

  @sanity @regression
  Scenario: User should navigate to register page successfully
    Given I am on home page
    When I click on my account link
    And I select register tab
    Then I verify register account text "Register Account"

  @smoke @regression
  Scenario: User should navigate to login page successfully
    Given I am on home page
    When I click on my account link
    And I select login tab
    Then I verify login account text "Returning Customer"

  @regression
  Scenario: User can register account successfully
    Given I am on home page
    When I click on my account link
    And I select register tab
    And I enter first name "Leo"
    And I enter last name "Messi"
    And I enter email "messi2012@gmail.com"
    And I enter telephone "07717223344"
    And I enter password "Test123"
    And I enter confirm password "Test123"
    And I select subscribe radio button yes
    And I click on privacy policy check box
    And I click continue button
    And I verify message "Your Account Has Been Created!"
    And I am clicking on continue button
    And I am clicking on my account link
    And I click on logout
    And I am verifying the text "Account Logout"
    And I am clicking continue

  @regression
  Scenario: User should login and logout successfully
    Given I am on home page
    When I click on my account link
    And I select login tab
    And I enter email address "messi101@gmail.com"
    And I enter password field "Test123"
    And I clicking on login button
    And I will verify the text "My Account"
    And I click on my account
    And Select logout
    And verify text "Account Logout"
    And click continue