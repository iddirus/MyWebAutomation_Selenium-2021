package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver;
    String amazonUrl="https://www.amazon.com/";
    String productName="Laptop";
    String searchBoxLocator="twotabsearchtextbox";
    String searchButtonLocator="nav-search-submit-button";

    @BeforeMethod
    public void setUp(){
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    // Action Method
    public void checkSearchBox(){
        // Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        // click on searchButton
        driver.findElement(By.id(searchButtonLocator)).click();
    }

    public void checkBestSellersBooksLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Children's Books")).click();
    }

    public void checkBestSellersAppsAndGamesLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Baby")).click();
        driver.findElement(By.linkText("Diapering")).click();
    }

    public void checkBirthdayGiftCardsMail(){
        driver.findElement(By.linkText("Gift Cards")).click();
        driver.findElement(By.linkText("Birthdays")).click();
        driver.findElement(By.linkText("Mail")).click();
    }

    public void checkAmazonDevicesLink(){
        driver.findElement(By.linkText("Amazon Devices")).click();
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("Amazon Devices")).click();
    }


    public void checkAccountAndListsSignIn(){
        driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2.nav-long-width")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("belscors@hotmail.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("evamessaad2016");
        driver.findElement(By.id("signInSubmit")).click();
    }

    public void checkMyAmazonPrimeLink(){
        driver.findElement(By.linkText("Prime")).click();
        driver.findElement(By.cssSelector("#prime-header-CTA > span > input")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("belscors@hotmail.com");
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("evamessaad2016");
        driver.findElement(By.id("signInSubmit")).click();
    }

    public void checkAmazonLanguageSettings(){
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout-link-2\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i")).click();
        driver.findElement(By.className("a-button-input")).click();

    }

    public void checkNewReleasesInVideoGames(){
        driver.findElement(By.linkText("New Releases")).click();
        driver.findElement(By.linkText("Video Games")).click();
    }

    public void checkToysAndGamesLink(){
        driver.findElement(By.linkText("Toys & Games")).click();
        driver.findElement(By.linkText("Building Toys")).click();

    }

    public void checkBestSellersAppliancesLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Appliances")).click();
        driver.findElement(By.linkText("Ice Makers")).click();
    }

    public void checkUnitedStatesImageLink(){
        driver.findElement(By.linkText("United States")).click();
        driver.findElement(By.xpath("//*[@id=\"a-popover-1\"]/div/div[2]/span[2]/span/span/input")).click();
    }

    public void checkSelectYourAddressLink(){
        driver.findElement(By.id("glow-ingress-line2")).click();
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys();
        driver.findElement(By.cssSelector("#GLUXZipUpdate > span > input")).click();
        driver.findElement(By.cssSelector("#a-popover-3 > div > div.a-popover-footer > span > span > span > button")).click();
    }

    public void checkBoysFashionTodaysDeals(){
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/span")).click();
    }

    public void checkBestSellersDigitalMusicLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Digital Music")).click();
        driver.findElement(By.linkText("Albums")).click();
    }

    public void checkCareersLink(){
        driver.findElement(By.linkText("Careers")).click();
        driver.findElement(By.cssSelector("head > meta:nth-child(9)")).sendKeys();
        driver.findElement(By.className("undefined form-control tt-input")).sendKeys();
        driver.findElement(By.cssSelector("#search-container > div > form > button > span")).click();
    }

    public void checkNesReleasesBooksLink(){
        driver.findElement(By.linkText("New Releases")).click();
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Romance")).click();
    }

    @AfterMethod
    public void tearDown(){
        // driver.close();
        driver.quit();
    }






}
