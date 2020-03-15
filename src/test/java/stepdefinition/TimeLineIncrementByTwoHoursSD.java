package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.DarkSkyHomePage;
import jdk.nashorn.api.scripting.ScriptUtils;
import org.apache.commons.lang.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.format.annotation.DateTimeFormat;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeLineIncrementByTwoHoursSD extends DarkSkyHomePage {

    DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given("^I am on Darksky home page$")
    public void iAmDarkSkyHomePage() throws InterruptedException {

        darkSkyHomePage.iAmOnDarkSkyHomePage();
        Thread.sleep(2000);
        darkSkyHomePage.clearValue();
        Thread.sleep(2000);
        darkSkyHomePage.setValue("28th St, Sacramento, CA");
        Thread.sleep(2000);
        darkSkyHomePage.clickOnScarchFiled();
        Thread.sleep(2000);
    }

    @Then("^I verify timeline is displayed with two hours incremented$")

    public void verifyTimeIncrementedByTwoHours() throws ParseException {

        String timelineArray = darkSkyHomePage.getTimefromTimeLine();

        Date date = new Date();
        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("ha");
        LocalTime time = LocalTime.now();
        String nowTime = FOMATTER.format(time);

        String[] timeArray = timelineArray.split("\n");

        ArrayList<String> timelineArrayList = new ArrayList<String>();

        for (int i = 1; i < timeArray.length; i++) {
            timelineArrayList.add(timeArray[i]);
        }

        ArrayList<String> localTimeArraylist = new ArrayList<>();
        LocalTime localTime=LocalTime.now();
        localTime = localTime.plusHours(2);

        String localTimeInLowercase=FOMATTER.format(localTime).toLowerCase();

        for (int i = 1; i < timelineArrayList.size()+1; i++) {

            localTimeArraylist.add(localTimeInLowercase);
            localTime = localTime.plusHours(2);
            localTimeInLowercase = FOMATTER.format(localTime).toLowerCase();
        }

        System.out.println("Time line array list from web pages: "+timelineArrayList);
        System.out.println("Time line array list from local time:"+localTimeArraylist);
        System.out.println("Timeline is displayed with two hours incremented");

         Assert.assertEquals(timelineArrayList,localTimeArraylist);
    }

    }

