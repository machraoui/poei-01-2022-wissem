import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class tp1
{
    WebDriver driver ;

  @BeforeMethod
    public void setup ()
  {
      driver = new ChromeDriver();
      // il faut mettre 2 second d'attente et la exactement sinon a chaque test l'action se repetera a chaque fois et cella et active avec findelement
    //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); à eviter

    driver.get("https://www.amazon.fr/");
    driver.manage().window().maximize();
    WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept")); //
    buttonCookies.click();

    }
    @AfterMethod
    public void teardown ()
{
    driver.quit();
}

    @Test //obligatoir pour commencer les tests //
    public void test1()  {
         // bouton droite import class  et la il faut le driver sinon ça marche pas //
       // pour installer le driver sur window faut acceder au lien de prof puis il faut choisir la mm version chrome et choisir windows tant que que on est sur windows //
        // puis il faut coupier le driver.exe dans windows32 (sur windows c l'endroit ou java va chercher dedans le prmier )puis relancer le test sur intellij//
       //ouvrir une page //
       /* try {
            Thread.sleep(1000);         //instrection interdite asleep mecanisme de synchro , thread :fille d'excution de java
        } catch (InterruptedException e) { // choisir la 2 éme apres qu'on appuié sur la lampe rouge a coté de sleep
            e.printStackTrace();
        }*/
        // maximiser l'ecran
        // boutton droite puis inspect sur l'endroit (xpath dans le cours ) puis on doit copier le path pas full xpath pq c'est sensible , vu que x path sur chrome b'est pas exacte vaut mieux faire F12 puis ctrl f
        //search x path refernce sur net mais vaut mieux utiliser fin element

        //driver.get("https://www.google.com/");




         WebElement barreRechere = driver.findElement(By.id("twotabsearchtextbox")) ;//id // on a ajouter webelement
         barreRechere.sendKeys("machine a raclette"); // taper le mot puis il faut appuier sur entrer mais il faut deja accepter les cookies
          barreRechere.sendKeys(Keys.ENTER);


        //driver.findElement(By.name("filed-keywords"));
        //driver.findElement(By.cssSelector()); // préferable que xpath pq il est plus pérforment css slector refernce sur google pour chercher id faut mettre #
        //driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'"));
        //driver.findElement(By.xpath("//*[@name='field-keywords'"));

       // driver.quit(); //quit  ferme tout et close non//


    }


    @Test
    public void test2()  {

        WebElement barreRechere = driver.findElement(By.id("twotabsearchtextbox")) ;//id // on a ajouter webelement
        barreRechere.sendKeys("machine a raclette"); // taper le mot puis il faut appuier sur entrer mais il faut deja accepter les cookies

        barreRechere.sendKeys(Keys.ENTER);

        WebElement article1 = driver.findElement(By.cssSelector("[data-asin='B00D2I1VK0']")) ;
        article1.click();
        WebElement panier=driver.findElement(By.cssSelector("[title='Ajouter au panier']"));
        panier.click();
        //WebElement refus = driver.findElement(By.id("attachSiNoCoverage"));
        //refus.click();
        

    }

    @Test
    public void trouverlivres ()
    {
        driver.findElement(By.id("nav-hamburger-menu")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10) ); // definir la duration 10

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".hmenu-item[data-menu-id='10']")));

        driver.findElement(By.cssSelector(".hmenu-item[data-menu-id='10']")).click();

        driver.findElement(By.cssSelector("ul.hmenu-visible > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector("ul.hmenu-visible > li:nth-child(3)")).click();







    }

}