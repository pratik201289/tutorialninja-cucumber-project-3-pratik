package com.tutorailsninja.demo.pages;

import com.tutorailsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class laptopsAndNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(laptopsAndNotebooksPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
    WebElement showAllLaptops;

    //By showAllLaptops = By.xpath("//a[text()='Show All Laptops & Notebooks']");
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement priceHighToLow;

    //By priceHighToLow = By.id("input-sort");
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement selectMacbook;
    //By selectMacbook = By.linkText("MacBook");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='MacBook']")
    WebElement macbookText;
    //By macbookText = By.xpath("//h1[text()='MacBook']");

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCart;

    //By addToCart = By.id("button-cart");
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;
    //By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;

    // By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    //By shoppingCartText = By.xpath("//div[@id='content']//h1");
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearQuantity;

    // By clearQuantity = By.xpath("//input[@value='1']");

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement addQuantity;
    //By addQuantity = By.xpath("//input[@value='1']");

    @CacheLookup
    @FindBy(xpath = "//button[@data-original-title='Update']")
    WebElement updateTab;

    //By updateTab = By.xpath("//button[@data-original-title='Update']");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;
    //By successModifiedMessage = By.xpath("//body/div[@id='checkout-cart']/div[1]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currency;

    //By currency = By.xpath("//span[contains(text(),'Currency')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£ Pound Sterling')]")
    WebElement sterlingPound;

    //By sterlingPound = By.xpath("//button[contains(text(),'£ Pound Sterling')]");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement total;
    //By total = By.xpath("//tbody/tr[1]/td[6]");
    @CacheLookup
    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement checkOut;

    //By checkOut = By.xpath("//a[text()='Checkout']");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Checkout']")
    WebElement checkOutText;

    //By checkOutText = By.xpath("//h1[text()='Checkout']");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;

    //By newCustomerText = By.xpath("//h2[contains(text(),'New Customer')]");
    @CacheLookup
    @FindBy(xpath = "//input[@name='account' and @value='guest']")
    WebElement guestCheckoutRadioButton;

    //By guestCheckoutRadioButton = By.xpath("//input[@name='account' and @value='guest']");
    @CacheLookup
    @FindBy(id = "button-account")
    WebElement continueTab;
//    By continueTab = By.id("button-account");

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;
    // By firstName = By.name("firstname");
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;

    //By lastName = By.name("lastName");
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailId;
    //By emailId = By.id("input-payment-email");
    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;
    //By telephone = By.name("telephone");
    @CacheLookup
    @FindBy(name = "address_1")
    WebElement address;
    //By address = By.name("address_1");
    @CacheLookup
    @FindBy(name = "city")
    WebElement city;
    // By city = By.name("city");
    @CacheLookup
    @FindBy(name = "postcode")
    WebElement postcode;
    //By postcode = By.name("postcode");
    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement selectCountry;
    //By selectCountry = By.id("input-payment-country");
    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement selectState;
    //By selectState = By.id("input-payment-zone");
    @CacheLookup
    @FindBy(id = "button-guest")
    WebElement continueButton;
    //By continueButton = By.id("button-guest");
    @CacheLookup
    @FindBy(name = "comment")
    WebElement addComment;
    //By addComment = By.name("comment");
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsAndConditions;
    //By termsAndConditions = By.name("agree");

    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement clickContinue;
    //By clickContinue = By.id("button-payment-method");
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warningMessage;
    //By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public void clickOnShowAllLaptopsAndNotebooks() {
        clickOnElement(showAllLaptops);
    }

    public Map<String, ArrayList> selectSortByPriceHighToLow() {

        Map<String, ArrayList> mapArrays = new HashMap<String, ArrayList>();

//        selectByVisibleTextFromDropDown(priceHighToLow, "Price (High > Low)");
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);

        mapArrays.put("originalProductsPrice", (ArrayList) originalProductsPrice);
        mapArrays.put("afterSortByPrice", afterSortByPrice);
        log.info("Original Product Before Sort By Price " +originalProductsPrice.toString());
        log.info("Original Product After Sort By Price " +afterSortByPrice.toString());
        return mapArrays;

    }

    public void selectProductMacbook() {
        log.info("Select the Product: " +selectMacbook.toString());
        clickOnElement(selectMacbook);

    }

    public String getMacbookText() {
        log.info("Verify the Text : " +macbookText.toString());
        return getTextFromElement(macbookText);
    }
    public String getMacbookText1() {
        log.info("Verify the Text : " +macbookText.toString());
        return getTextFromElement(macbookText);
    }
    public void clickOnAddToCartButton() {
        log.info("Click On Add to Cart: " +addToCart.toString());
        clickOnElement(addToCart);

    }
    public String getSuccessMessage() {
        log.info("Verify the Message : " +successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartText() {
        log.info("Click On Shopping to Cart: " +shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);

    }


    public String getShoppingCartText() {
        log.info("Verify the Message : " +shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void clearQuantityField() {
        log.info("Clear the Quantity Field : " +clearQuantity.toString());
        clearQuantity.clear();
        //driver.findElement((By) clearQuantity).clear();

    }
    public void addQuantityInField() {
        log.info("Send the Quantity : " +addQuantity.toString());
        sendTextToElement(addQuantity, "2");

    }

    public void clickOnUpdateTab() {
        log.info("Click on  : " +updateTab.toString());
        clickOnElement(updateTab);

    }

    public String getSuccessModifiedMessage() {
        log.info("Verify success Message  : " +successModifiedMessage.toString());
        return getTextFromElement(successModifiedMessage);
    }

    public void clickOnCurrency() {
        log.info("Click on Currency  : " +currency.toString());
        clickOnElement(currency);

    }

    public void selectSterlingPound() {
        log.info("Select on Pound Currency  : " +sterlingPound.toString());
        clickOnElement(sterlingPound);

    }
    public String getTotal() {
        log.info("Verify Total  : " +total.toString());
        return getTextFromElement(total);
    }
    public void clickOnCheckOut() {
        log.info("Click On Checkout  : " +checkOut.toString());
        clickOnElement(checkOut);
    }
    public String getCheckOutText() {
        log.info("Verify Checkout  : " +checkOutText.toString());
        return getTextFromElement(checkOutText);
    }

    public String getNewCustomerText() {
        log.info("Verify New Customer  : " +newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckOutRadioButton() {
        log.info("Click On Radio Button  : " +guestCheckoutRadioButton.toString());
        clickOnElement(guestCheckoutRadioButton);

    }

    public void clickOnContinueTab() {
        log.info("Click On Continue Button  : " +continueTab.toString());
        clickOnElement(continueTab);

    }

    public void fillAllMandatoryField() {
        log.info("Enter FirstName "+ firstName.toString());
        sendTextToElement(firstName, "Tom");

        log.info("Enter Lastname "+ lastName.toString());
        sendTextToElement(lastName, "Ford");

        log.info("Enter Email "+ emailId.toString());
        sendTextToElement(emailId, "tom12346@gmail.com");

        log.info("Enter Tel "+ telephone.toString());
        sendTextToElement(telephone, "07070223345");

        log.info("Enter Address "+ address.toString());
        sendTextToElement(address, "103, High road");

        log.info("Enter city "+ city.toString());
        sendTextToElement(city, "London");

        log.info("Enter Postcode "+ postcode.toString());
        sendTextToElement(postcode, "CR76JG");

        log.info("Select Country "+ selectCountry.toString());
        selectByVisibleTextFromDropDown(selectCountry, "United Kingdom");


        log.info("Select state "+ selectState.toString());
        selectByVisibleTextFromDropDown(selectState, "Greater London");
    }

    public void clickOnContinueButton() {
        log.info("Click on Continue  "+ continueButton.toString());
        clickOnElement(continueButton);

    }

    public void addCommentInCommentBox() {

        log.info("Add comment  " + addComment.toString());
        sendTextToElement(addComment, "Order should be delivered on time");
    }

    public void clickOnTermsAndConditionsCheckBox() {
        log.info("Click on Terms and Condition Checkbox  " + termsAndConditions.toString());
        clickOnElement(termsAndConditions);

    }

    public void clickOnContinue() {

        log.info("Click on Continue " + clickContinue.toString());
        clickOnElement(clickContinue);;

    }

    public String getWarningMessage() {
        log.info("Verify Warning " + warningMessage.toString());
        return getTextFromElement(warningMessage);
    }


}
