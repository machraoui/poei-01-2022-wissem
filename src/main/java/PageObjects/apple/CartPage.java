package PageObjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By ProductName = By.cssSelector("rs-iteminfo-title-wrapper");
    By CartTitle = By.cssSelector("rs-bag-header");
    By ProductPrice = By.cssSelector(".rs-iteminfo-price");
    By SubTotal = By.cssSelector("bagrs-summary-subtotalvalue");
    By Total = By.cssSelector("bagtotalvalue");

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getProductPrice(int index) {
        return driver.findElements(ProductName).get(index).getText();
    }

    public String getCarttitle() {
        return driver.findElement(CartTitle).getText();
    }

    public String getProductPrice() {
        return driver.findElement(ProductPrice).getText();
    }

    public String SubTotal() {
        return driver.findElement(SubTotal).getText();
    }
    public String Total() {
        return driver.findElement(Total).getText();
    }



}
