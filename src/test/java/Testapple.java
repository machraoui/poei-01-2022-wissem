import PageObjects.apple.*;
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
        public void openIphone13ProPage() {
            // Arrange
            String productName = "iPhone 13 Pro Max";
            String expectedPrice = "1 379,00  €";
            // Act
           // MainPage mainPage = new MainPage(driver);

            MainPage mainPage = new MainPage(driver);
            mainPage.openIphone13ProPage();

            IphonePage iphonePage = new IphonePage(driver);
            iphonePage.openIphone13ProPage();

            Iphone13ProPage iphone13ProPage = new Iphone13ProPage(driver);
            iphone13ProPage.buy();

            BuyIphone13Propage buyIphone13ProPage = new BuyIphone13Propage(driver);
            buyIphone13ProPage.choice13promax();

            buyIphone13ProPage.selectBlue();
            buyIphone13ProPage.select256Go();
            buyIphone13ProPage.noAppleTradeIn();
            buyIphone13ProPage.addToCart();


            ConfirmationAddToCartPage confirmationAddToCartPage = new ConfirmationAddToCartPage(driver);
            confirmationAddToCartPage.openCartPage();
            CartPage cartPage = new CartPage(driver);


           //CartPage cartPage = mainPage.openIphone13ProPage()
                   // .openIphone13ProPage();
                    /* buy()
                    .SelectIphonePro13Max()
                    .SelectIphonePro13Max()
                    .selectBlueAplin()
                    .select256go()
                    .noAppleTrading()
                    .addToCart()
                    .openCartPage();*/

            //Assert
           /* Assert.assertEquals(CartPage.getProductPrice(0),expectedPrice);
            Assert.assertEquals(CartPage.SubTotal() , expectedPrice);
            Assert.assertEquals(CartPage.Total(), expectedPrice);
            Assert.assertEquals(CartPage .getCarttitle(),productName);*/








            // MainPage.IphonePage()=;

           /* IphonePage iphonePage = new IphonePage(driver);
            iphonePage.IphonePage();*/

           /* Iphone13ProPage iphone13ProPage = new Iphone13ProPage(driver);
            iphone13ProPage.BuyIphone13ProPage();*/

          /*  BuyIphone13ProPage buyIphone13ProPage = new BuyIphone13ProPage(driver);
            Iphone13ProPage.choice13promax();
            Iphone13ProPage.selectBlue();
            Iphone13ProPage.select256Go();
           // Iphone13ProPage.noAppleTradIn();
        }
            //IphonePage(index);
           //.openResult();
            /*.ConfirmationAddToCartPage();*/
            //.choice13promax ();





        }
    }
