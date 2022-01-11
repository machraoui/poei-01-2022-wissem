package PageObjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IphonePage {

    WebDriver driver;

    By searchResultSelector = By.cssSelector("item-menu ac-gn-iphone");

    public IphonePage(WebDriver driver) {
        this.driver = driver;
    }

    public Iphone13ProPage openIphone13ProPage() {
        driver.findElement(searchResultSelector).click();

        Iphone13ProPage iphone13ProPage = new Iphone13ProPage(driver);
        return iphone13ProPage;
    }

}
