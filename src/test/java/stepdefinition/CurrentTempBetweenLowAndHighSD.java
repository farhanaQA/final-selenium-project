package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyHomePage;
import org.apache.http.client.methods.HttpUriRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CurrentTempBetweenLowAndHighSD extends DarkSkyHomePage {

   DarkSkyHomePage darkSkyHomePage=new DarkSkyHomePage();

   @Given("^I am on Darksky homepage$")
   public void iamOnHomePage(){

        darkSkyHomePage.iAmOnDarkSkyHomePage();
   }

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void verifyCurrentTempInBetweenLowAndHigh() {

         String[] tempArray = getTimeLineTemprature().split("\\n"); //
         ArrayList<Integer> tempArrayList = new ArrayList<Integer>();

         for (int i = 0; i < tempArray.length; i++) {

             tempArray[i] = tempArray[i].substring(0, tempArray[i].indexOf('°'));
             tempArrayList.add(Integer.parseInt(tempArray[i]));
         }

         //sorting array in ascending order
         Collections.sort(tempArrayList);
         int lowestTempFromArray=tempArrayList.get(0);
         int highestTempFromArray=tempArrayList.get((tempArrayList.size() - 1));

         String CurrentTempInString=darkSkyHomePage.getCurrentTempFromTimeline();
         String CurrentTemp=CurrentTempInString.substring(0,CurrentTempInString.indexOf("˚"));
         int todayCurrentTemp=Integer.parseInt(CurrentTemp);

         System.out.println("Today Current temperature: "+todayCurrentTemp+"˚");
         System.out.println("Today Lowest temperature: "+lowestTempFromArray+"˚");
         System.out.println("Today Highest temperature: "+highestTempFromArray+"˚");

         if(todayCurrentTemp>lowestTempFromArray && todayCurrentTemp<highestTempFromArray){

             System.out.println("current temp is not greater or less then temps from daily timeline");
         }
         else
             System.out.println(" current temp is greater or less then temps from daily timeline");

          }
    }
