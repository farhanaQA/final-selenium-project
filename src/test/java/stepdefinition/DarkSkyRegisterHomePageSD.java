package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyHomePage;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.testng.Assert;

public class DarkSkyRegisterHomePageSD extends DarkSkyHomePage {

    DarkSkyHomePage darkSkyHomePage=new DarkSkyHomePage();

    @Given("^I am on the darksky Register page$")
    public void iAmonDarkSkyRegisterPage() throws InterruptedException {
        darkSkyHomePage.iAmOnDarkSkyHomePage();
        Thread.sleep(2000);
        darkSkyHomePage.clickOndarkSkyAPIButton();
        Thread.sleep(5000);
        darkSkyHomePage.clickOnSignUpButton();
        Thread.sleep(2000);
    }

    @When("^I click on Register button$")
    public void iClickOnRegisterButton() throws InterruptedException {
        darkSkyHomePage.clickOnRegisterButton();
        Thread.sleep(2000);

    }
    @Then("^I verify I am on Register page by asserting Register header$")
    public void iAmOnRegisterPage() throws InterruptedException {
        Assert.assertEquals("Register",darkSkyHomePage.getRegisterEorrorText());
        Thread.sleep(2000);
    }
}
