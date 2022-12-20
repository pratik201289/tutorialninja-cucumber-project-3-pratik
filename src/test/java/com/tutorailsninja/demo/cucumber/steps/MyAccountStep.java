package com.tutorailsninja.demo.cucumber.steps;

import com.tutorailsninja.demo.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyAccountStep {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }
    @When("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("^I select register tab$")
    public void iSelectRegisterTab() {
        new MyAccountPage().selectMyAccountOptions("Register");
    }

    @Then("^I verify register account text \"([^\"]*)\"$")
    public void iVerifyRegisterAccountText(String expText) {
        Assert.assertEquals("Register account text is not displayed", expText, new MyAccountPage().getRegisterAccountText());
    }

    @And("^I select login tab$")
    public void iSelectLoginTab() {
        new MyAccountPage().selectMyAccountOptions("Login");
    }

    @Then("^I verify login account text \"([^\"]*)\"$")
    public void iVerifyLoginAccountText(String expText) {
        Assert.assertEquals("Returning customer message is not displayed", expText, new MyAccountPage().getReturningCustomerText());
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        new MyAccountPage().enterFirstName(firstName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new MyAccountPage().enterLastName(lastName);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new MyAccountPage().enterEmailId(email);
    }

    @And("^I enter telephone \"([^\"]*)\"$")
    public void iEnterTelephone(String phone) {
        new MyAccountPage().enterTelephone(phone);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new MyAccountPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPass) {
        new MyAccountPage().enterConfirmPassword(confirmPass);
    }

    @And("^I select subscribe radio button yes$")
    public void iSelectSubscribeRadioButtonYes() {
        new MyAccountPage().clickOnYesRadioButton();
    }

    @And("^I click on privacy policy check box$")
    public void iClickOnPrivacyPolicyCheckBox() {
        new MyAccountPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("^I click continue button$")
    public void iClickContinueButton() {
        new MyAccountPage().clickOnContinue();
    }

    @And("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String expMess) {
        Assert.assertEquals("Message is not displayed",expMess,new MyAccountPage().getAccountCreatedMessage());
    }

    @And("^I am clicking on continue button$")
    public void iAmClickingOnContinueButton() {
        new MyAccountPage().clickContinue();
    }

    @And("^I am clicking on my account link$")
    public void iAmClickingOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("^I click on logout$")
    public void iClickOnLogout() {
        new MyAccountPage().selectMyAccountOptions("Logout");
    }

    @And("^I am verifying the text \"([^\"]*)\"$")
    public void iAmVerifyingTheText(String expText) {
        Assert.assertEquals("Account logout not displayed",expText,new MyAccountPage().getAccountLogoutText());
    }

    @And("^I am clicking continue$")
    public void iAmClickingContinue() {
        new MyAccountPage().clickOnContinueButton();
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email)  {
        new MyAccountPage().enterEmailId(email);
    }

    @And("^I enter password field \"([^\"]*)\"$")
    public void iEnterPasswordField(String password)  {
        new MyAccountPage().enterPassword(password);
    }

    @And("^I clicking on login button$")
    public void iClickingOnLoginButton() {
        new MyAccountPage().clickOnLoginButton();
    }

    @And("^I will verify the text \"([^\"]*)\"$")
    public void iWillVerifyTheText(String text)  {
        Assert.assertEquals("My account text is not displayed",text,new MyAccountPage().getMyAccountText());
    }

    @And("^I click on my account$")
    public void iClickOnMyAccount() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("^Select logout$")
    public void selectLogout() {
        new MyAccountPage().selectMyAccountOptions("Logout");
    }

    @And("^verify text \"([^\"]*)\"$")
    public void verifyText(String expText)  {
        Assert.assertEquals("Account logout is not displayed",expText,new MyAccountPage().getAccountLogoutText());
    }

    @And("^click continue$")
    public void clickContinue() {
        new MyAccountPage().setClickOnLoginAfterContinue();
    }
}
