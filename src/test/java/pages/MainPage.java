package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {
    private final String mainPage = "https://onliner.by";
    private final String menuItemClass = "b-main-navigation__dropdown-advert-sign";

    @FindBy(className = "b-main-navigation")
    private WebElement mainHeaderMenu;

    @FindBy(xpath = "//a[.//span[@class='b-main-navigation__text'][contains(text(),\"Автобарахолка\")]]")
    private WebElement autoMenu;

    @FindBy(xpath = "//a[.//span[@class='b-main-navigation__text'][contains(text(),\"Дома и квартиры\")]]")
    private WebElement houseAndFlatsMenu;

    @FindBy(className = "b-main-navigation__dropdown_visible")
    private WebElement headerSubMenu;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isSubMenuItemExist(String menuItemName) {
        var webElements = getDriver().findElements(By.className(menuItemClass));
         return webElements.stream().anyMatch(e->e.getText().equals(menuItemName));
    }

    public void mouseHoverAutoMenu(){
        moveToAndHover(autoMenu);
    }

    public void mouseHoverHouseAndFlatsMenu(){
        moveToAndHover(houseAndFlatsMenu);
    }

    public WebElement getSubMenu(){
        return headerSubMenu;
    }

    public MainPage open(){
        openUrl(mainPage);
        return this;
    }
}
