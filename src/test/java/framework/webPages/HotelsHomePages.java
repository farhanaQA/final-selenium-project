package framework.webPages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;
import org.openqa.selenium.support.ui.Select;

public class HotelsHomePages extends BasePage {


    private By hotelsScarchField = By.xpath("//input[@id='qf-0q-destination']");
    private By closebutton = By.xpath("//button[contains(@class,'cta cta-link')]");
    private By searchButton = By.xpath("//button[@class='cta cta-strong']");
    private By todaySpacildeal = By.xpath("//section[@class='hotel-wrap']//aside[@class='pricing resp-module']//div[@class='price']//ins[contains(text(), '$')]");
    private By selecAirportJFKOption = By.xpath("//label[@id='f-label-lid-1662393']");
    private By selectOnTenMiles = By.xpath("//select[@id='f-distance']");
    private By landmark=By.xpath("//h3[contains(text(),'Landmarks')]");
    private By ratingFiveStar=By.xpath("//fieldset[@id='filter-star-rating']//li[*][1]");
    private By ratingFourStar=By.xpath("//fieldset[@id='filter-star-rating']//li[*][2]");
    private By ratingThreeStar=By.xpath("//fieldset[@id='filter-star-rating']//li[*][3]");
    private By selectRoom=By.xpath("//select[@id='qf-0q-rooms']");
    private By displyRoom=By.xpath("//span[contains(text(),'Room')]");

    public void selectLocationForSearchHotels(String text) { SharedSD.getDriver().findElement(hotelsScarchField).sendKeys(text); }
    public void clickOnClose() {
        clickOn(closebutton);
    }
    public void clickOnScarchButton() {
        clickOn(searchButton);
    }
    public String getSpacialDeal() {
        return SharedSD.getDriver().findElement(todaySpacildeal).getText();
    }
    public void selectOnlandmark(){ clickOn(landmark); }
    public void selectHotelsNearAirport() {
        clickOn(selecAirportJFKOption);
    }
    public void selectHotelsWithinTenMiles() {
        selectByTextFromDropDown(selectOnTenMiles, "10 miles");
    }
    public void selectFiveStar(){ clickOn(ratingFiveStar); }
    public void selectFourStar(){ clickOn(ratingFourStar); }
    public void selectThreeStar(){ clickOn(ratingThreeStar);}
    public String compareFiveStar(){
        return getTextFromElement(ratingFiveStar);
    }
    public String comparefourStar(){
        return getTextFromElement(ratingFourStar);
    }
    public String compareThreeStar(){
        return getTextFromElement(ratingThreeStar);
    }
    public void selectRoomFromdropdown(String text){ selectByTextFromDropDown(selectRoom,text); }
    public boolean isRoomDisplyed(){ return isElementDisplayed(displyRoom); }
    }



