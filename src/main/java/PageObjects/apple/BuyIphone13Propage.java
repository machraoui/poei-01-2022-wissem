package PageObjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuyIphone13Propage {
    By Iphone13promax = By.cssSelector("shoppingCart.actions.checkout");
    int timeoutSidebar = 3;
    int timeoutConfirmation = 10;


    By selectIphone13ProMax = By.cssSelector("Écran de 6,7 ");
    By selectBlueAlpin = By.cssSelector("[data-autom='dimensionCapacity128gb'] + label");
    By select256Go = By.cssSelector("dimensionCapacity256gb");
    By noAppleTradeIn = By.cssSelector("choose-noTradeIn");
    By addToCart = By.cssSelector("button button-block");
    WebDriver driver;
    public BuyIphone13Propage(WebDriver driver) {
        this.driver = driver;
    }

    public BuyIphone13Propage choice13promax() {
        driver.findElement(selectIphone13ProMax).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSidebar));
        wait.until(ExpectedConditions.elementToBeClickable(selectBlueAlpin));

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.getStackTrace();
        }

        return this;


    }

    public BuyIphone13Propage selectBlue() {
        driver.findElement(selectBlueAlpin).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSidebar));
        wait.until(ExpectedConditions.elementToBeClickable(select256Go));

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.getStackTrace();
        }

        return this;

    }

    public BuyIphone13Propage select256Go() {
        driver.findElement(select256Go).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutConfirmation));
        wait.until(ExpectedConditions.elementToBeClickable(noAppleTradeIn));


        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.getStackTrace();
        }

        return this;
    }


    public BuyIphone13Propage noAppleTradeIn() {
        driver.findElement(noAppleTradeIn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSidebar));
        wait.until(ExpectedConditions.elementToBeClickable(addToCart));

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.getStackTrace();
        }

        return this;
    }
    public ConfirmationAddToCartPage addToCart() {

        driver.findElement(addToCart).click();
        ConfirmationAddToCartPage confirmationAddToCartPage = new ConfirmationAddToCartPage(driver);
        return confirmationAddToCartPage;
    }



}
