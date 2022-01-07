import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    WebDriver driver;

    int timeoutSidebar = 3;

    By addToCartButtonSelector = By.id("add-to-cart-button");
    By addWarrantyButtonSelector = By.cssSelector("#attachSiAddCoverage input");


    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartButtonSelector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSidebar));
        wait.until(ExpectedConditions.elementToBeClickable(addWarrantyButtonSelector));
    }
}