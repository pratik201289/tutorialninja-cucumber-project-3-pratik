$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desktops.feature");
formatter.feature({
  "line": 1,
  "name": "DesktopPage Test",
  "description": "As user I want to test DesktopPage into tutorial ninja Website",
  "id": "desktoppage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6561796700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify the product arrange in Alphabetical Order",
  "description": "",
  "id": "desktoppage-test;verify-the-product-arrange-in-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the DesktopPage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Mouse Hover on Desktop tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select show all desktop",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select sort by position Name: Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify the product will arrange in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopPageStep.iAmOnTheDesktopPage()"
});
formatter.result({
  "duration": 120823900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.mouseHoverOnDesktopTabAndClick()"
});
formatter.result({
  "duration": 192780600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.selectShowAllDesktop()"
});
formatter.result({
  "duration": 906865200,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStep.selectSortByPositionNameZToA()"
});
formatter.result({
  "duration": 502117600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStep.verifyTheProductWillArrangeInDescendingOrder()"
});
formatter.result({
  "duration": 381225800,
  "status": "passed"
});
formatter.after({
  "duration": 740294500,
  "status": "passed"
});
formatter.before({
  "duration": 3256831200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify product added to shopping cart successfully",
  "description": "",
  "id": "desktoppage-test;verify-product-added-to-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@smoke"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on the DesktopPage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Mouse Hover on Desktop tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "select show all desktop",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select sort by position Name: A to Z",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select product \"HP LP3065\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Verify the Text \"HP LP3065\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "enter Quantity 1 using select class",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select delivery date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "click on Add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verify the Message Success: You have added HP \"LP3065\" to your shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "click on the link shopping cart display into success message",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "verify the text Shopping Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "verify the product name \"HP LP3065\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "verify the delivery date \"Delivery Date: 2023-11-30\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "verify the model \"Product 21\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "select the currency",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "verify the Total \"£74.73\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopPageStep.iAmOnTheDesktopPage()"
});
formatter.result({
  "duration": 22900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.mouseHoverOnDesktopTabAndClick()"
});
formatter.result({
  "duration": 268375000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.selectShowAllDesktop()"
});
formatter.result({
  "duration": 845711000,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStep.selectSortByPositionNameAToZ()"
});
formatter.result({
  "duration": 477722300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 16
    }
  ],
  "location": "DesktopPageStep.selectProduct(String)"
});
formatter.result({
  "duration": 1366092400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 17
    }
  ],
  "location": "DesktopPageStep.verifyTheText(String)"
});
formatter.result({
  "duration": 51881100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "DesktopPageStep.enterQuantityUsingSelectClass(int)"
});
formatter.result({
  "duration": 227328700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStep.selectDeliveryDate()"
});
formatter.result({
  "duration": 9383866900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStep.clickOnAddToCartButton()"
});
formatter.result({
  "duration": 59813600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LP3065",
      "offset": 47
    }
  ],
  "location": "DesktopPageStep.verifyTheMessageSuccessYouHaveAddedHPToYourShoppingCart(String)"
});
formatter.result({
  "duration": 2031353500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStep.clickOnTheLinkShoppingCartDisplayIntoSuccessMessage()"
});
formatter.result({
  "duration": 2458556300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStep.verifyTheTextShoppingCart()"
});
formatter.result({
  "duration": 42413500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 25
    }
  ],
  "location": "DesktopPageStep.verifyTheProductName(String)"
});
formatter.result({
  "duration": 28458500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Delivery Date: 2023-11-30",
      "offset": 26
    }
  ],
  "location": "DesktopPageStep.verifyTheDeliveryDate(String)"
});
formatter.result({
  "duration": 28438900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product 21",
      "offset": 18
    }
  ],
  "location": "DesktopPageStep.verifyTheModel(String)"
});
formatter.result({
  "duration": 30970000,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStep.selectTheCurrency()"
});
formatter.result({
  "duration": 660794300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£74.73",
      "offset": 18
    }
  ],
  "location": "DesktopPageStep.verifyTheTotal(String)"
});
formatter.result({
  "duration": 41684800,
  "status": "passed"
});
formatter.after({
  "duration": 784033900,
  "status": "passed"
});
formatter.uri("laptopsandnotebooks.feature");
formatter.feature({
  "line": 1,
  "name": "Laptops and notebooks Test",
  "description": "As a user I can sort product by price and place order successfully",
  "id": "laptops-and-notebooks-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3324203300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify that products price displayed high to low successfully",
  "description": "",
  "id": "laptops-and-notebooks-test;verify-that-products-price-displayed-high-to-low-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should hover laptops and notebooks tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on show laptops and notebooks",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select sort by price high to low",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should verify the product price will arrange in high to low order",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountStep.iAmOnHomePage()"
});
formatter.result({
  "duration": 51700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iShouldHoverLaptopsAndNotebooksTabAndClick()"
});
formatter.result({
  "duration": 261905600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickOnShowLaptopsAndNotebooks()"
});
formatter.result({
  "duration": 576682200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iSelectSortByPriceHighToLow()"
});
formatter.result({
  "duration": 744876000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iShouldVerifyTheProductPriceWillArrangeInHighToLowOrder()"
});
formatter.result({
  "duration": 209735200,
  "status": "passed"
});
formatter.after({
  "duration": 735709400,
  "status": "passed"
});
formatter.before({
  "duration": 3613794400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User can place order successfully",
  "description": "",
  "id": "laptops-and-notebooks-test;user-can-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@smoke"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on currency link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should hover laptops and notebooks tab and click",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on show laptops and notebooks",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select sort by price high to low",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select product macbook",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I am verify text \"MacBook\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on add cart button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify the message Success: You have added MacBook to your shopping cart!",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I am clicking on shopping cart text that display in to success message",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I can verify the text \"Shopping Cart\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#    And I am verify product name \"MacBook\""
    }
  ],
  "line": 26,
  "name": "I change the quantity",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should click on update tab",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I am verifying message Success: You have modified your shopping cart!",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I can verify the total \"£737.45\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I Verify the text \"Checkout\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Verify the text \"New Customer\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on guest checkout radio button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click continue tab",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I fill all mandatory field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I am adding comment about order into text area",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I check the terms and conditions check box",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I clicking on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I get Warning message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountStep.iAmOnHomePage()"
});
formatter.result({
  "duration": 17500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickOnCurrencyLink()"
});
formatter.result({
  "duration": 633815400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iShouldHoverLaptopsAndNotebooksTabAndClick()"
});
formatter.result({
  "duration": 159573100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickOnShowLaptopsAndNotebooks()"
});
formatter.result({
  "duration": 594405300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iSelectSortByPriceHighToLow()"
});
formatter.result({
  "duration": 654267500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iSelectProductMacbook()"
});
formatter.result({
  "duration": 1381771000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MacBook",
      "offset": 18
    }
  ],
  "location": "LaptopsAndDesktopTest.iAmVerifyText(String)"
});
formatter.result({
  "duration": 39008800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickOnAddCartButton()"
});
formatter.result({
  "duration": 60215700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.verifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart()"
});
formatter.result({
  "duration": 238216100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iAmClickingOnShoppingCartTextThatDisplayInToSuccessMessage()"
});
formatter.result({
  "duration": 412498900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart",
      "offset": 23
    }
  ],
  "location": "LaptopsAndDesktopTest.iCanVerifyTheText(String)"
});
formatter.result({
  "duration": 41150700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iChangeTheQuantity()"
});
formatter.result({
  "duration": 111998600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iShouldClickOnUpdateTab()"
});
formatter.result({
  "duration": 520976600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iAmVerifyingMessageSuccessYouHaveModifiedYourShoppingCart()"
});
formatter.result({
  "duration": 41655400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£737.45",
      "offset": 24
    }
  ],
  "location": "LaptopsAndDesktopTest.iCanVerifyTheTotal(String)"
});
formatter.result({
  "duration": 24927000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickOnCheckoutButton()"
});
formatter.result({
  "duration": 353525600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Checkout",
      "offset": 19
    }
  ],
  "location": "LaptopsAndDesktopTest.iVerifyTheText(String)"
});
formatter.result({
  "duration": 38775100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Customer",
      "offset": 17
    }
  ],
  "location": "LaptopsAndDesktopTest.verifyTheText(String)"
});
formatter.result({
  "duration": 5029761500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickOnGuestCheckoutRadioButton()"
});
formatter.result({
  "duration": 57082700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickContinueTab()"
});
formatter.result({
  "duration": 58319300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iFillAllMandatoryField()"
});
formatter.result({
  "duration": 1140161500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 78723200,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iAmAddingCommentAboutOrderIntoTextArea()"
});
formatter.result({
  "duration": 568229300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iCheckTheTermsAndConditionsCheckBox()"
});
formatter.result({
  "duration": 5077483500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iClickingOnContinueButton()"
});
formatter.result({
  "duration": 61096600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndDesktopTest.iGetWarningMessage()"
});
formatter.result({
  "duration": 374314300,
  "status": "passed"
});
formatter.after({
  "duration": 705191800,
  "status": "passed"
});
formatter.uri("myaccounts.feature");
formatter.feature({
  "line": 1,
  "name": "My Account Test",
  "description": "As a user I can register account and login and logout account successfully",
  "id": "my-account-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3533821000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to register page successfully",
  "description": "",
  "id": "my-account-test;user-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on my account link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select register tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify register account text \"Register Account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountStep.iAmOnHomePage()"
});
formatter.result({
  "duration": 24600,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 58309700,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iSelectRegisterTab()"
});
formatter.result({
  "duration": 714834000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register Account",
      "offset": 32
    }
  ],
  "location": "MyAccountStep.iVerifyRegisterAccountText(String)"
});
formatter.result({
  "duration": 33991500,
  "status": "passed"
});
formatter.after({
  "duration": 710841700,
  "status": "passed"
});
formatter.before({
  "duration": 3519528400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "my-account-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    },
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on my account link",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I select login tab",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify login account text \"Returning Customer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountStep.iAmOnHomePage()"
});
formatter.result({
  "duration": 14900,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 63217500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iSelectLoginTab()"
});
formatter.result({
  "duration": 415565500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Returning Customer",
      "offset": 29
    }
  ],
  "location": "MyAccountStep.iVerifyLoginAccountText(String)"
});
formatter.result({
  "duration": 39865200,
  "status": "passed"
});
formatter.after({
  "duration": 731663300,
  "status": "passed"
});
formatter.before({
  "duration": 3248759000,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User can register account successfully",
  "description": "",
  "id": "my-account-test;user-can-register-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on my account link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I select register tab",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter first name \"Leo\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter last name \"Messi\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter email \"messi103@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter telephone \"07717223344\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I enter password \"Test123\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter confirm password \"Test123\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select subscribe radio button yes",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on privacy policy check box",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I verify message \"Your Account Has Been Created!\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I am clicking on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I am clicking on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on logout",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I am verifying the text \"Account Logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I am clicking continue",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountStep.iAmOnHomePage()"
});
formatter.result({
  "duration": 24500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 66910300,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iSelectRegisterTab()"
});
formatter.result({
  "duration": 781633300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leo",
      "offset": 20
    }
  ],
  "location": "MyAccountStep.iEnterFirstName(String)"
});
formatter.result({
  "duration": 83170100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Messi",
      "offset": 19
    }
  ],
  "location": "MyAccountStep.iEnterLastName(String)"
});
formatter.result({
  "duration": 90547700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "messi103@gmail.com",
      "offset": 15
    }
  ],
  "location": "MyAccountStep.iEnterEmail(String)"
});
formatter.result({
  "duration": 98068900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07717223344",
      "offset": 19
    }
  ],
  "location": "MyAccountStep.iEnterTelephone(String)"
});
formatter.result({
  "duration": 91214700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test123",
      "offset": 18
    }
  ],
  "location": "MyAccountStep.iEnterPassword(String)"
});
formatter.result({
  "duration": 91510300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test123",
      "offset": 26
    }
  ],
  "location": "MyAccountStep.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 89711700,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iSelectSubscribeRadioButtonYes()"
});
formatter.result({
  "duration": 71613600,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iClickOnPrivacyPolicyCheckBox()"
});
formatter.result({
  "duration": 62278500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iClickContinueButton()"
});
formatter.result({
  "duration": 384205700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Account Has Been Created!",
      "offset": 18
    }
  ],
  "location": "MyAccountStep.iVerifyMessage(String)"
});
formatter.result({
  "duration": 40096566300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[contains(text(),\u0027Your Account Has Been Created!\u0027)]\"}\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [85fd940209881defd67ed70a0af214b9, findElement {using\u003dxpath, value\u003d//h1[contains(text(),\u0027Your Account Has Been Created!\u0027)]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\LENOVO\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:55311}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:55311/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 85fd940209881defd67ed70a0af214b9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy26.getText(Unknown Source)\r\n\tat com.tutorailsninja.demo.utility.Utility.getTextFromElement(Utility.java:61)\r\n\tat com.tutorailsninja.demo.pages.MyAccountPage.getAccountCreatedMessage(MyAccountPage.java:216)\r\n\tat com.tutorailsninja.demo.cucumber.steps.MyAccountStep.iVerifyMessage(MyAccountStep.java:86)\r\n\tat ✽.And I verify message \"Your Account Has Been Created!\"(myaccounts.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyAccountStep.iAmClickingOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccountStep.iAmClickingOnMyAccountLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccountStep.iClickOnLogout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Logout",
      "offset": 25
    }
  ],
  "location": "MyAccountStep.iAmVerifyingTheText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccountStep.iAmClickingContinue()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 998932800,
  "status": "passed"
});
formatter.before({
  "duration": 3763092300,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "User should login and logout successfully",
  "description": "",
  "id": "my-account-test;user-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "I click on my account link",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I select login tab",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I enter email address \"messi101@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I enter password field \"Test123\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I clicking on login button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I will verify the text \"My Account\"",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click on my account",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Select logout",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "verify text \"Account Logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click continue",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountStep.iAmOnHomePage()"
});
formatter.result({
  "duration": 134900,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 128392200,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iSelectLoginTab()"
});
formatter.result({
  "duration": 385681500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "messi101@gmail.com",
      "offset": 23
    }
  ],
  "location": "MyAccountStep.iEnterEmailAddress(String)"
});
formatter.result({
  "duration": 163833900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test123",
      "offset": 24
    }
  ],
  "location": "MyAccountStep.iEnterPasswordField(String)"
});
formatter.result({
  "duration": 113547500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iClickingOnLoginButton()"
});
formatter.result({
  "duration": 550918700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 24
    }
  ],
  "location": "MyAccountStep.iWillVerifyTheText(String)"
});
formatter.result({
  "duration": 38069300,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.iClickOnMyAccount()"
});
formatter.result({
  "duration": 51551700,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.selectLogout()"
});
formatter.result({
  "duration": 558078600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Logout",
      "offset": 13
    }
  ],
  "location": "MyAccountStep.verifyText(String)"
});
formatter.result({
  "duration": 40723900,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStep.clickContinue()"
});
formatter.result({
  "duration": 371698200,
  "status": "passed"
});
formatter.after({
  "duration": 653517000,
  "status": "passed"
});
formatter.uri("topmenu.feature");
formatter.feature({
  "line": 1,
  "name": "TopMenu Test",
  "description": "As user I want to test TopMenu into tutorial ninja Website",
  "id": "topmenu-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3391861800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify the User Should navigate to Desktop Page Successfully",
  "description": "",
  "id": "topmenu-test;verify-the-user-should-navigate-to-desktop-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Mouse Hover on Desktop tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select show all desktop",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify the text Desktops",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 96700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.mouseHoverOnDesktopTabAndClick()"
});
formatter.result({
  "duration": 284429200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.selectShowAllDesktop()"
});
formatter.result({
  "duration": 868213900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.verifyTheTextDesktops()"
});
formatter.result({
  "duration": 42221800,
  "status": "passed"
});
formatter.after({
  "duration": 758292300,
  "status": "passed"
});
formatter.before({
  "duration": 3187091900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify the User Should navigate to Laptop and Notebook Page Successfully",
  "description": "",
  "id": "topmenu-test;verify-the-user-should-navigate-to-laptop-and-notebook-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    },
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Mouse Hover on Laptop \u0026 Notebook tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "select show all laptops and notebooks",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verify the text Laptops \u0026 Notebooks",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 38300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.mouseHoverOnLaptopNotebookTabAndClick()"
});
formatter.result({
  "duration": 145917700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.selectShowAllLaptopsAndNotebooks()"
});
formatter.result({
  "duration": 609546800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.verifyTheTextLaptopsNotebooks()"
});
formatter.result({
  "duration": 31950300,
  "status": "passed"
});
formatter.after({
  "duration": 752370200,
  "status": "passed"
});
formatter.before({
  "duration": 3564020400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify the User Should navigate to Components Page Successfully",
  "description": "",
  "id": "topmenu-test;verify-the-user-should-navigate-to-components-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Mouse Hover on Components tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "select show all Components",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verify the text Components",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 56000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.mouseHoverOnComponentsTabAndClick()"
});
formatter.result({
  "duration": 175844500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.selectShowAllComponents()"
});
formatter.result({
  "duration": 570997500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.verifyTheTextComponents()"
});
formatter.result({
  "duration": 37729100,
  "status": "passed"
});
formatter.after({
  "duration": 757342400,
  "status": "passed"
});
});