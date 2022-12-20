package com.tutorailsninja.demo.cucumber.steps;

import com.tutorailsninja.demo.pages.DesktopPage;
import com.tutorailsninja.demo.pages.HomePage;
import com.tutorailsninja.demo.pages.laptopsAndNotebooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LaptopsAndDesktopTest {
    @When("^I click on currency link$")
    public void iClickOnCurrencyLink() {
        new DesktopPage().selectYourCurrency();
    }
    @When("^I should hover laptops and notebooks tab and click$")
    public void iShouldHoverLaptopsAndNotebooksTabAndClick() {
            new HomePage().hoverAndClickOnLaptopsAndNotebooksTab();
    }

    @And("^I click on show laptops and notebooks$")
    public void iClickOnShowLaptopsAndNotebooks() {
        new laptopsAndNotebooksPage().clickOnShowAllLaptopsAndNotebooks();
    }

    @And("^I select sort by price high to low$")
    public void iSelectSortByPriceHighToLow() {
        new laptopsAndNotebooksPage().selectSortByPriceHighToLow();
    }

    @Then("^I should verify the product price will arrange in high to low order$")
    public void iShouldVerifyTheProductPriceWillArrangeInHighToLowOrder() {
        new laptopsAndNotebooksPage().selectSortByPriceHighToLow();
    }

    @And("^I select product macbook$")
    public void iSelectProductMacbook() {
        new laptopsAndNotebooksPage().selectProductMacbook();
    }

    @And("^I am verify text \"([^\"]*)\"$")
    public void iAmVerifyText(String text) {
     Assert.assertEquals("Text is not displayed",text,new laptopsAndNotebooksPage().getMacbookText());

    }

    @And("^I click on add cart button$")
    public void iClickOnAddCartButton() {
        new laptopsAndNotebooksPage().clickOnAddToCartButton();
    }

    @And("^Verify the message Success: You have added MacBook to your shopping cart!$")
    public void verifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        String expMess = "Success: You have added MacBook to your shopping cart!\n" + "×";
        Assert.assertEquals("Success message is not displayed", expMess, new laptopsAndNotebooksPage().getSuccessMessage());
    }

    @And("^I am clicking on shopping cart text that display in to success message$")
    public void iAmClickingOnShoppingCartTextThatDisplayInToSuccessMessage() {
        new laptopsAndNotebooksPage().clickOnShoppingCartText();
    }

    @And("^I can verify the text \"([^\"]*)\"$")
    public void iCanVerifyTheText(String expMess) {
        Assert.assertTrue("Shopping Cart is not displayed", new laptopsAndNotebooksPage().getShoppingCartText().contains(expMess));
    }



    @And("^I change the quantity$")
    public void iChangeTheQuantity() {
        new laptopsAndNotebooksPage().clearQuantityField();
        new laptopsAndNotebooksPage().addQuantityInField();
    }

    @And("^I should click on update tab$")
    public void iShouldClickOnUpdateTab() {
        new laptopsAndNotebooksPage().clickOnUpdateTab();
    }

    @And("^I am verifying message Success: You have modified your shopping cart!$")
    public void iAmVerifyingMessageSuccessYouHaveModifiedYourShoppingCart() {
        String expectedMessage = "Success: You have modified your shopping cart!\n" + "×";
        Assert.assertEquals("Success message is not displayed", expectedMessage, new laptopsAndNotebooksPage().getSuccessModifiedMessage());
    }

    @And("^I can verify the total \"([^\"]*)\"$")
    public void iCanVerifyTheTotal(String expTotal) {
        Assert.assertEquals("Total is not displayed",expTotal,new laptopsAndNotebooksPage().getTotal());
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new laptopsAndNotebooksPage().clickOnCheckOut();
    }

    @And("^I Verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String expText) {
        Assert.assertEquals("Checkout is not displayed",expText,new laptopsAndNotebooksPage().getCheckOutText());
    }

    @And("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expText) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("New customer text not displayed",expText,new laptopsAndNotebooksPage().getNewCustomerText());
    }

    @And("^I click on guest checkout radio button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new laptopsAndNotebooksPage().clickOnGuestCheckOutRadioButton();
    }

    @And("^I click continue tab$")
    public void iClickContinueTab() {
        new laptopsAndNotebooksPage().clickOnContinueTab();
    }

    @And("^I fill all mandatory field$")
    public void iFillAllMandatoryField() {
        new laptopsAndNotebooksPage().fillAllMandatoryField();

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new laptopsAndNotebooksPage().clickOnContinueButton();
    }

    @And("^I am adding comment about order into text area$")
    public void iAmAddingCommentAboutOrderIntoTextArea() {
        new laptopsAndNotebooksPage().addCommentInCommentBox();
    }

    @And("^I check the terms and conditions check box$")
    public void iCheckTheTermsAndConditionsCheckBox() throws InterruptedException {
        Thread.sleep(5000);
        new laptopsAndNotebooksPage().clickOnTermsAndConditionsCheckBox();
    }

    @And("^I clicking on continue button$")
    public void iClickingOnContinueButton() {
        new laptopsAndNotebooksPage().clickOnContinue();
    }

    @Then("^I get Warning message$")
    public void iGetWarningMessage() {
        String expectedPaymentText = "Warning: Payment method required!\n"+"×";
        Assert.assertEquals("Warning message is not displayed",expectedPaymentText,new laptopsAndNotebooksPage().getWarningMessage());
    }


}
