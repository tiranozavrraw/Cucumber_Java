package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class MainPageTest extends BaseTest{

//    @Test
//    public void testHoverMainMenuAutoItem(){
//        MainPage mainPage = new MainPage(driver);
//        mainPage.open();
//        mainPage.mouseHoverAutoMenu();
//    }
//
//    @Test
//    public void testHoverMainMenuHouseAndFlatsItem(){
//        MainPage mainPage = new MainPage(driver);
//        mainPage.open();
//        mainPage.mouseHoverHouseAndFlatsMenu();
//    }
    @Given("Main page is displayed")
    public void openMainPage(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @When("Mouse hover \"Автобарахолка\" menu item")
    public void hoverAutoMenu(){
        MainPage mainPage = new MainPage(driver);
        mainPage.mouseHoverAutoMenu();
    }
    @Then("Sub-menu options are displayed")
    public void checkSubMenuIsDisplayed(){
        MainPage mainPage = new MainPage(driver);
        mainPage.getSubMenu();

    }

    @And("Contains division by {string}, {string} and {string}")
    public void checkSubMenuItems(String city, String price, String brand){
        MainPage mainPage = new MainPage(driver);
        Assertions.assertTrue(mainPage.isSubMenuItemExist(city));
        Assertions.assertTrue(mainPage.isSubMenuItemExist(price));
        Assertions.assertTrue(mainPage.isSubMenuItemExist(brand));

    }


}
