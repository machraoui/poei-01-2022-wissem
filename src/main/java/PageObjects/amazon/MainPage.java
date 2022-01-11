package PageObjects.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    int timeOut = 10;
    WebDriver driver;
    By searchResultSelector = By.cssSelector("#twotabsearchtextbox");
    By productLoaded = By.cssSelector("[data-component-type='s-search-result']");



    public MainPage (WebDriver driver){
        this.driver = driver;
    };

    public void searchProduct(String productName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        WebElement searchBarAmazon = wait.until(
                ExpectedConditions.elementToBeClickable(searchResultSelector));

        searchBarAmazon.sendKeys(productName+ Keys.ENTER);

        WebElement PageIsLoadedElement = wait.until(
                ExpectedConditions.elementToBeClickable(productLoaded));

        //If we are here! All OK

    }
}