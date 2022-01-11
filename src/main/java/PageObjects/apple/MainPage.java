package PageObjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;

    //int timeoutSearch = 10;

    By searching13pro = By.id("ac-gn-link-iphone");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public  IphonePage openIphone13ProPage () {

        this.driver.findElement(searching13pro).click();

        IphonePage iphonePage = new IphonePage(driver);
        return iphonePage;
    }
}
