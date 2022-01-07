import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ubereats

{
        WebDriver driver;

@BeforeMethod
public void setup()
        {
        driver = new ChromeDriver();
        driver.get("https://www.ubereats.com/fr");
        driver.manage().window().maximize();
        WebElement buttonCookies = driver.findElement(By.id("bc gh gi gl bj bk bl bm bn bo bt bu ba bb")).click();
        }
@AfterMethod
public void teardown()
        {
        driver.quit();
        }




































}
