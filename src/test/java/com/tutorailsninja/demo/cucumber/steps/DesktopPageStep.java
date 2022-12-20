package com.tutorailsninja.demo.cucumber.steps;

import com.tutorailsninja.demo.pages.DesktopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DesktopPageStep {
    @Given("^I am on the DesktopPage$")
    public void iAmOnTheDesktopPage() {

    }

    @And("^select sort by position Name: Z to A$")
    public void selectSortByPositionNameZToA() {
        new DesktopPage().setSortSelectZToA();
    }


    @Then("^Verify the product will arrange in descending order$")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        new DesktopPage().verifyProductArrangeInDescendingOrder();
    }

    @And("^select sort by position Name: A to Z$")
    public void selectSortByPositionNameAToZ() {
        new DesktopPage().sortAToZ();
    }


    @And("^select product \"([^\"]*)\"$")
    public void selectProduct(String arg0) {

        new DesktopPage().setSelectProduct();
    }

    @Then("^Verify the Text \"([^\"]*)\"$")
    public void verifyTheText(String str) {

        // new DesktopPage().getProductText();
        Assert.assertEquals("Login page not displayed", str, new DesktopPage().getProductText());

    }

    @And("^select delivery date$")
    public void selectDeliveryDate() {
        new DesktopPage().pickDate();
    }

    @And("^enter Quantity (\\d+) using select class$")
    public void enterQuantityUsingSelectClass(int arg0) {
        new DesktopPage().enterQuantity();
    }

    @And("^click on Add to cart button$")
    public void clickOnAddToCartButton() {
        new DesktopPage().addProductToCart();
    }

    @Then("^verify the Message Success: You have added HP \"([^\"]*)\" to your shopping cart$")
    public void verifyTheMessageSuccessYouHaveAddedHPToYourShoppingCart(String str) throws InterruptedException {

        String expectedText = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
            Thread.sleep(2000);
        Assert.assertEquals("Login page not displayed", expectedText, new DesktopPage().productAddedToCartDisplayed());

    }

    @And("^click on the link shopping cart display into success message$")
    public void clickOnTheLinkShoppingCartDisplayIntoSuccessMessage() throws InterruptedException {
        Thread.sleep(2000);
        new DesktopPage().setShoppingCart();
    }

    @Then("^verify the text Shopping Cart$")
    public void verifyTheTextShoppingCart() {
        Assert.assertEquals("Text Shopping cart text is not displayed", "Shopping Cart", new DesktopPage().textShoppingCart());
    }

    @Then("^verify the product name \"([^\"]*)\"$")
    public void verifyTheProductName(String str) {

        Assert.assertEquals("Product Name text is not displayed", str, new DesktopPage().getProductText1());
    }

    @Then("^verify the delivery date \"([^\"]*)\"$")
    public void verifyTheDeliveryDate(String str) {


        Assert.assertEquals("Verify the delivery date is not display", str, new DesktopPage().verifyDeliveryDate());
    }

    @Then("^verify the model \"([^\"]*)\"$")
    public void verifyTheModel(String model) {

        Assert.assertEquals("Model is not displayed", model, new DesktopPage().verifyProductModel());
    }

    @Then("^select the currency$")
    public void selectTheCurrency() {
        new DesktopPage().selectYourCurrency();
    }

    @Then("^verify the Total \"([^\"]*)\"$")
    public void verifyTheTotal(String total) {
        Assert.assertEquals("Model is not displayed", total, new DesktopPage().total());

    }

}
