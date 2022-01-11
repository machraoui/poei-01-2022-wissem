package PageObjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iphone13ProPage {
    WebDriver driver;
    By Iphone13ProMaxSelector = By.cssSelector(".ac-ln-button");

    public Iphone13ProPage(WebDriver driver) {
        this.driver = driver;
    }

    public BuyIphone13Propage buy () {
        driver.findElement(Iphone13ProMaxSelector).click();
        BuyIphone13Propage buyIphone13Propage = new BuyIphone13Propage(driver);
        return buyIphone13Propage;
    }
}

