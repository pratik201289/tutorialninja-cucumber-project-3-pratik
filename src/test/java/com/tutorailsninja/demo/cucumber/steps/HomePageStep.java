package com.tutorailsninja.demo.cucumber.steps;

import com.tutorailsninja.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage(){
        System.out.println("i am on the homepage");
    }

    @When("^Mouse Hover on Desktop tab and click$")
    public void mouseHoverOnDesktopTabAndClick() {
        new HomePage().hoverAndClickOnDesktop();
    }

    @And("^select show all desktop$")
    public void selectShowAllDesktop() {
        new HomePage().selectMenu("Show All Desktops");
    }

    @Then("^verify the text Desktops$")
    public void verifyTheTextDesktops() {
        String expectedMessage = "Desktops";
        String actualMessage = new HomePage().getDesktopsText();
        Assert.assertEquals("Desktop text is not displayed", expectedMessage, actualMessage);
    }

    @When("^Mouse Hover on Laptop & Notebook tab and click$")
    public void mouseHoverOnLaptopNotebookTabAndClick() {
        new HomePage().hoverAndClickOnLaptopsAndNotebooksTab();
    }

    @And("^select show all laptops and notebooks$")
    public void selectShowAllLaptopsAndNotebooks() {
        new HomePage().selectMenu("Show All Laptops & Notebooks");
    }

    @Then("^verify the text Laptops & Notebooks$")
    public void verifyTheTextLaptopsNotebooks() {
        String expectedMessage = "Laptops & Notebooks";
        String actualMessage = new HomePage().getLaptopsAndNotBooksText();
        Assert.assertEquals("Laptop and Notebook text is not displayed", expectedMessage, actualMessage);
    }

    @When("^Mouse Hover on Components tab and click$")
    public void mouseHoverOnComponentsTabAndClick() {
        new HomePage().hoverAndClickOnComponents();
    }

    @And("^select show all Components$")
    public void selectShowAllComponents() {
        new HomePage().selectMenu("Show All Components");

    }

    @Then("^verify the text Components$")
    public void verifyTheTextComponents() {
        String expectedMessage = "Components";
        String actualMessage = new HomePage().getComponentsText();
        Assert.assertEquals("Show All Components text is not displayed", expectedMessage, actualMessage);
    }

}
