package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefinition.SharedSD;

public class DarkSkyHomePage extends BasePage {

    private By darkSkyAPIButton = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By signUpButton = By.xpath("//a[@class='button filled']");
    private By registerButton = By.xpath("//button[contains(text(),'Register')]");
    private By registerText = By.xpath("//h1[@class='stand-alone title']");
    private By expandButton = By.xpath("//a[@data-day='0']//span[@class='open']");
    private By currentTemp = By.xpath("//span[@class='summary swap']");
    private By lowestTemp = By.xpath("//span[@class='low-temp-text']");
    private By highestTemp = By.xpath("//span[@class='high-temp-text']");
    private By TimeLineTemprature = By.xpath("//div[@id='timeline']//div[@class='temps']");
    private By CurrentTempFromTimeline=By.xpath("//span[@class='summary swap']");
    private By timeLineLowestTemp = By.xpath("//a[@data-day='0']//span[@class='minTemp']");
    private By TimeLineHighestTemp =By.xpath("//a[@data-day='0']//span[@class='maxTemp']");
    private By lowerTempOverView=By.xpath("//div[@class='dayDetails revealed']//span[@class='highTemp swip']//span[@class='temp']");
    private By HighTempOverView=By.xpath("//div[contains(@class,'revealed')]//span[@class='lowTemp swap']//span[@class='temp']");
    private By timeLinetemp=By.xpath("//div[@id='timeline']//div[@class='hours']");
    private By scarchFieldforCalifornia=By.xpath("//form[@id='searchForm']//input");
    private By scarchButton=By.xpath("//a[@class='searchButton']//img");

    public void iAmOnDarkSkyHomePage(){
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Home Page");
    }

    public void clickOndarkSkyAPIButton() {
        clickOn(darkSkyAPIButton);
    }
    public void clickOnSignUpButton() {
        clickOn(signUpButton);
    }
    public void clickOnRegisterButton() {
        clickOn(registerButton);
    }
    public String getRegisterEorrorText() { return getTextFromElement(registerText);
    }

    public void clickOnExpandButton() {
        clickOn(expandButton);
    }
    public String getCurrentTemp() {
        return getTextFromElement(currentTemp);
    }
    public String getLowestTemp() {
        return getTextFromElement(lowestTemp);
    }
    public String getHighestTemp() {
        return getTextFromElement(highestTemp);
    }
    public String getTimeLineTemprature() {
        return getTextFromElement(TimeLineTemprature);
    }
    public String  getCurrentTempFromTimeline(){
        return getTextFromElement(CurrentTempFromTimeline);
    }
    public String getTimeLineLowestTemp() {
        return getTextFromElement(timeLineLowestTemp);
    }
    public String getTimeLineHighestTemp() {
        return getTextFromElement(TimeLineHighestTemp);
    }
    public String getHighTempOverView() {
        return getTextFromElement(HighTempOverView);
    }
    public String getlowerTempOverView() {
        return getTextFromElement(lowerTempOverView);
    }
    public String getTimefromTimeLine(){
        return getTextFromElement(timeLinetemp);
    }
    public void setValue(String value){
        SharedSD.getDriver().findElement(scarchFieldforCalifornia).sendKeys(value);
    }
    public void clearValue() {
        SharedSD.getDriver().findElement(scarchFieldforCalifornia).clear();
    }
    public void clickOnScarchFiled(){
        clickOn(scarchButton);
    }



}

