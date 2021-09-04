package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class MainPageTest {

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
    protected WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void tearDown() {
        driver.quit();
    }


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
