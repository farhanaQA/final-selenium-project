package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.HotelsHomePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HotelsTodayDealSD {

    HotelsHomePages hotelsHomePages = new HotelsHomePages();

    @Given("^I am on default locations search result screen$")
    public void verifyTodayDeal() throws InterruptedException {

        hotelsHomePages.selectLocationForSearchHotels("Las Vegas, Nevada, United States of America");
        Thread.sleep(2000);
        hotelsHomePages.clickOnClose();
        Thread.sleep(2000);
        hotelsHomePages.clickOnScarchButton();
        Thread.sleep(2000);
    }

    @Then("^I verify todays deal is less than \\$(\\d+)$")
    public void verifySpacialdeal(int price) {

        String spacialDeal = hotelsHomePages.getSpacialDeal();

        int spacialDealInInt = Integer.parseInt(spacialDeal.substring(1,spacialDeal.length()));
        System.out.println(" today spacial deal :"+spacialDealInInt);

        boolean isdealIslessThen=true;
        if(spacialDealInInt<price){
            isdealIslessThen=true;
        }
        else
            isdealIslessThen=false;

        Assert.assertTrue(isdealIslessThen,"today spacial deal is more then $200");
    }

}

