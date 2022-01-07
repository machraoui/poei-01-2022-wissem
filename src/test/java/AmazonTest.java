import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();

        // fermer cookies
        driver.findElement(By.id("sp-cc-accept")).click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void nintendoSwitchAddToCartPriceTest() {
        // Arrange
        String productName = "Nintendo Switch Oled";

        // Act
        MainPages mainPage = new MainPages(driver);
        mainPage.searchProduct(productName);

        // Assert
    }

    @Test
    public void machineARacletteTest() {
        // Arrange
        String productName = "Machine a raclette";

        // Act
        MainPages mainPage = new MainPages(driver);
        mainPage.searchProduct(productName);
    }
}