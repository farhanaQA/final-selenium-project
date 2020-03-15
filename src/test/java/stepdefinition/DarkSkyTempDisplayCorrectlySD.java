package stepdefinition;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.BasePage;
import framework.webPages.DarkSkyHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import java.util.List;

public class DarkSkyTempDisplayCorrectlySD extends DarkSkyHomePage {

    DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given("^I am on Darksky Home Page$")
    public void iAmonDarkSkyHomePage() {
        darkSkyHomePage.iAmOnDarkSkyHomePage();
    }

    @When("^I expand todays timeline$")
    public void clickOnExpand() throws InterruptedException {

        //Scroll (by pixels)
        JavascriptExecutor jsScrollBy = (JavascriptExecutor) SharedSD.getDriver();
        jsScrollBy.executeScript("scrollBy(0,500);");
        Thread.sleep(2000);
        clickOnExpandButton();
        Thread.sleep(2000);
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifTempDisplayCorrectly()

    {
        System.out.println("Lowest temperature from TimeLine :"+darkSkyHomePage.getTimeLineLowestTemp());
        System.out.println("highest temperature form TimeLine :"+darkSkyHomePage.getTimeLineHighestTemp());
        System.out.println("Lowest temperature from overview after click expand button :"+darkSkyHomePage.getlowerTempOverView());
        System.out.println("highest temperature from overview after click expand button :" +darkSkyHomePage.getHighTempOverView());

       Assert.assertEquals(getTimeLineLowestTemp(),getlowerTempOverView());
       Assert.assertEquals(getTimeLineHighestTemp(),getHighTempOverView());
    }



}
