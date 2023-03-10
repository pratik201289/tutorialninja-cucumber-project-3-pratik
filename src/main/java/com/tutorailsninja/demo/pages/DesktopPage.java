package com.tutorailsninja.demo.pages;

import com.tutorailsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    //1.2 Click on “Show All Desktops”
    @CacheLookup
    @FindBy(linkText = "Show All Desktops")
    WebElement clickOnShowAllDesktops;

    public void showAllDesktops() {
        log.info("Click on element : " + clickOnShowAllDesktops.toString());
        clickOnElement(clickOnShowAllDesktops);

    }

    //1.3 Select Sort By position "Name: Z to A"

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortSelectZToA;

    public void setSortSelectZToA() {
        log.info("Select the sort Z TO A " + sortSelectZToA);
        selectByVisibleTextFromDropDown(sortSelectZToA, "Name (Z - A)");
    }

    //1.4 Verify the Product will arrange in Descending order
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectOrderBy;

    public void setSelectOrderByZToA() {
        log.info("Select the sort Z TO A " + sortSelectZToA);
        selectByVisibleTextFromDropDown(sortSelectZToA, "Name (Z - A)");

    }

    public Map<String, ArrayList> verifyProductArrangeInDescendingOrder() {

        Map<String, ArrayList> mapArrays = new HashMap<String, ArrayList>();

        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        //  Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        //System.out.println(afterSortByZToAProductsName);
        //mapArrays.put("originalProductsName", (ArrayList) originalProductsName);
        //mapArrays.put("afterSortByZToAProductsName", afterSortByZToAProductsName);
        //return mapArrays;
        // System.out.println("Orginial Name before Sort " +originalProductsName);
        // System.out.println("After Sort:" + afterSortByZToAProductsName);
        mapArrays.put("originalProductsName", originalProductsName);
        mapArrays.put("afterSortByZToAProductsName", afterSortByZToAProductsName);
        log.info("original Product Name Before Sort:  " + originalProductsName.toString());
        log.info("After sort products in Z to A:  " + afterSortByZToAProductsName.toString());

        return mapArrays;

    }

    //2.3 Select Sort By position "Name: A to Z"
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortOrderByAToZ;

    public void sortAToZ() {
        log.info("Sorted Product A to Z:  " + sortOrderByAToZ.toString());
        selectByVisibleTextFromDropDown(sortOrderByAToZ, "Name (A - Z)");

    }

    //2.4 Select product “HP LP3065”

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement selectProduct;

    public void setSelectProduct() {

        log.info("Click on Product: " + selectProduct.toString());
        clickOnElement(selectProduct);

    }

    //2.5 Verify the Text "HP LP3065"
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement selectHPLP3065;

    public String getProductText() {
        log.info("Verify the Text of Product: " + selectHPLP3065.toString());
        return getTextFromElement(selectHPLP3065);
    }

    //2.6 Select Delivery Date "2022-11-30"
    public void pickDate() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    //2.7.Enter Qty "1” using Select class
    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement Qty;

    public void enterQuantity() {
        log.info("Enter Quantity: " + Qty);
        driver.findElement(By.id("input-quantity")).clear();
        sendTextToElement(Qty, "1");

    }

    //2.8 Click on “Add to Cart” button

    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartTab;

    public void addProductToCart() {
        log.info("Click on Add to Cart" + addToCartTab.toString());
        clickOnElement(addToCartTab);

    }

    //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successfullyAddedToCartText;

    public String productAddedToCartDisplayed() {
        log.info("Verify the Successfully Cart Message" + successfullyAddedToCartText.toString());
        return getTextFromElement(successfullyAddedToCartText);
    }

    // 2.10 Click on link “shopping cart” display into success message

    @FindBy(linkText = "shopping cart")
    WebElement shoppingCart;

    public void setShoppingCart() {
        log.info("Click on Shopping Cart" + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    // 2.11 Verify the text "Shopping Cart"
    @CacheLookup
    @FindBy(xpath = "//a[text()='Shopping Cart']")
    WebElement textShoppingCart;

    public String textShoppingCart() {
        log.info("Verify the text" + textShoppingCart.toString());

        return getTextFromElement(textShoppingCart);
    }

    // 2.12 Verify the Product name "HP LP3065"
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement productText;

    public String getProductText1() {
        log.info("Verify the text" + productText.toString());

        return getTextFromElement(productText);
    }

    //2.13 Verify the Delivery Date "2022-11-30"
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;

    public String verifyDeliveryDate() {
        log.info("Verify the Delivery Date" + deliveryDate.toString());

        return getTextFromElement(deliveryDate);
    }

    //2.14 Verify the Model "Product21"
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement productModel;

    public String verifyProductModel() {
        log.info("Verify the Product Model" + productModel.toString());

        return getTextFromElement(productModel);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    public String total() {
        log.info("Verify the Total Amount" + total.toString());
        return getTextFromElement(total);
    }

    public void selectYourCurrency() {
        clickOnElement(By.xpath("//span[contains(text(),'Currency')]"));
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }

    }
}
