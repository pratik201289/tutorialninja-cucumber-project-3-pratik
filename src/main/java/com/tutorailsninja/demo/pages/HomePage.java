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

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBys(@FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"))
    List<WebElement> selectMenu;
    //By selectMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    @CacheLookup
    @FindBy(xpath = "//a[text()='Desktops']")
    WebElement desktopTab;
    //    By desktopTab = By.xpath("//a[text()='Desktops']");
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Desktops']")
    WebElement desktopsText;
    //  By desktopsText = By.xpath("//h2[text()='Desktops']");
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksTab;
    //By laptopsAndNotebooksTab = By.linkText("Laptops & Notebooks");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopsAndNotBooksText;

    //    By laptopsAndNotBooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsTab;

    //    By componentsTab = By.linkText("Components");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;
    //By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public void selectMenu(String menu) {
      //  List<WebElement> topMenuList = driver.findElements(selectMenu);
        log.info("Select My Menu Option " + selectMenu.toString() );
        try {
            for (WebElement element :selectMenu) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
                selectMenu.toString();
        }
    }

    public void hoverAndClickOnDesktop() {
        log.info("Mouse Hover and click on Desktop "+ desktopTab.toString());
        mouseHoverToElementAndClick(desktopTab);
    
    }

    public String getDesktopsText() {
        log.info("Get the Desktop Tab "+ desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void hoverAndClickOnLaptopsAndNotebooksTab() {
        log.info("Mouse Hover and click on  "+ laptopsAndNotebooksTab.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
    
    }

    public String getLaptopsAndNotBooksText() {
        log.info("Get the Laptop and NotBooks Text "+ laptopsAndNotBooksText.toString());
        return getTextFromElement(laptopsAndNotBooksText);
    }

    public void hoverAndClickOnComponents() {
        log.info("Mouse Hover and click on  "+ componentsTab.toString());
        mouseHoverToElementAndClick(componentsTab);
    
    }

    public String getComponentsText() {
        log.info("Get the Components Menu Text "+ componentsText.toString());
        return getTextFromElement(componentsText);
    }
}


