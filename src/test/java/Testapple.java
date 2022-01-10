import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class Testapple {

        WebDriver driver;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.get("https://www.apple.com/fr/");
            driver.manage().window().maximize();

        }

        @AfterMethod
        public void teardown() {
            driver.quit();
        }

        @Test
        public void hpChromebookAddToCartPriceTest() {
            // Arrange
            String productName = "iPhone 13 Pro Max";
            String expectedPrice = "369,00 €";


        }
    }
