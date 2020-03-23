package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.HotelsHomePages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class HotelsListWithinTenMilesSD extends HotelsHomePages {

    HotelsHomePages hotelsHomePages = new HotelsHomePages();

    @Given("^I am default locations search result screen$")
    public void verifyTodayDeal() throws InterruptedException {

        hotelsHomePages.selectLocationForSearchHotels("New York, New York, United States of America");
        Thread.sleep(5000);
        hotelsHomePages.clickOnClose();
        Thread.sleep(2000);
        hotelsHomePages.clickOnScarchButton();
        Thread.sleep(2000);
    }

    @Then("^I verify system displays all hotels within (.+) miles radius of airport$")
    public void verifyHotelListWithinTenMiles(double miles) throws InterruptedException {

        JavascriptExecutor jsScrollBy = (JavascriptExecutor) SharedSD.getDriver();
        jsScrollBy.executeScript("scrollBy(0,600);");
        Thread.sleep(2000);
        hotelsHomePages.selectOnlandmark();
        Thread.sleep(3000);
        hotelsHomePages.selectHotelsNearAirport();
        Thread.sleep(3000);
        jsScrollBy.executeScript("scrollBy(0,600);");
        Thread.sleep(3000);
        hotelsHomePages.selectHotelsWithinTenMiles();
        Thread.sleep(2000);

        while (true) {
            try {
                WebElement element = SharedSD.getDriver().findElement(By.xpath("//h3[contains(text(),'Want to see more hotels?')]"));
                ((JavascriptExecutor) SharedSD.getDriver()).executeScript(
                        "arguments[0].scrollIntoView();", element);
                break;
            } catch (Exception ex) {
                jsScrollBy.executeScript("scrollBy(0,1000);");
                Thread.sleep(2000);
            }
        }
        List<WebElement> hotelList = SharedSD.getDriver().findElements(By.className("property-name-link"));
        List<WebElement> radius = SharedSD.getDriver().findElements(By.xpath("//li[contains(text(),'miles to John F. Kennedy International Airport (JFK)')]"));
        for (int i = 0; i < radius.size(); i++) {

            System.out.println("hotelList :" + hotelList.get(i).getText() + " within radius " + radius.get(i).getText());
        }

    }

    @And("^I verify Hilton Hotel is within (.+) miles radius$")
    public void verifyHotelsIsWithinRadius(double miles) throws InterruptedException {
        List<WebElement> radius = SharedSD.getDriver().findElements(By.xpath("//li[contains(text(),'miles to John F. Kennedy International Airport (JFK)')]"));
        List<WebElement> hotelsList = SharedSD.getDriver().findElements(By.className("property-name-link"));

        boolean isHiltonHotelInRadius = true;
        for (int i = 0; i < hotelsList.size(); i++) {
            String radiusString = radius.get(i).getText();
            String[] tokens = radius.get(i).getText().split(" ");
            double milesNum = Double.parseDouble(tokens[0].trim());

            if ((hotelsList.get(i).getText().contains("Hilton") &&
                    radiusString.contains("John F. Kennedy International Airport")) && (milesNum < miles)) {
                isHiltonHotelInRadius = true;
                 //System.out.println(isHiltonHotelInRadius);
                break;
            }
        }

        Assert.assertTrue(isHiltonHotelInRadius,"Hilton Hotel is not  within radius");
    }
}