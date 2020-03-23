package stepdefinition;

import com.google.gson.internal.bind.util.ISO8601Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.BasePage;
import framework.webPages.HotelsHomePages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HotelsSelectedByRating extends BasePage {

    HotelsHomePages hotelsHomePages = new HotelsHomePages();
    JavascriptExecutor jsScrollBy = (JavascriptExecutor) SharedSD.getDriver();

    @Given("^I am on the default locations search result screen$")
    public void verifyTodayDeal() throws InterruptedException {

        hotelsHomePages.selectLocationForSearchHotels("New York, New York, United States of America");
        Thread.sleep(2000);
        hotelsHomePages.clickOnClose();
        Thread.sleep(2000);
        hotelsHomePages.clickOnScarchButton();
        Thread.sleep(2000);

    }

    @When("^I select property class (.*)$")
    public void verifySelectHotelByProperty(String star) {

           switch (star) {
               case "5-star":
                hotelsHomePages.selectFiveStar();
                break;
            case "4-star":
                hotelsHomePages.selectFourStar();
                break;
            case "3-star":
                hotelsHomePages.selectThreeStar();
                break;
        }
    }

    @Then("^I verify system displays only (.*) hotels on search result$")
    public void hotelsListwithRating(String star) throws InterruptedException {

        while(true){
            try {
                WebElement element = SharedSD.getDriver().findElement(By.xpath("//h3[contains(text(),'Want to see more hotels?')]"));
                ((JavascriptExecutor) SharedSD.getDriver()).executeScript(
                        "arguments[0].scrollIntoView();", element);
                break;
            }
            catch(Exception ex){
                jsScrollBy.executeScript("scrollBy(0,7000);");
                Thread.sleep(2000);
            }
        }
        List<WebElement> hotelsStars = SharedSD.getDriver().findElements(By.xpath("//div[@id='listings']//following::li//following::div[contains(@class,'additional-details')]//span[contains(@class,'star-rating')]"));
        List<WebElement> hotelsList=SharedSD.getDriver().findElements(By.xpath("//div[@id='listings']//h3[@class='p-name']"));
        for (int i = 0; i < hotelsList.size(); i++) {
            System.out.println("Hotels list with " + hotelsStars.get(i).getText() + " " + hotelsList.get(i).getText());
        }

        boolean isStarDisplay = true;
        if (star.equals(hotelsHomePages.compareFiveStar())||star.equals(hotelsHomePages.comparefourStar()) ||
                star.equals(hotelsHomePages.compareThreeStar())) {
            isStarDisplay = true;}
         else {
            isStarDisplay = false;}

        Assert.assertTrue(isStarDisplay,"System is not displays only "+ star +"hotels on search result");
    }


}










