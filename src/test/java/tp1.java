import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tp1 {
    @Test //obligatoir pour commencer les tests //
    public void test1()  {
        WebDriver driver = new ChromeDriver(); // bouton droite import class  et la il faut le driver sinon ça marche pas //
       // pour installer le driver sur window faut acceder au lien de prof puis il faut choisir la mm version chrome et choisir windows tant que que on est sur windows //
        // puis il faut coupier le driver.exe dans windows32 (sur windows c l'endroit ou java va chercher dedans le prmier )puis relancer le test sur intellij//
        driver.get("https://www.amazon.fr/");//ouvrir une page //
       /* try {
            Thread.sleep(1000);         //instrection interdite asleep mecanisme de synchro , thread :fille d'excution de java
        } catch (InterruptedException e) { // choisir la 2 éme apres qu'on appuié sur la lampe rouge a coté de sleep
            e.printStackTrace();
        }*/
        driver.manage().window().maximize();// maximiser l'ecran
        // boutton droite puis inspect sur l'endroit (xpath dans le cours ) puis on doit copier le path pas full xpath pq c'est sensible , vu que x path sur chrome b'est pas exacte vaut mieux faire F12 puis ctrl f
        //search x path refernce sur net mais vaut mieux utiliser fin element

        //driver.get("https://www.google.com/");

         WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept")); //
         buttonCookies.click();


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
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();
        WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept")); //
        buttonCookies.click();
        WebElement barreRechere = driver.findElement(By.id("twotabsearchtextbox")) ;//id // on a ajouter webelement
        barreRechere.sendKeys("machine a raclette"); // taper le mot puis il faut appuier sur entrer mais il faut deja accepter les cookies

        barreRechere.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement article1 = driver.findElement(By.cssSelector("[data-asin='B00D2I1VK0']")) ;
        article1.click();
        WebElement panier=driver.findElement(By.cssSelector("[title='Ajouter au panier']"));
        panier.click();
        WebElement refus = driver.findElement(By.id("attachSiNoCoverage"));
        refus.click();


        driver.quit();


    }

}