package com.tutorailsninja.demo.pages;

import com.tutorailsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink;



    //By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    @CacheLookup
    @FindBys(@FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li"))
    List<WebElement> selectMyAccount;

    //By selectMyAccount = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register Account']")
    WebElement registerAccountText;
    //By registerAccountText = By.xpath("//h1[text()='Register Account']");
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Returning Customer']")
    WebElement returningCustomerText;
    // By returningCustomerText = By.xpath("//h2[text()='Returning Customer']");
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;
    //By firstName = By.id("input-firstname");

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastName;
    //By lastName = By.id("input-lastName");
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailId;
    //By emailId = By.id("input-email");

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;
    //By telephone = By.id("input-telephone");
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    //By password = By.id("input-password");
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    //By confirmPassword = By.id("input-confirm");
    @CacheLookup
    @FindBy(xpath = "//label[1]/input[@name='newsletter']")
    WebElement yesRadioButton;
    //By yesRadioButton = By.xpath("//label[1]/input[@name='newsletter']");
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicy;
    //By privacyPolicy = By.name("agree");
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    //By continueButton = By.xpath("//input[@value='Continue']");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedMessage;
    //    By accountCreatedMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinue;
    //By clickOnContinue = By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    //By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContinue;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnLoginAfterContinue;

   // By clickContinue = By.xpath("//a[contains(text(),'Continue')]");
   @CacheLookup
   @FindBy(xpath = "//input[@value='Login']")
   WebElement loginButton;

    //By loginButton = By.xpath("//input[@value='Login']");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountText;
    //By myAccountText = By.xpath("//h2[contains(text(),'My Account')]");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountText1;
    //By myAccountText = By.xpath("//h2[contains(text(),'My Account')]");

    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement LogOut;

    public void clickOnLogOut(){
        log.info("Click on Logout: " +LogOut.toString());
        clickOnElement(LogOut);
    }

    public void clickOnMyAccountLink() {
        //mouseHoverToElement(myAccountLink);
        log.info("Click on Register: " +myAccountLink.toString());
        clickOnElement(myAccountLink);
    }
    public void clickOnMyAccountLink1() {
        //mouseHoverToElement(myAccountLink);
        log.info("Click on My Account : " +myAccountLink.toString());
        clickOnElement(myAccountLink);

    }

    public void selectMyAccountOptions(String option) {
        // List<WebElement> myAccountList = driver.findElements(selectMyAccount);
        log.info("Select My Account List: "+selectMyAccount.toString());
            try{
            for (WebElement options : selectMyAccount) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }}
            catch (StaleElementReferenceException e){
               selectMyAccount.toString();
            }

    }

    public String getRegisterAccountText() {

        log.info("Verify Register Text : "+registerAccountText.toString());

        return getTextFromElement(registerAccountText);
    }

    public String getReturningCustomerText() {
        log.info("get Returning Customer Text : "+returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);
    }

    public void enterFirstName(String firstName) {
        log.info("Enter FirstName "+ this.firstName.toString());
        sendTextToElement(this.firstName, "Bruce");


    }
    public void enterLastName(String lastName) {
        log.info("Enter LastName "+ this.lastName.toString());
        sendTextToElement(this.lastName, "Tyson");

    }

    public void enterEmailId(String email) {
        log.info("Enter emailId "+ emailId.toString());
        sendTextToElement(emailId,email);

    }

    public void enterTelephone(String phone) {
        log.info("Enter telephone "+ telephone.toString());
        sendTextToElement(telephone, phone);

    }

    public void enterPassword(String password) {
        log.info("Enter password "+ this.password.toString());
        sendTextToElement(this.password, password);

    }

    public void enterConfirmPassword(String confirmPass) {
        log.info("Enter confirmPassword "+ confirmPassword.toString());
        sendTextToElement(confirmPassword, confirmPass);

    }

    public void clickOnYesRadioButton() {
        log.info("clickOnElement "+ yesRadioButton.toString());
        clickOnElement(yesRadioButton);

    }

    public void clickOnPrivacyPolicyCheckBox() {
        log.info("clickOnPrivacyPolicyCheckBox "+ privacyPolicy.toString());
        clickOnElement(privacyPolicy);

    }

    public void clickOnContinue() {
        log.info("clickOnContinue "+ continueButton.toString());
        clickOnElement(continueButton);

    }

    public String getAccountCreatedMessage() {
        log.info("getAccountCreatedMessage "+ accountCreatedMessage.toString());

        return getTextFromElement(accountCreatedMessage);
    }

    public void clickOnContinueButton() {
        log.info("clickOnContinueButton "+ clickOnContinue.toString());
        clickOnElement(clickOnContinue);

    }

    public String getAccountLogoutText() {
        log.info("getAccountLogoutText "+ accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }

    public void clickContinue() {
        log.info("clickOnContinue "+ clickContinue.toString());
        clickOnElement(clickContinue);


    }
    public void setClickOnLoginAfterContinue() {
        log.info("clickOnContinue "+ clickOnLoginAfterContinue.toString());
        clickOnElement(clickOnLoginAfterContinue);


    }

    public void clickOnLoginButton() {
        log.info("clickOnLoginButton "+ loginButton.toString());
        clickOnElement(loginButton);

    }

    public String getMyAccountText() {
        log.info("getMyAccountText "+ myAccountText.toString());
        return getTextFromElement(myAccountText);
    }

}
