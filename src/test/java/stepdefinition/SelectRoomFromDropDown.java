package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.HotelsHomePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class SelectRoomFromDropDown extends HotelsHomePages {

    HotelsHomePages hotelsHomePages=new HotelsHomePages();

    @Given("^I am on hotels.com home page$")
      public void verifyImOnHotelHomePage(){
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations","Invalid Home Page");

    }
    @Then("^I select (.*) from room dropdown$")
    public void verifySelectRoomFromDropDown(String room) throws InterruptedException {

        switch (room) {
            case "1":
                hotelsHomePages.selectRoomFromdropdown("1");
                break;
            case "2":
                hotelsHomePages.selectRoomFromdropdown("2");
                break;
            case "3":
                hotelsHomePages.selectRoomFromdropdown("3");
                break;
            case "4":
                hotelsHomePages.selectRoomFromdropdown("4");
                break;
            case "5":
                hotelsHomePages.selectRoomFromdropdown("5");
                break;
            case "6":
                hotelsHomePages.selectRoomFromdropdown("6");
                break;
            case "7":
                hotelsHomePages.selectRoomFromdropdown("7");
                break;
            case "8":
                hotelsHomePages.selectRoomFromdropdown("8");
                break;
            case "9+":
                hotelsHomePages.selectRoomFromdropdown("9+");
                break;
           }
       }

        @And("^I verify (.*) is displayed$")
        public void verifyNumberOfRoomDropdownIsDisplayed (String text) {
            List<WebElement> roomNumber = SharedSD.getDriver().findElements(By.xpath("//span[contains(text(),'Room')]"));

            for (int i = 0; i < roomNumber.size(); i++) {
              System.out.println("Display room : "+roomNumber.get(i).getText());
            }

          Assert.assertTrue(hotelsHomePages.isRoomDisplyed(),"Room Not displayed");
        }

        }